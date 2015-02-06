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

/**
 * Hello world!
 */
public class App {

  public static final String LTBLUE = "lightblue";
  public static final String WHITE = "white";
  public static final String LTGREY = "lightgrey";
  public static final String PURPLE = "purple";
  public static final String GREEN = "#00ff00"; //"lime" fail
  public static final String RED = "red";
  public static final String PINKISH = "pink";
  public static final String LTGREEN = "#AAFFAA"; //"lightgreen" fail
  public static final String LTRED = "salmon";
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
    Graph parent = new Graph().withFileName(id()).withRankdir(Rankdir.LR)
    /* .withRatio("1000") */
    /* .withRanksep(BigDecimal.valueOf(2)) */
    /* .withNodesep(BigDecimal.valueOf(.0010 )) */;
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

  public static void visitPolicySet(JAXBElement<PolicySetType> e, ClusterOrGraph graph,
      Object... createEdgeToHere) {
    PolicySetType top = e.getValue();
    String policySetId = top.getPolicySetId();
    Node policySet = new Node().withId(id()).withLabel("PolicySet:" + urnTip(policySetId));
    addChildToFirstOf(policySet, graph);
    linkChildToFirstOf(graph, policySet, createEdgeToHere);
    System.err.println("PolicySet: " + (top).toString());

    ClusterOrGraph c = graph;
    visitTarget(graph, policySet, top.getTarget());
    final AdviceExpressionsType adviceExpressions = top.getAdviceExpressions();
    Node child = visitAdviceExpressions(c, adviceExpressions);

    linkChildToFirstOf(graph, child,/* fnNode,policyNode, */createEdgeToHere);
    child = visitObligationExpressions(c, top.getObligationExpressions());
    linkChildToFirstOf(graph, child,/* fnNode,policyNode, */createEdgeToHere);

    List<JAXBElement<?>> policySetOrPolicyOrPolicySetIdReference =
        top.getPolicySetOrPolicyOrPolicySetIdReference();

    for (JAXBElement<?> jaxbElement : policySetOrPolicyOrPolicySetIdReference)
      switch (jaxbElement.getValue().getClass().getSimpleName()) {
        case "PolicySetType":
          visitPolicySet((JAXBElement<PolicySetType>) jaxbElement, c, policySet);
          break;
        case "PolicyType":
          visitPolicy((JAXBElement<PolicyType>) jaxbElement, c, policySet);
          break;
        case "PolicySetIdReference":
        case "PolicyIdReference":
        default:
          System.err.println("not handling " + jaxbElement.getValue().getClass().getSimpleName());
          break;
      }
  }

  public static void visitPolicy(JAXBElement<PolicyType> e, ClusterOrGraph graph,
                                   Object... createEdgeToHere) {
        PolicyType top = e.getValue();
        String PolicyId = top.getPolicyId();
        Node policyNode =
                new Node().withId(id()).withLabel("Policy:" + urnTip(PolicyId));
        addChildToFirstOf(policyNode, graph);
        linkChildToFirstOf(graph, policyNode, createEdgeToHere);
        System.err.println("Policy: " + (top).toString());

        ClusterOrGraph c = graph;
        //        Cluster c = new Cluster().withStyle(Style.INVIS);
        //        addChildToFirstOf(c, graph);

        Node fnNode = visitTarget(c, policyNode, top.getTarget());
        final AdviceExpressionsType adviceExpressions = top.getAdviceExpressions();
        Node child = visitAdviceExpressions(c, adviceExpressions);
        if(null!=child)
            linkChildToFirstOf(graph,child,fnNode,policyNode,createEdgeToHere);
        child = visitObligationExpressions(c, top.getObligationExpressions());
        if(null!=child)
            linkChildToFirstOf(graph,child,fnNode,policyNode,createEdgeToHere);

//        top.getCombinerParametersOrRuleCombinerParametersOrVariableDefinition().stream().filter(o -> o instanceof RuleType).map(o -> (RuleType) o).forEach(ruleType -> {
//            visitRule(policyNode, c, fnNode, ruleType);
//        });
        top.getCombinerParametersOrRuleCombinerParametersOrVariableDefinition().forEach(o -> {
            final String simpleName = o.getClass().getSimpleName();
            switch (simpleName) {
                case "RuleType": {
                    visitRule(policyNode, c, fnNode, (RuleType) o);
                    break;
                }
                case "VariableDefinitionType": {
                    VariableDefinitionType v = (VariableDefinitionType) o;
                    final Node aaaa00 = new Node().withLabel(urnTip(v.getVariableId())).withId(id()).withColor("#EEEE00").withStyle(NodeStyle.FILLED);
                    addChildToFirstOf(aaaa00, c);
                    linkChildToFirstOf(c, aaaa00, policyNode);
                    linkChildToFirstOf(c, visitExpression(c, v.getExpression()), aaaa00);
                }

            }

        });

    }

