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
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;

/**
 * <p>
 * Java class for deleteVerbDefinition complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteVerbDefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://camel.apache.org/schema/spring}verbDefinition">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteVerbDefinition")
public class DeleteVerbDefinition extends VerbDefinition {

  @Override
  public DeleteVerbDefinition withTo(ToElement value) {
    setTo(value);
    return this;
  }

  @Override
  public DeleteVerbDefinition withRoute(RouteElement value) {
    setRoute(value);
    return this;
  }

  @Override
  public DeleteVerbDefinition withMethod(String value) {
    setMethod(value);
    return this;
  }

  @Override
  public DeleteVerbDefinition withUri(String value) {
    setUri(value);
    return this;
  }

  @Override
  public DeleteVerbDefinition withConsumes(String value) {
    setConsumes(value);
    return this;
  }

  @Override
  public DeleteVerbDefinition withProduces(String value) {
    setProduces(value);
    return this;
  }

  @Override
  public DeleteVerbDefinition withBindingMode(RestBindingMode value) {
    setBindingMode(value);
    return this;
  }

  @Override
  public DeleteVerbDefinition withSkipBindingOnErrorCode(Boolean value) {
    setSkipBindingOnErrorCode(value);
    return this;
  }

  @Override
  public DeleteVerbDefinition withEnableCORS(Boolean value) {
    setEnableCORS(value);
    return this;
  }

  @Override
  public DeleteVerbDefinition withType(String value) {
    setType(value);
    return this;
  }

  @Override
  public DeleteVerbDefinition withOutType(String value) {
    setOutType(value);
    return this;
  }

  @Override
  public DeleteVerbDefinition withDescription(DescriptionElement value) {
    setDescription(value);
    return this;
  }

  @Override
  public DeleteVerbDefinition withCustomId(Boolean value) {
    setCustomId(value);
    return this;
  }

  @Override
  public DeleteVerbDefinition withId(String value) {
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
