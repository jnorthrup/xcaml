package policyxform;

import com.google.common.base.Joiner;
import oasis.names.tc.xacml._3_0.core.schema.wd_17.*;
import org.apache.camel.schema.spring.*;
import org.springframework.schema.beans.BeansElement;
import org.springframework.schema.beans.DefaultableBoolean;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;
import specified.XacmlDataType;
import specified.XacmlFunctionProto;

import javax.xml.bind.*;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.MessageFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

//import ;


public class PolicyVisitor {

    public static final Class[] COMMON_CLASSES = {
            org.apache.camel.schema.spring.ObjectFactory.class,
            org.springframework.schema.beans.ObjectFactory.class,
            org.springframework.schema.util.ObjectFactory.class,
            oasis.names.tc.xacml._3_0.core.schema.wd_17.ObjectFactory.class,
    };

    public static final String REST_PROVIDER = Config.get("rest_provider",
            //            "netty-http"
            "netty4-http"
            //            "jetty"
            //            "restlet"
            //            "servlet"
            //            "spark-rest""netty4-http";
    );
    public static final String REST_HOST = Config.get("rest_host", "0.0.0.0");
    public static final String REST_PORT = Config.get("rest_port", "8901");
    long c;
    JAXBContext currentJaxbContext;
    private CamelContextElement currentCamelContext;
    private RouteContextElement currentRouteContext;
    private RestContextElement currentRestContext;
    private BeansElement beans;
    private PolicyType currentPolicy;
    private PolicySetType currentPolicySet;
    private RouteElement currentRouteElement;
    private RouteElement primaryRoute;

    public PolicyVisitor() throws JAXBException {
        currentJaxbContext = createJaxbContext();
    }

    public static void main(String... args) throws InterruptedException,
            ParserConfigurationException, IOException, SAXException, JAXBException {
        new PolicyVisitor().visitXml(args);
    }

    static String traceDescriptionElement(int... skip) {
        int sk = skip.length < 1 ? 2 : skip[0];
        Iterator<StackTraceElement> x =
                asList(Thread.currentThread().getStackTrace()).stream().skip(sk).limit(1).iterator();
        String value = null;
        while (x.hasNext()) {
            StackTraceElement next = x.next();
            String format =
                    MessageFormat.format("{0} ({1}:{2} )", next.getMethodName(), next.getFileName(), next
                            .getLineNumber());
            value = format;
            break;
        }
        return value;
    }

    static JAXBContext createJaxbContext(Class... classes) throws JAXBException {
        return JAXBContext.newInstance(classes.length == 0 ? COMMON_CLASSES : classes);
    }

    public static String trace() {
        return "+trace.out: " + traceDescriptionElement(3);
    }

