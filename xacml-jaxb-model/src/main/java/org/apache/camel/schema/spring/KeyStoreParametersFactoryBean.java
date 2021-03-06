//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.10-b140310.1920 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.24 at 02:28:45 PM PDT 
//


package org.apache.camel.schema.spring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for keyStoreParametersFactoryBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="keyStoreParametersFactoryBean">
 *   &lt;complexContent>
 *     &lt;extension base="{http://camel.apache.org/schema/spring}abstractKeyStoreParametersFactoryBean">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "keyStoreParametersFactoryBean")
public class KeyStoreParametersFactoryBean
    extends AbstractKeyStoreParametersFactoryBean
{


    @Override
    public KeyStoreParametersFactoryBean withType(String value) {
        setType(value);
        return this;
    }

    @Override
    public KeyStoreParametersFactoryBean withPassword(String value) {
        setPassword(value);
        return this;
    }

    @Override
    public KeyStoreParametersFactoryBean withProvider(String value) {
        setProvider(value);
        return this;
    }

    @Override
    public KeyStoreParametersFactoryBean withResource(String value) {
        setResource(value);
        return this;
    }

    @Override
    public KeyStoreParametersFactoryBean withCamelContextId(String value) {
        setCamelContextId(value);
        return this;
    }

    @Override
    public KeyStoreParametersFactoryBean withId(String value) {
        setId(value);
        return this;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.DEFAULT_STYLE);
    }

}
