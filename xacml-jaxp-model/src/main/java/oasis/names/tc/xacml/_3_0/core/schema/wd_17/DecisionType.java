//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.01.27 at 11:38:39 PM PST
//

package oasis.names.tc.xacml._3_0.core.schema.wd_17;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for DecisionType.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="DecisionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Permit"/&gt;
 *     &lt;enumeration value="Deny"/&gt;
 *     &lt;enumeration value="Indeterminate"/&gt;
 *     &lt;enumeration value="NotApplicable"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DecisionType")
@XmlEnum
public enum DecisionType {

  @XmlEnumValue("Permit")
  PERMIT("Permit"), @XmlEnumValue("Deny")
  DENY("Deny"), @XmlEnumValue("Indeterminate")
  INDETERMINATE("Indeterminate"), @XmlEnumValue("NotApplicable")
  NOT_APPLICABLE("NotApplicable");
  private final String value;

  DecisionType(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static DecisionType fromValue(String v) {
    for (DecisionType c : DecisionType.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