    public void visitXml(String... args) throws JAXBException, ParserConfigurationException,
            IOException, SAXException, InterruptedException {
        JAXBContext jc =
                JAXBContext.newInstance(oasis.names.tc.xacml._3_0.core.schema.wd_17.ObjectFactory.class);
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        documentBuilderFactory.setNamespaceAware(true);
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();

        String infile = Config.get("input", args[0]);
        Path path1 = Paths.get(infile);
        byte[] input = Files.readAllBytes(path1);
        Document doc =
                documentBuilder.parse(new ByteArrayInputStream(new String(input).replaceAll("\\s+", " ")
                        .getBytes(StandardCharsets.UTF_8)));
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        Element documentElement = doc.getDocumentElement();
        String tagName = documentElement.getTagName();
        System.err.println("" + tagName);
        String out = Config.get("output", args[1]);

        currentRouteContext = new RouteContextElement().withId(id());

        final RouteElement e1 = new RouteElement().withId(id()).withFrom(new FromElement().withUri("direct:start")).withAopOrAggregateOrBean(new ToElement().withUri("direct:request"));
        currentRouteContext.getRoute().add(e1);
        String value = "beans::foo " + this.id();


        final RestDefinition restDefinition = new RestDefinition().withBindingMode(RestBindingMode.JSON_XML).withId(id()).withPath("/pdp").withVerbOrDeleteOrGet(new PostVerbDefinition().withBindingMode(RestBindingMode.JSON_XML).withTo(new ToElement().withUri("direct:request")).withType(RequestType.class.getCanonicalName()));
        final RestConfigurationDefinition restlet = new RestConfigurationDefinition().withBindingMode(RestBindingMode.JSON_XML).withComponent(REST_PROVIDER).withHost(REST_HOST).withPort(REST_PORT);

        currentRestContext = new RestContextElement().withId(id()).withRest(restDefinition);

        final RestContextRefDefinition restContextRefDefinition = new RestContextRefDefinition().withRef(currentRestContext.getId());
        currentCamelContext = new CamelContextElement().withRouteContextRef(new RouteContextRefDefinition().withRef(currentRouteContext.getId()))

                .withRestContextRef(restContextRefDefinition).withRestConfiguration(restlet);


        org.springframework.schema.beans.BeanElement responseBean = new org.springframework.schema.beans.BeanElement().withId("theResponse").withLazyInit(DefaultableBoolean.TRUE).withScope("prototype").withClazz(ResponseType.class.getCanonicalName());
        org.springframework.schema.beans.BeanElement requestBean = new org.springframework.schema.beans.BeanElement().withId("theRequest").withLazyInit(DefaultableBoolean.DEFAULT).withScope("prototype").withClazz(RequestType.class.getCanonicalName());

        final String[] txId = new String[1];
        final org.springframework.schema.util.MapElement envMap = new org.springframework.schema.util.MapElement().withDescription(new org.springframework.schema.beans.DescriptionElement().withContent("Env data")).withKeyType(String.class.getCanonicalName()).withId("EnvData").withScope("singleton");
        final org.springframework.schema.util.MapElement pipMap = new org.springframework.schema.util.MapElement().withDescription(new org.springframework.schema.beans.DescriptionElement().withContent("PIP data")).withKeyType(String.class.getCanonicalName()).withId("PIPdata").withScope("prototype");

        beans = new BeansElement().withImportOrAliasOrBean(/*requestBean, responseBean, */envMap, pipMap).withDescription(new org.springframework.schema.beans.DescriptionElement().withContent(value));
        primaryRoute = new RouteElement().withId(id()).withFrom(new FromElement().withUri("direct:request"));
        switch (tagName) {
            case "PolicySet": {
                JAXBElement<PolicySetType> e = unmarshaller.unmarshal(doc, PolicySetType.class);
                currentCamelContext.setId(this.id() + '-' + this.urnTip(e.getValue().getPolicySetId()));
                this.visitPolicySet(e, currentCamelContext);
                break;
            }

            case "Policy":
                JAXBElement<PolicyType> e = unmarshaller.unmarshal(doc, PolicyType.class);
                currentPolicy = e.getValue();
                String policyId = e.getValue().getPolicyId();
                String s = this.ncName(policyId);
                currentCamelContext.setId(this.id() + '-' + s);
//                currentCamelContext.getRoute().add(primaryRoute);
                currentRouteElement = primaryRoute;

                this.visitPolicy(e);
                break;
            default:
                System.exit(1);
        }


        beans.getImportOrAliasOrBean().add(currentRouteContext);
        beans.getImportOrAliasOrBean().add(currentRestContext);
        beans.getImportOrAliasOrBean().add(currentCamelContext);
        this.writeGraph(beans, out);
    }

    public String ncName(String urn) {
        return this.urnTip(urn).replaceAll("^:(.*)", "$1");
    }

    public void visitPolicy(JAXBElement<PolicyType> e)
            throws JAXBException {
        currentPolicy = e.getValue();
        String policyId = currentPolicy.getPolicyId();

        currentPolicy.getRuleCombiningAlgId();


        currentRouteContext.getRoute().add(currentRouteElement);
        PropertiesElement properties = currentCamelContext.getProperties();
        Object o = this.visitTarget(currentPolicy.getTarget(), currentRouteElement);
        String ruleCombiningAlgId = currentPolicy.getRuleCombiningAlgId();
        for (Object o1 : currentPolicy.getCombinerParametersOrRuleCombinerParametersOrVariableDefinition())
            if (o1 instanceof RuleType) visitRule((RuleType) o1);
    }

