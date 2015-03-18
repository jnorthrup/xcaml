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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.springframework.schema.util.PropertiesElement;


/**
 * <p>Java class for propsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="propsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.springframework.org/schema/beans}collectionType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://www.springframework.org/schema/beans}prop"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "propsType", propOrder = {
    "prop"
})
@XmlSeeAlso({
    PropertiesElement.class,
    PropsElement.class
})
public class PropsType
    extends CollectionType
{

    protected List<PropElement> prop;

    /**
     * Gets the value of the prop property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prop property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropElement }
     * 
     * 
     */
    public List<PropElement> getProp() {
        if (prop == null) {
            prop = new ArrayList<PropElement>();
        }
        return this.prop;
    }

    public PropsType withProp(PropElement... values) {
        if (values!= null) {
            for (PropElement value: values) {
                getProp().add(value);
            }
        }
        return this;
    }

    public PropsType withProp(Collection<PropElement> values) {
        if (values!= null) {
            getProp().addAll(values);
        }
        return this;
    }

    @Override
    public PropsType withValueType(String value) {
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
