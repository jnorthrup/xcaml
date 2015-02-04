//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation,
// v2.2.10-b140310.1920
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.02.04 at 10:47:30 AM PST
//

package com.microsoft.schemas.visio._2003.core;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;

/**
 * <p>
 * Java class for Reviewer_Type complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Reviewer_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/visio/2003/core}IndexedRow_Type">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://schemas.microsoft.com/visio/2003/core}Name_Type" minOccurs="0"/>
 *         &lt;element name="Initials" type="{http://schemas.microsoft.com/visio/2003/core}Initials_Type" minOccurs="0"/>
 *         &lt;element name="Color" type="{http://schemas.microsoft.com/visio/2003/core}Color_Type" minOccurs="0"/>
 *         &lt;element name="ReviewerID" type="{http://schemas.microsoft.com/visio/2003/core}ReviewerID_Type" minOccurs="0"/>
 *         &lt;element name="CurrentIndex" type="{http://schemas.microsoft.com/visio/2003/core}CurrentIndex_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reviewer_Type", propOrder = {
    "name", "initials", "color", "reviewerID", "currentIndex"})
public class ReviewerType extends IndexedRowType {

  @XmlElement(name = "Name")
  protected NameType name;
  @XmlElement(name = "Initials")
  protected InitialsType initials;
  @XmlElement(name = "Color")
  protected ColorType color;
  @XmlElement(name = "ReviewerID")
  protected ReviewerIDType reviewerID;
  @XmlElement(name = "CurrentIndex")
  protected CurrentIndexType currentIndex;

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
   * Gets the value of the initials property.
   * 
   * @return possible object is {@link InitialsType }
   * 
   */
  public InitialsType getInitials() {
    return initials;
  }

  /**
   * Sets the value of the initials property.
   * 
   * @param value allowed object is {@link InitialsType }
   * 
   */
  public void setInitials(InitialsType value) {
    this.initials = value;
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
   * Gets the value of the reviewerID property.
   * 
   * @return possible object is {@link ReviewerIDType }
   * 
   */
  public ReviewerIDType getReviewerID() {
    return reviewerID;
  }

  /**
   * Sets the value of the reviewerID property.
   * 
   * @param value allowed object is {@link ReviewerIDType }
   * 
   */
  public void setReviewerID(ReviewerIDType value) {
    this.reviewerID = value;
  }

  /**
   * Gets the value of the currentIndex property.
   * 
   * @return possible object is {@link CurrentIndexType }
   * 
   */
  public CurrentIndexType getCurrentIndex() {
    return currentIndex;
  }

  /**
   * Sets the value of the currentIndex property.
   * 
   * @param value allowed object is {@link CurrentIndexType }
   * 
   */
  public void setCurrentIndex(CurrentIndexType value) {
    this.currentIndex = value;
  }

  public ReviewerType withName(NameType value) {
    setName(value);
    return this;
  }

  public ReviewerType withInitials(InitialsType value) {
    setInitials(value);
    return this;
  }

  public ReviewerType withColor(ColorType value) {
    setColor(value);
    return this;
  }

  public ReviewerType withReviewerID(ReviewerIDType value) {
    setReviewerID(value);
    return this;
  }

  public ReviewerType withCurrentIndex(CurrentIndexType value) {
    setCurrentIndex(value);
    return this;
  }

  @Override
  public ReviewerType withIX(BigInteger value) {
    setIX(value);
    return this;
  }

  @Override
  public ReviewerType withDel(BigInteger value) {
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
