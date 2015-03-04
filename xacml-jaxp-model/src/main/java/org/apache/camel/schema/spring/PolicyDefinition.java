//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation,
// v2.2.10-b140310.1920
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.03.04 at 01:11:38 AM PST
//

package org.apache.camel.schema.spring;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;

/**
 * <p>
 * Java class for policyDefinition complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="policyDefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://camel.apache.org/schema/spring}output">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="ref" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;anyAttribute processContents='skip' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "policyDefinition")
public class PolicyDefinition extends Output {

  @XmlAttribute(name = "ref", required = true)
  protected String ref;

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

  public PolicyDefinition withRef(String value) {
    setRef(value);
    return this;
  }

  @Override
  public PolicyDefinition withAopOrAggregateOrBean(ProcessorDefinition... values) {
    if (values != null) {
      for (ProcessorDefinition value : values) {
        getAopOrAggregateOrBean().add(value);
      }
    }
    return this;
  }

  @Override
  public PolicyDefinition withAopOrAggregateOrBean(Collection<ProcessorDefinition> values) {
    if (values != null) {
      getAopOrAggregateOrBean().addAll(values);
    }
    return this;
  }

  @Override
  public PolicyDefinition withInheritErrorHandler(Boolean value) {
    setInheritErrorHandler(value);
    return this;
  }

  @Override
  public PolicyDefinition withDescription(DescriptionElement value) {
    setDescription(value);
    return this;
  }

  @Override
  public PolicyDefinition withCustomId(Boolean value) {
    setCustomId(value);
    return this;
  }

  @Override
  public PolicyDefinition withId(String value) {
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
