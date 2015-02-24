//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation,
// v2.2.10-b140310.1920
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.02.24 at 02:12:57 PM PST
//

package org.springframework.schema.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;

/**
 * <p>
 * Java class for propertyType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="propertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.springframework.org/schema/beans}description" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://www.springframework.org/schema/beans}meta"/>
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
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "propertyType", propOrder = {
    "description", "meta", "bean", "ref", "idref", "value", "_null", "array", "list", "set", "map",
    "props", "any"})
public class PropertyType {

  protected Description description;
  protected MetaType meta;
  protected Bean bean;
  protected Ref ref;
  protected Idref idref;
  protected Value value;
  @XmlElement(name = "null")
  protected Null _null;
  protected Array array;
  protected List list;
  protected Set set;
  protected Map map;
  protected Props props;
  @XmlAnyElement(lax = true)
  protected Object any;
  @XmlAttribute(name = "name", required = true)
  protected String name;
  @XmlAttribute(name = "ref")
  protected String refAttr;
  @XmlAttribute(name = "value")
  protected String valueAttr;

  /**
   * Gets the value of the description property.
   * 
   * @return possible object is {@link Description }
   * 
   */
  public Description getDescription() {
    return description;
  }

  /**
   * Sets the value of the description property.
   * 
   * @param value allowed object is {@link Description }
   * 
   */
  public void setDescription(Description value) {
    this.description = value;
  }

  /**
   * Gets the value of the meta property.
   * 
   * @return possible object is {@link MetaType }
   * 
   */
  public MetaType getMeta() {
    return meta;
  }

  /**
   * Sets the value of the meta property.
   * 
   * @param value allowed object is {@link MetaType }
   * 
   */
  public void setMeta(MetaType value) {
    this.meta = value;
  }

  /**
   * Gets the value of the bean property.
   * 
   * @return possible object is {@link Bean }
   * 
   */
  public Bean getBean() {
    return bean;
  }

  /**
   * Sets the value of the bean property.
   * 
   * @param value allowed object is {@link Bean }
   * 
   */
  public void setBean(Bean value) {
    this.bean = value;
  }

  /**
   * Gets the value of the ref property.
   * 
   * @return possible object is {@link Ref }
   * 
   */
  public Ref getRef() {
    return ref;
  }

  /**
   * Sets the value of the ref property.
   * 
   * @param value allowed object is {@link Ref }
   * 
   */
  public void setRef(Ref value) {
    this.ref = value;
  }

  /**
   * Gets the value of the idref property.
   * 
   * @return possible object is {@link Idref }
   * 
   */
  public Idref getIdref() {
    return idref;
  }

  /**
   * Sets the value of the idref property.
   * 
   * @param value allowed object is {@link Idref }
   * 
   */
  public void setIdref(Idref value) {
    this.idref = value;
  }

  /**
   * Gets the value of the value property.
   * 
   * @return possible object is {@link Value }
   * 
   */
  public Value getValue() {
    return value;
  }

  /**
   * Sets the value of the value property.
   * 
   * @param value allowed object is {@link Value }
   * 
   */
  public void setValue(Value value) {
    this.value = value;
  }

  /**
   * Gets the value of the null property.
   * 
   * @return possible object is {@link Null }
   * 
   */
  public Null getNull() {
    return _null;
  }

  /**
   * Sets the value of the null property.
   * 
   * @param value allowed object is {@link Null }
   * 
   */
  public void setNull(Null value) {
    this._null = value;
  }

  /**
   * Gets the value of the array property.
   * 
   * @return possible object is {@link Array }
   * 
   */
  public Array getArray() {
    return array;
  }

  /**
   * Sets the value of the array property.
   * 
   * @param value allowed object is {@link Array }
   * 
   */
  public void setArray(Array value) {
    this.array = value;
  }

  /**
   * Gets the value of the list property.
   * 
   * @return possible object is {@link List }
   * 
   */
  public List getList() {
    return list;
  }

  /**
   * Sets the value of the list property.
   * 
   * @param value allowed object is {@link List }
   * 
   */
  public void setList(List value) {
    this.list = value;
  }

  /**
   * Gets the value of the set property.
   * 
   * @return possible object is {@link Set }
   * 
   */
  public Set getSet() {
    return set;
  }

  /**
   * Sets the value of the set property.
   * 
   * @param value allowed object is {@link Set }
   * 
   */
  public void setSet(Set value) {
    this.set = value;
  }

  /**
   * Gets the value of the map property.
   * 
   * @return possible object is {@link Map }
   * 
   */
  public Map getMap() {
    return map;
  }

  /**
   * Sets the value of the map property.
   * 
   * @param value allowed object is {@link Map }
   * 
   */
  public void setMap(Map value) {
    this.map = value;
  }

  /**
   * Gets the value of the props property.
   * 
   * @return possible object is {@link Props }
   * 
   */
  public Props getProps() {
    return props;
  }

  /**
   * Sets the value of the props property.
   * 
   * @param value allowed object is {@link Props }
   * 
   */
  public void setProps(Props value) {
    this.props = value;
  }

  /**
   * Gets the value of the any property.
   * 
   * @return possible object is {@link Object }
   * 
   */
  public Object getAny() {
    return any;
  }

  /**
   * Sets the value of the any property.
   * 
   * @param value allowed object is {@link Object }
   * 
   */
  public void setAny(Object value) {
    this.any = value;
  }

  /**
   * Gets the value of the name property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the value of the name property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setName(String value) {
    this.name = value;
  }

  /**
   * Gets the value of the refAttr property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getRefAttr() {
    return refAttr;
  }

  /**
   * Sets the value of the refAttr property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setRefAttr(String value) {
    this.refAttr = value;
  }

  /**
   * Gets the value of the valueAttr property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getValueAttr() {
    return valueAttr;
  }

  /**
   * Sets the value of the valueAttr property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setValueAttr(String value) {
    this.valueAttr = value;
  }

  public PropertyType withDescription(Description value) {
    setDescription(value);
    return this;
  }

  public PropertyType withMeta(MetaType value) {
    setMeta(value);
    return this;
  }

  public PropertyType withBean(Bean value) {
    setBean(value);
    return this;
  }

  public PropertyType withRef(Ref value) {
    setRef(value);
    return this;
  }

  public PropertyType withIdref(Idref value) {
    setIdref(value);
    return this;
  }

  public PropertyType withValue(Value value) {
    setValue(value);
    return this;
  }

  public PropertyType withNull(Null value) {
    setNull(value);
    return this;
  }

  public PropertyType withArray(Array value) {
    setArray(value);
    return this;
  }

  public PropertyType withList(List value) {
    setList(value);
    return this;
  }

  public PropertyType withSet(Set value) {
    setSet(value);
    return this;
  }

  public PropertyType withMap(Map value) {
    setMap(value);
    return this;
  }

  public PropertyType withProps(Props value) {
    setProps(value);
    return this;
  }

  public PropertyType withAny(Object value) {
    setAny(value);
    return this;
  }

  public PropertyType withName(String value) {
    setName(value);
    return this;
  }

  public PropertyType withRefAttr(String value) {
    setRefAttr(value);
    return this;
  }

  public PropertyType withValueAttr(String value) {
    setValueAttr(value);
    return this;
  }

  /**
   * Generates a String representation of the contents of this type. This is an extension method, produced by the 'ts'
   * xjc plugin
   * 
   */
  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.DEFAULT_STYLE);
  }

}
