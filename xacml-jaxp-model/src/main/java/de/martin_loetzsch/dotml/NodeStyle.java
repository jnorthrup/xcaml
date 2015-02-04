//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation,
// v2.2.10-b140310.1920
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.02.04 at 10:47:30 AM PST
//

package de.martin_loetzsch.dotml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for nodeStyle.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="nodeStyle">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="solid"/>
 *     &lt;enumeration value="dashed"/>
 *     &lt;enumeration value="dotted"/>
 *     &lt;enumeration value="invis"/>
 *     &lt;enumeration value="bold"/>
 *     &lt;enumeration value="filled"/>
 *     &lt;enumeration value="rounded"/>
 *     &lt;enumeration value="diagonals"/>
 *     &lt;enumeration value="wedged"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "nodeStyle")
@XmlEnum
public enum NodeStyle {

  @XmlEnumValue("solid")
  SOLID("solid"), @XmlEnumValue("dashed")
  DASHED("dashed"), @XmlEnumValue("dotted")
  DOTTED("dotted"), @XmlEnumValue("invis")
  INVIS("invis"), @XmlEnumValue("bold")
  BOLD("bold"), @XmlEnumValue("filled")
  FILLED("filled"), @XmlEnumValue("rounded")
  ROUNDED("rounded"), @XmlEnumValue("diagonals")
  DIAGONALS("diagonals"), @XmlEnumValue("wedged")
  WEDGED("wedged");
  private final String value;

  NodeStyle(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static NodeStyle fromValue(String v) {
    for (NodeStyle c : NodeStyle.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
