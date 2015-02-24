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
 * Java class for xmlTokenizerExpression complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xmlTokenizerExpression">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://camel.apache.org/schema/spring>namespaceAwareExpression">
 *       &lt;attribute name="headerName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="group" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xmlTokenizerExpression")
public class XmlTokenizerExpression extends NamespaceAwareExpression {

  @XmlAttribute(name = "headerName")
  protected String headerName;
  @XmlAttribute(name = "mode")
  protected String mode;
  @XmlAttribute(name = "group")
  protected Integer group;

  /**
   * Gets the value of the headerName property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getHeaderName() {
    return headerName;
  }

  /**
   * Sets the value of the headerName property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setHeaderName(String value) {
    this.headerName = value;
  }

  /**
   * Gets the value of the mode property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getMode() {
    return mode;
  }

  /**
   * Sets the value of the mode property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setMode(String value) {
    this.mode = value;
  }

  /**
   * Gets the value of the group property.
   * 
   * @return possible object is {@link Integer }
   * 
   */
  public Integer getGroup() {
    return group;
  }

  /**
   * Sets the value of the group property.
   * 
   * @param value allowed object is {@link Integer }
   * 
   */
  public void setGroup(Integer value) {
    this.group = value;
  }

  public XmlTokenizerExpression withHeaderName(String value) {
    setHeaderName(value);
    return this;
  }

  public XmlTokenizerExpression withMode(String value) {
    setMode(value);
    return this;
  }

  public XmlTokenizerExpression withGroup(Integer value) {
    setGroup(value);
    return this;
  }

  @Override
  public XmlTokenizerExpression withValue(String value) {
    setValue(value);
    return this;
  }

  @Override
  public XmlTokenizerExpression withId(String value) {
    setId(value);
    return this;
  }

  @Override
  public XmlTokenizerExpression withTrim(Boolean value) {
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
