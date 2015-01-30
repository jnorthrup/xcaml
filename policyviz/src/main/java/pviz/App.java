package pviz;

import com.google.common.base.Joiner;
import com.google.common.hash.HashCode;
import com.google.common.hash.Hashing;
import de.martin_loetzsch.dotml.*;
import oasis.names.tc.xacml._3_0.core.schema.wd_17.*;
import oasis.names.tc.xacml._3_0.core.schema.wd_17.ObjectFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import javax.xml.bind.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Hello world!
 */
public class App {

    public static final String LTBLUE = "#DDDDFF";
    public static final String WHITE = "#FFFFFF";
    public static final String LTGREY = "#DDDDDD";
    public static final String PURPLE = "#FF00FF";
    public static final String GREEN = "#00FF00";
    public static final Random RANDOM = new Random();
    public static final String RED = "#FF0000";

    public static void main(String[] args) throws JAXBException, ParserConfigurationException,
            IOException, SAXException, InterruptedException {
        JAXBContext jc = JAXBContext.newInstance(ObjectFactory.class.getPackage().getName());
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        documentBuilderFactory.setNamespaceAware(true);
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();

        Path path1 = Paths.get(args[0]);
        byte[] input = Files.readAllBytes(path1);
        Document doc =
                documentBuilder.parse(new ByteArrayInputStream(new String(input).replaceAll("\\s+", " ")
                        .getBytes(StandardCharsets.UTF_8)));
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        Element documentElement = doc.getDocumentElement();

        String tagName = documentElement.getTagName();

        System.err.println("" + tagName);

        switch (tagName) {
            case "PolicySet": {
                JAXBElement<PolicySetType> e = unmarshaller.unmarshal(doc, PolicySetType.class);
                HashCode hashCode = Hashing.adler32().hashBytes(input);
                String adler32 = hashCode.toString();
                Graph parent = new Graph().withFileName("z" + adler32).withRankdir(Rankdir.LR)
        /* .withRatio("1000") */ 
        /* .withRanksep(BigDecimal.valueOf(2)) */
        /* .withNodesep(BigDecimal.valueOf(.0010 )) */;

                decoratePolicySet(e, parent);
                writeGraph(parent);
                break;
            }
            case "Policy": {
                JAXBElement<PolicyType> e = unmarshaller.unmarshal(doc, PolicyType.class);
                HashCode hashCode = Hashing.adler32().hashBytes(input);
                String adler32 = hashCode.toString();
                Graph parent = new Graph().withFileName("z" + adler32);

                decoratePolicy(e, parent);
                writeGraph(parent);
                break;
            }
            default:
                break;
        }
    }

    public static void decoratePolicySet(JAXBElement<PolicySetType> e, ClusterOrGraph graph,
                                         Object... createEdgeToHere) {
        PolicySetType top = e.getValue();
        String policySetId = top.getPolicySetId();
        Node policySet =
                new Node().withId(safeId(policySetId)).withLabel("PolicySet:" + urnTip(policySetId));
        addChildToFirstOf(policySet, graph);
        linkChildToFirstOf(graph, policySet, createEdgeToHere);
        System.err.println("PolicySet: " + (top).toString());
//        Cluster c = new Cluster().withStyle(Style.INVIS);
//        addChildToFirstOf(c, graph);
        ClusterOrGraph c = graph;
        decorateTarget(graph, policySet, top.getTarget());
//        Cluster c = new Cluster().withStyle(Style.INVIS);
//        addChildToFirstOf(c, graph);
//        decorateTarget(c, policySet, top.getTarget());


        List<JAXBElement<?>> policySetOrPolicyOrPolicySetIdReference =
                top.getPolicySetOrPolicyOrPolicySetIdReference();
        for (JAXBElement<?> jaxbElement : policySetOrPolicyOrPolicySetIdReference) {
            switch (jaxbElement.getValue().getClass().getSimpleName()) {
                case "PolicySetType":
                    decoratePolicySet((JAXBElement<PolicySetType>) jaxbElement, c, policySet);
                    break;
                case "PolicyType":
                    decoratePolicy((JAXBElement<PolicyType>) jaxbElement, c, policySet);
                    break;
                case "PolicySetIdReference":
                case "PolicyIdReference":
                default:
                    System.err.println("not handling " + jaxbElement.getValue().getClass().getSimpleName());
                    break;

            }
        }
    }