    private void visitRule(RuleType o1) {
        RouteElement currentRouteElement1 = currentRouteElement;
        TargetType target = o1.getTarget();
        this.visitTarget(target, currentRouteElement1);
        currentRouteElement = currentRouteElement1;

    }

    public StringWriter reifyProxy() throws JAXBException {
        StringWriter writer = new StringWriter();
        Marshaller marshaller = this.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
        marshaller.marshal(currentPolicy, writer);
        return writer;
    }

    public void visitPolicySet(JAXBElement<PolicySetType> e,
                               Object... createEdgeToHere) {
        currentPolicySet = e.getValue();
        String policySetId = currentPolicySet.getPolicySetId();
        currentRouteContext.setId(policySetId);

        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        Object[] objects =
                asList(stackTrace).stream().skip(1).limit(1).distinct().toArray();

        // Node policySet = new Node().withId(id()).withLabel("PolicySet:" + urnTip(policySetId));
        // addChildToFirstOf(policySet, graph);
        // linkChildToFirstOf(graph, policySet, createEdgeToHere);
        // System.err.println("PolicySet: " + (top).toString());
        //
        // Object c = graph;
        // visitTarget(graph, policySet, top.getTarget());
        // final AdviceExpressionsType adviceExpressions = top.getAdviceExpressions();
        // Node child = visitAdviceExpressions(c, adviceExpressions);
        //
        // linkChildToFirstOf(graph, child,/* fnNode,policyNode, */createEdgeToHere);
        // child = visitObligationExpressions(c, top.getObligationExpressions());
        // linkChildToFirstOf(graph, child,/* fnNode,policyNode, */createEdgeToHere);
        //
        // List<JAXBElement<?>> policySetOrPolicyOrPolicySetIdReference =
        // top.getPolicySetOrPolicyOrPolicySetIdReference();
        //
        // for (JAXBElement<?> jaxbElement : policySetOrPolicyOrPolicySetIdReference)
        // switch (jaxbElement.getValue().getClass().getSimpleName()) {
        // case "PolicySetType":
        // visitPolicySet((JAXBElement<PolicySetType>) jaxbElement, c, policySet);
        // break;
        // case "PolicyType":
        // visitPolicy((JAXBElement<PolicyType>) jaxbElement, c, policySet);
        // break;
        // case "PolicySetIdReference":
        // case "PolicyIdReference":
        // default:
        // System.err.println("not handling " + jaxbElement.getValue().getClass().getSimpleName());
        // break;
        // }

    }

    public PolicyVisitor.Node visitAdviceExpressions(PolicyVisitor.Parent outer, AdviceExpressionsType adviceExpressions) {
        return null;
    }

    public PolicyVisitor.Node visitObligationExpressions(PolicyVisitor.Parent outer,
                                                         ObligationExpressionsType ObligationExpressions) {
        return null;
    }

