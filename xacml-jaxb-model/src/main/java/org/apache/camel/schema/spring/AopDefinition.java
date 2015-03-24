//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.10-b140310.1920 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.24 at 02:18:22 PM PDT 
//


package org.apache.camel.schema.spring;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for aopDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="aopDefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://camel.apache.org/schema/spring}output">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="beforeUri" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="afterUri" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="afterFinallyUri" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;anyAttribute processContents='skip' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aopDefinition")
public class AopDefinition
    extends Output
{

    @XmlAttribute(name = "beforeUri")
    protected String beforeUri;
    @XmlAttribute(name = "afterUri")
    protected String afterUri;
    @XmlAttribute(name = "afterFinallyUri")
    protected String afterFinallyUri;

    /**
     * Gets the value of the beforeUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeforeUri() {
        return beforeUri;
    }

    /**
     * Sets the value of the beforeUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeforeUri(String value) {
        this.beforeUri = value;
    }

    /**
     * Gets the value of the afterUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAfterUri() {
        return afterUri;
    }

    /**
     * Sets the value of the afterUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAfterUri(String value) {
        this.afterUri = value;
    }

    /**
     * Gets the value of the afterFinallyUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAfterFinallyUri() {
        return afterFinallyUri;
    }

    /**
     * Sets the value of the afterFinallyUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAfterFinallyUri(String value) {
        this.afterFinallyUri = value;
    }

    public AopDefinition withBeforeUri(String value) {
        setBeforeUri(value);
        return this;
    }

    public AopDefinition withAfterUri(String value) {
        setAfterUri(value);
        return this;
    }

    public AopDefinition withAfterFinallyUri(String value) {
        setAfterFinallyUri(value);
        return this;
    }

    @Override
    public AopDefinition withAopOrAggregateOrBean(ProcessorDefinition... values) {
        if (values!= null) {
            for (ProcessorDefinition value: values) {
                getAopOrAggregateOrBean().add(value);
            }
        }
        return this;
    }

    @Override
    public AopDefinition withAopOrAggregateOrBean(Collection<ProcessorDefinition> values) {
        if (values!= null) {
            getAopOrAggregateOrBean().addAll(values);
        }
        return this;
    }

    @Override
    public AopDefinition withInheritErrorHandler(Boolean value) {
        setInheritErrorHandler(value);
        return this;
    }

    @Override
    public AopDefinition withDescription(DescriptionElement value) {
        setDescription(value);
        return this;
    }

    @Override
    public AopDefinition withCustomId(Boolean value) {
        setCustomId(value);
        return this;
    }

    @Override
    public AopDefinition withId(String value) {
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
