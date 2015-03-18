//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.10-b140310.1920 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.18 at 10:26:44 AM PDT 
//


package org.springframework.schema.beans;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for listOrSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listOrSetType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.springframework.org/schema/beans}collectionType">
 *       &lt;group ref="{http://www.springframework.org/schema/beans}collectionElements"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listOrSetType", propOrder = {
    "description",
    "beanOrRefOrIdref"
})
@XmlSeeAlso({
    org.springframework.schema.util.ListElement.class,
    org.springframework.schema.util.SetElement.class,
    org.springframework.schema.beans.SetElement.class,
    org.springframework.schema.beans.ListElement.class,
    ArrayElement.class
})
public class ListOrSetType
    extends CollectionType
{

    protected DescriptionElement description;
    @XmlElementRefs({
        @XmlElementRef(name = "ref", namespace = "http://www.springframework.org/schema/beans", type = RefElement.class, required = false),
        @XmlElementRef(name = "idref", namespace = "http://www.springframework.org/schema/beans", type = IdrefElement.class, required = false),
        @XmlElementRef(name = "bean", namespace = "http://www.springframework.org/schema/beans", type = BeanElement.class, required = false),
        @XmlElementRef(name = "props", namespace = "http://www.springframework.org/schema/beans", type = PropsElement.class, required = false),
        @XmlElementRef(name = "value", namespace = "http://www.springframework.org/schema/beans", type = ValueElement.class, required = false),
        @XmlElementRef(name = "null", namespace = "http://www.springframework.org/schema/beans", type = NullElement.class, required = false),
        @XmlElementRef(name = "array", namespace = "http://www.springframework.org/schema/beans", type = ArrayElement.class, required = false),
        @XmlElementRef(name = "set", namespace = "http://www.springframework.org/schema/beans", type = org.springframework.schema.beans.SetElement.class, required = false),
        @XmlElementRef(name = "map", namespace = "http://www.springframework.org/schema/beans", type = MapElement.class, required = false),
        @XmlElementRef(name = "list", namespace = "http://www.springframework.org/schema/beans", type = org.springframework.schema.beans.ListElement.class, required = false)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> beanOrRefOrIdref;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link DescriptionElement }
     *     
     */
    public DescriptionElement getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescriptionElement }
     *     
     */
    public void setDescription(DescriptionElement value) {
        this.description = value;
    }

    /**
     * Gets the value of the beanOrRefOrIdref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beanOrRefOrIdref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBeanOrRefOrIdref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RefElement }
     * {@link IdrefElement }
     * {@link BeanElement }
     * {@link PropsElement }
     * {@link ValueElement }
     * {@link NullElement }
     * {@link ArrayElement }
     * {@link org.springframework.schema.beans.SetElement }
     * {@link MapElement }
     * {@link org.springframework.schema.beans.ListElement }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getBeanOrRefOrIdref() {
        if (beanOrRefOrIdref == null) {
            beanOrRefOrIdref = new ArrayList<Object>();
        }
        return this.beanOrRefOrIdref;
    }

    public ListOrSetType withDescription(DescriptionElement value) {
        setDescription(value);
        return this;
    }

    public ListOrSetType withBeanOrRefOrIdref(Object... values) {
        if (values!= null) {
            for (Object value: values) {
                getBeanOrRefOrIdref().add(value);
            }
        }
        return this;
    }

    public ListOrSetType withBeanOrRefOrIdref(Collection<Object> values) {
        if (values!= null) {
            getBeanOrRefOrIdref().addAll(values);
        }
        return this;
    }

    @Override
    public ListOrSetType withValueType(String value) {
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
