//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation,
// v2.2.10-b140310.1920
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.02.04 at 04:25:41 AM PST
//

package de.martin_loetzsch.dotml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for arrow-type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="arrow-type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="normal"/>
 *     &lt;enumeration value="inv"/>
 *     &lt;enumeration value="dot"/>
 *     &lt;enumeration value="invdot"/>
 *     &lt;enumeration value="odot"/>
 *     &lt;enumeration value="invodot"/>
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="tee"/>
 *     &lt;enumeration value="empty"/>
 *     &lt;enumeration value="invempty"/>
 *     &lt;enumeration value="diamond"/>
 *     &lt;enumeration value="odiamond"/>
 *     &lt;enumeration value="box"/>
 *     &lt;enumeration value="obox"/>
 *     &lt;enumeration value="open"/>
 *     &lt;enumeration value="crow"/>
 *     &lt;enumeration value="halfopen"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "arrow-type")
@XmlEnum
public enum ArrowType {

  @XmlEnumValue("normal")
  NORMAL("normal"), @XmlEnumValue("inv")
  INV("inv"), @XmlEnumValue("dot")
  DOT("dot"), @XmlEnumValue("invdot")
  INVDOT("invdot"), @XmlEnumValue("odot")
  ODOT("odot"), @XmlEnumValue("invodot")
  INVODOT("invodot"), @XmlEnumValue("none")
  NONE("none"), @XmlEnumValue("tee")
  TEE("tee"), @XmlEnumValue("empty")
  EMPTY("empty"), @XmlEnumValue("invempty")
  INVEMPTY("invempty"), @XmlEnumValue("diamond")
  DIAMOND("diamond"), @XmlEnumValue("odiamond")
  ODIAMOND("odiamond"), @XmlEnumValue("box")
  BOX("box"), @XmlEnumValue("obox")
  OBOX("obox"), @XmlEnumValue("open")
  OPEN("open"), @XmlEnumValue("crow")
  CROW("crow"), @XmlEnumValue("halfopen")
  HALFOPEN("halfopen");
  private final String value;

  ArrowType(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ArrowType fromValue(String v) {
    for (ArrowType c : ArrowType.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
