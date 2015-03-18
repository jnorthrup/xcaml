//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation,
// v2.2.10-b140310.1920
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.03.04 at 01:11:38 AM PST
//

package org.apache.camel.schema.spring;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;

/**
 * <p>
 * Java class for throttleDefinition complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="throttleDefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://camel.apache.org/schema/spring}expressionNode">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="executorServiceRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="timePeriodMillis" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="asyncDelayed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="callerRunsWhenRejected" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="rejectExecution" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;anyAttribute processContents='skip' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "throttleDefinition")
public class ThrottleDefinition extends ExpressionNode {

  @XmlAttribute(name = "executorServiceRef")
  protected String executorServiceRef;
  @XmlAttribute(name = "timePeriodMillis")
  protected Long timePeriodMillis;
  @XmlAttribute(name = "asyncDelayed")
  protected Boolean asyncDelayed;
  @XmlAttribute(name = "callerRunsWhenRejected")
  protected Boolean callerRunsWhenRejected;
  @XmlAttribute(name = "rejectExecution")
  protected Boolean rejectExecution;

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
   * Gets the value of the timePeriodMillis property.
   * 
   * @return possible object is {@link Long }
   * 
   */
  public Long getTimePeriodMillis() {
    return timePeriodMillis;
  }

  /**
   * Sets the value of the timePeriodMillis property.
   * 
   * @param value allowed object is {@link Long }
   * 
   */
  public void setTimePeriodMillis(Long value) {
    this.timePeriodMillis = value;
  }

  /**
   * Gets the value of the asyncDelayed property.
   * 
   * @return possible object is {@link Boolean }
   * 
   */
  public Boolean isAsyncDelayed() {
    return asyncDelayed;
  }

  /**
   * Sets the value of the asyncDelayed property.
   * 
   * @param value allowed object is {@link Boolean }
   * 
   */
  public void setAsyncDelayed(Boolean value) {
    this.asyncDelayed = value;
  }

  /**
   * Gets the value of the callerRunsWhenRejected property.
   * 
   * @return possible object is {@link Boolean }
   * 
   */
  public Boolean isCallerRunsWhenRejected() {
    return callerRunsWhenRejected;
  }

  /**
   * Sets the value of the callerRunsWhenRejected property.
   * 
   * @param value allowed object is {@link Boolean }
   * 
   */
  public void setCallerRunsWhenRejected(Boolean value) {
    this.callerRunsWhenRejected = value;
  }

  /**
   * Gets the value of the rejectExecution property.
   * 
   * @return possible object is {@link Boolean }
   * 
   */
  public Boolean isRejectExecution() {
    return rejectExecution;
  }

  /**
   * Sets the value of the rejectExecution property.
   * 
   * @param value allowed object is {@link Boolean }
   * 
   */
  public void setRejectExecution(Boolean value) {
    this.rejectExecution = value;
  }

  public ThrottleDefinition withExecutorServiceRef(String value) {
    setExecutorServiceRef(value);
    return this;
  }

  public ThrottleDefinition withTimePeriodMillis(Long value) {
    setTimePeriodMillis(value);
    return this;
  }

  public ThrottleDefinition withAsyncDelayed(Boolean value) {
    setAsyncDelayed(value);
    return this;
  }

  public ThrottleDefinition withCallerRunsWhenRejected(Boolean value) {
    setCallerRunsWhenRejected(value);
    return this;
  }

  public ThrottleDefinition withRejectExecution(Boolean value) {
    setRejectExecution(value);
    return this;
  }

  @Override
  public ThrottleDefinition withExpressionDefinition(Expression value) {
    setExpressionDefinition(value);
    return this;
  }

  @Override
  public ThrottleDefinition withConstant(ConstantElement value) {
    setConstant(value);
    return this;
  }

  @Override
  public ThrottleDefinition withEl(ElElement value) {
    setEl(value);
    return this;
  }

  @Override
  public ThrottleDefinition withGroovy(GroovyElement value) {
    setGroovy(value);
    return this;
  }

  @Override
  public ThrottleDefinition withHeader(HeaderElement value) {
    setHeader(value);
    return this;
  }

  @Override
  public ThrottleDefinition withJxpath(JxpathElement value) {
    setJxpath(value);
    return this;
  }

  @Override
  public ThrottleDefinition withJavaScript(JavaScriptElement value) {
    setJavaScript(value);
    return this;
  }

  @Override
  public ThrottleDefinition withJsonpath(JsonpathElement value) {
    setJsonpath(value);
    return this;
  }

  @Override
  public ThrottleDefinition withLanguage(LanguageElement value) {
    setLanguage(value);
    return this;
  }

  @Override
  public ThrottleDefinition withMethod(MethodElement value) {
    setMethod(value);
    return this;
  }

  @Override
  public ThrottleDefinition withMvel(MvelElement value) {
    setMvel(value);
    return this;
  }

  @Override
  public ThrottleDefinition withOgnl(OgnlElement value) {
    setOgnl(value);
    return this;
  }

  @Override
  public ThrottleDefinition withPhp(PhpElement value) {
    setPhp(value);
    return this;
  }

  @Override
  public ThrottleDefinition withProperty(Object value) {
    setProperty(value);
    return this;
  }

  @Override
  public ThrottleDefinition withPython(PythonElement value) {
    setPython(value);
    return this;
  }

  @Override
  public ThrottleDefinition withRef(RefElement value) {
    setRef(value);
    return this;
  }

  @Override
  public ThrottleDefinition withRuby(RubyElement value) {
    setRuby(value);
    return this;
  }

  @Override
  public ThrottleDefinition withSimple(SimpleElement value) {
    setSimple(value);
    return this;
  }

  @Override
  public ThrottleDefinition withSpel(SpELExpression value) {
    setSpel(value);
    return this;
  }

  @Override
  public ThrottleDefinition withSql(SqlElement value) {
    setSql(value);
    return this;
  }

  @Override
  public ThrottleDefinition withTokenize(TokenizerExpression value) {
    setTokenize(value);
    return this;
  }

  @Override
  public ThrottleDefinition withVtdxml(VtdXmlExpression value) {
    setVtdxml(value);
    return this;
  }

  @Override
  public ThrottleDefinition withXtokenize(XmlTokenizerExpression value) {
    setXtokenize(value);
    return this;
  }

  @Override
  public ThrottleDefinition withXpath(XpathElement value) {
    setXpath(value);
    return this;
  }

  @Override
  public ThrottleDefinition withXquery(XqueryElement value) {
    setXquery(value);
    return this;
  }

  @Override
  public ThrottleDefinition withAopOrAggregateOrBean(ProcessorDefinition... values) {
    if (values != null) {
      for (ProcessorDefinition value : values) {
        getAopOrAggregateOrBean().add(value);
      }
    }
    return this;
  }

  @Override
  public ThrottleDefinition withAopOrAggregateOrBean(Collection<ProcessorDefinition> values) {
    if (values != null) {
      getAopOrAggregateOrBean().addAll(values);
    }
    return this;
  }

  @Override
  public ThrottleDefinition withInheritErrorHandler(Boolean value) {
    setInheritErrorHandler(value);
    return this;
  }

  @Override
  public ThrottleDefinition withDescription(DescriptionElement value) {
    setDescription(value);
    return this;
  }

  @Override
  public ThrottleDefinition withCustomId(Boolean value) {
    setCustomId(value);
    return this;
  }

  @Override
  public ThrottleDefinition withId(String value) {
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