  private static Node visitAdviceExpressions(ClusterOrGraph outer, AdviceExpressionsType adviceExpressions) {
        final Node[] adviceNode = new Node[1];

        if (null != adviceExpressions)
            adviceExpressions.getAdviceExpression().forEach(adviceExpressionType -> {
                final Cluster advCluster = new Cluster().withId(id());
                addChildToFirstOf(advCluster, outer);

                  EffectType appliesTo = adviceExpressionType.getAppliesTo();
                final Node node = new Node().withId(id()).withColor(appliesTo != EffectType.DENY ? LTGREEN : LTRED).withShape(Shape.NOTE).withStyle(NodeStyle.FILLED).withLabel(adviceExpressionType.getAdviceId());
                adviceNode[0] = node;
                addChildToFirstOf(adviceNode[0], advCluster);
                adviceExpressionType.getAttributeAssignmentExpression().forEach(aa -> {
                    Cluster ac = new Cluster().withId(id()).withColor(LTGREY).withLabel(aa.getAttributeId());
                    addChildToFirstOf(ac, advCluster);
                    visitExpression(ac, aa.getExpression());
                });
            });

        return adviceNode[0];
    }

  private static Node visitObligationExpressions(ClusterOrGraph outer, ObligationExpressionsType ObligationExpressions) {
        final Node[] ObligationNode = new Node[1];

        if (null != ObligationExpressions)
            ObligationExpressions.getObligationExpression().forEach(obligationExpressionType -> {
                final Cluster advCluster = new Cluster().withId(id());
                addChildToFirstOf(advCluster, outer);
                final EffectType appliesTo = obligationExpressionType.getFulfillOn();
                ObligationNode[0] = new Node().withId(id()).withColor(appliesTo != EffectType.DENY ? LTGREEN : LTRED).withShape(Shape.CDS).withStyle(NodeStyle.FILLED).withLabel(obligationExpressionType.getObligationId());
                addChildToFirstOf(ObligationNode[0], advCluster);
                obligationExpressionType.getAttributeAssignmentExpression().forEach(aa -> {

                    final Cluster ac = new Cluster().withId(id()).withColor(LTGREY).withLabel(aa.getAttributeId());
                    addChildToFirstOf(ac, advCluster);
                     visitExpression(ac, aa.getExpression()) ;
                });
            });

        return ObligationNode[0];
    }

  private static Node visitRule(Node topLink, ClusterOrGraph c, Node prevLink, RuleType ruleType) {
    boolean permit = ruleType.getEffect() == EffectType.PERMIT;
    Node rule =
        new Node().withId(id()).withColor(permit ? GREEN : RED).withLabel(
            "Rule:" + urnTip(ruleType.getRuleId())).withShape(permit ? Shape.RARROW : Shape.OCTAGON)
            .withStyle(NodeStyle.FILLED);
    Cluster ruleCluster = new Cluster().withId(id()).withStyle(ClusterStyle.INVIS);
    addChildToFirstOf(ruleCluster, c);
    addChildToFirstOf(rule, ruleCluster);
    linkChildToFirstOf(c, rule, prevLink, topLink);
    Node prev = visitTarget(ruleCluster, rule, ruleType.getTarget());
    ConditionType condition = ruleType.getCondition();
    if (null != condition) {
      JAXBElement<?> expression = condition.getExpression();

      if (!expression.isNil()) {
        Cluster outer = new Cluster().withId(id()).withStyle(ClusterStyle.INVIS);
        Node node = visitExpression(outer, expression);
        addChildToFirstOf(outer, c);
        linkChildToFirstOf(outer, node, prev);
      }
    }
    final Node adv = visitAdviceExpressions(ruleCluster, ruleType.getAdviceExpressions());
    if (null != adv)
      linkChildToFirstOf(ruleCluster, adv, prev, prevLink, topLink);
    final Node ob = visitObligationExpressions(ruleCluster, ruleType.getObligationExpressions());
    linkChildToFirstOf(ruleCluster, ob, prev, prevLink, topLink);
    return rule;
  }

