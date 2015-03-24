//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.10-b140310.1920 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.24 at 02:18:23 PM PDT 
//


package org.springframework.schema.beans;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for mapType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mapType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.springframework.org/schema/beans}collectionType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.springframework.org/schema/beans}description" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://www.springframework.org/schema/beans}entry"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="key-type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mapType", propOrder = {
    "description",
    "entry"
})
@XmlSeeAlso({
    org.springframework.schema.util.MapElement.class,
    org.springframework.schema.beans.MapElement.class
})
public class MapType
    extends CollectionType
{

    protected DescriptionElement description;
    protected List<EntryType> entry;
    @XmlAttribute(name = "key-type")
    protected String keyType;

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
     * Gets the value of the entry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntryType }
     * 
     * 
     */
    public List<EntryType> getEntry() {
        if (entry == null) {
            entry = new ArrayList<EntryType>();
        }
        return this.entry;
    }

    /**
     * Gets the value of the keyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyType() {
        return keyType;
    }

    /**
     * Sets the value of the keyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyType(String value) {
        this.keyType = value;
    }

    public MapType withDescription(DescriptionElement value) {
        setDescription(value);
        return this;
    }

    public MapType withEntry(EntryType... values) {
        if (values!= null) {
            for (EntryType value: values) {
                getEntry().add(value);
            }
        }
        return this;
    }

    public MapType withEntry(Collection<EntryType> values) {
        if (values!= null) {
            getEntry().addAll(values);
        }
        return this;
    }

    public MapType withKeyType(String value) {
        setKeyType(value);
        return this;
    }

    @Override
    public MapType withValueType(String value) {
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
