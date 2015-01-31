//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation,
// v2.2.10-b140310.1920
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.01.30 at 05:51:02 PM PST
//

package de.martin_loetzsch.dotml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for rank.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="rank">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="same"/>
 *     &lt;enumeration value="min"/>
 *     &lt;enumeration value="source"/>
 *     &lt;enumeration value="max"/>
 *     &lt;enumeration value="sink"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "rank")
@XmlEnum
public enum Rank {

  @XmlEnumValue("same")
  SAME("same"), @XmlEnumValue("min")
  MIN("min"), @XmlEnumValue("source")
  SOURCE("source"), @XmlEnumValue("max")
  MAX("max"), @XmlEnumValue("sink")
  SINK("sink");
  private final String value;

  Rank(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static Rank fromValue(String v) {
    for (Rank c : Rank.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
