//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation,
// v2.2.10-b140310.1920
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.01.30 at 05:53:03 PM PST
//

package org.graphdrawing.graphml.xmlns;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for graph.edgedefault.type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="graph.edgedefault.type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="directed"/>
 *     &lt;enumeration value="undirected"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "graph.edgedefault.type")
@XmlEnum
public enum GraphEdgedefaultType {

  @XmlEnumValue("directed")
  DIRECTED("directed"), @XmlEnumValue("undirected")
  UNDIRECTED("undirected");
  private final String value;

  GraphEdgedefaultType(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static GraphEdgedefaultType fromValue(String v) {
    for (GraphEdgedefaultType c : GraphEdgedefaultType.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
