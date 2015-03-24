//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.10-b140310.1920 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.24 at 02:18:23 PM PDT 
//


package org.springframework.schema.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.springframework.org/schema/beans}description" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://www.springframework.org/schema/beans}bean"/>
 *           &lt;element ref="{http://www.springframework.org/schema/beans}ref"/>
 *           &lt;element ref="{http://www.springframework.org/schema/beans}idref"/>
 *           &lt;element ref="{http://www.springframework.org/schema/beans}value"/>
 *           &lt;element ref="{http://www.springframework.org/schema/beans}null"/>
 *           &lt;element ref="{http://www.springframework.org/schema/beans}array"/>
 *           &lt;element ref="{http://www.springframework.org/schema/beans}list"/>
 *           &lt;element ref="{http://www.springframework.org/schema/beans}set"/>
 *           &lt;element ref="{http://www.springframework.org/schema/beans}map"/>
 *           &lt;element ref="{http://www.springframework.org/schema/beans}props"/>
 *           &lt;any namespace='##other'/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="index" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ref" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "description",
    "bean",
    "ref",
    "idref",
    "value",
    "_null",
    "array",
    "list",
    "set",
    "map",
    "props",
    "any"
})
@XmlRootElement(name = "constructor-arg")
public class ConstructorArgElement {

    protected DescriptionElement description;
    protected BeanElement bean;
    protected RefElement ref;
    protected IdrefElement idref;
    protected ValueElement value;
    @XmlElement(name = "null")
    protected NullElement _null;
    protected ArrayElement array;
    protected ListElement list;
    protected SetElement set;
    protected MapElement map;
    protected PropsElement props;
    @XmlAnyElement(lax = true)
    protected Object any;
    @XmlAttribute(name = "index")
    protected String index;
    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "ref")
    protected String refAttr;
    @XmlAttribute(name = "value")
    protected String valueAttr;

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
     * Gets the value of the bean property.
     * 
     * @return
     *     possible object is
     *     {@link BeanElement }
     *     
     */
    public BeanElement getBean() {
        return bean;
    }

    /**
     * Sets the value of the bean property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeanElement }
     *     
     */
    public void setBean(BeanElement value) {
        this.bean = value;
    }

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link RefElement }
     *     
     */
    public RefElement getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefElement }
     *     
     */
    public void setRef(RefElement value) {
        this.ref = value;
    }

    /**
     * Gets the value of the idref property.
     * 
     * @return
     *     possible object is
     *     {@link IdrefElement }
     *     
     */
    public IdrefElement getIdref() {
        return idref;
    }

    /**
     * Sets the value of the idref property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdrefElement }
     *     
     */
    public void setIdref(IdrefElement value) {
        this.idref = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link ValueElement }
     *     
     */
    public ValueElement getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueElement }
     *     
     */
    public void setValue(ValueElement value) {
        this.value = value;
    }

    /**
     * Gets the value of the null property.
     * 
     * @return
     *     possible object is
     *     {@link NullElement }
     *     
     */
    public NullElement getNull() {
        return _null;
    }

    /**
     * Sets the value of the null property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullElement }
     *     
     */
    public void setNull(NullElement value) {
        this._null = value;
    }

    /**
     * Gets the value of the array property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayElement }
     *     
     */
    public ArrayElement getArray() {
        return array;
    }

    /**
     * Sets the value of the array property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayElement }
     *     
     */
    public void setArray(ArrayElement value) {
        this.array = value;
    }

    /**
     * Gets the value of the list property.
     * 
     * @return
     *     possible object is
     *     {@link ListElement }
     *     
     */
    public ListElement getList() {
        return list;
    }

    /**
     * Sets the value of the list property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListElement }
     *     
     */
    public void setList(ListElement value) {
        this.list = value;
    }

    /**
     * Gets the value of the set property.
     * 
     * @return
     *     possible object is
     *     {@link SetElement }
     *     
     */
    public SetElement getSet() {
        return set;
    }

    /**
     * Sets the value of the set property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetElement }
     *     
     */
    public void setSet(SetElement value) {
        this.set = value;
    }

    /**
     * Gets the value of the map property.
     * 
     * @return
     *     possible object is
     *     {@link MapElement }
     *     
     */
    public MapElement getMap() {
        return map;
    }

    /**
     * Sets the value of the map property.
     * 
     * @param value
     *     allowed object is
     *     {@link MapElement }
     *     
     */
    public void setMap(MapElement value) {
        this.map = value;
    }

    /**
     * Gets the value of the props property.
     * 
     * @return
     *     possible object is
     *     {@link PropsElement }
     *     
     */
    public PropsElement getProps() {
        return props;
    }

    /**
     * Sets the value of the props property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropsElement }
     *     
     */
    public void setProps(PropsElement value) {
        this.props = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAny() {
        return any;
    }

    /**
     * Sets the value of the any property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAny(Object value) {
        this.any = value;
    }

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndex(String value) {
        this.index = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the refAttr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefAttr() {
        return refAttr;
    }

    /**
     * Sets the value of the refAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefAttr(String value) {
        this.refAttr = value;
    }

    /**
     * Gets the value of the valueAttr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueAttr() {
        return valueAttr;
    }

    /**
     * Sets the value of the valueAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueAttr(String value) {
        this.valueAttr = value;
    }

    public ConstructorArgElement withDescription(DescriptionElement value) {
        setDescription(value);
        return this;
    }

    public ConstructorArgElement withBean(BeanElement value) {
        setBean(value);
        return this;
    }

    public ConstructorArgElement withRef(RefElement value) {
        setRef(value);
        return this;
    }

    public ConstructorArgElement withIdref(IdrefElement value) {
        setIdref(value);
        return this;
    }

    public ConstructorArgElement withValue(ValueElement value) {
        setValue(value);
        return this;
    }

    public ConstructorArgElement withNull(NullElement value) {
        setNull(value);
        return this;
    }

    public ConstructorArgElement withArray(ArrayElement value) {
        setArray(value);
        return this;
    }

    public ConstructorArgElement withList(ListElement value) {
        setList(value);
        return this;
    }

    public ConstructorArgElement withSet(SetElement value) {
        setSet(value);
        return this;
    }

    public ConstructorArgElement withMap(MapElement value) {
        setMap(value);
        return this;
    }

    public ConstructorArgElement withProps(PropsElement value) {
        setProps(value);
        return this;
    }

    public ConstructorArgElement withAny(Object value) {
        setAny(value);
        return this;
    }

    public ConstructorArgElement withIndex(String value) {
        setIndex(value);
        return this;
    }

    public ConstructorArgElement withType(String value) {
        setType(value);
        return this;
    }

    public ConstructorArgElement withName(String value) {
        setName(value);
        return this;
    }

    public ConstructorArgElement withRefAttr(String value) {
        setRefAttr(value);
        return this;
    }

    public ConstructorArgElement withValueAttr(String value) {
        setValueAttr(value);
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
