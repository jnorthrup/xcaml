package policyxform;

import com.google.common.base.Joiner;
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
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFileAttributes;
import java.util.List;
import java.util.stream.Collectors;

class ClusterOrGraph {
};

class Node {
}

/**
 * Hello world!
 */
public class App {

  static long c = 0;

  public static void main(String[] args) throws JAXBException, ParserConfigurationException,
      IOException, SAXException, InterruptedException {
    JAXBContext jc = JAXBContext.newInstance(ObjectFactory.class.getPackage().getName());
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
    Object parent = null;
    switch (tagName) {
      case "PolicySet": {
        JAXBElement<PolicySetType> e = unmarshaller.unmarshal(doc, PolicySetType.class);
        visitPolicySet(e, parent);
        break;
      }

      case "Policy": {
        JAXBElement<PolicyType> e = unmarshaller.unmarshal(doc, PolicyType.class);
        visitPolicy(e, parent);
        break;
      }
      default:
        System.exit(1);
    }
    writeGraph(parent, out);
  }

  private static void visitPolicy(JAXBElement<PolicyType> e, Object parent,
      Object... createEdgeToHere) {

  }

  public static void visitPolicySet(JAXBElement<PolicySetType> e, Object graph,
      Object... createEdgeToHere) {

  }

  private static Node visitAdviceExpressions(ClusterOrGraph outer,
      AdviceExpressionsType adviceExpressions) {
    return null;
  }

  private static Node visitObligationExpressions(ClusterOrGraph outer,
      ObligationExpressionsType ObligationExpressions) {
    return null;
  }

  private static Node visitRule(Node topLink, ClusterOrGraph c, Node prevLink, RuleType ruleType) {

    return null;
  }

  public static Object visitTarget(ClusterOrGraph graph, Object parent, TargetType targetType) {
    Object val = null;

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
    return urnTip(stringTip(dataType1, ch));
  }

  static String urnTip(String attributeId) {
    char ch = ':';
    return stringTip(attributeId, ch);
  }

  static String stringTip(String dataType1, char ch) {

    final int beginIndex = dataType1.lastIndexOf(ch);
    if (-1 == beginIndex)
      return dataType1;
    return dataType1.substring(beginIndex);
  }

  private static void writeGraph(Object graph, String out) throws JAXBException, IOException,
      InterruptedException {
  }

  private static String id() {
    return "n" + c++;
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
  }

  static void addChildToFirstOf(Object child, Object... parent) {

  }

  static Object visitExpression(ClusterOrGraph outer, JAXBElement<?> expression) {
    /*
     * possible object is AttributeValueType AttributeDesignatorType VariableReferenceType AttributeSelectorType
     * FunctionType ApplyType ExpressionType
     */
    return null;
  }
}