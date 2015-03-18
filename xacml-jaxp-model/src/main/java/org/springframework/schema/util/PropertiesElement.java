//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.10-b140310.1920 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.18 at 10:26:44 AM PDT 
//


package org.springframework.schema.util;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.springframework.schema.beans.PropElement;
import org.springframework.schema.beans.PropsType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.springframework.org/schema/beans}propsType">
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="location" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ignore-resource-not-found" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="local-override" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="scope" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "properties")
public class PropertiesElement
    extends PropsType
{

    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "location")
    protected String location;
    @XmlAttribute(name = "ignore-resource-not-found")
    protected Boolean ignoreResourceNotFound;
    @XmlAttribute(name = "local-override")
    protected Boolean localOverride;
    @XmlAttribute(name = "scope")
    protected String scope;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the ignoreResourceNotFound property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIgnoreResourceNotFound() {
        if (ignoreResourceNotFound == null) {
            return false;
        } else {
            return ignoreResourceNotFound;
        }
    }

    /**
     * Sets the value of the ignoreResourceNotFound property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreResourceNotFound(Boolean value) {
        this.ignoreResourceNotFound = value;
    }

    /**
     * Gets the value of the localOverride property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isLocalOverride() {
        if (localOverride == null) {
            return false;
        } else {
            return localOverride;
        }
    }

    /**
     * Sets the value of the localOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocalOverride(Boolean value) {
        this.localOverride = value;
    }

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScope(String value) {
        this.scope = value;
    }

    public PropertiesElement withId(String value) {
        setId(value);
        return this;
    }

    public PropertiesElement withLocation(String value) {
        setLocation(value);
        return this;
    }

    public PropertiesElement withIgnoreResourceNotFound(Boolean value) {
        setIgnoreResourceNotFound(value);
        return this;
    }

    public PropertiesElement withLocalOverride(Boolean value) {
        setLocalOverride(value);
        return this;
    }

    public PropertiesElement withScope(String value) {
        setScope(value);
        return this;
    }

    @Override
    public PropertiesElement withProp(PropElement... values) {
        if (values!= null) {
            for (PropElement value: values) {
                getProp().add(value);
            }
        }
        return this;
    }

    @Override
    public PropertiesElement withProp(Collection<PropElement> values) {
        if (values!= null) {
            getProp().addAll(values);
        }
        return this;
    }

    @Override
    public PropertiesElement withValueType(String value) {
        setValueType(value);
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
