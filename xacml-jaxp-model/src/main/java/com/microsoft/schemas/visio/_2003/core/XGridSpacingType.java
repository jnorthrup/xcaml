//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation,
// v2.2.10-b140310.1920
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.02.04 at 10:47:30 AM PST
//

package com.microsoft.schemas.visio._2003.core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;

/**
 * <p>
 * Java class for XGridSpacing_Type complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XGridSpacing_Type">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://schemas.microsoft.com/visio/2003/core>Cell_Type">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XGridSpacing_Type")
public class XGridSpacingType extends CellType {

  @Override
  public XGridSpacingType withValue(String value) {
    setValue(value);
    return this;
  }

  @Override
  public XGridSpacingType withUnit(String value) {
    setUnit(value);
    return this;
  }

  @Override
  public XGridSpacingType withF(String value) {
    setF(value);
    return this;
  }

  @Override
  public XGridSpacingType withErr(String value) {
    setErr(value);
    return this;
  }

  @Override
  public XGridSpacingType withV(String value) {
    setV(value);
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
