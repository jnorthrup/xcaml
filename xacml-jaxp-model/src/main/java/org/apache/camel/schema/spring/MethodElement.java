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
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://camel.apache.org/schema/spring>expression">
 *       &lt;attribute name="bean" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ref" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="method" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="beanType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "method")
public class MethodElement extends Expression {

  @XmlAttribute(name = "bean")
  protected String bean;
  @XmlAttribute(name = "ref")
  protected String ref;
  @XmlAttribute(name = "method")
  protected String method;
  @XmlAttribute(name = "beanType")
  protected String beanType;

  /**
   * Gets the value of the bean property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getBean() {
    return bean;
  }

  /**
   * Sets the value of the bean property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setBean(String value) {
    this.bean = value;
  }

  /**
   * Gets the value of the ref property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getRef() {
    return ref;
  }

  /**
   * Sets the value of the ref property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setRef(String value) {
    this.ref = value;
  }

  /**
   * Gets the value of the method property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getMethod() {
    return method;
  }

  /**
   * Sets the value of the method property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setMethod(String value) {
    this.method = value;
  }

  /**
   * Gets the value of the beanType property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getBeanType() {
    return beanType;
  }

  /**
   * Sets the value of the beanType property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setBeanType(String value) {
    this.beanType = value;
  }

  public MethodElement withBean(String value) {
    setBean(value);
    return this;
  }

  public MethodElement withRef(String value) {
    setRef(value);
    return this;
  }

  public MethodElement withMethod(String value) {
    setMethod(value);
    return this;
  }

  public MethodElement withBeanType(String value) {
    setBeanType(value);
    return this;
  }

  @Override
  public MethodElement withValue(String value) {
    setValue(value);
    return this;
  }

  @Override
  public MethodElement withId(String value) {
    setId(value);
    return this;
  }

  @Override
  public MethodElement withTrim(Boolean value) {
    setTrim(value);
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