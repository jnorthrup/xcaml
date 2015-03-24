//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.10-b140310.1920 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.24 at 02:18:22 PM PDT 
//


package org.apache.camel.schema.spring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for restBindingMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="restBindingMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="xml"/>
 *     &lt;enumeration value="json_xml"/>
 *     &lt;enumeration value="auto"/>
 *     &lt;enumeration value="json"/>
 *     &lt;enumeration value="off"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "restBindingMode")
@XmlEnum
public enum RestBindingMode {

    @XmlEnumValue("xml")
    XML("xml"),
    @XmlEnumValue("json_xml")
    JSON_XML("json_xml"),
    @XmlEnumValue("auto")
    AUTO("auto"),
    @XmlEnumValue("json")
    JSON("json"),
    @XmlEnumValue("off")
    OFF("off");
    private final String value;

    RestBindingMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RestBindingMode fromValue(String v) {
        for (RestBindingMode c: RestBindingMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
