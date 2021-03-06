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
 * <p>Java class for dir.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dir">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="forward"/>
 *     &lt;enumeration value="back"/>
 *     &lt;enumeration value="both"/>
 *     &lt;enumeration value="none"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dir")
@XmlEnum
public enum Dir {

    @XmlEnumValue("forward")
    FORWARD("forward"),
    @XmlEnumValue("back")
    BACK("back"),
    @XmlEnumValue("both")
    BOTH("both"),
    @XmlEnumValue("none")
    NONE("none");
    private final String value;

    Dir(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Dir fromValue(String v) {
        for (Dir c: Dir.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
