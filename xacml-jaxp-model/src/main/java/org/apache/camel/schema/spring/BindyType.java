//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation,
// v2.2.10-b140310.1920
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.02.24 at 01:59:12 PM PST
//

package org.apache.camel.schema.spring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for bindyType.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="bindyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Csv"/>
 *     &lt;enumeration value="KeyValue"/>
 *     &lt;enumeration value="Fixed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "bindyType")
@XmlEnum
public enum BindyType {

  @XmlEnumValue("Csv")
  CSV("Csv"), @XmlEnumValue("KeyValue")
  KEY_VALUE("KeyValue"), @XmlEnumValue("Fixed")
  FIXED("Fixed");
  private final String value;

  BindyType(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static BindyType fromValue(String v) {
    for (BindyType c : BindyType.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
