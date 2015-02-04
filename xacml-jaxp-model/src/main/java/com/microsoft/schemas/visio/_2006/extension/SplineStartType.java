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
 * Java class for SplineStart_Type complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SplineStart_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/visio/2006/extension}IndexedRow_Type">
 *       &lt;sequence>
 *         &lt;element name="X" type="{http://schemas.microsoft.com/visio/2006/extension}X_Type" minOccurs="0"/>
 *         &lt;element name="Y" type="{http://schemas.microsoft.com/visio/2006/extension}Y_Type" minOccurs="0"/>
 *         &lt;element name="A" type="{http://schemas.microsoft.com/visio/2006/extension}A_Type" minOccurs="0"/>
 *         &lt;element name="B" type="{http://schemas.microsoft.com/visio/2006/extension}B_Type" minOccurs="0"/>
 *         &lt;element name="C" type="{http://schemas.microsoft.com/visio/2006/extension}C_Type" minOccurs="0"/>
 *         &lt;element name="D" type="{http://schemas.microsoft.com/visio/2006/extension}D_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SplineStart_Type", propOrder = {"x", "y", "a", "b", "c", "d"})
public class SplineStartType extends IndexedRowType {

  @XmlElement(name = "X")
  protected XType x;
  @XmlElement(name = "Y")
  protected YType y;
  @XmlElement(name = "A")
  protected AType a;
  @XmlElement(name = "B")
  protected BType b;
  @XmlElement(name = "C")
  protected CType c;
  @XmlElement(name = "D")
  protected DType d;

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

  /**
   * Gets the value of the a property.
   * 
   * @return possible object is {@link AType }
   * 
   */
  public AType getA() {
    return a;
  }

  /**
   * Sets the value of the a property.
   * 
   * @param value allowed object is {@link AType }
   * 
   */
  public void setA(AType value) {
    this.a = value;
  }

  /**
   * Gets the value of the b property.
   * 
   * @return possible object is {@link BType }
   * 
   */
  public BType getB() {
    return b;
  }

  /**
   * Sets the value of the b property.
   * 
   * @param value allowed object is {@link BType }
   * 
   */
  public void setB(BType value) {
    this.b = value;
  }

  /**
   * Gets the value of the c property.
   * 
   * @return possible object is {@link CType }
   * 
   */
  public CType getC() {
    return c;
  }

  /**
   * Sets the value of the c property.
   * 
   * @param value allowed object is {@link CType }
   * 
   */
  public void setC(CType value) {
    this.c = value;
  }

  /**
   * Gets the value of the d property.
   * 
   * @return possible object is {@link DType }
   * 
   */
  public DType getD() {
    return d;
  }

  /**
   * Sets the value of the d property.
   * 
   * @param value allowed object is {@link DType }
   * 
   */
  public void setD(DType value) {
    this.d = value;
  }

  public SplineStartType withX(XType value) {
    setX(value);
    return this;
  }

  public SplineStartType withY(YType value) {
    setY(value);
    return this;
  }

  public SplineStartType withA(AType value) {
    setA(value);
    return this;
  }

  public SplineStartType withB(BType value) {
    setB(value);
    return this;
  }

  public SplineStartType withC(CType value) {
    setC(value);
    return this;
  }

  public SplineStartType withD(DType value) {
    setD(value);
    return this;
  }

  @Override
  public SplineStartType withIX(BigInteger value) {
    setIX(value);
    return this;
  }

  @Override
  public SplineStartType withDel(BigInteger value) {
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
