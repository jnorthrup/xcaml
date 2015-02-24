//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation,
// v2.2.10-b140310.1920
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.02.24 at 01:59:12 PM PST
//

package org.apache.camel.schema.spring;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;

/**
 * <p>
 * Java class for failoverLoadBalancerDefinition complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="failoverLoadBalancerDefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://camel.apache.org/schema/spring}loadBalancer">
 *       &lt;sequence>
 *         &lt;element name="exception" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="roundRobin" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="maximumFailoverAttempts" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "failoverLoadBalancerDefinition", propOrder = {"exception"})
public class FailoverLoadBalancerDefinition extends LoadBalancer {

  protected List<String> exception;
  @XmlAttribute(name = "roundRobin")
  protected Boolean roundRobin;
  @XmlAttribute(name = "maximumFailoverAttempts")
  protected Integer maximumFailoverAttempts;

  /**
   * Gets the value of the exception property.
   * 
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
   * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
   * the exception property.
   * 
   * <p>
   * For example, to add a new item, do as follows:
   * 
   * <pre>
     *    getException().add(newItem);
     * </pre>
   * 
   * 
   * <p>
   * Objects of the following type(s) are allowed in the list {@link String }
   * 
   * 
   */
  public List<String> getException() {
    if (exception == null) {
      exception = new ArrayList<String>();
    }
    return this.exception;
  }

  /**
   * Gets the value of the roundRobin property.
   * 
   * @return possible object is {@link Boolean }
   * 
   */
  public Boolean isRoundRobin() {
    return roundRobin;
  }

  /**
   * Sets the value of the roundRobin property.
   * 
   * @param value allowed object is {@link Boolean }
   * 
   */
  public void setRoundRobin(Boolean value) {
    this.roundRobin = value;
  }

  /**
   * Gets the value of the maximumFailoverAttempts property.
   * 
   * @return possible object is {@link Integer }
   * 
   */
  public Integer getMaximumFailoverAttempts() {
    return maximumFailoverAttempts;
  }

  /**
   * Sets the value of the maximumFailoverAttempts property.
   * 
   * @param value allowed object is {@link Integer }
   * 
   */
  public void setMaximumFailoverAttempts(Integer value) {
    this.maximumFailoverAttempts = value;
  }

  public FailoverLoadBalancerDefinition withException(String... values) {
    if (values != null) {
      for (String value : values) {
        getException().add(value);
      }
    }
    return this;
  }

  public FailoverLoadBalancerDefinition withException(Collection<String> values) {
    if (values != null) {
      getException().addAll(values);
    }
    return this;
  }

  public FailoverLoadBalancerDefinition withRoundRobin(Boolean value) {
    setRoundRobin(value);
    return this;
  }

  public FailoverLoadBalancerDefinition withMaximumFailoverAttempts(Integer value) {
    setMaximumFailoverAttempts(value);
    return this;
  }

  @Override
  public FailoverLoadBalancerDefinition withId(String value) {
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
