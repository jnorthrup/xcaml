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
 * Java class for Control_Type complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Control_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/visio/2003/core}NamedIndexedRow_Type">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="X" type="{http://schemas.microsoft.com/visio/2003/core}X_Type" minOccurs="0"/>
 *         &lt;element name="Y" type="{http://schemas.microsoft.com/visio/2003/core}Y_Type" minOccurs="0"/>
 *         &lt;element name="XDyn" type="{http://schemas.microsoft.com/visio/2003/core}XDyn_Type" minOccurs="0"/>
 *         &lt;element name="YDyn" type="{http://schemas.microsoft.com/visio/2003/core}YDyn_Type" minOccurs="0"/>
 *         &lt;element name="XCon" type="{http://schemas.microsoft.com/visio/2003/core}XCon_Type" minOccurs="0"/>
 *         &lt;element name="YCon" type="{http://schemas.microsoft.com/visio/2003/core}YCon_Type" minOccurs="0"/>
 *         &lt;element name="CanGlue" type="{http://schemas.microsoft.com/visio/2003/core}CanGlue_Type" minOccurs="0"/>
 *         &lt;element name="Prompt" type="{http://schemas.microsoft.com/visio/2003/core}Prompt_Type" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Control_Type", propOrder = {"xOrYOrXDyn"})
public class ControlType extends NamedIndexedRowType {

  @XmlElements({
      @XmlElement(name = "X", type = XType.class), @XmlElement(name = "Y", type = YType.class),
      @XmlElement(name = "XDyn", type = XDynType.class),
      @XmlElement(name = "YDyn", type = YDynType.class),
      @XmlElement(name = "XCon", type = XConType.class),
      @XmlElement(name = "YCon", type = YConType.class),
      @XmlElement(name = "CanGlue", type = CanGlueType.class),
      @XmlElement(name = "Prompt", type = PromptType.class)})
  protected List<CellType> xOrYOrXDyn;

  /**
   * Gets the value of the xOrYOrXDyn property.
   * 
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
   * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
   * the xOrYOrXDyn property.
   * 
   * <p>
   * For example, to add a new item, do as follows:
   * 
   * <pre>
     *    getXOrYOrXDyn().add(newItem);
     * </pre>
   * 
   * 
   * <p>
   * Objects of the following type(s) are allowed in the list {@link XType } {@link YType } {@link XDynType }
   * {@link YDynType } {@link XConType } {@link YConType } {@link CanGlueType } {@link PromptType }
   * 
   * 
   */
  public List<CellType> getXOrYOrXDyn() {
    if (xOrYOrXDyn == null) {
      xOrYOrXDyn = new ArrayList<CellType>();
    }
    return this.xOrYOrXDyn;
  }

  public ControlType withXOrYOrXDyn(CellType... values) {
    if (values != null) {
      for (CellType value : values) {
        getXOrYOrXDyn().add(value);
      }
    }
    return this;
  }

  public ControlType withXOrYOrXDyn(Collection<CellType> values) {
    if (values != null) {
      getXOrYOrXDyn().addAll(values);
    }
    return this;
  }

  @Override
  public ControlType withName(String value) {
    setName(value);
    return this;
  }

  @Override
  public ControlType withNameU(String value) {
    setNameU(value);
    return this;
  }

  @Override
  public ControlType withDel(BigInteger value) {
    setDel(value);
    return this;
  }

  @Override
  public ControlType withID(BigInteger value) {
    setID(value);
    return this;
  }

  @Override
  public ControlType withIX(BigInteger value) {
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