//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation,
// v2.2.10-b140310.1920
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.02.24 at 01:59:12 PM PST
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
 * Java class for logDefinition complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="logDefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://camel.apache.org/schema/spring}noOutputDefinition">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="message" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loggingLevel" type="{http://camel.apache.org/schema/spring}loggingLevel" />
 *       &lt;attribute name="logName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="marker" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loggerRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;anyAttribute processContents='skip' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "logDefinition")
public class LogDefinition extends NoOutputDefinition {

  @XmlAttribute(name = "message", required = true)
  protected String message;
  @XmlAttribute(name = "loggingLevel")
  protected LoggingLevel loggingLevel;
  @XmlAttribute(name = "logName")
  protected String logName;
  @XmlAttribute(name = "marker")
  protected String marker;
  @XmlAttribute(name = "loggerRef")
  protected String loggerRef;

  /**
   * Gets the value of the message property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getMessage() {
    return message;
  }

  /**
   * Sets the value of the message property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setMessage(String value) {
    this.message = value;
  }

  /**
   * Gets the value of the loggingLevel property.
   * 
   * @return possible object is {@link LoggingLevel }
   * 
   */
  public LoggingLevel getLoggingLevel() {
    return loggingLevel;
  }

  /**
   * Sets the value of the loggingLevel property.
   * 
   * @param value allowed object is {@link LoggingLevel }
   * 
   */
  public void setLoggingLevel(LoggingLevel value) {
    this.loggingLevel = value;
  }

  /**
   * Gets the value of the logName property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getLogName() {
    return logName;
  }

  /**
   * Sets the value of the logName property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setLogName(String value) {
    this.logName = value;
  }

  /**
   * Gets the value of the marker property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getMarker() {
    return marker;
  }

  /**
   * Sets the value of the marker property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setMarker(String value) {
    this.marker = value;
  }

  /**
   * Gets the value of the loggerRef property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getLoggerRef() {
    return loggerRef;
  }

  /**
   * Sets the value of the loggerRef property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setLoggerRef(String value) {
    this.loggerRef = value;
  }

  public LogDefinition withMessage(String value) {
    setMessage(value);
    return this;
  }

  public LogDefinition withLoggingLevel(LoggingLevel value) {
    setLoggingLevel(value);
    return this;
  }

  public LogDefinition withLogName(String value) {
    setLogName(value);
    return this;
  }

  public LogDefinition withMarker(String value) {
    setMarker(value);
    return this;
  }

  public LogDefinition withLoggerRef(String value) {
    setLoggerRef(value);
    return this;
  }

  @Override
  public LogDefinition withInheritErrorHandler(Boolean value) {
    setInheritErrorHandler(value);
    return this;
  }

  @Override
  public LogDefinition withDescription(DescriptionDefinition value) {
    setDescription(value);
    return this;
  }

  @Override
  public LogDefinition withCustomId(Boolean value) {
    setCustomId(value);
    return this;
  }

  @Override
  public LogDefinition withId(String value) {
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
