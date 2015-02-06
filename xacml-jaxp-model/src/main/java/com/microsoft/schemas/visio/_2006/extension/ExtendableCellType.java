//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation,
// v2.2.10-b140310.1920
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.02.04 at 10:47:31 AM PST
//

package com.microsoft.schemas.visio._2006.extension;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;

/**
 * <p>
 * Java class for ExtendableCell_Type complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtendableCell_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="SolutionXML" type="{http://schemas.microsoft.com/visio/2006/extension}SolutionXML_Type"/>
 *       &lt;/choice>
 *       &lt;attribute name="Unit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="F" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Err" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="V" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendableCell_Type", propOrder = {"content"})
@XmlSeeAlso({AType.class, ValueType.class, CType.class, DType.class, BType.class})
public class ExtendableCellType {

  @XmlElementRef(name = "SolutionXML", namespace = "http://schemas.microsoft.com/visio/2006/extension", type = JAXBElement.class, required = false)
  @XmlMixed
  protected List<Serializable> content;
  @XmlAttribute(name = "Unit")
  protected String unit;
  @XmlAttribute(name = "F")
  protected String f;
  @XmlAttribute(name = "Err")
  protected String err;
  @XmlAttribute(name = "V")
  protected String v;

  /**
   * Gets the value of the content property.
   * 
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
   * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
   * the content property.
   * 
   * <p>
   * For example, to add a new item, do as follows:
   * 
   * <pre>
     *    getContent().add(newItem);
     * </pre>
   * 
   * 
   * <p>
   * Objects of the following type(s) are allowed in the list {@link JAXBElement }{@code <}{@link SolutionXMLType }
   * {@code >} {@link String }
   * 
   * 
   */
  public List<Serializable> getContent() {
    if (content == null) {
      content = new ArrayList<Serializable>();
    }
    return this.content;
  }

  /**
   * Gets the value of the unit property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getUnit() {
    return unit;
  }

  /**
   * Sets the value of the unit property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setUnit(String value) {
    this.unit = value;
  }

  /**
   * Gets the value of the f property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getF() {
    return f;
  }

  /**
   * Sets the value of the f property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setF(String value) {
    this.f = value;
  }

  /**
   * Gets the value of the err property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getErr() {
    return err;
  }

  /**
   * Sets the value of the err property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setErr(String value) {
    this.err = value;
  }

  /**
   * Gets the value of the v property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getV() {
    return v;
  }

  /**
   * Sets the value of the v property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setV(String value) {
    this.v = value;
  }

  public ExtendableCellType withContent(Serializable... values) {
    if (values != null) {
      for (Serializable value : values) {
        getContent().add(value);
      }
    }
    return this;
  }

  public ExtendableCellType withContent(Collection<Serializable> values) {
    if (values != null) {
      getContent().addAll(values);
    }
    return this;
  }

  public ExtendableCellType withUnit(String value) {
    setUnit(value);
    return this;
  }

  public ExtendableCellType withF(String value) {
    setF(value);
    return this;
  }

  public ExtendableCellType withErr(String value) {
    setErr(value);
    return this;
  }

  public ExtendableCellType withV(String value) {
    setV(value);
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