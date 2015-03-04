package policyxform;

import com.google.common.base.Joiner;
import oasis.names.tc.xacml._3_0.core.schema.wd_17.*;
import org.apache.camel.schema.spring.CamelContextElement;
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
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class PolicyVisitor {

  interface Parent {
  };

  interface Node {
  }

  long c = 0;

  public static void main(String... args) throws InterruptedException,
      ParserConfigurationException, IOException, SAXException, JAXBException {
    new PolicyVisitor().visitXml(args);
  }

  public void visitXml(String... args) throws JAXBException, ParserConfigurationException,
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
    CamelContextElement parent = new CamelContextElement().withId(id());
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
    writeGraph(new Beans().withImportOrAliasOrBean(parent).withDescription(
        new Description().withContent("beans::foo " + id())), out);
  }

  public void visitPolicy(JAXBElement<PolicyType> e, Object parent, Object... createEdgeToHere) {

  }

  public void visitPolicySet(JAXBElement<PolicySetType> e, Object graph, Object... createEdgeToHere) {

  }

  public Node visitAdviceExpressions(Parent outer, AdviceExpressionsType adviceExpressions) {
    return null;
  }

  public Node visitObligationExpressions(Parent outer,
      ObligationExpressionsType ObligationExpressions) {
    return null;
  }

  public Node visitRule(Node topLink, Parent c, Node prevLink, RuleType ruleType) {

    return null;
  }

  public Object visitTarget(Parent graph, Object parent, TargetType targetType) {
    Object val = null;

    return val;
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
    final JAXBContext jaxbContext = JAXBContext.newInstance(Beans.class, CamelContextElement.class);

    final Marshaller marshaller = jaxbContext.createMarshaller();
    marshaller.marshal(graph, Paths.get(out + ".spring.xml").toFile());
    marshaller.marshal(graph, System.out);

  }

}