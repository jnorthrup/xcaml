//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation,
// v2.2.10-b140310.1920
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.02.04 at 10:47:30 AM PST
//

package com.microsoft.schemas.visio._2003.core;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;

/**
 * <p>
 * Java class for ConnectionABCD_Type complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConnectionABCD_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/visio/2003/core}NamedIndexedRow_Type">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="X" type="{http://schemas.microsoft.com/visio/2003/core}X_Type" minOccurs="0"/>
 *         &lt;element name="Y" type="{http://schemas.microsoft.com/visio/2003/core}Y_Type" minOccurs="0"/>
 *         &lt;element name="A" type="{http://schemas.microsoft.com/visio/2003/core}A_Type" minOccurs="0"/>
 *         &lt;element name="B" type="{http://schemas.microsoft.com/visio/2003/core}B_Type" minOccurs="0"/>
 *         &lt;element name="C" type="{http://schemas.microsoft.com/visio/2003/core}C_Type" minOccurs="0"/>
 *         &lt;element name="D" type="{http://schemas.microsoft.com/visio/2003/core}D_Type" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectionABCD_Type", propOrder = {"xOrYOrA"})
public class ConnectionABCDType extends NamedIndexedRowType {

  @XmlElements({
      @XmlElement(name = "X", type = XType.class), @XmlElement(name = "Y", type = YType.class),
      @XmlElement(name = "A", type = AType.class), @XmlElement(name = "B", type = BType.class),
      @XmlElement(name = "C", type = CType.class), @XmlElement(name = "D", type = DType.class)})
  protected List<Object> xOrYOrA;

  /**
   * Gets the value of the xOrYOrA property.
   * 
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
   * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
   * the xOrYOrA property.
   * 
   * <p>
   * For example, to add a new item, do as follows:
   * 
   * <pre>
     *    getXOrYOrA().add(newItem);
     * </pre>
   * 
   * 
   * <p>
   * Objects of the following type(s) are allowed in the list {@link XType } {@link YType } {@link AType } {@link BType }
   * {@link CType } {@link DType }
   * 
   * 
   */
  public List<Object> getXOrYOrA() {
    if (xOrYOrA == null) {
      xOrYOrA = new ArrayList<Object>();
    }
    return this.xOrYOrA;
  }

  public ConnectionABCDType withXOrYOrA(Object... values) {
    if (values != null) {
      for (Object value : values) {
        getXOrYOrA().add(value);
      }
    }
    return this;
  }

  public ConnectionABCDType withXOrYOrA(Collection<Object> values) {
    if (values != null) {
      getXOrYOrA().addAll(values);
    }
    return this;
  }

  @Override
  public ConnectionABCDType withName(String value) {
    setName(value);
    return this;
  }

  @Override
  public ConnectionABCDType withNameU(String value) {
    setNameU(value);
    return this;
  }

  @Override
  public ConnectionABCDType withDel(BigInteger value) {
    setDel(value);
    return this;
  }

  @Override
  public ConnectionABCDType withID(BigInteger value) {
    setID(value);
    return this;
  }

  @Override
  public ConnectionABCDType withIX(BigInteger value) {
    setIX(value);
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
