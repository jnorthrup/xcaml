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
 * <p>Java class for csvDataFormat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="csvDataFormat">
 *   &lt;complexContent>
 *     &lt;extension base="{http://camel.apache.org/schema/spring}dataFormat">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="autogenColumns" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="delimiter" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="configRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="strategyRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="skipFirstLine" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="lazyLoad" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="useMaps" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "csvDataFormat")
public class CsvDataFormat
    extends DataFormat
{

    @XmlAttribute(name = "autogenColumns")
    protected Boolean autogenColumns;
    @XmlAttribute(name = "delimiter")
    protected String delimiter;
    @XmlAttribute(name = "configRef")
    protected String configRef;
    @XmlAttribute(name = "strategyRef")
    protected String strategyRef;
    @XmlAttribute(name = "skipFirstLine")
    protected Boolean skipFirstLine;
    @XmlAttribute(name = "lazyLoad")
    protected Boolean lazyLoad;
    @XmlAttribute(name = "useMaps")
    protected Boolean useMaps;

    /**
     * Gets the value of the autogenColumns property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutogenColumns() {
        return autogenColumns;
    }

    /**
     * Sets the value of the autogenColumns property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutogenColumns(Boolean value) {
        this.autogenColumns = value;
    }

    /**
     * Gets the value of the delimiter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelimiter() {
        return delimiter;
    }

    /**
     * Sets the value of the delimiter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelimiter(String value) {
        this.delimiter = value;
    }

    /**
     * Gets the value of the configRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigRef() {
        return configRef;
    }

    /**
     * Sets the value of the configRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigRef(String value) {
        this.configRef = value;
    }

    /**
     * Gets the value of the strategyRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrategyRef() {
        return strategyRef;
    }

    /**
     * Sets the value of the strategyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrategyRef(String value) {
        this.strategyRef = value;
    }

    /**
     * Gets the value of the skipFirstLine property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSkipFirstLine() {
        return skipFirstLine;
    }

    /**
     * Sets the value of the skipFirstLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSkipFirstLine(Boolean value) {
        this.skipFirstLine = value;
    }

    /**
     * Gets the value of the lazyLoad property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLazyLoad() {
        return lazyLoad;
    }

    /**
     * Sets the value of the lazyLoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLazyLoad(Boolean value) {
        this.lazyLoad = value;
    }

    /**
     * Gets the value of the useMaps property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseMaps() {
        return useMaps;
    }

    /**
     * Sets the value of the useMaps property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseMaps(Boolean value) {
        this.useMaps = value;
    }

    public CsvDataFormat withAutogenColumns(Boolean value) {
        setAutogenColumns(value);
        return this;
    }

    public CsvDataFormat withDelimiter(String value) {
        setDelimiter(value);
        return this;
    }

    public CsvDataFormat withConfigRef(String value) {
        setConfigRef(value);
        return this;
    }

    public CsvDataFormat withStrategyRef(String value) {
        setStrategyRef(value);
        return this;
    }

    public CsvDataFormat withSkipFirstLine(Boolean value) {
        setSkipFirstLine(value);
        return this;
    }

    public CsvDataFormat withLazyLoad(Boolean value) {
        setLazyLoad(value);
        return this;
    }

    public CsvDataFormat withUseMaps(Boolean value) {
        setUseMaps(value);
        return this;
    }

    @Override
    public CsvDataFormat withId(String value) {
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
