//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation,
// v2.2.10-b140310.1920
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.02.04 at 10:47:31 AM PST
//

package com.microsoft.schemas.office.visio._2010.extension;

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
 * Java class for Connection_Type complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Connection_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/office/visio/2010/extension}NamedIndexedRow_Type">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="X" type="{http://schemas.microsoft.com/office/visio/2010/extension}X_Type" minOccurs="0"/>
 *         &lt;element name="Y" type="{http://schemas.microsoft.com/office/visio/2010/extension}Y_Type" minOccurs="0"/>
 *         &lt;element name="DirX" type="{http://schemas.microsoft.com/office/visio/2010/extension}DirX_Type" minOccurs="0"/>
 *         &lt;element name="DirY" type="{http://schemas.microsoft.com/office/visio/2010/extension}DirY_Type" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://schemas.microsoft.com/office/visio/2010/extension}Type_Type" minOccurs="0"/>
 *         &lt;element name="AutoGen" type="{http://schemas.microsoft.com/office/visio/2010/extension}AutoGen_Type" minOccurs="0"/>
 *         &lt;element name="Prompt" type="{http://schemas.microsoft.com/office/visio/2010/extension}Prompt_Type" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Connection_Type", propOrder = {"xOrYOrDirX"})
public class ConnectionType extends NamedIndexedRowType {

  @XmlElements({
      @XmlElement(name = "X", type = XType.class), @XmlElement(name = "Y", type = YType.class),
      @XmlElement(name = "DirX", type = DirXType.class),
      @XmlElement(name = "DirY", type = DirYType.class),
      @XmlElement(name = "Type", type = TypeType.class),
      @XmlElement(name = "AutoGen", type = AutoGenType.class),
      @XmlElement(name = "Prompt", type = PromptType.class)})
  protected List<CellType> xOrYOrDirX;

  /**
   * Gets the value of the xOrYOrDirX property.
   * 
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
   * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
   * the xOrYOrDirX property.
   * 
   * <p>
   * For example, to add a new item, do as follows:
   * 
   * <pre>
     *    getXOrYOrDirX().add(newItem);
     * </pre>
   * 
   * 
   * <p>
   * Objects of the following type(s) are allowed in the list {@link XType } {@link YType } {@link DirXType }
   * {@link DirYType } {@link TypeType } {@link AutoGenType } {@link PromptType }
   * 
   * 
   */
  public List<CellType> getXOrYOrDirX() {
    if (xOrYOrDirX == null) {
      xOrYOrDirX = new ArrayList<CellType>();
    }
    return this.xOrYOrDirX;
  }

  public ConnectionType withXOrYOrDirX(CellType... values) {
    if (values != null) {
      for (CellType value : values) {
        getXOrYOrDirX().add(value);
      }
    }
    return this;
  }

  public ConnectionType withXOrYOrDirX(Collection<CellType> values) {
    if (values != null) {
      getXOrYOrDirX().addAll(values);
    }
    return this;
  }

  @Override
  public ConnectionType withName(String value) {
    setName(value);
    return this;
  }

  @Override
  public ConnectionType withNameU(String value) {
    setNameU(value);
    return this;
  }

  @Override
  public ConnectionType withDel(BigInteger value) {
    setDel(value);
    return this;
  }

  @Override
  public ConnectionType withID(BigInteger value) {
    setID(value);
    return this;
  }

  @Override
  public ConnectionType withIX(BigInteger value) {
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
