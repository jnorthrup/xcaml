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
 * Java class for camelRedeliveryPolicyFactoryBean complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="camelRedeliveryPolicyFactoryBean">
 *   &lt;complexContent>
 *     &lt;extension base="{http://camel.apache.org/schema/spring}abstractCamelRedeliveryPolicyFactoryBean">
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
@XmlType(name = "camelRedeliveryPolicyFactoryBean")
public class CamelRedeliveryPolicyFactoryBean extends AbstractCamelRedeliveryPolicyFactoryBean {

  @Override
  public CamelRedeliveryPolicyFactoryBean withMaximumRedeliveries(String value) {
    setMaximumRedeliveries(value);
    return this;
  }

  @Override
  public CamelRedeliveryPolicyFactoryBean withRedeliveryDelay(String value) {
    setRedeliveryDelay(value);
    return this;
  }

  @Override
  public CamelRedeliveryPolicyFactoryBean withAsyncDelayedRedelivery(String value) {
    setAsyncDelayedRedelivery(value);
    return this;
  }

  @Override
  public CamelRedeliveryPolicyFactoryBean withBackOffMultiplier(String value) {
    setBackOffMultiplier(value);
    return this;
  }

  @Override
  public CamelRedeliveryPolicyFactoryBean withUseExponentialBackOff(String value) {
    setUseExponentialBackOff(value);
    return this;
  }

  @Override
  public CamelRedeliveryPolicyFactoryBean withCollisionAvoidanceFactor(String value) {
    setCollisionAvoidanceFactor(value);
    return this;
  }

  @Override
  public CamelRedeliveryPolicyFactoryBean withUseCollisionAvoidance(String value) {
    setUseCollisionAvoidance(value);
    return this;
  }

  @Override
  public CamelRedeliveryPolicyFactoryBean withMaximumRedeliveryDelay(String value) {
    setMaximumRedeliveryDelay(value);
    return this;
  }

  @Override
  public CamelRedeliveryPolicyFactoryBean withRetriesExhaustedLogLevel(LoggingLevel value) {
    setRetriesExhaustedLogLevel(value);
    return this;
  }

  @Override
  public CamelRedeliveryPolicyFactoryBean withRetryAttemptedLogLevel(LoggingLevel value) {
    setRetryAttemptedLogLevel(value);
    return this;
  }

  @Override
  public CamelRedeliveryPolicyFactoryBean withLogRetryAttempted(String value) {
    setLogRetryAttempted(value);
    return this;
  }

  @Override
  public CamelRedeliveryPolicyFactoryBean withLogStackTrace(String value) {
    setLogStackTrace(value);
    return this;
  }

  @Override
  public CamelRedeliveryPolicyFactoryBean withLogRetryStackTrace(String value) {
    setLogRetryStackTrace(value);
    return this;
  }

  @Override
  public CamelRedeliveryPolicyFactoryBean withLogHandled(String value) {
    setLogHandled(value);
    return this;
  }

  @Override
  public CamelRedeliveryPolicyFactoryBean withLogContinued(String value) {
    setLogContinued(value);
    return this;
  }

  @Override
  public CamelRedeliveryPolicyFactoryBean withLogExhausted(String value) {
    setLogExhausted(value);
    return this;
  }

  @Override
  public CamelRedeliveryPolicyFactoryBean withDisableRedelivery(String value) {
    setDisableRedelivery(value);
    return this;
  }

  @Override
  public CamelRedeliveryPolicyFactoryBean withDelayPattern(String value) {
    setDelayPattern(value);
    return this;
  }

  @Override
  public CamelRedeliveryPolicyFactoryBean withAllowRedeliveryWhileStopping(String value) {
    setAllowRedeliveryWhileStopping(value);
    return this;
  }

  @Override
  public CamelRedeliveryPolicyFactoryBean withCamelContextId(String value) {
    setCamelContextId(value);
    return this;
  }

  @Override
  public CamelRedeliveryPolicyFactoryBean withId(String value) {
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
