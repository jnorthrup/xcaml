//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.10-b140310.1920 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.24 at 02:28:45 PM PDT 
//


package org.apache.camel.schema.spring;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for shutdownRunningTask.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="shutdownRunningTask">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CompleteAllTasks"/>
 *     &lt;enumeration value="CompleteCurrentTaskOnly"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "shutdownRunningTask")
@XmlEnum
public enum ShutdownRunningTask {

    @XmlEnumValue("CompleteAllTasks")
    COMPLETE_ALL_TASKS("CompleteAllTasks"),
    @XmlEnumValue("CompleteCurrentTaskOnly")
    COMPLETE_CURRENT_TASK_ONLY("CompleteCurrentTaskOnly");
    private final String value;

    ShutdownRunningTask(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ShutdownRunningTask fromValue(String v) {
        for (ShutdownRunningTask c: ShutdownRunningTask.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
