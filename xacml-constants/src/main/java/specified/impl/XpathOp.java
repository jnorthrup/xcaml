package specified.impl;

import oasis.names.tc.xacml._3_0.core.schema.wd_17.ContentType;
import org.xml.sax.SAXException;
import specified.BindUri;
import specified.BindXacmlFunctions;
import specified.XacmlFunctionProto;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.*;
import java.io.IOException;
import java.io.StringBufferInputStream;

/**
 * * A.3.15 XPath-based functions This section specifies functions that take XPath expressions for arguments. An XPath
 * expression evaluates to a node-set, which is a set of XML nodes that match the expression. A node or node-set is not
 * in the formal data-type system of XACML. All comparison or other operations on node-sets are performed in isolation
 * of the particular function specified. The context nodes and namespace mappings of the XPath expressions are defined
 * by the XPath data-type, see section B.3. The following functions are defined:
 */
public enum XpathOp implements specified.F {
  /**
   * This function SHALL take an “urn:oasis:names:tc:xacml:3.0:data-type:xpathExpression” as an argument and evaluates
   * to an “http://www.w3.org/2001/XMLSchema#integer”. The value returned from the function SHALL be the count of the
   * nodes within the node-set that match the given XPath expression. If the <Content> element of the category to which
   * the XPath expression applies to is not present in the request, this function SHALL return a value of zero.
   */
  @BindXacmlFunctions(XacmlFunctionProto.urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__xpath_$2D_node_$2D_count)
  xpath_node_count {
    @Override
    public <T> T apply(Object... objects) {
      String xpathExpression = String.valueOf(objects[0]);
      ContentType ct = (ContentType) objects[1];
      XPathFactory xPathfactory = XPathFactory.newInstance();
      XPath xpath = xPathfactory.newXPath();
      try {
        XPathExpression expr = xpath.compile("count(" + xpathExpression + ")");
        for (Object o : ct.getContent()) {
          DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
          DocumentBuilder builder;

          try {
            builder = factory.newDocumentBuilder();
            return (T) expr.evaluate(builder.parse(new StringBufferInputStream((String) o)),
                XPathConstants.NUMBER);
          } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
          }

        }
      } catch (XPathExpressionException e) {
        e.printStackTrace();
      }
      return (T) (Integer) 0;
    }
  },
  /**
   * This function SHALL take two “urn:oasis:names:tc:xacml:3.0:data-type:xpathExpression” arguments and SHALL return an
   * “http://www.w3.org/2001/XMLSchema#boolean”. The function SHALL return "True" if any of the XML nodes in the
   * node-set matched by the first argument equals any of the XML nodes in the node-set matched by the second argument.
   * Two nodes are considered equal if they have the same identity. If the <Content> element of the category to which
   * either XPath expression applies to is not present in the request, this function SHALL return a value of “False”.
   */
  @BindUri("urn:oasis:names:tc:xacml:3.0:function:xpath-node-equal")
  xpath_node_equal,
  /**
   * This function SHALL take two “urn:oasis:names:tc:xacml:3.0:data-type:xpathExpression” arguments and SHALL return an
   * “http://www.w3.org/2001/XMLSchema#boolean”. This function SHALL evaluate to "True" if one of the following two
   * conditions is satisfied: (1) Any of the XML nodes in the node-set matched by the first argument is equal to any of
   * the XML nodes in the node-set matched by the second argument; (2) any node below any of the XML nodes in the
   * node-set matched by the first argument is equal to any of the XML nodes in the node-set matched by the second
   * argument. Two nodes are considered equal if they have the same identity. If the <Content> element of the category
   * to which either XPath expression applies to is not present in the request, this function SHALL return a value of
   * “False”.
   * <p>
   * NOTE: The first condition is equivalent to "xpath-node-equal", and guarantees that "xpath-node-equal" is a special
   * case of "xpath-node-match".
   */

  @BindUri("urn:oasis:names:tc:xacml:3.0:function:xpath-node-match")
  xpath_node_match, ;

}
