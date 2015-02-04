//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation,
// v2.2.10-b140310.1920
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.02.04 at 10:47:31 AM PST
//

package com.microsoft.schemas.visio._2006.extension;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;

/**
 * <p>
 * Java class for LineTo_Type complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LineTo_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/visio/2006/extension}IndexedRow_Type">
 *       &lt;sequence>
 *         &lt;element name="X" type="{http://schemas.microsoft.com/visio/2006/extension}X_Type" minOccurs="0"/>
 *         &lt;element name="Y" type="{http://schemas.microsoft.com/visio/2006/extension}Y_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineTo_Type", propOrder = {"x", "y"})
public class LineToType extends IndexedRowType {

  @XmlElement(name = "X")
  protected XType x;
  @XmlElement(name = "Y")
  protected YType y;

  /**
   * Gets the value of the x property.
   * 
   * @return possible object is {@link XType }
   * 
   */
  public XType getX() {
    return x;
  }

  /**
   * Sets the value of the x property.
   * 
   * @param value allowed object is {@link XType }
   * 
   */
  public void setX(XType value) {
    this.x = value;
  }

  /**
   * Gets the value of the y property.
   * 
   * @return possible object is {@link YType }
   * 
   */
  public YType getY() {
    return y;
  }

  /**
   * Sets the value of the y property.
   * 
   * @param value allowed object is {@link YType }
   * 
   */
  public void setY(YType value) {
    this.y = value;
  }

  public LineToType withX(XType value) {
    setX(value);
    return this;
  }

  public LineToType withY(YType value) {
    setY(value);
    return this;
  }

  @Override
  public LineToType withIX(BigInteger value) {
    setIX(value);
    return this;
  }

  @Override
  public LineToType withDel(BigInteger value) {
    setDel(value);
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
