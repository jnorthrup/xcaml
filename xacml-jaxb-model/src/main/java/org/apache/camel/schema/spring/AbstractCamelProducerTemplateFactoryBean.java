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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for abstractCamelProducerTemplateFactoryBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="abstractCamelProducerTemplateFactoryBean">
 *   &lt;complexContent>
 *     &lt;extension base="{http://camel.apache.org/schema/spring}abstractCamelFactoryBean">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="defaultEndpoint" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="maximumCacheSize" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abstractCamelProducerTemplateFactoryBean")
@XmlSeeAlso({
    CamelProducerTemplateFactoryBean.class
})
public abstract class AbstractCamelProducerTemplateFactoryBean
    extends AbstractCamelFactoryBean
{

    @XmlAttribute(name = "defaultEndpoint")
    protected String defaultEndpoint;
    @XmlAttribute(name = "maximumCacheSize")
    protected Integer maximumCacheSize;

    /**
     * Gets the value of the defaultEndpoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultEndpoint() {
        return defaultEndpoint;
    }

    /**
     * Sets the value of the defaultEndpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultEndpoint(String value) {
        this.defaultEndpoint = value;
    }

    /**
     * Gets the value of the maximumCacheSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaximumCacheSize() {
        return maximumCacheSize;
    }

    /**
     * Sets the value of the maximumCacheSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaximumCacheSize(Integer value) {
        this.maximumCacheSize = value;
    }

    public AbstractCamelProducerTemplateFactoryBean withDefaultEndpoint(String value) {
        setDefaultEndpoint(value);
        return this;
    }

    public AbstractCamelProducerTemplateFactoryBean withMaximumCacheSize(Integer value) {
        setMaximumCacheSize(value);
        return this;
    }

    @Override
    public AbstractCamelProducerTemplateFactoryBean withCamelContextId(String value) {
        setCamelContextId(value);
        return this;
    }

    @Override
    public AbstractCamelProducerTemplateFactoryBean withId(String value) {
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
