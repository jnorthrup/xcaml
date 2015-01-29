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
import java.math.BigDecimal;
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

  public static final String LTBLUE = "#DDDDFF".toUpperCase();
  public static final String WHITE = "#FFFFFF".toUpperCase();
  public static final String LTGREY = "#AAAAAA".toUpperCase();
  public static final String PURPLE = "#FF00FF".toUpperCase();
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
        HashCode hashCode = Hashing.sha256().hashBytes(input);
        String sha256 = hashCode.toString();
        Graph parent = Graph.builder().withFileName("z" + sha256)/*.withRatio("1000")*/ /*.withRanksep(BigDecimal.valueOf(2))*/ /*.withNodesep(BigDecimal.valueOf(.0010))*/.build();

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
      default:
        break;
    }
  }

  public static void decoratePolicySet(JAXBElement<PolicySetType> e, ClusterOrGraph graph,
      Object... createEdgeToHere) {
    PolicySetType top = e.getValue();
    String policySetId = top.getPolicySetId();
    Node policySet =
        Node.builder().withId(safeId(policySetId)).withLabel("PolicySet:" + urnTip(policySetId))
            .build();
      addChildToFirstOf(policySet, graph);
      linkChildToFirstOf(graph, policySet, createEdgeToHere);
    System.err.println("PolicySet: " + (top).toString());

    decorateTarget(graph, policySet, top.getTarget());

    List<JAXBElement<?>> policySetOrPolicyOrPolicySetIdReference =
        top.getPolicySetOrPolicyOrPolicySetIdReference();
    for (JAXBElement<?> jaxbElement : policySetOrPolicyOrPolicySetIdReference) {
      switch (jaxbElement.getValue().getClass().getSimpleName()) {
        case "PolicySetType":
          decoratePolicySet((JAXBElement<PolicySetType>) jaxbElement, graph, policySet);
          break;
        case "PolicyType":
          decoratePolicy((JAXBElement<PolicyType>) jaxbElement, graph, policySet);
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
        Node.builder().withId(safeId(PolicyId)).withLabel("Policy:" + urnTip(PolicyId)).build();
      addChildToFirstOf(Policy, graph);
      linkChildToFirstOf(graph, Policy, createEdgeToHere);
    System.err.println("Policy: " + (top).toString());

    decorateTarget(graph, Policy, top.getTarget());
  }

  public static void decorateTarget(ClusterOrGraph graph, Node parent, TargetType targetType) {
      if (!targetType.getAnyOf().isEmpty()) {
          Node link = null;
          Node fnNode = null;
          for (AnyOfType anAnyOf : targetType.getAnyOf()) {
              for (AllOfType anAllOf : anAnyOf.getAllOf()) {
                  for (MatchType aMatch : anAllOf.getMatch()) {
                      addChildToFirstOf(link, graph);
                      String matchId = aMatch.getMatchId();
                      SubGraph matchRecord = SubGraph.builder().build();
                      addChildToFirstOf(matchRecord, graph);

                      linkChildToFirstOf(graph, link, fnNode);
                      fnNode = Node.builder().withId(randChars()).withLabel("fn" + urnTip(matchId)).withColor(GREEN).withShape(Shape.DIAMOND).withStyle(Style.SOLID).build();
                      addChildToFirstOf(fnNode, matchRecord);
                      linkChildToFirstOf(graph, fnNode, link, parent);
                      AttributeValueType attributeValue = aMatch.getAttributeValue();
                      assert null != aMatch;
                      String dataType1 = attributeValue.getDataType();
                      Joiner contentsJoined = Joiner.on(",");
                      String join = null;
                      try {
                          join = contentsJoined.join(attributeValue.getContent().stream().map(String::valueOf).collect(Collectors.toList()));
                      } catch (Exception e1) {
                          e1.printStackTrace();
                      }
                      Node val = Node.builder().withLabel(hashTip(dataType1) + ":" + join).withId(randChars()).withShape(Shape.PARALLELOGRAM).withStyle(Style.SOLID).withColor("#FFEE88").build();

                      AttributeDesignatorType attributeDesignator = aMatch.getAttributeDesignator();
                      if (null != attributeDesignator) {
                          String attributeId = attributeDesignator.getAttributeId();
                          Node build = Node.builder().withId(randChars()).withLabel(urnTip(attributeId)).withColor(LTBLUE).withShape(Shape.PARALLELOGRAM).withStyle(Style.SOLID).build();
                          addChildToFirstOf(build, matchRecord);
                          linkChildToFirstOf(graph, fnNode, build);
                      } else {
                          AttributeSelectorType attributeSelector = aMatch.getAttributeSelector();
                          String contextSelectorId = attributeSelector.getContextSelectorId();
                          Node build = Node.builder().withId(randChars()).withLabel(urnTip(contextSelectorId)).withFillcolor(LTBLUE).withShape(Shape.PARALLELOGRAM).withStyle(Style.SOLID).build();
                          addChildToFirstOf(build, matchRecord);
                          linkChildToFirstOf(graph, fnNode, build);
                      }
                      addChildToFirstOf(val, matchRecord);
                      linkChildToFirstOf(graph, fnNode, val);

                      link = Node.builder().withColor(RED).withLabel("AND").withShape(Shape.PARALLELOGRAM).withId(randChars()).build();
                  }
                  link = Node.builder().withColor(PURPLE).withLabel("OR").withShape(Shape.CIRCLE).withId(randChars()).build();
              }
              link = Node.builder().withColor(PURPLE).withLabel("OR").withShape(Shape.DOUBLECIRCLE).withId(randChars()).build();
          }
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
      StreamSource ourGraph = new StreamSource(new StringReader(writer.toString()));

      StreamSource xslt = new StreamSource(ClassLoader.getSystemResourceAsStream("dotml2dot.xsl"));
      File aaa = File.createTempFile("aaa", ".svg");

        Process start =
          new ProcessBuilder().command("dot", "-Tsvg", "-o", aaa.getAbsolutePath()).start();
        try (OutputStream outputStream = start.getOutputStream()) {
            StreamResult outputTarget = new StreamResult(outputStream);
            TransformerFactory.newInstance().newTransformer(xslt).transform(ourGraph, outputTarget);
        }

        int i = start.waitFor();

        System.err.println("see " + aaa.toURL().toExternalForm());
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
          graph.getNodeOrClusterOrSubGraph().add(
              Edge.builder().withFrom(fromId).withTo(toId).withStyle(Style.SOLID).build());
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
            if (o instanceof Record) {
                Record record = (Record) o;
                record.getNodeOrRecord().add(child);return;
            }
            if (o instanceof SubGraph) {
                SubGraph subGraph = (SubGraph) o;
                subGraph.getNodeOrRecord().add(child);return;
            }
        }

  }
}