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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;

/**
 * <p>
 * Java class for noOutputDefinition complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="noOutputDefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://camel.apache.org/schema/spring}processorDefinition">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='skip' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "noOutputDefinition")
@XmlSeeAlso({
    ConvertBodyDefinition.class, SetExchangePatternDefinition.class, StopDefinition.class,
    LogDefinition.class, PollEnrichDefinition.class, RestBindingDefinition.class,
    RollbackDefinition.class, WireTapDefinition.class, MarshalDefinition.class,
    EnrichDefinition.class, BeanDefinition.class, RemoveHeaderDefinition.class,
    RemovePropertyDefinition.class, RemoveHeadersDefinition.class, ProcessDefinition.class,
    ThrowExceptionDefinition.class, UnmarshalDefinition.class, SendDefinition.class})
public abstract class NoOutputDefinition extends ProcessorDefinition {

  @Override
  public NoOutputDefinition withInheritErrorHandler(Boolean value) {
    setInheritErrorHandler(value);
    return this;
  }

  @Override
  public NoOutputDefinition withDescription(DescriptionDefinition value) {
    setDescription(value);
    return this;
  }

  @Override
  public NoOutputDefinition withCustomId(Boolean value) {
    setCustomId(value);
    return this;
  }

  @Override
  public NoOutputDefinition withId(String value) {
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
