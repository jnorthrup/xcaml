//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.10-b140310.1920 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.24 at 02:28:45 PM PDT 
//


package org.apache.camel.schema.spring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for soapJaxbDataFormat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="soapJaxbDataFormat">
 *   &lt;complexContent>
 *     &lt;extension base="{http://camel.apache.org/schema/spring}dataFormat">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="contextPath" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="encoding" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="elementNameStrategyRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="namespacePrefixRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="schema" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "soapJaxbDataFormat")
public class SoapJaxbDataFormat
    extends DataFormat
{

    @XmlAttribute(name = "contextPath", required = true)
    protected String contextPath;
    @XmlAttribute(name = "encoding")
    protected String encoding;
    @XmlAttribute(name = "elementNameStrategyRef")
    protected String elementNameStrategyRef;
    @XmlAttribute(name = "version")
    protected String version;
    @XmlAttribute(name = "namespacePrefixRef")
    protected String namespacePrefixRef;
    @XmlAttribute(name = "schema")
    protected String schema;

    /**
     * Gets the value of the contextPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContextPath() {
        return contextPath;
    }

    /**
     * Sets the value of the contextPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContextPath(String value) {
        this.contextPath = value;
    }

    /**
     * Gets the value of the encoding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncoding() {
        return encoding;
    }

    /**
     * Sets the value of the encoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncoding(String value) {
        this.encoding = value;
    }

    /**
     * Gets the value of the elementNameStrategyRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementNameStrategyRef() {
        return elementNameStrategyRef;
    }

    /**
     * Sets the value of the elementNameStrategyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementNameStrategyRef(String value) {
        this.elementNameStrategyRef = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the namespacePrefixRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamespacePrefixRef() {
        return namespacePrefixRef;
    }

    /**
     * Sets the value of the namespacePrefixRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamespacePrefixRef(String value) {
        this.namespacePrefixRef = value;
    }

    /**
     * Gets the value of the schema property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchema() {
        return schema;
    }

    /**
     * Sets the value of the schema property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchema(String value) {
        this.schema = value;
    }

    public SoapJaxbDataFormat withContextPath(String value) {
        setContextPath(value);
        return this;
    }

    public SoapJaxbDataFormat withEncoding(String value) {
        setEncoding(value);
        return this;
    }

    public SoapJaxbDataFormat withElementNameStrategyRef(String value) {
        setElementNameStrategyRef(value);
        return this;
    }

    public SoapJaxbDataFormat withVersion(String value) {
        setVersion(value);
        return this;
    }

    public SoapJaxbDataFormat withNamespacePrefixRef(String value) {
        setNamespacePrefixRef(value);
        return this;
    }

    public SoapJaxbDataFormat withSchema(String value) {
        setSchema(value);
        return this;
    }

    @Override
    public SoapJaxbDataFormat withId(String value) {
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