    public Object visitTarget(TargetType targetType, RouteElement routeElement) {

        String id = this.id();
        RouteElement rt = routeElement;
        targetType.getAnyOf().forEach(anyOfType -> {
            anyOfType.getAllOf().forEach(allOfType -> {
                allOfType.getMatch().forEach(matchType -> {
                    /*match is a (function with a designator ) or a selector */
                    String matchId = matchType.getMatchId();
                    XacmlFunctionProto func = XacmlFunctionProto.from(matchId);
                    //todo: extractors for bean values go here

                    XacmlDataType res = XacmlDataType.from(matchType.getAttributeValue().getDataType());
                    String args = Joiner.on(' ').join(matchType.getAttributeValue().getContent().stream().map(Object::toString).iterator()).trim();
                    Map<QName, String> otherAttributes = matchType.getAttributeValue().getOtherAttributes();
                    assert func.returns == res;

                    /*extract this from our state context, whatever that may have been designated last*/
                    //body.foo
                    AttributeDesignatorType attributeDesignator = matchType.getAttributeDesignator();
                    String cat = attributeDesignator.getCategory();
                    String attId = attributeDesignator.getAttributeId();
                    String dataType = attributeDesignator.getDataType();
                    XacmlDataType from = XacmlDataType.from(dataType);
                    String optKey = attributeDesignator.getIssuer();

                    final String value = "\n" +
                            "import static specified.XacmlFunctionProto.from as from\n" +
                            "import static xcaml.pdp.RequestTupleUtil.lookup as lookup\n" +
                            "XacmlFunctionProto functionProto = from(\"" + matchId + "\")" + "\n" +
                            "RequestType xacmlRequest = ${body}\n" +
                            "String args= \"" + args + "\"\n" +
                            "String tupleCat= \"" + cat + "\"\n" +
                            "String tupleAttId= \"" + attId + "\"\n" +
                            "def tupleValue = lookup(xacmlRequest, tupleCat, tupleAttId)\n" +
                            "def result = functionProto.apply(args, tupleValue)\n" +
                            "return result\n";
                    final FilterElement filterElement = new FilterElement().withGroovy(new GroovyElement().withTrim(true).withId(id()).withValue(value));

                    rt.getAopOrAggregateOrBean().add(filterElement);

                    filterElement.getAopOrAggregateOrBean().add(new ToElement().withUri("direct:permit"));
                    filterElement.getAopOrAggregateOrBean().add(new OtherwiseElement().withAopOrAggregateOrBean(new ToElement().withUri("direct:deny")));

                });
            });
        });
//        currentCamelContext.getRoute().add(rt);

        return targetType;
    }

    public String getContentString(List<Object> content) {
        String join = null;
        Joiner contentsJoined = Joiner.on(",");
        try {
            join = contentsJoined.join(content.stream().map(String::valueOf).collect(Collectors.toList()));
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        return join;
    }

    String hashTip(String dataType1) {
        char ch = '#';
        String attributeId = this.stringTip(dataType1, ch);
        return this.urnTip(attributeId);
    }

    String urnTip(String attributeId) {
        char ch = ':';
        return this.stringTip(attributeId, ch);
    }

    String stringTip(String dataType1, char ch) {

        int beginIndex = dataType1.lastIndexOf(ch);
        if (-1 == beginIndex)
            return dataType1;
        return dataType1.substring(beginIndex);
    }

    public String id() {
        return "n" + c++;
    }

    String getId(Object reflectme) {
        try {
            return String.valueOf(reflectme.getClass().getMethod("getId").invoke(reflectme));
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }

    void linkChildToFirstOf(PolicyVisitor.Parent graph, Object to, Object... from) {
    }

    void addChildToFirstOf(Object child, Object... parent) {

    }

    Object visitExpression(PolicyVisitor.Parent outer, JAXBElement<?> expression) {
    /*
     * possible object is AttributeValueType AttributeDesignatorType VariableReferenceType AttributeSelectorType
     * FunctionType ApplyType ExpressionType
     */
        return null;
    }

    public void writeGraph(BeansElement graph, String out) throws JAXBException, IOException,
            InterruptedException {
        Marshaller marshaller = this.createMarshaller(COMMON_CLASSES);
        // output pretty printed
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION,
                "http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd " +
                        "http://www.springframework.org/schema/util http://www.springframework.org/schema/util/spring-util.xsd " +
                        "http://camel.apache.org/schema/spring http://camel.apache.org/schema/spring/camel-spring.xsd"
        );


        marshaller.marshal(graph, Paths.get(out + ".spring.xml").toFile());
        marshaller.marshal(graph, System.out);

    }

    Marshaller createMarshaller(Class... classes) throws JAXBException {
        JAXBContext jaxbContext = currentJaxbContext;

        return jaxbContext.createMarshaller();
    }


    interface Parent {
    }

    interface Node {
    }

}