  public static Node visitTarget(ClusterOrGraph graph, Node parent, TargetType targetType) {
    Node val = null;
    Node scope = null;
    Node fnNode = null;

    for (AnyOfType anAnyOf : targetType.getAnyOf()) {
      for (AllOfType anAllOf : anAnyOf.getAllOf()) {
        for (MatchType aMatch : anAllOf.getMatch()) {

          addChildToFirstOf(scope, graph);
          String matchId = aMatch.getMatchId();
          Record matchCluster = new Record();
          addChildToFirstOf(new RecordNode().withFillcolor(LTGREY).withStyle(NodeStyle.FILLED)
              .withNodeOrRecord(matchCluster), graph);
          linkChildToFirstOf(graph, scope, val, fnNode);
          fnNode =
              new Node().withId(id()).withLabel("fn" + urnTip(matchId)).withColor(GREEN).withShape(
                  Shape.DIAMOND).withStyle(NodeStyle.SOLID);
          addChildToFirstOf(fnNode, matchCluster);
          linkChildToFirstOf(graph, fnNode, scope, parent);
          AttributeValueType attributeValue = aMatch.getAttributeValue();
          String dataType1 = attributeValue.getDataType();
          String join = getContentString(attributeValue.getContent());
          val =
              new Node().withLabel(hashTip(dataType1) + ":" + join).withId(id()).withShape(
                  Shape.PARALLELOGRAM).withStyle(NodeStyle.SOLID).withColor("#FFEE88");

          AttributeDesignatorType attributeDesignator = aMatch.getAttributeDesignator();
          if (null != attributeDesignator) {
            String attributeId = attributeDesignator.getAttributeId();
            Node build =
                new Node().withId(id()).withLabel(urnTip(attributeId)).withColor(LTBLUE).withShape(
                    Shape.PARALLELOGRAM).withStyle(NodeStyle.SOLID);
            addChildToFirstOf(build, matchCluster);
          } else {
            AttributeSelectorType attributeSelector = aMatch.getAttributeSelector();
            String contextSelectorId = attributeSelector.getContextSelectorId();
            Node build =
                new Node().withId(id()).withLabel(urnTip(contextSelectorId)).withFillcolor(LTBLUE)
                    .withShape(Shape.PARALLELOGRAM).withStyle(NodeStyle.SOLID);
            addChildToFirstOf(build, matchCluster);
          }
          addChildToFirstOf(val, matchCluster);

          scope =
              new Node().withColor(RED).withLabel("AND").withShape(Shape.PARALLELOGRAM)
                  .withId(id());
        }
        scope = new Node().withColor(PURPLE).withLabel("OR").withShape(Shape.CIRCLE).withId(id());
      }
      scope =
          new Node().withColor(PURPLE).withLabel("OR").withShape(Shape.DOUBLECIRCLE).withId(id());
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

  private static void writeGraph(Graph graph, String out) throws JAXBException, IOException,
      InterruptedException {
    Marshaller marshaller =
        JAXBContext
            .newInstance(de.martin_loetzsch.dotml.ObjectFactory.class.getPackage().getName())
            .createMarshaller();
    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
    try (StringWriter writer = new StringWriter()) {

      marshaller.marshal(graph, writer);
      System.err.println("using: " + writer.toString());
      final String str = writer.toString();
      final Path path = Paths.get(out + ".dotml");
      try (FileWriter fileWriter = new FileWriter(path.toFile())) {
        fileWriter.write(str);
      }
      try {
        Files.createSymbolicLink(Paths.get(out + ".dotml.xml"), path);
      } catch (IOException e) {

      }

      {
        StreamSource ourGraph = new StreamSource(new StringReader(str));

        StreamSource xslt =
            new StreamSource(ClassLoader.getSystemResourceAsStream("dotml2dot.xsl"));

        String fileName = out + ".dot";
        TransformerFactory.newInstance().newTransformer(xslt).transform(ourGraph,
            new StreamResult(new FileWriter(fileName)));
        // "-Gperipheries=0","-Gpack","-Gvisit","-Gconcentrate","-Gsplines=ortho","-Gsplines=curved","-Gsplines=polyline","-Gclusterrank","-Gsplines=ortho","-Goverlap=false"
        Process start =
            new ProcessBuilder().command("dot", fileName,/* "-Gsplines=ortho", */"-Goverlap=false",
                "-Tsvg", "-o" + out + ".svg", "-Tpng", "-o" + out + ".png").start();
        // Process gxl = new ProcessBuilder().command("dot2gxl", "/tmp/x.dot","-o/tmp/x.gxl" ).start();
        start.waitFor();
        // gxl.waitFor();
        File aaa = new File(out + ".svg");
        System.err.println("see " + aaa.toURL().toExternalForm());
      }

    } catch (TransformerException e1) {
      e1.printStackTrace();
    }
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
    if (null != to)
      for (Object parent : from)
        if (null != parent) {
          String toId = getId(to);
          String fromId = getId(parent);
          graph.getNodeOrClusterOrSubGraph().add(
              new Edge().withFrom(fromId).withTo(toId).withStyle(EdgeStyle.SOLID));
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

  static Node visitExpression(ClusterOrGraph outer, JAXBElement<?> expression) {
            /*possible object is
            AttributeValueType
            AttributeDesignatorType
            VariableReferenceType
            AttributeSelectorType
            FunctionType
            ApplyType
            ExpressionType
            */
        String simpleName = expression.getDeclaredType().getSimpleName();
        switch (simpleName) {

            case "ApplyType": {
                ApplyType applyType = (ApplyType) expression.getValue();
                String functionId = applyType.getFunctionId();
                Node applyNode = new Node().withLabel("apply:" + urnTip(functionId)).withShape(Shape.INVTRIANGLE).withId(id());
                Cluster applyCluster = new Cluster().withId(id()).withStyle(ClusterStyle.INVIS);

                //visitExpression
                addChildToFirstOf(applyCluster, outer);
                addChildToFirstOf(applyNode, applyCluster);
                applyType.getExpression().forEach(jaxbElement -> linkChildToFirstOf(applyCluster, visitExpression(applyCluster, jaxbElement), applyNode));
                return applyNode;
            }
            case "AttributeValueType": {
                AttributeValueType a = (AttributeValueType) expression.getValue();
                String s = hashTip(a.getDataType());
                String contentString = getContentString(a.getContent());
                Node valueNode = new Node().withLabel(s + ":" + contentString).withId(id()).withFillcolor(LTBLUE).withStyle(NodeStyle.FILLED);
                addChildToFirstOf(valueNode, outer);
                return valueNode;
            }
            case "AttributeDesignatorType": {

                AttributeDesignatorType a = (AttributeDesignatorType) expression.getValue();

                RecordNode recordNode = new RecordNode().withColor(LTBLUE);
                addChildToFirstOf(recordNode, outer);
                Node lastNode = null;
                for (String s : new String[]{hashTip(a.getDataType()), urnTip(a.getCategory()), urnTip(a.getAttributeId())}) {
                    recordNode.getNodeOrRecord().add(lastNode = new Node().withId(id()).withLabel(s));
                }
                return lastNode;

            }
            case "VariableReferenceType": {
                VariableReferenceType value = (VariableReferenceType) expression.getValue();
                Node node = new Node().withId(id()).withLabel("var->:" + urnTip(value.getVariableId()));
                addChildToFirstOf(node, outer);
                return node;//todo: link to safeId
            }
            case "AttributeSelectorType": {
                AttributeSelectorType a = (AttributeSelectorType) expression.getValue();

                RecordNode recordNode = new RecordNode();
                addChildToFirstOf(recordNode, outer);

                Node lastnode = null;
                for (String s : new String[]{"xpath:" + (a.getContextSelectorId()), hashTip(a.getDataType()), a.getPath()}) {
                    Node node = new Node().withId(id()).withLabel(s);
                    recordNode.getNodeOrRecord().add(lastnode = node);

                }
                return lastnode;

            }
            case "FunctionType": {
                FunctionType a = (FunctionType) expression.getValue();
                return new Node().withId(id()).withLabel(urnTip(a.getFunctionId())).withShape(Shape.PARALLELOGRAM);

            }
        }
        return null;
    }
}