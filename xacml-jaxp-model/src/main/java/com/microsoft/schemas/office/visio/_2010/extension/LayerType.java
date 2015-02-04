//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation,
// v2.2.10-b140310.1920
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.02.04 at 10:47:31 AM PST
//

package com.microsoft.schemas.office.visio._2010.extension;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;

/**
 * <p>
 * Java class for Layer_Type complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Layer_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/office/visio/2010/extension}IndexedRow_Type">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://schemas.microsoft.com/office/visio/2010/extension}Name_Type" minOccurs="0"/>
 *         &lt;element name="Color" type="{http://schemas.microsoft.com/office/visio/2010/extension}Color_Type" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://schemas.microsoft.com/office/visio/2010/extension}Status_Type" minOccurs="0"/>
 *         &lt;element name="Visible" type="{http://schemas.microsoft.com/office/visio/2010/extension}Visible_Type" minOccurs="0"/>
 *         &lt;element name="Print" type="{http://schemas.microsoft.com/office/visio/2010/extension}Print_Type" minOccurs="0"/>
 *         &lt;element name="Active" type="{http://schemas.microsoft.com/office/visio/2010/extension}Active_Type" minOccurs="0"/>
 *         &lt;element name="Lock" type="{http://schemas.microsoft.com/office/visio/2010/extension}Lock_Type" minOccurs="0"/>
 *         &lt;element name="Snap" type="{http://schemas.microsoft.com/office/visio/2010/extension}Snap_Type" minOccurs="0"/>
 *         &lt;element name="Glue" type="{http://schemas.microsoft.com/office/visio/2010/extension}Glue_Type" minOccurs="0"/>
 *         &lt;element name="NameUniv" type="{http://schemas.microsoft.com/office/visio/2010/extension}NameUniv_Type" minOccurs="0"/>
 *         &lt;element name="ColorTrans" type="{http://schemas.microsoft.com/office/visio/2010/extension}ColorTrans_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Layer_Type", propOrder = {
    "name", "color", "status", "visible", "print", "active", "lock", "snap", "glue", "nameUniv",
    "colorTrans"})
public class LayerType extends IndexedRowType {

  @XmlElement(name = "Name")
  protected NameType name;
  @XmlElement(name = "Color")
  protected ColorType color;
  @XmlElement(name = "Status")
  protected StatusType status;
  @XmlElement(name = "Visible")
  protected VisibleType visible;
  @XmlElement(name = "Print")
  protected PrintType print;
  @XmlElement(name = "Active")
  protected ActiveType active;
  @XmlElement(name = "Lock")
  protected LockType lock;
  @XmlElement(name = "Snap")
  protected SnapType snap;
  @XmlElement(name = "Glue")
  protected GlueType glue;
  @XmlElement(name = "NameUniv")
  protected NameUnivType nameUniv;
  @XmlElement(name = "ColorTrans")
  protected ColorTransType colorTrans;

  /**
   * Gets the value of the name property.
   * 
   * @return possible object is {@link NameType }
   * 
   */
  public NameType getName() {
    return name;
  }

  /**
   * Sets the value of the name property.
   * 
   * @param value allowed object is {@link NameType }
   * 
   */
  public void setName(NameType value) {
    this.name = value;
  }

  /**
   * Gets the value of the color property.
   * 
   * @return possible object is {@link ColorType }
   * 
   */
  public ColorType getColor() {
    return color;
  }

  /**
   * Sets the value of the color property.
   * 
   * @param value allowed object is {@link ColorType }
   * 
   */
  public void setColor(ColorType value) {
    this.color = value;
  }

  /**
   * Gets the value of the status property.
   * 
   * @return possible object is {@link StatusType }
   * 
   */
  public StatusType getStatus() {
    return status;
  }

  /**
   * Sets the value of the status property.
   * 
   * @param value allowed object is {@link StatusType }
   * 
   */
  public void setStatus(StatusType value) {
    this.status = value;
  }

  /**
   * Gets the value of the visible property.
   * 
   * @return possible object is {@link VisibleType }
   * 
   */
  public VisibleType getVisible() {
    return visible;
  }

  /**
   * Sets the value of the visible property.
   * 
   * @param value allowed object is {@link VisibleType }
   * 
   */
  public void setVisible(VisibleType value) {
    this.visible = value;
  }

  /**
   * Gets the value of the print property.
   * 
   * @return possible object is {@link PrintType }
   * 
   */
  public PrintType getPrint() {
    return print;
  }

  /**
   * Sets the value of the print property.
   * 
   * @param value allowed object is {@link PrintType }
   * 
   */
  public void setPrint(PrintType value) {
    this.print = value;
  }

  /**
   * Gets the value of the active property.
   * 
   * @return possible object is {@link ActiveType }
   * 
   */
  public ActiveType getActive() {
    return active;
  }

  /**
   * Sets the value of the active property.
   * 
   * @param value allowed object is {@link ActiveType }
   * 
   */
  public void setActive(ActiveType value) {
    this.active = value;
  }

  /**
   * Gets the value of the lock property.
   * 
   * @return possible object is {@link LockType }
   * 
   */
  public LockType getLock() {
    return lock;
  }

  /**
   * Sets the value of the lock property.
   * 
   * @param value allowed object is {@link LockType }
   * 
   */
  public void setLock(LockType value) {
    this.lock = value;
  }

  /**
   * Gets the value of the snap property.
   * 
   * @return possible object is {@link SnapType }
   * 
   */
  public SnapType getSnap() {
    return snap;
  }

  /**
   * Sets the value of the snap property.
   * 
   * @param value allowed object is {@link SnapType }
   * 
   */
  public void setSnap(SnapType value) {
    this.snap = value;
  }

  /**
   * Gets the value of the glue property.
   * 
   * @return possible object is {@link GlueType }
   * 
   */
  public GlueType getGlue() {
    return glue;
  }

  /**
   * Sets the value of the glue property.
   * 
   * @param value allowed object is {@link GlueType }
   * 
   */
  public void setGlue(GlueType value) {
    this.glue = value;
  }

  /**
   * Gets the value of the nameUniv property.
   * 
   * @return possible object is {@link NameUnivType }
   * 
   */
  public NameUnivType getNameUniv() {
    return nameUniv;
  }

  /**
   * Sets the value of the nameUniv property.
   * 
   * @param value allowed object is {@link NameUnivType }
   * 
   */
  public void setNameUniv(NameUnivType value) {
    this.nameUniv = value;
  }

  /**
   * Gets the value of the colorTrans property.
   * 
   * @return possible object is {@link ColorTransType }
   * 
   */
  public ColorTransType getColorTrans() {
    return colorTrans;
  }

  /**
   * Sets the value of the colorTrans property.
   * 
   * @param value allowed object is {@link ColorTransType }
   * 
   */
  public void setColorTrans(ColorTransType value) {
    this.colorTrans = value;
  }

  public LayerType withName(NameType value) {
    setName(value);
    return this;
  }

  public LayerType withColor(ColorType value) {
    setColor(value);
    return this;
  }

  public LayerType withStatus(StatusType value) {
    setStatus(value);
    return this;
  }

  public LayerType withVisible(VisibleType value) {
    setVisible(value);
    return this;
  }

  public LayerType withPrint(PrintType value) {
    setPrint(value);
    return this;
  }

  public LayerType withActive(ActiveType value) {
    setActive(value);
    return this;
  }

  public LayerType withLock(LockType value) {
    setLock(value);
    return this;
  }

  public LayerType withSnap(SnapType value) {
    setSnap(value);
    return this;
  }

  public LayerType withGlue(GlueType value) {
    setGlue(value);
    return this;
  }

  public LayerType withNameUniv(NameUnivType value) {
    setNameUniv(value);
    return this;
  }

  public LayerType withColorTrans(ColorTransType value) {
    setColorTrans(value);
    return this;
  }

  @Override
  public LayerType withIX(BigInteger value) {
    setIX(value);
    return this;
  }

  @Override
  public LayerType withDel(BigInteger value) {
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
