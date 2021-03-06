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
 *       &lt;attribute name="contextPath" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="schema" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="prettyPrint" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ignoreJAXBElement" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="mustBeJAXBElement" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="filterNonXmlChars" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="encoding" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fragment" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="partClass" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="partNamespace" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="namespacePrefixRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="xmlStreamWriterWrapper" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="schemaLocation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "jaxb")
public class JaxbElement
    extends DataFormat
{

    @XmlAttribute(name = "contextPath", required = true)
    protected String contextPath;
    @XmlAttribute(name = "schema")
    protected String schema;
    @XmlAttribute(name = "prettyPrint")
    protected Boolean prettyPrint;
    @XmlAttribute(name = "ignoreJAXBElement")
    protected Boolean ignoreJAXBElement;
    @XmlAttribute(name = "mustBeJAXBElement")
    protected Boolean mustBeJAXBElement;
    @XmlAttribute(name = "filterNonXmlChars")
    protected Boolean filterNonXmlChars;
    @XmlAttribute(name = "encoding")
    protected String encoding;
    @XmlAttribute(name = "fragment")
    protected Boolean fragment;
    @XmlAttribute(name = "partClass")
    protected String partClass;
    @XmlAttribute(name = "partNamespace")
    protected String partNamespace;
    @XmlAttribute(name = "namespacePrefixRef")
    protected String namespacePrefixRef;
    @XmlAttribute(name = "xmlStreamWriterWrapper")
    protected String xmlStreamWriterWrapper;
    @XmlAttribute(name = "schemaLocation")
    protected String schemaLocation;

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

    /**
     * Gets the value of the prettyPrint property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrettyPrint() {
        return prettyPrint;
    }

    /**
     * Sets the value of the prettyPrint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrettyPrint(Boolean value) {
        this.prettyPrint = value;
    }

    /**
     * Gets the value of the ignoreJAXBElement property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreJAXBElement() {
        return ignoreJAXBElement;
    }

    /**
     * Sets the value of the ignoreJAXBElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreJAXBElement(Boolean value) {
        this.ignoreJAXBElement = value;
    }

    /**
     * Gets the value of the mustBeJAXBElement property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMustBeJAXBElement() {
        return mustBeJAXBElement;
    }

    /**
     * Sets the value of the mustBeJAXBElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMustBeJAXBElement(Boolean value) {
        this.mustBeJAXBElement = value;
    }

    /**
     * Gets the value of the filterNonXmlChars property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFilterNonXmlChars() {
        return filterNonXmlChars;
    }

    /**
     * Sets the value of the filterNonXmlChars property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFilterNonXmlChars(Boolean value) {
        this.filterNonXmlChars = value;
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
     * Gets the value of the fragment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFragment() {
        return fragment;
    }

    /**
     * Sets the value of the fragment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFragment(Boolean value) {
        this.fragment = value;
    }

    /**
     * Gets the value of the partClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartClass() {
        return partClass;
    }

    /**
     * Sets the value of the partClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartClass(String value) {
        this.partClass = value;
    }

    /**
     * Gets the value of the partNamespace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartNamespace() {
        return partNamespace;
    }

    /**
     * Sets the value of the partNamespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartNamespace(String value) {
        this.partNamespace = value;
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
     * Gets the value of the xmlStreamWriterWrapper property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlStreamWriterWrapper() {
        return xmlStreamWriterWrapper;
    }

    /**
     * Sets the value of the xmlStreamWriterWrapper property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlStreamWriterWrapper(String value) {
        this.xmlStreamWriterWrapper = value;
    }

    /**
     * Gets the value of the schemaLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaLocation() {
        return schemaLocation;
    }

    /**
     * Sets the value of the schemaLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaLocation(String value) {
        this.schemaLocation = value;
    }

    public JaxbElement withContextPath(String value) {
        setContextPath(value);
        return this;
    }

    public JaxbElement withSchema(String value) {
        setSchema(value);
        return this;
    }

    public JaxbElement withPrettyPrint(Boolean value) {
        setPrettyPrint(value);
        return this;
    }

    public JaxbElement withIgnoreJAXBElement(Boolean value) {
        setIgnoreJAXBElement(value);
        return this;
    }

    public JaxbElement withMustBeJAXBElement(Boolean value) {
        setMustBeJAXBElement(value);
        return this;
    }

    public JaxbElement withFilterNonXmlChars(Boolean value) {
        setFilterNonXmlChars(value);
        return this;
    }

    public JaxbElement withEncoding(String value) {
        setEncoding(value);
        return this;
    }

    public JaxbElement withFragment(Boolean value) {
        setFragment(value);
        return this;
    }

    public JaxbElement withPartClass(String value) {
        setPartClass(value);
        return this;
    }

    public JaxbElement withPartNamespace(String value) {
        setPartNamespace(value);
        return this;
    }

    public JaxbElement withNamespacePrefixRef(String value) {
        setNamespacePrefixRef(value);
        return this;
    }

    public JaxbElement withXmlStreamWriterWrapper(String value) {
        setXmlStreamWriterWrapper(value);
        return this;
    }

    public JaxbElement withSchemaLocation(String value) {
        setSchemaLocation(value);
        return this;
    }

    @Override
    public JaxbElement withId(String value) {
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
