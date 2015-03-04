//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation,
// v2.2.10-b140310.1920
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.03.04 at 01:11:38 AM PST
//

package org.apache.camel.schema.spring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;

/**
 * <p>
 * Java class for threadPoolProfileDefinition complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="threadPoolProfileDefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://camel.apache.org/schema/spring}optionalIdentifiedDefinition">
 *       &lt;sequence>
 *         &lt;element name="timeUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="defaultProfile" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="poolSize" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="maxPoolSize" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="keepAliveTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="maxQueueSize" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="rejectedPolicy" type="{http://camel.apache.org/schema/spring}threadPoolRejectedPolicy" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "threadPoolProfileDefinition", propOrder = {"timeUnit"})
public class ThreadPoolProfileDefinition extends OptionalIdentifiedDefinition {

  protected String timeUnit;
  @XmlAttribute(name = "defaultProfile")
  protected Boolean defaultProfile;
  @XmlAttribute(name = "poolSize")
  protected String poolSize;
  @XmlAttribute(name = "maxPoolSize")
  protected String maxPoolSize;
  @XmlAttribute(name = "keepAliveTime")
  protected String keepAliveTime;
  @XmlAttribute(name = "maxQueueSize")
  protected String maxQueueSize;
  @XmlAttribute(name = "rejectedPolicy")
  protected ThreadPoolRejectedPolicy rejectedPolicy;

  /**
   * Gets the value of the timeUnit property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getTimeUnit() {
    return timeUnit;
  }

  /**
   * Sets the value of the timeUnit property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setTimeUnit(String value) {
    this.timeUnit = value;
  }

  /**
   * Gets the value of the defaultProfile property.
   * 
   * @return possible object is {@link Boolean }
   * 
   */
  public Boolean isDefaultProfile() {
    return defaultProfile;
  }

  /**
   * Sets the value of the defaultProfile property.
   * 
   * @param value allowed object is {@link Boolean }
   * 
   */
  public void setDefaultProfile(Boolean value) {
    this.defaultProfile = value;
  }

  /**
   * Gets the value of the poolSize property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getPoolSize() {
    return poolSize;
  }

  /**
   * Sets the value of the poolSize property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setPoolSize(String value) {
    this.poolSize = value;
  }

  /**
   * Gets the value of the maxPoolSize property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getMaxPoolSize() {
    return maxPoolSize;
  }

  /**
   * Sets the value of the maxPoolSize property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setMaxPoolSize(String value) {
    this.maxPoolSize = value;
  }

  /**
   * Gets the value of the keepAliveTime property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getKeepAliveTime() {
    return keepAliveTime;
  }

  /**
   * Sets the value of the keepAliveTime property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setKeepAliveTime(String value) {
    this.keepAliveTime = value;
  }

  /**
   * Gets the value of the maxQueueSize property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getMaxQueueSize() {
    return maxQueueSize;
  }

  /**
   * Sets the value of the maxQueueSize property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setMaxQueueSize(String value) {
    this.maxQueueSize = value;
  }

  /**
   * Gets the value of the rejectedPolicy property.
   * 
   * @return possible object is {@link ThreadPoolRejectedPolicy }
   * 
   */
  public ThreadPoolRejectedPolicy getRejectedPolicy() {
    return rejectedPolicy;
  }

  /**
   * Sets the value of the rejectedPolicy property.
   * 
   * @param value allowed object is {@link ThreadPoolRejectedPolicy }
   * 
   */
  public void setRejectedPolicy(ThreadPoolRejectedPolicy value) {
    this.rejectedPolicy = value;
  }

  public ThreadPoolProfileDefinition withTimeUnit(String value) {
    setTimeUnit(value);
    return this;
  }

  public ThreadPoolProfileDefinition withDefaultProfile(Boolean value) {
    setDefaultProfile(value);
    return this;
  }

  public ThreadPoolProfileDefinition withPoolSize(String value) {
    setPoolSize(value);
    return this;
  }

  public ThreadPoolProfileDefinition withMaxPoolSize(String value) {
    setMaxPoolSize(value);
    return this;
  }

  public ThreadPoolProfileDefinition withKeepAliveTime(String value) {
    setKeepAliveTime(value);
    return this;
  }

  public ThreadPoolProfileDefinition withMaxQueueSize(String value) {
    setMaxQueueSize(value);
    return this;
  }

  public ThreadPoolProfileDefinition withRejectedPolicy(ThreadPoolRejectedPolicy value) {
    setRejectedPolicy(value);
    return this;
  }

  @Override
  public ThreadPoolProfileDefinition withDescription(DescriptionElement value) {
    setDescription(value);
    return this;
  }

  @Override
  public ThreadPoolProfileDefinition withCustomId(Boolean value) {
    setCustomId(value);
    return this;
  }

  @Override
  public ThreadPoolProfileDefinition withId(String value) {
    setId(value);
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
