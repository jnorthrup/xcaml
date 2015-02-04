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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;

/**
 * <p>
 * Java class for EventItem_Type complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventItem_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="Action" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *       &lt;attribute name="EventCode" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *       &lt;attribute name="Enabled" type="{http://schemas.microsoft.com/visio/2003/core}ISOBoolean" />
 *       &lt;attribute name="Target" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TargetArgs" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventItem_Type")
public class EventItemType {

  @XmlAttribute(name = "ID")
  @XmlSchemaType(name = "unsignedLong")
  protected BigInteger id;
  @XmlAttribute(name = "Action")
  @XmlSchemaType(name = "unsignedShort")
  protected Integer action;
  @XmlAttribute(name = "EventCode")
  @XmlSchemaType(name = "unsignedShort")
  protected Integer eventCode;
  @XmlAttribute(name = "Enabled")
  protected BigInteger enabled;
  @XmlAttribute(name = "Target")
  protected String target;
  @XmlAttribute(name = "TargetArgs")
  protected String targetArgs;

  /**
   * Gets the value of the id property.
   * 
   * @return possible object is {@link BigInteger }
   * 
   */
  public BigInteger getID() {
    return id;
  }

  /**
   * Sets the value of the id property.
   * 
   * @param value allowed object is {@link BigInteger }
   * 
   */
  public void setID(BigInteger value) {
    this.id = value;
  }

  /**
   * Gets the value of the action property.
   * 
   * @return possible object is {@link Integer }
   * 
   */
  public Integer getAction() {
    return action;
  }

  /**
   * Sets the value of the action property.
   * 
   * @param value allowed object is {@link Integer }
   * 
   */
  public void setAction(Integer value) {
    this.action = value;
  }

  /**
   * Gets the value of the eventCode property.
   * 
   * @return possible object is {@link Integer }
   * 
   */
  public Integer getEventCode() {
    return eventCode;
  }

  /**
   * Sets the value of the eventCode property.
   * 
   * @param value allowed object is {@link Integer }
   * 
   */
  public void setEventCode(Integer value) {
    this.eventCode = value;
  }

  /**
   * Gets the value of the enabled property.
   * 
   * @return possible object is {@link BigInteger }
   * 
   */
  public BigInteger getEnabled() {
    return enabled;
  }

  /**
   * Sets the value of the enabled property.
   * 
   * @param value allowed object is {@link BigInteger }
   * 
   */
  public void setEnabled(BigInteger value) {
    this.enabled = value;
  }

  /**
   * Gets the value of the target property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getTarget() {
    return target;
  }

  /**
   * Sets the value of the target property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setTarget(String value) {
    this.target = value;
  }

  /**
   * Gets the value of the targetArgs property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getTargetArgs() {
    return targetArgs;
  }

  /**
   * Sets the value of the targetArgs property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setTargetArgs(String value) {
    this.targetArgs = value;
  }

  public EventItemType withID(BigInteger value) {
    setID(value);
    return this;
  }

  public EventItemType withAction(Integer value) {
    setAction(value);
    return this;
  }

  public EventItemType withEventCode(Integer value) {
    setEventCode(value);
    return this;
  }

  public EventItemType withEnabled(BigInteger value) {
    setEnabled(value);
    return this;
  }

  public EventItemType withTarget(String value) {
    setTarget(value);
    return this;
  }

  public EventItemType withTargetArgs(String value) {
    setTargetArgs(value);
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
