//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation,
// v2.2.10-b140310.1920
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.03.04 at 01:11:38 AM PST
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
 * Java class for wireTapDefinition complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="wireTapDefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://camel.apache.org/schema/spring}noOutputDefinition">
 *       &lt;sequence>
 *         &lt;element name="body" type="{http://camel.apache.org/schema/spring}expressionSubElementDefinition" minOccurs="0"/>
 *         &lt;element ref="{http://camel.apache.org/schema/spring}setHeader" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="uri" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ref" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="processorRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="executorServiceRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="copy" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="onPrepareRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;anyAttribute processContents='skip' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wireTapDefinition", propOrder = {"body", "setHeader"})
public class WireTapDefinition extends NoOutputDefinition {

  protected ExpressionSubElementDefinition body;
  protected List<SetHeaderDefinition> setHeader;
  @XmlAttribute(name = "uri")
  protected String uri;
  @XmlAttribute(name = "ref")
  protected String ref;
  @XmlAttribute(name = "processorRef")
  protected String processorRef;
  @XmlAttribute(name = "executorServiceRef")
  protected String executorServiceRef;
  @XmlAttribute(name = "copy")
  protected Boolean copy;
  @XmlAttribute(name = "onPrepareRef")
  protected String onPrepareRef;

  /**
   * Gets the value of the body property.
   * 
   * @return possible object is {@link ExpressionSubElementDefinition }
   * 
   */
  public ExpressionSubElementDefinition getBody() {
    return body;
  }

  /**
   * Sets the value of the body property.
   * 
   * @param value allowed object is {@link ExpressionSubElementDefinition }
   * 
   */
  public void setBody(ExpressionSubElementDefinition value) {
    this.body = value;
  }

  /**
   * Gets the value of the setHeader property.
   * 
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
   * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
   * the setHeader property.
   * 
   * <p>
   * For example, to add a new item, do as follows:
   * 
   * <pre>
     *    getSetHeader().add(newItem);
     * </pre>
   * 
   * 
   * <p>
   * Objects of the following type(s) are allowed in the list {@link SetHeaderDefinition }
   * 
   * 
   */
  public List<SetHeaderDefinition> getSetHeader() {
    if (setHeader == null) {
      setHeader = new ArrayList<SetHeaderDefinition>();
    }
    return this.setHeader;
  }

  /**
   * Gets the value of the uri property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getUri() {
    return uri;
  }

  /**
   * Sets the value of the uri property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setUri(String value) {
    this.uri = value;
  }

  /**
   * Gets the value of the ref property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getRef() {
    return ref;
  }

  /**
   * Sets the value of the ref property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setRef(String value) {
    this.ref = value;
  }

  /**
   * Gets the value of the processorRef property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getProcessorRef() {
    return processorRef;
  }

  /**
   * Sets the value of the processorRef property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setProcessorRef(String value) {
    this.processorRef = value;
  }

  /**
   * Gets the value of the executorServiceRef property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getExecutorServiceRef() {
    return executorServiceRef;
  }

  /**
   * Sets the value of the executorServiceRef property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setExecutorServiceRef(String value) {
    this.executorServiceRef = value;
  }

  /**
   * Gets the value of the copy property.
   * 
   * @return possible object is {@link Boolean }
   * 
   */
  public Boolean isCopy() {
    return copy;
  }

  /**
   * Sets the value of the copy property.
   * 
   * @param value allowed object is {@link Boolean }
   * 
   */
  public void setCopy(Boolean value) {
    this.copy = value;
  }

  /**
   * Gets the value of the onPrepareRef property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getOnPrepareRef() {
    return onPrepareRef;
  }

  /**
   * Sets the value of the onPrepareRef property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setOnPrepareRef(String value) {
    this.onPrepareRef = value;
  }

  public WireTapDefinition withBody(ExpressionSubElementDefinition value) {
    setBody(value);
    return this;
  }

  public WireTapDefinition withSetHeader(SetHeaderDefinition... values) {
    if (values != null) {
      for (SetHeaderDefinition value : values) {
        getSetHeader().add(value);
      }
    }
    return this;
  }

  public WireTapDefinition withSetHeader(Collection<SetHeaderDefinition> values) {
    if (values != null) {
      getSetHeader().addAll(values);
    }
    return this;
  }

  public WireTapDefinition withUri(String value) {
    setUri(value);
    return this;
  }

  public WireTapDefinition withRef(String value) {
    setRef(value);
    return this;
  }

  public WireTapDefinition withProcessorRef(String value) {
    setProcessorRef(value);
    return this;
  }

  public WireTapDefinition withExecutorServiceRef(String value) {
    setExecutorServiceRef(value);
    return this;
  }

  public WireTapDefinition withCopy(Boolean value) {
    setCopy(value);
    return this;
  }

  public WireTapDefinition withOnPrepareRef(String value) {
    setOnPrepareRef(value);
    return this;
  }

  @Override
  public WireTapDefinition withInheritErrorHandler(Boolean value) {
    setInheritErrorHandler(value);
    return this;
  }

  @Override
  public WireTapDefinition withDescription(DescriptionElement value) {
    setDescription(value);
    return this;
  }

  @Override
  public WireTapDefinition withCustomId(Boolean value) {
    setCustomId(value);
    return this;
  }

  @Override
  public WireTapDefinition withId(String value) {
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