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

    public static final String LTBLUE = "#A0A0FF".toUpperCase();
    public static final String WHITE = "#FFFFFF".toUpperCase();
    public static final String LTGREY = "#AAAAAA".toUpperCase();
    public static final String PURPLE = "#FF00FF".toUpperCase();
    public static final String GREEN = "#00FF00";
    public static final Random RANDOM = new Random();

    public static void main(String[] args) throws JAXBException, ParserConfigurationException,
            IOException, SAXException, InterruptedException {
        JAXBContext jc = JAXBContext.newInstance(ObjectFactory.class.getPackage().getName());
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        documentBuilderFactory.setNamespaceAware(true);
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();

        Path path1 = Paths.get(args[0]);
        byte[] input = Files.readAllBytes(path1);
        Document doc = documentBuilder.parse(new ByteArrayInputStream(input));
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        Element documentElement = doc.getDocumentElement();

        String tagName = documentElement.getTagName();

        System.err.println("" + tagName);

        switch (tagName) {
            case "PolicySet": {
                JAXBElement<PolicySetType> e = unmarshaller.unmarshal(doc, PolicySetType.class);
                HashCode hashCode = Hashing.sha256().hashBytes(input);
                String sha256 = hashCode.toString();
                Graph parent = Graph.builder().withFileName("z" + sha256).build();

                decoratePolicySet(e, parent);
                writeGraph(parent);
                break;
            }
            case "Policy": {
                JAXBElement<PolicyType> e = unmarshaller.unmarshal(doc, PolicyType.class);
                HashCode hashCode = Hashing.sha256().hashBytes(input);
                String sha256 = hashCode.toString();
                Graph parent = Graph.builder().withFileName("z" + sha256).build();

                decoratePolicy(e, parent);
                writeGraph(parent);
                break;
            }
            default:break;
        }
    }

    public static void decoratePolicySet(JAXBElement<PolicySetType> e, ClusterOrGraph graph, Object... createEdgeToHere) {
        PolicySetType top = e.getValue();
        String policySetId = top.getPolicySetId();
        Node policySet = Node.builder().withId(safeId(policySetId)).withLabel("PolicySet:" + urnTip(policySetId)).build();
        linkChildToFirstOf(graph, policySet, createEdgeToHere);
        graph.getNodeOrClusterOrSubGraph().add(policySet);
        System.err.println("PolicySet: " + (top).toString());

        decorateTarget(graph, policySet, top.getTarget());

        for (JAXBElement<?> jaxbElement : top.getPolicySetOrPolicyOrPolicySetIdReference()) {
            switch (jaxbElement.getValue().getClass().getName())
            {
                case "PolicySetType":
                    decoratePolicySet(e, graph, policySet);
                    break;
                case "PolicyType":
                case "PolicySetIdReference":
                case "PolicyIdReference":

                
            }
        }
    }
    public static void decoratePolicy(JAXBElement<PolicyType> e, Graph graph, Object... createEdgeToHere) {
        PolicyType top = e.getValue();
        String PolicyId = top.getPolicyId();
        Node Policy = Node.builder().withId(safeId(PolicyId)).withLabel("Policy:" + urnTip(PolicyId)).build();
        linkChildToFirstOf(graph, Policy, createEdgeToHere);
        graph.getNodeOrClusterOrSubGraph().add(Policy);
        System.err.println("Policy: " + (top).toString());

        decorateTarget(graph, Policy, top.getTarget());
    }

    public static void decorateTarget(ClusterOrGraph graph, Node policySet, TargetType targetType) {
        TargetType target = targetType;
        List<AnyOfType> anyOf = target.getAnyOf();
        Node or = null;
        for (AnyOfType anyOfType : anyOf) {
            String orId = randChars();
            addChildToFirstOf(or, graph);
            Node and = null;
            //join by OR
            for (AllOfType allOfType : anyOfType.getAllOf()) {
                String andId = randChars();
                //join by AND
                addChildToFirstOf(and, or, graph);
                for (MatchType matchType : allOfType.getMatch()) {
                    String matchId = matchType.getMatchId();

                    String id = randChars();
                    Cluster matchCluster = (Cluster.builder().withBgcolor(LTBLUE).withId(safeId(id)).withLabel("cluster:" + matchId).build());
                    addChildToFirstOf(matchCluster, graph);
                    Node matchNode = Node.builder().withId(safeId(matchId)).withLabel("match:" + urnTip(matchId)).withColor(GREEN).withFillcolor(GREEN).withStyle(Style.FILLED).withShape(Shape.DIAMOND).build();
                    addChildToFirstOf(matchNode, matchCluster);
                    AttributeValueType attributeValue = matchType.getAttributeValue();

                    String dataType1 = attributeValue.getDataType();
                    Joiner contentsJoined = Joiner.on(",");
                    String join = null;
                    try {
                        join = contentsJoined.join(attributeValue.getContent().stream().map(String::valueOf).collect(Collectors.toList()));
                    } catch (Exception e1) {
                        e1.printStackTrace();
                    }
                    matchCluster.getNodeOrClusterOrSubGraph().add(Node.builder().withColor(WHITE).withStyle(Style.FILLED).withLabel(hashTip(dataType1) + ":" + join).withId(randChars()).build());
                    AttributeDesignatorType attributeDesignator = matchType.getAttributeDesignator();
                    if (null != attributeDesignator) {
                        String attributeId = attributeDesignator.getAttributeId();
                        String category = attributeDesignator.getCategory();
                        String dataType = attributeDesignator.getDataType();
                        String issuer = attributeDesignator.getIssuer();
                        boolean mustBePresent = attributeDesignator.isMustBePresent();
                        addChildToFirstOf(Node.builder().withId(safeId("attr:" + attributeId)).withColor(LTGREY).withStyle(Style.FILLED).withLabel(urnTip(attributeId)).build(), matchCluster, graph);
                    } else {
                        AttributeSelectorType attributeSelector = matchType.getAttributeSelector();
                        String contextSelectorId = attributeSelector.getContextSelectorId();
                        String category = attributeSelector.getCategory();
                        String dataType = attributeSelector.getDataType();
                        String path = attributeSelector.getPath();
                        boolean mustBePresent = attributeSelector.isMustBePresent();

                        addChildToFirstOf(Node.builder().withColor(LTGREY).withStyle(Style.FILLED).withLabel(category + '/' + contextSelectorId).build(), matchCluster, graph);
                    }
                    linkChildToFirstOf(graph, matchNode, and, or, policySet);
                }
                linkChildToFirstOf(graph, and, or, policySet);
                and = (Node.builder().withStyle(Style.FILLED).withColor(LTBLUE).withId(safeId(andId)).withLabel("AND").build());
            }
            linkChildToFirstOf(graph, or, policySet);
            or = (Node.builder().withStyle(Style.FILLED).withColor(PURPLE).withId(safeId(orId)).withLabel("OR").build());
        }
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

    private static void writeGraph(Graph graph) throws JAXBException, IOException, InterruptedException {
        Marshaller marshaller = JAXBContext.newInstance(de.martin_loetzsch.dotml.ObjectFactory.class.getPackage().getName()).createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        try (StringWriter writer = new StringWriter()) {

            marshaller.marshal(graph, writer);
            System.err.println("using: " + writer.toString());
            StreamSource ourGraph = new StreamSource(new StringReader(writer.toString()));

            StreamSource xslt = new StreamSource(
                    ClassLoader.getSystemResourceAsStream("dotml2dot.xsl"));
            File aaa = File.createTempFile("aaa", ".svg");
            System.err.println("see " + aaa.toURL());

            Process start = new ProcessBuilder().command("dot", "-Tsvg:cairo", "-o", aaa.getAbsolutePath()).start();
            try (OutputStream outputStream = start.getOutputStream()) {
                StreamResult outputTarget = new StreamResult(outputStream);
                TransformerFactory.newInstance().newTransformer(xslt).transform(ourGraph, outputTarget);
            }

            int i = start.waitFor();

        } catch (TransformerException e1) {
            e1.printStackTrace();
        }
    }

    private static String safeId(String a) {
        return "uu" + Hashing.sha256().hashString(a, Charset.defaultCharset()).toString();
    }


    private static String randChars() {
        return "uu" + Hashing.sha256().hashLong(RANDOM.nextLong()).toString();
    }

    static String getId(Object reflectme) {
        try {
            return String.valueOf(reflectme.getClass().getMethod("getId").invoke(reflectme));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }

    static void linkChildToFirstOf(ClusterOrGraph graph, Object to, Object... from) {
        if (null != to)
            for (Object parent : from)
                if (null != parent) {
                    String id = getId(to);
                    String id1 = getId(parent);
                    graph.getNodeOrClusterOrSubGraph().add(Edge.builder().withFrom(id).withTo(id1).withStyle(Style.SOLID).build());
                    return;
                }
    }

    static void addChildToFirstOf(Object child, Object... parent) {
        if (null == child) return;
        for (Object o : parent) {
            if (parent == null) continue;
            if (o instanceof ClusterOrGraph) {
                ClusterOrGraph clusterOrGraph = (ClusterOrGraph) o;
                clusterOrGraph.getNodeOrClusterOrSubGraph().add(child);
                return;
            } else if (o instanceof Node) {
                Node node = (Node) o;
                throw new Error("cant add to nodes");
            }
        }


    }
}