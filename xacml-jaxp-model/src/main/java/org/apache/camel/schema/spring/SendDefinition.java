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
 * Java class for sendDefinition complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendDefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://camel.apache.org/schema/spring}noOutputDefinition">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="uri" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ref" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;anyAttribute processContents='skip' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendDefinition")
@XmlSeeAlso({InOnlyDefinition.class, InOutDefinition.class, ToElement.class})
public abstract class SendDefinition extends NoOutputDefinition {

  @XmlAttribute(name = "uri")
  protected String uri;
  @XmlAttribute(name = "ref")
  protected String ref;

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

  public SendDefinition withUri(String value) {
    setUri(value);
    return this;
  }

  public SendDefinition withRef(String value) {
    setRef(value);
    return this;
  }

  @Override
  public SendDefinition withInheritErrorHandler(Boolean value) {
    setInheritErrorHandler(value);
    return this;
  }

  @Override
  public SendDefinition withDescription(DescriptionElement value) {
    setDescription(value);
    return this;
  }

  @Override
  public SendDefinition withCustomId(Boolean value) {
    setCustomId(value);
    return this;
  }

  @Override
  public SendDefinition withId(String value) {
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
