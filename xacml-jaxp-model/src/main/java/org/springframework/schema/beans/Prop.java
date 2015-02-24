//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation,
// v2.2.10-b140310.1920
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.02.24 at 02:12:57 PM PST
//

package org.springframework.schema.beans;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlMixed;
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
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *       &lt;/choice>
 *       &lt;attribute name="key" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"content"})
@XmlRootElement(name = "prop")
public class Prop {

  @XmlMixed
  protected List<String> content;
  @XmlAttribute(name = "key", required = true)
  protected String key;

  /**
   * Gets the value of the content property.
   * 
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
   * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
   * the content property.
   * 
   * <p>
   * For example, to add a new item, do as follows:
   * 
   * <pre>
     *    getContent().add(newItem);
     * </pre>
   * 
   * 
   * <p>
   * Objects of the following type(s) are allowed in the list {@link String }
   * 
   * 
   */
  public List<String> getContent() {
    if (content == null) {
      content = new ArrayList<String>();
    }
    return this.content;
  }

  /**
   * Gets the value of the key property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getKey() {
    return key;
  }

  /**
   * Sets the value of the key property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setKey(String value) {
    this.key = value;
  }

  public Prop withContent(String... values) {
    if (values != null) {
      for (String value : values) {
        getContent().add(value);
      }
    }
    return this;
  }

  public Prop withContent(Collection<String> values) {
    if (values != null) {
      getContent().addAll(values);
    }
    return this;
  }

  public Prop withKey(String value) {
    setKey(value);
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
