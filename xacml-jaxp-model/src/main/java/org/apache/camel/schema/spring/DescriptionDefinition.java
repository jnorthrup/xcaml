//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation,
// v2.2.10-b140310.1920
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.02.24 at 01:59:12 PM PST
//

package org.apache.camel.schema.spring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;

/**
 * <p>
 * Java class for descriptionDefinition complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="descriptionDefinition">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="lang" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="layoutX" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="layoutY" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="layoutWidth" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="layoutHeight" type="{http://www.w3.org/2001/XMLSchema}double" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "descriptionDefinition", propOrder = {"value"})
public class DescriptionDefinition {

  @XmlValue
  protected String value;
  @XmlAttribute(name = "lang")
  protected String lang;
  @XmlAttribute(name = "layoutX")
  protected Double layoutX;
  @XmlAttribute(name = "layoutY")
  protected Double layoutY;
  @XmlAttribute(name = "layoutWidth")
  protected Double layoutWidth;
  @XmlAttribute(name = "layoutHeight")
  protected Double layoutHeight;

  /**
   * Gets the value of the value property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getValue() {
    return value;
  }

  /**
   * Sets the value of the value property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * Gets the value of the lang property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getLang() {
    return lang;
  }

  /**
   * Sets the value of the lang property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setLang(String value) {
    this.lang = value;
  }

  /**
   * Gets the value of the layoutX property.
   * 
   * @return possible object is {@link Double }
   * 
   */
  public Double getLayoutX() {
    return layoutX;
  }

  /**
   * Sets the value of the layoutX property.
   * 
   * @param value allowed object is {@link Double }
   * 
   */
  public void setLayoutX(Double value) {
    this.layoutX = value;
  }

  /**
   * Gets the value of the layoutY property.
   * 
   * @return possible object is {@link Double }
   * 
   */
  public Double getLayoutY() {
    return layoutY;
  }

  /**
   * Sets the value of the layoutY property.
   * 
   * @param value allowed object is {@link Double }
   * 
   */
  public void setLayoutY(Double value) {
    this.layoutY = value;
  }

  /**
   * Gets the value of the layoutWidth property.
   * 
   * @return possible object is {@link Double }
   * 
   */
  public Double getLayoutWidth() {
    return layoutWidth;
  }

  /**
   * Sets the value of the layoutWidth property.
   * 
   * @param value allowed object is {@link Double }
   * 
   */
  public void setLayoutWidth(Double value) {
    this.layoutWidth = value;
  }

  /**
   * Gets the value of the layoutHeight property.
   * 
   * @return possible object is {@link Double }
   * 
   */
  public Double getLayoutHeight() {
    return layoutHeight;
  }

  /**
   * Sets the value of the layoutHeight property.
   * 
   * @param value allowed object is {@link Double }
   * 
   */
  public void setLayoutHeight(Double value) {
    this.layoutHeight = value;
  }

  public DescriptionDefinition withValue(String value) {
    setValue(value);
    return this;
  }

  public DescriptionDefinition withLang(String value) {
    setLang(value);
    return this;
  }

  public DescriptionDefinition withLayoutX(Double value) {
    setLayoutX(value);
    return this;
  }

  public DescriptionDefinition withLayoutY(Double value) {
    setLayoutY(value);
    return this;
  }

  public DescriptionDefinition withLayoutWidth(Double value) {
    setLayoutWidth(value);
    return this;
  }

  public DescriptionDefinition withLayoutHeight(Double value) {
    setLayoutHeight(value);
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
