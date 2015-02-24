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
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;

/**
 * <p>
 * Java class for camelThreadPoolFactoryBean complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="camelThreadPoolFactoryBean">
 *   &lt;complexContent>
 *     &lt;extension base="{http://camel.apache.org/schema/spring}abstractCamelThreadPoolFactoryBean">
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
@XmlType(name = "camelThreadPoolFactoryBean")
public class CamelThreadPoolFactoryBean extends AbstractCamelThreadPoolFactoryBean {

  @Override
  public CamelThreadPoolFactoryBean withPoolSize(String value) {
    setPoolSize(value);
    return this;
  }

  @Override
  public CamelThreadPoolFactoryBean withMaxPoolSize(String value) {
    setMaxPoolSize(value);
    return this;
  }

  @Override
  public CamelThreadPoolFactoryBean withKeepAliveTime(String value) {
    setKeepAliveTime(value);
    return this;
  }

  @Override
  public CamelThreadPoolFactoryBean withTimeUnit(String value) {
    setTimeUnit(value);
    return this;
  }

  @Override
  public CamelThreadPoolFactoryBean withMaxQueueSize(String value) {
    setMaxQueueSize(value);
    return this;
  }

  @Override
  public CamelThreadPoolFactoryBean withRejectedPolicy(ThreadPoolRejectedPolicy value) {
    setRejectedPolicy(value);
    return this;
  }

  @Override
  public CamelThreadPoolFactoryBean withThreadName(String value) {
    setThreadName(value);
    return this;
  }

  @Override
  public CamelThreadPoolFactoryBean withScheduled(Boolean value) {
    setScheduled(value);
    return this;
  }

  @Override
  public CamelThreadPoolFactoryBean withCamelContextId(String value) {
    setCamelContextId(value);
    return this;
  }

  @Override
  public CamelThreadPoolFactoryBean withId(String value) {
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
