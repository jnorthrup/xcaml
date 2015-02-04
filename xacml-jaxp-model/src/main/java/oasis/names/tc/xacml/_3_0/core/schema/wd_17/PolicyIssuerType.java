//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation,
// v2.2.10-b140310.1920
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.02.04 at 10:47:30 AM PST
//

package oasis.names.tc.xacml._3_0.core.schema.wd_17;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;

/**
 * <p>
 * Java class for PolicyIssuerType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PolicyIssuerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:xacml:3.0:core:schema:wd-17}Content" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:xacml:3.0:core:schema:wd-17}Attribute" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicyIssuerType", propOrder = {"content", "attribute"})
public class PolicyIssuerType {

  @XmlElement(name = "Content")
  protected ContentType content;
  @XmlElement(name = "Attribute")
  protected List<AttributeType> attribute;

  /**
   * Gets the value of the content property.
   * 
   * @return possible object is {@link ContentType }
   * 
   */
  public ContentType getContent() {
    return content;
  }

  /**
   * Sets the value of the content property.
   * 
   * @param value allowed object is {@link ContentType }
   * 
   */
  public void setContent(ContentType value) {
    this.content = value;
  }

  /**
   * Gets the value of the attribute property.
   * 
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
   * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
   * the attribute property.
   * 
   * <p>
   * For example, to add a new item, do as follows:
   * 
   * <pre>
     *    getAttribute().add(newItem);
     * </pre>
   * 
   * 
   * <p>
   * Objects of the following type(s) are allowed in the list {@link AttributeType }
   * 
   * 
   */
  public List<AttributeType> getAttribute() {
    if (attribute == null) {
      attribute = new ArrayList<AttributeType>();
    }
    return this.attribute;
  }

  public PolicyIssuerType withContent(ContentType value) {
    setContent(value);
    return this;
  }

  public PolicyIssuerType withAttribute(AttributeType... values) {
    if (values != null) {
      for (AttributeType value : values) {
        getAttribute().add(value);
      }
    }
    return this;
  }

  public PolicyIssuerType withAttribute(Collection<AttributeType> values) {
    if (values != null) {
      getAttribute().addAll(values);
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
