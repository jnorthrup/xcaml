//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation,
// v2.2.10-b140310.1920
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.02.04 at 10:47:30 AM PST
//

package com.microsoft.schemas.visio._2003.core;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;

/**
 * <p>
 * Java class for User_Type complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="User_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/visio/2003/core}NamedRow_Type">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="Value" type="{http://schemas.microsoft.com/visio/2003/core}Value_Type" minOccurs="0"/>
 *         &lt;element name="Prompt" type="{http://schemas.microsoft.com/visio/2003/core}Prompt_Type" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "User_Type", propOrder = {"valueOrPrompt"})
public class UserType extends NamedRowType {

  @XmlElements({
      @XmlElement(name = "Value", type = ValueType.class),
      @XmlElement(name = "Prompt", type = PromptType.class)})
  protected List<Object> valueOrPrompt;

  /**
   * Gets the value of the valueOrPrompt property.
   * 
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
   * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
   * the valueOrPrompt property.
   * 
   * <p>
   * For example, to add a new item, do as follows:
   * 
   * <pre>
     *    getValueOrPrompt().add(newItem);
     * </pre>
   * 
   * 
   * <p>
   * Objects of the following type(s) are allowed in the list {@link ValueType } {@link PromptType }
   * 
   * 
   */
  public List<Object> getValueOrPrompt() {
    if (valueOrPrompt == null) {
      valueOrPrompt = new ArrayList<Object>();
    }
    return this.valueOrPrompt;
  }

  public UserType withValueOrPrompt(Object... values) {
    if (values != null) {
      for (Object value : values) {
        getValueOrPrompt().add(value);
      }
    }
    return this;
  }

  public UserType withValueOrPrompt(Collection<Object> values) {
    if (values != null) {
      getValueOrPrompt().addAll(values);
    }
    return this;
  }

  @Override
  public UserType withName(String value) {
    setName(value);
    return this;
  }

  @Override
  public UserType withNameU(String value) {
    setNameU(value);
    return this;
  }

  @Override
  public UserType withDel(BigInteger value) {
    setDel(value);
    return this;
  }

  @Override
  public UserType withID(BigInteger value) {
    setID(value);
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