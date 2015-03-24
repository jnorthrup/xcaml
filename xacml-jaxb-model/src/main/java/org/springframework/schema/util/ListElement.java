//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.10-b140310.1920 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.24 at 02:18:23 PM PDT 
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
import org.springframework.schema.beans.DescriptionElement;
import org.springframework.schema.beans.ListOrSetType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.springframework.org/schema/beans}listOrSetType">
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="list-class" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlRootElement(name = "list")
public class ListElement
    extends ListOrSetType
{

    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "list-class")
    protected String listClass;
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
     * Gets the value of the listClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListClass() {
        return listClass;
    }

    /**
     * Sets the value of the listClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListClass(String value) {
        this.listClass = value;
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

    public ListElement withId(String value) {
        setId(value);
        return this;
    }

    public ListElement withListClass(String value) {
        setListClass(value);
        return this;
    }

    public ListElement withScope(String value) {
        setScope(value);
        return this;
    }

    @Override
    public ListElement withDescription(DescriptionElement value) {
        setDescription(value);
        return this;
    }

    @Override
    public ListElement withBeanOrRefOrIdref(Object... values) {
        if (values!= null) {
            for (Object value: values) {
                getBeanOrRefOrIdref().add(value);
            }
        }
        return this;
    }

    @Override
    public ListElement withBeanOrRefOrIdref(Collection<Object> values) {
        if (values!= null) {
            getBeanOrRefOrIdref().addAll(values);
        }
        return this;
    }

    @Override
    public ListElement withValueType(String value) {
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
