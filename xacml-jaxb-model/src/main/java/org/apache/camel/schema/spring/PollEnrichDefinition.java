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
 * <p>Java class for pollEnrichDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pollEnrichDefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://camel.apache.org/schema/spring}noOutputDefinition">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="uri" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ref" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="timeout" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="strategyRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="strategyMethodName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="strategyMethodAllowNull" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="aggregateOnException" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;anyAttribute processContents='skip' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pollEnrichDefinition")
public class PollEnrichDefinition
    extends NoOutputDefinition
{

    @XmlAttribute(name = "uri")
    protected String uri;
    @XmlAttribute(name = "ref")
    protected String ref;
    @XmlAttribute(name = "timeout")
    protected Long timeout;
    @XmlAttribute(name = "strategyRef")
    protected String strategyRef;
    @XmlAttribute(name = "strategyMethodName")
    protected String strategyMethodName;
    @XmlAttribute(name = "strategyMethodAllowNull")
    protected Boolean strategyMethodAllowNull;
    @XmlAttribute(name = "aggregateOnException")
    protected Boolean aggregateOnException;

    /**
     * Gets the value of the uri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUri() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUri(String value) {
        this.uri = value;
    }

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRef(String value) {
        this.ref = value;
    }

    /**
     * Gets the value of the timeout property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTimeout() {
        return timeout;
    }

    /**
     * Sets the value of the timeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTimeout(Long value) {
        this.timeout = value;
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
     * Gets the value of the strategyMethodName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrategyMethodName() {
        return strategyMethodName;
    }

    /**
     * Sets the value of the strategyMethodName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrategyMethodName(String value) {
        this.strategyMethodName = value;
    }

    /**
     * Gets the value of the strategyMethodAllowNull property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStrategyMethodAllowNull() {
        return strategyMethodAllowNull;
    }

    /**
     * Sets the value of the strategyMethodAllowNull property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStrategyMethodAllowNull(Boolean value) {
        this.strategyMethodAllowNull = value;
    }

    /**
     * Gets the value of the aggregateOnException property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAggregateOnException() {
        return aggregateOnException;
    }

    /**
     * Sets the value of the aggregateOnException property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAggregateOnException(Boolean value) {
        this.aggregateOnException = value;
    }

    public PollEnrichDefinition withUri(String value) {
        setUri(value);
        return this;
    }

    public PollEnrichDefinition withRef(String value) {
        setRef(value);
        return this;
    }

    public PollEnrichDefinition withTimeout(Long value) {
        setTimeout(value);
        return this;
    }

    public PollEnrichDefinition withStrategyRef(String value) {
        setStrategyRef(value);
        return this;
    }

    public PollEnrichDefinition withStrategyMethodName(String value) {
        setStrategyMethodName(value);
        return this;
    }

    public PollEnrichDefinition withStrategyMethodAllowNull(Boolean value) {
        setStrategyMethodAllowNull(value);
        return this;
    }

    public PollEnrichDefinition withAggregateOnException(Boolean value) {
        setAggregateOnException(value);
        return this;
    }

    @Override
    public PollEnrichDefinition withInheritErrorHandler(Boolean value) {
        setInheritErrorHandler(value);
        return this;
    }

    @Override
    public PollEnrichDefinition withDescription(DescriptionElement value) {
        setDescription(value);
        return this;
    }

    @Override
    public PollEnrichDefinition withCustomId(Boolean value) {
        setCustomId(value);
        return this;
    }

    @Override
    public PollEnrichDefinition withId(String value) {
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
