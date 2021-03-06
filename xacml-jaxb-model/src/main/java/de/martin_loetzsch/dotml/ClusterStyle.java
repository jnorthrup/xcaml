//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.10-b140310.1920 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.24 at 02:28:45 PM PDT 
//


package de.martin_loetzsch.dotml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clusterStyle.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="clusterStyle">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="dashed"/>
 *     &lt;enumeration value="dotted"/>
 *     &lt;enumeration value="solid"/>
 *     &lt;enumeration value="invis"/>
 *     &lt;enumeration value="bold"/>
 *     &lt;enumeration value="filled"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "clusterStyle")
@XmlEnum
public enum ClusterStyle {

    @XmlEnumValue("dashed")
    DASHED("dashed"),
    @XmlEnumValue("dotted")
    DOTTED("dotted"),
    @XmlEnumValue("solid")
    SOLID("solid"),
    @XmlEnumValue("invis")
    INVIS("invis"),
    @XmlEnumValue("bold")
    BOLD("bold"),
    @XmlEnumValue("filled")
    FILLED("filled");
    private final String value;

    ClusterStyle(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClusterStyle fromValue(String v) {
        for (ClusterStyle c: ClusterStyle.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
