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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;

/**
 * <p>
 * Java class for cryptoDataFormat complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cryptoDataFormat">
 *   &lt;complexContent>
 *     &lt;extension base="{http://camel.apache.org/schema/spring}dataFormat">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="algorithm" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cryptoProvider" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="keyRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="initVectorRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="algorithmParameterRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="buffersize" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="macAlgorithm" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="shouldAppendHMAC" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="inline" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cryptoDataFormat")
public class CryptoDataFormat extends DataFormat {

  @XmlAttribute(name = "algorithm")
  protected String algorithm;
  @XmlAttribute(name = "cryptoProvider")
  protected String cryptoProvider;
  @XmlAttribute(name = "keyRef")
  protected String keyRef;
  @XmlAttribute(name = "initVectorRef")
  protected String initVectorRef;
  @XmlAttribute(name = "algorithmParameterRef")
  protected String algorithmParameterRef;
  @XmlAttribute(name = "buffersize")
  protected Integer buffersize;
  @XmlAttribute(name = "macAlgorithm")
  protected String macAlgorithm;
  @XmlAttribute(name = "shouldAppendHMAC")
  protected Boolean shouldAppendHMAC;
  @XmlAttribute(name = "inline")
  protected Boolean inline;

  /**
   * Gets the value of the algorithm property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getAlgorithm() {
    return algorithm;
  }

  /**
   * Sets the value of the algorithm property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setAlgorithm(String value) {
    this.algorithm = value;
  }

  /**
   * Gets the value of the cryptoProvider property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getCryptoProvider() {
    return cryptoProvider;
  }

  /**
   * Sets the value of the cryptoProvider property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setCryptoProvider(String value) {
    this.cryptoProvider = value;
  }

  /**
   * Gets the value of the keyRef property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getKeyRef() {
    return keyRef;
  }

  /**
   * Sets the value of the keyRef property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setKeyRef(String value) {
    this.keyRef = value;
  }

  /**
   * Gets the value of the initVectorRef property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getInitVectorRef() {
    return initVectorRef;
  }

  /**
   * Sets the value of the initVectorRef property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setInitVectorRef(String value) {
    this.initVectorRef = value;
  }

  /**
   * Gets the value of the algorithmParameterRef property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getAlgorithmParameterRef() {
    return algorithmParameterRef;
  }

  /**
   * Sets the value of the algorithmParameterRef property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setAlgorithmParameterRef(String value) {
    this.algorithmParameterRef = value;
  }

  /**
   * Gets the value of the buffersize property.
   * 
   * @return possible object is {@link Integer }
   * 
   */
  public Integer getBuffersize() {
    return buffersize;
  }

  /**
   * Sets the value of the buffersize property.
   * 
   * @param value allowed object is {@link Integer }
   * 
   */
  public void setBuffersize(Integer value) {
    this.buffersize = value;
  }

  /**
   * Gets the value of the macAlgorithm property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getMacAlgorithm() {
    return macAlgorithm;
  }

  /**
   * Sets the value of the macAlgorithm property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setMacAlgorithm(String value) {
    this.macAlgorithm = value;
  }

  /**
   * Gets the value of the shouldAppendHMAC property.
   * 
   * @return possible object is {@link Boolean }
   * 
   */
  public Boolean isShouldAppendHMAC() {
    return shouldAppendHMAC;
  }

  /**
   * Sets the value of the shouldAppendHMAC property.
   * 
   * @param value allowed object is {@link Boolean }
   * 
   */
  public void setShouldAppendHMAC(Boolean value) {
    this.shouldAppendHMAC = value;
  }

  /**
   * Gets the value of the inline property.
   * 
   * @return possible object is {@link Boolean }
   * 
   */
  public Boolean isInline() {
    return inline;
  }

  /**
   * Sets the value of the inline property.
   * 
   * @param value allowed object is {@link Boolean }
   * 
   */
  public void setInline(Boolean value) {
    this.inline = value;
  }

  public CryptoDataFormat withAlgorithm(String value) {
    setAlgorithm(value);
    return this;
  }

  public CryptoDataFormat withCryptoProvider(String value) {
    setCryptoProvider(value);
    return this;
  }

  public CryptoDataFormat withKeyRef(String value) {
    setKeyRef(value);
    return this;
  }

  public CryptoDataFormat withInitVectorRef(String value) {
    setInitVectorRef(value);
    return this;
  }

  public CryptoDataFormat withAlgorithmParameterRef(String value) {
    setAlgorithmParameterRef(value);
    return this;
  }

  public CryptoDataFormat withBuffersize(Integer value) {
    setBuffersize(value);
    return this;
  }

  public CryptoDataFormat withMacAlgorithm(String value) {
    setMacAlgorithm(value);
    return this;
  }

  public CryptoDataFormat withShouldAppendHMAC(Boolean value) {
    setShouldAppendHMAC(value);
    return this;
  }

  public CryptoDataFormat withInline(Boolean value) {
    setInline(value);
    return this;
  }

  @Override
  public CryptoDataFormat withId(String value) {
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
