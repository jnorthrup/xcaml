//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation,
// v2.2.10-b140310.1920
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.02.04 at 10:47:31 AM PST
//

package com.microsoft.schemas.office.visio._2010.extension;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;

/**
 * <p>
 * Java class for EnableLineProps_Type complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnableLineProps_Type">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://schemas.microsoft.com/office/visio/2010/extension>Cell_Type">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnableLineProps_Type")
public class EnableLinePropsType extends CellType {

  @Override
  public EnableLinePropsType withValue(String value) {
    setValue(value);
    return this;
  }

  @Override
  public EnableLinePropsType withUnit(String value) {
    setUnit(value);
    return this;
  }

  @Override
  public EnableLinePropsType withF(String value) {
    setF(value);
    return this;
  }

  @Override
  public EnableLinePropsType withErr(String value) {
    setErr(value);
    return this;
  }

  @Override
  public EnableLinePropsType withV(String value) {
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
