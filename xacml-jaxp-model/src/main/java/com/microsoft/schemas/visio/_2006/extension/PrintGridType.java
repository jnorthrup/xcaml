//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation,
// v2.2.10-b140310.1920
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.02.04 at 10:47:31 AM PST
//

package com.microsoft.schemas.visio._2006.extension;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;

/**
 * <p>
 * Java class for PrintGrid_Type complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrintGrid_Type">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://schemas.microsoft.com/visio/2006/extension>Cell_Type">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrintGrid_Type")
public class PrintGridType extends CellType {

  @Override
  public PrintGridType withValue(String value) {
    setValue(value);
    return this;
  }

  @Override
  public PrintGridType withUnit(String value) {
    setUnit(value);
    return this;
  }

  @Override
  public PrintGridType withF(String value) {
    setF(value);
    return this;
  }

  @Override
  public PrintGridType withErr(String value) {
    setErr(value);
    return this;
  }

  @Override
  public PrintGridType withV(String value) {
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
