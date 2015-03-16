package policyxform;

import com.google.common.base.Joiner;
import oasis.names.tc.xacml._3_0.core.schema.wd_17.*;
import org.apache.camel.schema.spring.CamelContextElement;
import org.apache.camel.schema.spring.DescriptionElement;
import org.apache.camel.schema.spring.FromElement;
import org.apache.camel.schema.spring.RouteElement;
import org.springframework.schema.beans.Beans;
import org.springframework.schema.beans.Description;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import javax.xml.bind.*;
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
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class PolicyVisitor {

  public static final Class[] COMMON_CLASSES = new Class[] {
      org.springframework.schema.beans.ObjectFactory.class,
      org.apache.camel.schema.spring.ObjectFactory.class,
      oasis.names.tc.xacml._3_0.core.schema.wd_17.ObjectFactory.class};
  public static final String LINE_SEPARATOR = System.lineSeparator();
  long c = 0;
  JAXBContext currentJaxbContext;
  private CamelContextElement currentCamelContext;
  private Beans beans;
  private PolicyType currentPolicy;
  private PolicySetType currentPolicySet;
  private RouteElement currentRouteElement;

  ;

  public PolicyVisitor() throws JAXBException {
    currentJaxbContext = createJaxbContext();
  }

  public static void main(String... args) throws InterruptedException,
      ParserConfigurationException, IOException, SAXException, JAXBException {
    new PolicyVisitor().visitXml(args);
  }

  static String traceDescriptionElement(int... skip) {
    int sk = skip.length < 1 ? 2 : skip[0];
    final Iterator<StackTraceElement> x =
        Arrays.asList(Thread.currentThread().getStackTrace()).stream().skip(sk).limit(1).iterator();
    String value = null;
    while (x.hasNext()) {
      StackTraceElement next = x.next();
      final String format =
          MessageFormat.format("{0} ({1}:{2} )", next.getMethodName(), next.getFileName(), next
              .getLineNumber());
      value = (format);
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

    final String infile = args[0];
    Path path1 = Paths.get(infile);
    byte[] input = Files.readAllBytes(path1);
    Document doc =
        documentBuilder.parse(new ByteArrayInputStream(new String(input).replaceAll("\\s+", " ")
            .getBytes(StandardCharsets.UTF_8)));
    Unmarshaller unmarshaller = jc.createUnmarshaller();
    Element documentElement = doc.getDocumentElement();
    String tagName = documentElement.getTagName();
    System.err.println("" + tagName);
    final String out = args[1];
    currentCamelContext = new CamelContextElement();
    switch (tagName) {
      case "PolicySet": {
        JAXBElement<PolicySetType> e = unmarshaller.unmarshal(doc, PolicySetType.class);
        currentCamelContext.setId(id() + '-' + urnTip(e.getValue().getPolicySetId()));
        visitPolicySet(e, currentCamelContext);
        break;
      }

      case "Policy": {
        JAXBElement<PolicyType> e = unmarshaller.unmarshal(doc, PolicyType.class);
          final String policyId = e.getValue().getPolicyId();
          final String s = ncName(policyId);
          currentCamelContext.setId(id() + '-' + s);
          visitPolicy(e, currentCamelContext);
        break;
      }
      default:
        System.exit(1);
    }
    beans =
        new Beans().withImportOrAliasOrBean(currentCamelContext).withDescription(
            new Description().withContent("beans::foo " + id()));
    writeGraph(beans, out);
  }

    public String ncName(String urn) {
        return urnTip(urn).replaceAll("^:(.*)", "$1");
    }

    public void visitPolicy(JAXBElement<PolicyType> e, Object... createEdgeToHere)
      throws JAXBException {
    currentPolicy = e.getValue();
    String policySetId = currentPolicy.getPolicyId();

    currentPolicy.getRuleCombiningAlgId();
    // final RouteElement routeElement = new RouteElement().withDescription(traceDescriptionElement( ));

    final String s = trace();
    final String description = currentPolicy.getDescription();
    currentRouteElement =
        new RouteElement().withId(id()).withDescription(
            new DescriptionElement().withValue(description + LINE_SEPARATOR + s));

    currentCamelContext.getRoute().add(currentRouteElement);
    final Object o = visitTarget(currentPolicy.getTarget(), this.currentRouteElement);
    final String ruleCombiningAlgId = currentPolicy.getRuleCombiningAlgId();
    final List<Object> combinerParametersOrRuleCombinerParametersOrVariableDefinition =
        currentPolicy.getCombinerParametersOrRuleCombinerParametersOrVariableDefinition();
    for (Object o1 : combinerParametersOrRuleCombinerParametersOrVariableDefinition) {
      if (o1 instanceof RuleType) {
        visitRule((RuleType) o1);
      }
      /*
       * if (o1 instanceof AdviceExpressionsType) { AdviceExpressionsType adviceExpressionsType =
       * (AdviceExpressionsType) o1; visitAdviceExpressions(new Parent() { },adviceExpressionsType ); }
       */

    }
  }

  private void visitRule(RuleType o1) {
    RouteElement currentRouteElement1 = new RouteElement().withId(o1.getRuleId());
    final TargetType target = o1.getTarget();
    visitTarget(target, currentRouteElement1);
    currentRouteElement = currentRouteElement1;

  }

  public StringWriter reifyProxy() throws JAXBException {
    final StringWriter writer = new StringWriter();
    final Marshaller marshaller = createMarshaller();
    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
    marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
    marshaller.marshal(currentPolicy, writer);
    return writer;
  }

  public void visitPolicySet(JAXBElement<PolicySetType> e, CamelContextElement graph,
      Object... createEdgeToHere) {
    currentPolicySet = e.getValue();
    String policySetId = currentPolicySet.getPolicySetId();
    graph.setId(policySetId);

    final StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
    final Object[] objects =
        Arrays.asList(stackTrace).stream().skip(1).limit(1).distinct().toArray();

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

  public Node visitAdviceExpressions(Parent outer, AdviceExpressionsType adviceExpressions) {
    return null;
  }

  public Node visitObligationExpressions(Parent outer,
      ObligationExpressionsType ObligationExpressions) {
    return null;
  }

  public Object visitTarget(TargetType targetType, RouteElement routeElement) {

        final String id = id();
        RouteElement rt = new RouteElement().withId(id), currentRoutElement = rt, parent =
                routeElement;
        rt.getFrom().add(new FromElement().withRef(parent.getId()));
        targetType.getAnyOf().forEach(anyOfType -> {
            anyOfType.getAllOf().forEach(allOfType -> {
                allOfType.getMatch().forEach(matchType -> {
                    final String matchId = matchType.getMatchId();
                    System.err.println("matchId" + matchId);
                    rt.setDescription(new DescriptionElement().withValue("Match::"+matchId));
                });
            });
        });
        currentCamelContext.getRoute().add(rt);

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
    return urnTip(stringTip(dataType1, ch));
  }

  String urnTip(String attributeId) {
    char ch = ':';
    return stringTip(attributeId, ch);
  }

  String stringTip(String dataType1, char ch) {

    final int beginIndex = dataType1.lastIndexOf(ch);
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

  void linkChildToFirstOf(Parent graph, Object to, Object... from) {
  }

  void addChildToFirstOf(Object child, Object... parent) {

  }

  Object visitExpression(Parent outer, JAXBElement<?> expression) {
    /*
     * possible object is AttributeValueType AttributeDesignatorType VariableReferenceType AttributeSelectorType
     * FunctionType ApplyType ExpressionType
     */
    return null;
  }

  public void writeGraph(Beans graph, String out) throws JAXBException, IOException,
      InterruptedException {
    final Marshaller marshaller = createMarshaller(COMMON_CLASSES);
    // output pretty printed
    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
    marshaller.marshal(graph, Paths.get(out + ".spring.xml").toFile());
    marshaller.marshal(graph, System.out);

  }

  Marshaller createMarshaller(Class... classes) throws JAXBException {
    final JAXBContext jaxbContext = currentJaxbContext;

    return jaxbContext.createMarshaller();
  }

  interface Parent {
  }

  interface Node {
  }

}