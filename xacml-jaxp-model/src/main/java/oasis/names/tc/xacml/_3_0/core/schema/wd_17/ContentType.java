//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation,
// v2.2.10-b140310.1920
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.01.30 at 05:51:02 PM PST
//

package oasis.names.tc.xacml._3_0.core.schema.wd_17;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.w3c.dom.Element;

/**
 * <p>
 * Java class for ContentType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;any processContents='lax'/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentType", propOrder = {"content"})
public class ContentType {

  @XmlMixed
  @XmlAnyElement(lax = true)
  protected List<Object> content;

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
   * Objects of the following type(s) are allowed in the list {@link String } {@link Object } {@link Element }
   * 
   * 
   */
  public List<Object> getContent() {
    if (content == null) {
      content = new ArrayList<Object>();
    }
    return this.content;
  }

  public ContentType withContent(Object... values) {
    if (values != null) {
      for (Object value : values) {
        getContent().add(value);
      }
    }
    return this;
  }

  public ContentType withContent(Collection<Object> values) {
    if (values != null) {
      getContent().addAll(values);
    }
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