    public static void decoratePolicy(JAXBElement<PolicyType> e, ClusterOrGraph graph,
                                      Object... createEdgeToHere) {
        PolicyType top = e.getValue();
        String PolicyId = top.getPolicyId();
        Node Policy =
                new Node().withId(safeId(PolicyId)).withLabel("Policy:" + urnTip(PolicyId));
        addChildToFirstOf(Policy, graph);
        linkChildToFirstOf(graph, Policy, createEdgeToHere);
        System.err.println("Policy: " + (top).toString());

        ClusterOrGraph c = graph;
        //        Cluster c = new Cluster().withStyle(Style.INVIS);
        //        addChildToFirstOf(c, graph);

        Node fnNode = decorateTarget(c, Policy, top.getTarget());
        top.getCombinerParametersOrRuleCombinerParametersOrVariableDefinition().stream().filter(o -> o instanceof RuleType).map(o -> (RuleType) o).forEach(ruleType -> {
            boolean permit = ruleType.getEffect() == EffectType.PERMIT;
            Node rule = new Node().withId(randChars()).withColor(permit ? GREEN : RED).withLabel("Rule:" + urnTip(ruleType.getRuleId())).withShape(permit ? Shape.HOUSE : Shape.OCTAGON).withStyle(Style.FILLED);
            Cluster ruleCluster = new Cluster().withId(randChars()).withStyle(Style.INVIS);
            addChildToFirstOf(ruleCluster, c);
            addChildToFirstOf(rule, ruleCluster);
            linkChildToFirstOf(c, rule, fnNode, Policy);
            decorateTarget(ruleCluster, rule, ruleType.getTarget());

        });

        //todo: resume
//        boolean b = top.getCombinerParametersOrRuleCombinerParametersOrVariableDefinition().stream().map(o -> ((JAXBElement<?>) (o)).getValue()).filter(o -> o instanceof RuleType).map(o -> ()).forEachOrdered(


    }

    public static Node decorateTarget(ClusterOrGraph graph, Node parent, TargetType targetType) {
        Node val = null;
        Node scope = null;
        Node fnNode = null;


        for (AnyOfType anAnyOf : targetType.getAnyOf()) {
            for (AllOfType anAllOf : anAnyOf.getAllOf()) {
                for (MatchType aMatch : anAllOf.getMatch()) {

                    addChildToFirstOf(scope, graph);
                    String matchId = aMatch.getMatchId();
                    Record matchCluster = new Record();
                    addChildToFirstOf(new RecordNode().withFillcolor(LTGREY).withStyle(Style.FILLED).withNodeOrRecord(matchCluster), graph);
                    linkChildToFirstOf(graph, scope, val, fnNode);
                    fnNode = new Node().withId(randChars()).withLabel("fn" + urnTip(matchId)).withColor(GREEN).withShape(Shape.DIAMOND).withStyle(Style.SOLID);
                    addChildToFirstOf(fnNode, matchCluster);
                    linkChildToFirstOf(graph, fnNode, scope, parent);
                    AttributeValueType attributeValue = aMatch.getAttributeValue();
                    String dataType1 = attributeValue.getDataType();
                    String join = getContentString(attributeValue.getContent());
                    val = new Node().withLabel(hashTip(dataType1) + ":" + join).withId(randChars()).withShape(Shape.PARALLELOGRAM).withStyle(Style.SOLID).withColor("#FFEE88");

                    AttributeDesignatorType attributeDesignator = aMatch.getAttributeDesignator();
                    if (null != attributeDesignator) {
                        String attributeId = attributeDesignator.getAttributeId();
                        Node build = new Node().withId(randChars()).withLabel(urnTip(attributeId)).withColor(LTBLUE).withShape(Shape.PARALLELOGRAM).withStyle(Style.SOLID);
                        addChildToFirstOf(build, matchCluster);
                    } else {
                        AttributeSelectorType attributeSelector = aMatch.getAttributeSelector();
                        String contextSelectorId = attributeSelector.getContextSelectorId();
                        Node build = new Node().withId(randChars()).withLabel(urnTip(contextSelectorId)).withFillcolor(LTBLUE).withShape(Shape.PARALLELOGRAM).withStyle(Style.SOLID);
                        addChildToFirstOf(build, matchCluster);
                    }
                    addChildToFirstOf(val, matchCluster);

                    scope = new Node().withColor(RED).withLabel("AND").withShape(Shape.PARALLELOGRAM).withId(randChars());
                }
                scope = new Node().withColor(PURPLE).withLabel("OR").withShape(Shape.CIRCLE).withId(randChars());
            }
            scope = new Node().withColor(PURPLE).withLabel("OR").withShape(Shape.DOUBLECIRCLE).withId(randChars());
        }
        return val;
    }

