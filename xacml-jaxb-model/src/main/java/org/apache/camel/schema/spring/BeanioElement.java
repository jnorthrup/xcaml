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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://camel.apache.org/schema/spring}dataFormat">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="mapping" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="streamName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ignoreUnidentifiedRecords" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ignoreUnexpectedRecords" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ignoreInvalidRecords" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="encoding" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "beanio")
public class BeanioElement extends DataFormat {

  @XmlAttribute(name = "mapping", required = true)
  protected String mapping;
  @XmlAttribute(name = "streamName", required = true)
  protected String streamName;
  @XmlAttribute(name = "ignoreUnidentifiedRecords")
  protected Boolean ignoreUnidentifiedRecords;
  @XmlAttribute(name = "ignoreUnexpectedRecords")
  protected Boolean ignoreUnexpectedRecords;
  @XmlAttribute(name = "ignoreInvalidRecords")
  protected Boolean ignoreInvalidRecords;
  @XmlAttribute(name = "encoding")
  protected String encoding;

  /**
   * Gets the value of the mapping property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getMapping() {
    return mapping;
  }

  /**
   * Sets the value of the mapping property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setMapping(String value) {
    this.mapping = value;
  }

  /**
   * Gets the value of the streamName property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getStreamName() {
    return streamName;
  }

  /**
   * Sets the value of the streamName property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setStreamName(String value) {
    this.streamName = value;
  }

  /**
   * Gets the value of the ignoreUnidentifiedRecords property.
   * 
   * @return possible object is {@link Boolean }
   * 
   */
  public Boolean isIgnoreUnidentifiedRecords() {
    return ignoreUnidentifiedRecords;
  }

  /**
   * Sets the value of the ignoreUnidentifiedRecords property.
   * 
   * @param value allowed object is {@link Boolean }
   * 
   */
  public void setIgnoreUnidentifiedRecords(Boolean value) {
    this.ignoreUnidentifiedRecords = value;
  }

  /**
   * Gets the value of the ignoreUnexpectedRecords property.
   * 
   * @return possible object is {@link Boolean }
   * 
   */
  public Boolean isIgnoreUnexpectedRecords() {
    return ignoreUnexpectedRecords;
  }

  /**
   * Sets the value of the ignoreUnexpectedRecords property.
   * 
   * @param value allowed object is {@link Boolean }
   * 
   */
  public void setIgnoreUnexpectedRecords(Boolean value) {
    this.ignoreUnexpectedRecords = value;
  }

  /**
   * Gets the value of the ignoreInvalidRecords property.
   * 
   * @return possible object is {@link Boolean }
   * 
   */
  public Boolean isIgnoreInvalidRecords() {
    return ignoreInvalidRecords;
  }

  /**
   * Sets the value of the ignoreInvalidRecords property.
   * 
   * @param value allowed object is {@link Boolean }
   * 
   */
  public void setIgnoreInvalidRecords(Boolean value) {
    this.ignoreInvalidRecords = value;
  }

  /**
   * Gets the value of the encoding property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getEncoding() {
    return encoding;
  }

  /**
   * Sets the value of the encoding property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setEncoding(String value) {
    this.encoding = value;
  }

  public BeanioElement withMapping(String value) {
    setMapping(value);
    return this;
  }

  public BeanioElement withStreamName(String value) {
    setStreamName(value);
    return this;
  }

  public BeanioElement withIgnoreUnidentifiedRecords(Boolean value) {
    setIgnoreUnidentifiedRecords(value);
    return this;
  }

  public BeanioElement withIgnoreUnexpectedRecords(Boolean value) {
    setIgnoreUnexpectedRecords(value);
    return this;
  }

  public BeanioElement withIgnoreInvalidRecords(Boolean value) {
    setIgnoreInvalidRecords(value);
    return this;
  }

  public BeanioElement withEncoding(String value) {
    setEncoding(value);
    return this;
  }

  @Override
  public BeanioElement withId(String value) {
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