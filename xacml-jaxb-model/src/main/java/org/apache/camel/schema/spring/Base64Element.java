//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.10-b140310.1920 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.24 at 02:18:22 PM PDT 
//


package org.apache.camel.schema.spring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://camel.apache.org/schema/spring}dataFormat">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="lineLength" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="lineSeparator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="urlSafe" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "base64")
public class Base64Element
    extends DataFormat
{

    @XmlAttribute(name = "lineLength")
    protected Integer lineLength;
    @XmlAttribute(name = "lineSeparator")
    protected String lineSeparator;
    @XmlAttribute(name = "urlSafe")
    protected Boolean urlSafe;

    /**
     * Gets the value of the lineLength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLineLength() {
        return lineLength;
    }

    /**
     * Sets the value of the lineLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLineLength(Integer value) {
        this.lineLength = value;
    }

    /**
     * Gets the value of the lineSeparator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineSeparator() {
        return lineSeparator;
    }

    /**
     * Sets the value of the lineSeparator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineSeparator(String value) {
        this.lineSeparator = value;
    }

    /**
     * Gets the value of the urlSafe property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrlSafe() {
        return urlSafe;
    }

    /**
     * Sets the value of the urlSafe property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrlSafe(Boolean value) {
        this.urlSafe = value;
    }

    public Base64Element withLineLength(Integer value) {
        setLineLength(value);
        return this;
    }

    public Base64Element withLineSeparator(String value) {
        setLineSeparator(value);
        return this;
    }

    public Base64Element withUrlSafe(Boolean value) {
        setUrlSafe(value);
        return this;
    }

    @Override
    public Base64Element withId(String value) {
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
