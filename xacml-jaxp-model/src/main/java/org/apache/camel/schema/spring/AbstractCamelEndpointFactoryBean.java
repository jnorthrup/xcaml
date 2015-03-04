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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;

/**
 * <p>
 * Java class for abstractCamelEndpointFactoryBean complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="abstractCamelEndpointFactoryBean">
 *   &lt;complexContent>
 *     &lt;extension base="{http://camel.apache.org/schema/spring}abstractCamelFactoryBean">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="singleton" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="uri" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pattern" type="{http://camel.apache.org/schema/spring}exchangePattern" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abstractCamelEndpointFactoryBean")
@XmlSeeAlso({EndpointElement.class})
public abstract class AbstractCamelEndpointFactoryBean extends AbstractCamelFactoryBean {

  @XmlAttribute(name = "singleton")
  protected Boolean singleton;
  @XmlAttribute(name = "uri")
  protected String uri;
  @XmlAttribute(name = "pattern")
  protected ExchangePattern pattern;

  /**
   * Gets the value of the singleton property.
   * 
   * @return possible object is {@link Boolean }
   * 
   */
  public Boolean isSingleton() {
    return singleton;
  }

  /**
   * Sets the value of the singleton property.
   * 
   * @param value allowed object is {@link Boolean }
   * 
   */
  public void setSingleton(Boolean value) {
    this.singleton = value;
  }

  /**
   * Gets the value of the uri property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getUri() {
    return uri;
  }

  /**
   * Sets the value of the uri property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setUri(String value) {
    this.uri = value;
  }

  /**
   * Gets the value of the pattern property.
   * 
   * @return possible object is {@link ExchangePattern }
   * 
   */
  public ExchangePattern getPattern() {
    return pattern;
  }

  /**
   * Sets the value of the pattern property.
   * 
   * @param value allowed object is {@link ExchangePattern }
   * 
   */
  public void setPattern(ExchangePattern value) {
    this.pattern = value;
  }

  public AbstractCamelEndpointFactoryBean withSingleton(Boolean value) {
    setSingleton(value);
    return this;
  }

  public AbstractCamelEndpointFactoryBean withUri(String value) {
    setUri(value);
    return this;
  }

  public AbstractCamelEndpointFactoryBean withPattern(ExchangePattern value) {
    setPattern(value);
    return this;
  }

  @Override
  public AbstractCamelEndpointFactoryBean withCamelContextId(String value) {
    setCamelContextId(value);
    return this;
  }

  @Override
  public AbstractCamelEndpointFactoryBean withId(String value) {
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
