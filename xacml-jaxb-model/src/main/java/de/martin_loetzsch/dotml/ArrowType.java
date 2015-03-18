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
 * Java class for arrow-type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="arrow-type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="box"/>
 *     &lt;enumeration value="crow"/>
 *     &lt;enumeration value="diamond"/>
 *     &lt;enumeration value="ediamond"/>
 *     &lt;enumeration value="odiamond"/>
 *     &lt;enumeration value="dot"/>
 *     &lt;enumeration value="empty"/>
 *     &lt;enumeration value="halfopen"/>
 *     &lt;enumeration value="inv"/>
 *     &lt;enumeration value="invdot"/>
 *     &lt;enumeration value="invempty"/>
 *     &lt;enumeration value="invodot"/>
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="normal"/>
 *     &lt;enumeration value="obox"/>
 *     &lt;enumeration value="odiamond"/>
 *     &lt;enumeration value="odot"/>
 *     &lt;enumeration value="open"/>
 *     &lt;enumeration value="tee"/>
 *     &lt;enumeration value="vee"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "arrow-type")
@XmlEnum
public enum ArrowType {

  @XmlEnumValue("box")
  BOX("box"), @XmlEnumValue("crow")
  CROW("crow"), @XmlEnumValue("diamond")
  DIAMOND("diamond"), @XmlEnumValue("ediamond")
  EDIAMOND("ediamond"), @XmlEnumValue("odiamond")
  ODIAMOND("odiamond"), @XmlEnumValue("dot")
  DOT("dot"), @XmlEnumValue("empty")
  EMPTY("empty"), @XmlEnumValue("halfopen")
  HALFOPEN("halfopen"), @XmlEnumValue("inv")
  INV("inv"), @XmlEnumValue("invdot")
  INVDOT("invdot"), @XmlEnumValue("invempty")
  INVEMPTY("invempty"), @XmlEnumValue("invodot")
  INVODOT("invodot"), @XmlEnumValue("none")
  NONE("none"), @XmlEnumValue("normal")
  NORMAL("normal"), @XmlEnumValue("obox")
  OBOX("obox"), @XmlEnumValue("odot")
  ODOT("odot"), @XmlEnumValue("open")
  OPEN("open"), @XmlEnumValue("tee")
  TEE("tee"), @XmlEnumValue("vee")
  VEE("vee");
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