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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;

/**
 * <p>
 * Java class for abstractKeyManagersParametersFactoryBean complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="abstractKeyManagersParametersFactoryBean">
 *   &lt;complexContent>
 *     &lt;extension base="{http://camel.apache.org/schema/spring}abstractJsseUtilFactoryBean">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="keyPassword" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="provider" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="algorithm" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abstractKeyManagersParametersFactoryBean")
@XmlSeeAlso({KeyManagersParametersFactoryBean.class})
public abstract class AbstractKeyManagersParametersFactoryBean extends AbstractJsseUtilFactoryBean {

  @XmlAttribute(name = "keyPassword")
  protected String keyPassword;
  @XmlAttribute(name = "provider")
  protected String provider;
  @XmlAttribute(name = "algorithm")
  protected String algorithm;

  /**
   * Gets the value of the keyPassword property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getKeyPassword() {
    return keyPassword;
  }

  /**
   * Sets the value of the keyPassword property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setKeyPassword(String value) {
    this.keyPassword = value;
  }

  /**
   * Gets the value of the provider property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getProvider() {
    return provider;
  }

  /**
   * Sets the value of the provider property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setProvider(String value) {
    this.provider = value;
  }

  /**
   * Gets the value of the algorithm property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getAlgorithm() {
    return algorithm;
  }

  /**
   * Sets the value of the algorithm property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setAlgorithm(String value) {
    this.algorithm = value;
  }

  public AbstractKeyManagersParametersFactoryBean withKeyPassword(String value) {
    setKeyPassword(value);
    return this;
  }

  public AbstractKeyManagersParametersFactoryBean withProvider(String value) {
    setProvider(value);
    return this;
  }

  public AbstractKeyManagersParametersFactoryBean withAlgorithm(String value) {
    setAlgorithm(value);
    return this;
  }

  @Override
  public AbstractKeyManagersParametersFactoryBean withCamelContextId(String value) {
    setCamelContextId(value);
    return this;
  }

  @Override
  public AbstractKeyManagersParametersFactoryBean withId(String value) {
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
