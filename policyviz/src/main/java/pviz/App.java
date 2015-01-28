package pviz;

import com.google.common.base.Joiner;
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
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * Hello world!
 * 
 */
public class App {

  public static void main(String[] args) throws JAXBException, ParserConfigurationException,
      IOException, SAXException {
    JAXBContext jc = JAXBContext.newInstance(ObjectFactory.class.getPackage().getName());
    DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
    documentBuilderFactory.setNamespaceAware(true);
    DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
    Document doc = documentBuilder.parse(Paths.get(args[0]).toUri().toASCIIString());
    Unmarshaller unmarshaller = jc.createUnmarshaller();
    Element documentElement = doc.getDocumentElement();

    String tagName = documentElement.getTagName();

    System.err.println("" + tagName);

    if (!tagName.equals("PolicySet")) {
      return;
    } else {
      JAXBElement<PolicySetType> e = unmarshaller.unmarshal(doc, PolicySetType.class);
      PolicySetType top = e.getValue();

      Cluster policySet = Cluster.builder().withId(top.getPolicySetId()).withLabel("PolicySet:"+top.getPolicySetId()).build();
      Graph graph = Graph.builder().withNodeOrClusterOrSubGraph(policySet).build();
      
      System.err.println("PolicySet: " + (top).toString());
      
      String policyId = top.getPolicySetId();
      TargetType target = top.getTarget();
      List<AnyOfType> anyOf = top.getTarget().getAnyOf();
      Node or = null;
      for (AnyOfType anyOfType : anyOf) {
        String orId = UUID.randomUUID().toString();
        addChildToFirstOf(or,policySet);
        Node and=null;
        //join by OR
        for (AllOfType allOfType : anyOfType.getAllOf()) {
          String andId = UUID.randomUUID().toString();
          //join by AND
          addChildToFirstOf(and,or,policySet);
          for (MatchType matchType : allOfType.getMatch()) {
            String matchId = matchType.getMatchId();

            Cluster cluster = (Cluster.builder().withFillcolor("ltblue").withId(matchId).withLabel(matchId + ":" + matchType).build());

            addChildToFirstOf(cluster, policySet);
            AttributeValueType attributeValue = matchType.getAttributeValue();

            String dataType1 = attributeValue.getDataType();
            Joiner contentsJoined = Joiner.on(",");
            String join = null;
            try {
              join = contentsJoined.join(attributeValue.getContent().stream().map(String::valueOf).collect(Collectors.toList()));
            } catch (Exception e1) {
              e1.printStackTrace();
            }
            boolean white = cluster.getNodeOrClusterOrSubGraph().add(Node.builder().withFillcolor("white").withLabel(dataType1 + ":" + join).build());
            AttributeDesignatorType attributeDesignator = matchType.getAttributeDesignator();
            if (null != attributeDesignator) {
              String attributeId = attributeDesignator.getAttributeId();
              String category = attributeDesignator.getCategory();
              String dataType = attributeDesignator.getDataType();
              String issuer = attributeDesignator.getIssuer();
              boolean mustBePresent = attributeDesignator.isMustBePresent();
              addChildToFirstOf(Node.builder().withId("attr:" + attributeId).withFillcolor("ltgrey").withLabel(category+'/'+attributeId).build(), cluster, policySet);
            } else {
              AttributeSelectorType attributeSelector = matchType.getAttributeSelector();
              String contextSelectorId = attributeSelector.getContextSelectorId();
              String category = attributeSelector.getCategory();
              String dataType = attributeSelector.getDataType();
              String path = attributeSelector.getPath();
              boolean mustBePresent = attributeSelector.isMustBePresent();

              addChildToFirstOf(Node.builder().withFillcolor("ltgrey").withLabel(category + '/' + contextSelectorId).build(), cluster, policySet);
            }
            linkChildToFirstOf(graph, cluster, and, or, policySet);
          }
          linkChildToFirstOf(graph, and, or, policySet);
          and = (Node.builder().withFillcolor("ltblue").withId(andId).withLabel("AND").build());
        }
        linkChildToFirstOf(graph, or, policySet);
        or = (Node.builder().withFillcolor("purple").withId(orId).withLabel("OR").build());
      }
      Marshaller marshaller = JAXBContext.newInstance(de.martin_loetzsch.dotml.ObjectFactory.class.getPackage().getName()).createMarshaller();
      marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
      marshaller.marshal(graph, System.out);
    }

  }
  static String getId(Object reflectme){
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
  static void linkChildToFirstOf(Graph graph, Object to, Object... from) {
    if(null!=to)
    for (Object parent : from)
      if (null != parent) {
        String id = getId(to);
        String id1 = getId(parent);
        graph.getNodeOrClusterOrSubGraph().add(Edge.builder().withFrom(id).withTo(id1).build());
        return;
      }
  }
  static void addChildToFirstOf(Object child, Object...parent){
    if(null==child)return;
    for (Object o : parent) {
      if(parent==null)continue;
      if (o instanceof ClusterOrGraph) {
        ClusterOrGraph clusterOrGraph = (ClusterOrGraph) o;
        clusterOrGraph.getNodeOrClusterOrSubGraph().add(child);
        return;
      }else if (o instanceof Node) {
        Node node = (Node) o;
        throw new Error("cant add to nodes");
      }
    }


  }
}
