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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;

/**
 * <p>
 * Java class for RuleInfo_Type complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RuleInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="RuleSetID" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="RuleID" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RuleInfo_Type")
public class RuleInfoType {

  @XmlAttribute(name = "RuleSetID")
  @XmlSchemaType(name = "unsignedLong")
  protected BigInteger ruleSetID;
  @XmlAttribute(name = "RuleID")
  @XmlSchemaType(name = "unsignedLong")
  protected BigInteger ruleID;

  /**
   * Gets the value of the ruleSetID property.
   * 
   * @return possible object is {@link BigInteger }
   * 
   */
  public BigInteger getRuleSetID() {
    return ruleSetID;
  }

  /**
   * Sets the value of the ruleSetID property.
   * 
   * @param value allowed object is {@link BigInteger }
   * 
   */
  public void setRuleSetID(BigInteger value) {
    this.ruleSetID = value;
  }

  /**
   * Gets the value of the ruleID property.
   * 
   * @return possible object is {@link BigInteger }
   * 
   */
  public BigInteger getRuleID() {
    return ruleID;
  }

  /**
   * Sets the value of the ruleID property.
   * 
   * @param value allowed object is {@link BigInteger }
   * 
   */
  public void setRuleID(BigInteger value) {
    this.ruleID = value;
  }

  public RuleInfoType withRuleSetID(BigInteger value) {
    setRuleSetID(value);
    return this;
  }

  public RuleInfoType withRuleID(BigInteger value) {
    setRuleID(value);
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
