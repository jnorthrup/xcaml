//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation,
// v2.2.10-b140310.1920
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.01.27 at 09:43:08 PM PST
//

package de.martin_loetzsch.dotml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for node-port.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="node-port">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value=":n"/>
 *     &lt;enumeration value=":ne"/>
 *     &lt;enumeration value=":e"/>
 *     &lt;enumeration value=":se"/>
 *     &lt;enumeration value=":s"/>
 *     &lt;enumeration value=":sw"/>
 *     &lt;enumeration value=":w"/>
 *     &lt;enumeration value=":nw"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "node-port")
@XmlEnum
public enum NodePort {

  @XmlEnumValue(":n")
  N(":n"), @XmlEnumValue(":ne")
  NE(":ne"), @XmlEnumValue(":e")
  E(":e"), @XmlEnumValue(":se")
  SE(":se"), @XmlEnumValue(":s")
  S(":s"), @XmlEnumValue(":sw")
  SW(":sw"), @XmlEnumValue(":w")
  W(":w"), @XmlEnumValue(":nw")
  NW(":nw");
  private final String value;

  NodePort(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static NodePort fromValue(String v) {
    for (NodePort c : NodePort.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