    private static String getContentString(List<Object> content) {
        String join = null;
        Joiner contentsJoined = Joiner.on(",");
        try {
            join = contentsJoined.join(content.stream().map(String::valueOf).collect(Collectors.toList()));
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        return join;
    }

    static String hashTip(String dataType1) {
        char ch = '#';
        return stringTip(dataType1, ch);
    }

    static String urnTip(String attributeId) {
        char ch = ':';
        return stringTip(attributeId, ch);
    }

    static String stringTip(String dataType1, char ch) {
        return dataType1.substring(dataType1.lastIndexOf(ch));
    }

    private static void writeGraph(Graph graph) throws JAXBException, IOException,
            InterruptedException {
        Marshaller marshaller =
                JAXBContext
                        .newInstance(de.martin_loetzsch.dotml.ObjectFactory.class.getPackage().getName())
                        .createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        try (StringWriter writer = new StringWriter()) {

            marshaller.marshal(graph, writer);
            System.err.println("using: " + writer.toString());

            {
                StreamSource ourGraph = new StreamSource(new StringReader(writer.toString()));

                StreamSource xslt = new StreamSource(ClassLoader.getSystemResourceAsStream("dotml2dot.xsl"));
                File aaa = new File("/tmp/x.svg");

                String fileName = "/tmp/x.dot";
                TransformerFactory.newInstance().newTransformer(xslt).transform(ourGraph, new StreamResult(new FileWriter(fileName)));
//                "-Gperipheries=0","-Gpack","-Gdecorate","-Gconcentrate",
                Process start = new ProcessBuilder().command("dot", "-Gclusterrank", "-Gsplines=polyline", fileName, "-Tsvg", "-o/tmp/x.svg", "-Tpng", "-o/tmp/x.png").start();
//                Process gxl = new ProcessBuilder().command("dot2gxl", "/tmp/x.dot","-o/tmp/x.gxl"  ).start();
                start.waitFor();
//                gxl.waitFor();
                System.err.println("see " + aaa.toURL().toExternalForm());

//                aaa = new File("/tmp/x.pdf");
//                start = new ProcessBuilder().command("dot", "-i", "/tmp/x.dot", "-Tpdf", "-o", aaa.getAbsolutePath()).start();
//                start.waitFor();
//                System.err.println("see " + aaa.toURL().toExternalForm());


            }

        } catch (TransformerException e1) {
            e1.printStackTrace();
        }
    }

    private static String safeId(String a) {
        return "uu" + Hashing.adler32().hashString(a, Charset.defaultCharset()).toString();
    }

    private static String randChars() {
        return "uu" + Hashing.adler32().hashLong(RANDOM.nextLong()).toString();
    }

    static String getId(Object reflectme) {
        try {
            return String.valueOf(reflectme.getClass().getMethod("getId").invoke(reflectme));
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }

    static void linkChildToFirstOf(ClusterOrGraph graph, Object to, Object... from) {
        if (null != to)
            for (Object parent : from)
                if (null != parent) {
                    String toId = getId(to);
                    String fromId = getId(parent);
                    graph.getNodeOrClusterOrSubGraph().add(new Edge().withFrom(fromId).withTo(toId).withStyle(Style.SOLID));
                    return;
                }
    }

    static void addChildToFirstOf(Object child, Object... parent) {
        if (null != child)
            for (Object o : parent)
                if (null != o) {
                    assert !(o instanceof Node) : "nodes cannot have children";
                    if (o instanceof ClusterOrGraph) {
                        ClusterOrGraph clusterOrGraph = (ClusterOrGraph) o;
                        clusterOrGraph.getNodeOrClusterOrSubGraph().add(child);
                        return;
                    }
                    if (o instanceof RecordNode) {
                        RecordNode record = (RecordNode) o;
                        record.getNodeOrRecord().add(child);
                        return;
                    }
                    if (o instanceof Record) {
                        Record record = (Record) o;
                        record.getNodeOrRecord().add(child);
                        return;
                    }
                    if (o instanceof SubGraph) {
                        SubGraph subGraph = (SubGraph) o;
                        subGraph.getNodeOrRecord().add(child);
                        return;
                    }
                }

    }

    static Node decorateExpression(JAXBElement<?> expression, Cluster outer) {
            /*possible object is
            AttributeValueType
            AttributeDesignatorType
            VariableReferenceType
            AttributeSelectorType
            FunctionType
            ApplyType
            ExpressionType
            */
        switch (expression.getDeclaredType().getSimpleName()) {
            case "ApplyType": {
                ApplyType applyType = (ApplyType) expression.getValue();
                String functionId = applyType.getFunctionId();
                Node applyNode = new Node().withLabel("apply:" + urnTip(functionId)).withShape(Shape.TRIANGLE);
                Cluster applyCluster = new Cluster().withId(randChars()).withStyle(Style.INVIS);

                //decorateExpression
                addChildToFirstOf(outer, applyCluster);
                addChildToFirstOf(applyCluster, outer);
                applyType.getExpression().forEach(jaxbElement -> linkChildToFirstOf(applyCluster, decorateExpression(jaxbElement, applyCluster), applyNode));


                return applyNode;
            }
            case "AttributeValueType": {
                AttributeValueType a = (AttributeValueType) expression.getValue();

                String s = hashTip(a.getDataType());
                String contentString = getContentString(a.getContent());
                Node valueNode = new Node().withLabel(s + ":" + contentString).withId(randChars()).withFillcolor(LTBLUE).withStyle(Style.FILLED);
                addChildToFirstOf(valueNode, outer);
                return valueNode;
            }
            default:
                break;
        }
        return null;
    }

}