//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.10-b140310.1920 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.24 at 02:18:22 PM PDT 
//


package org.apache.camel.schema.spring;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for restDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="restDefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://camel.apache.org/schema/spring}optionalIdentifiedDefinition">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://camel.apache.org/schema/spring}verb"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}delete"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}get"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}head"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}post"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}put"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="path" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="consumes" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="produces" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bindingMode" type="{http://camel.apache.org/schema/spring}restBindingMode" />
 *       &lt;attribute name="skipBindingOnErrorCode" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="enableCORS" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "restDefinition", propOrder = {
    "verbOrDeleteOrGet"
})
public class RestDefinition
    extends OptionalIdentifiedDefinition
{

    @XmlElements({
        @XmlElement(name = "verb"),
        @XmlElement(name = "delete", type = DeleteVerbDefinition.class),
        @XmlElement(name = "get", type = GetVerbDefinition.class),
        @XmlElement(name = "head", type = HeadVerbDefinition.class),
        @XmlElement(name = "post", type = PostVerbDefinition.class),
        @XmlElement(name = "put", type = PutElement.class)
    })
    protected List<VerbDefinition> verbOrDeleteOrGet;
    @XmlAttribute(name = "path")
    protected String path;
    @XmlAttribute(name = "consumes")
    protected String consumes;
    @XmlAttribute(name = "produces")
    protected String produces;
    @XmlAttribute(name = "bindingMode")
    protected RestBindingMode bindingMode;
    @XmlAttribute(name = "skipBindingOnErrorCode")
    protected Boolean skipBindingOnErrorCode;
    @XmlAttribute(name = "enableCORS")
    protected Boolean enableCORS;

    /**
     * Gets the value of the verbOrDeleteOrGet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the verbOrDeleteOrGet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVerbOrDeleteOrGet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VerbDefinition }
     * {@link DeleteVerbDefinition }
     * {@link GetVerbDefinition }
     * {@link HeadVerbDefinition }
     * {@link PostVerbDefinition }
     * {@link PutElement }
     * 
     * 
     */
    public List<VerbDefinition> getVerbOrDeleteOrGet() {
        if (verbOrDeleteOrGet == null) {
            verbOrDeleteOrGet = new ArrayList<VerbDefinition>();
        }
        return this.verbOrDeleteOrGet;
    }

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath(String value) {
        this.path = value;
    }

    /**
     * Gets the value of the consumes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumes() {
        return consumes;
    }

    /**
     * Sets the value of the consumes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumes(String value) {
        this.consumes = value;
    }

    /**
     * Gets the value of the produces property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduces() {
        return produces;
    }

    /**
     * Sets the value of the produces property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduces(String value) {
        this.produces = value;
    }

    /**
     * Gets the value of the bindingMode property.
     * 
     * @return
     *     possible object is
     *     {@link RestBindingMode }
     *     
     */
    public RestBindingMode getBindingMode() {
        return bindingMode;
    }

    /**
     * Sets the value of the bindingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestBindingMode }
     *     
     */
    public void setBindingMode(RestBindingMode value) {
        this.bindingMode = value;
    }

    /**
     * Gets the value of the skipBindingOnErrorCode property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSkipBindingOnErrorCode() {
        return skipBindingOnErrorCode;
    }

    /**
     * Sets the value of the skipBindingOnErrorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSkipBindingOnErrorCode(Boolean value) {
        this.skipBindingOnErrorCode = value;
    }

    /**
     * Gets the value of the enableCORS property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableCORS() {
        return enableCORS;
    }

    /**
     * Sets the value of the enableCORS property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableCORS(Boolean value) {
        this.enableCORS = value;
    }

    public RestDefinition withVerbOrDeleteOrGet(VerbDefinition... values) {
        if (values!= null) {
            for (VerbDefinition value: values) {
                getVerbOrDeleteOrGet().add(value);
            }
        }
        return this;
    }

    public RestDefinition withVerbOrDeleteOrGet(Collection<VerbDefinition> values) {
        if (values!= null) {
            getVerbOrDeleteOrGet().addAll(values);
        }
        return this;
    }

    public RestDefinition withPath(String value) {
        setPath(value);
        return this;
    }

    public RestDefinition withConsumes(String value) {
        setConsumes(value);
        return this;
    }

    public RestDefinition withProduces(String value) {
        setProduces(value);
        return this;
    }

    public RestDefinition withBindingMode(RestBindingMode value) {
        setBindingMode(value);
        return this;
    }

    public RestDefinition withSkipBindingOnErrorCode(Boolean value) {
        setSkipBindingOnErrorCode(value);
        return this;
    }

    public RestDefinition withEnableCORS(Boolean value) {
        setEnableCORS(value);
        return this;
    }

    @Override
    public RestDefinition withDescription(DescriptionElement value) {
        setDescription(value);
        return this;
    }

    @Override
    public RestDefinition withCustomId(Boolean value) {
        setCustomId(value);
        return this;
    }

    @Override
    public RestDefinition withId(String value) {
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
