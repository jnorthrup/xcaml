//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation,
// v2.2.10-b140310.1920
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.01.29 at 11:29:15 AM PST
//

package org.graphdrawing.graphml.xmlns;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for endpoint.type.type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="endpoint.type.type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="in"/>
 *     &lt;enumeration value="out"/>
 *     &lt;enumeration value="undir"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "endpoint.type.type")
@XmlEnum
public enum EndpointTypeType {

  @XmlEnumValue("in")
  IN("in"), @XmlEnumValue("out")
  OUT("out"), @XmlEnumValue("undir")
  UNDIR("undir");
  private final String value;

  EndpointTypeType(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static EndpointTypeType fromValue(String v) {
    for (EndpointTypeType c : EndpointTypeType.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
