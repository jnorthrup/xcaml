//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation,
// v2.2.10-b140310.1920
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.02.24 at 01:59:12 PM PST
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
 * Java class for delayDefinition complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="delayDefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://camel.apache.org/schema/spring}expressionNode">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="executorServiceRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="asyncDelayed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="callerRunsWhenRejected" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;anyAttribute processContents='skip' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "delayDefinition")
public class DelayDefinition extends ExpressionNode {

  @XmlAttribute(name = "executorServiceRef")
  protected String executorServiceRef;
  @XmlAttribute(name = "asyncDelayed")
  protected Boolean asyncDelayed;
  @XmlAttribute(name = "callerRunsWhenRejected")
  protected Boolean callerRunsWhenRejected;

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

  public DelayDefinition withExecutorServiceRef(String value) {
    setExecutorServiceRef(value);
    return this;
  }

  public DelayDefinition withAsyncDelayed(Boolean value) {
    setAsyncDelayed(value);
    return this;
  }

  public DelayDefinition withCallerRunsWhenRejected(Boolean value) {
    setCallerRunsWhenRejected(value);
    return this;
  }

  @Override
  public DelayDefinition withExpressionDefinition(Expression value) {
    setExpressionDefinition(value);
    return this;
  }

  @Override
  public DelayDefinition withConstant(ConstantExpression value) {
    setConstant(value);
    return this;
  }

  @Override
  public DelayDefinition withEl(ElExpression value) {
    setEl(value);
    return this;
  }

  @Override
  public DelayDefinition withGroovy(GroovyExpression value) {
    setGroovy(value);
    return this;
  }

  @Override
  public DelayDefinition withHeader(HeaderExpression value) {
    setHeader(value);
    return this;
  }

  @Override
  public DelayDefinition withJxpath(JxPathExpression value) {
    setJxpath(value);
    return this;
  }

  @Override
  public DelayDefinition withJavaScript(JavaScriptExpression value) {
    setJavaScript(value);
    return this;
  }

  @Override
  public DelayDefinition withJsonpath(JsonPathExpression value) {
    setJsonpath(value);
    return this;
  }

  @Override
  public DelayDefinition withLanguage(LanguageExpression value) {
    setLanguage(value);
    return this;
  }

  @Override
  public DelayDefinition withMethod(MethodCallExpression value) {
    setMethod(value);
    return this;
  }

  @Override
  public DelayDefinition withMvel(MvelExpression value) {
    setMvel(value);
    return this;
  }

  @Override
  public DelayDefinition withOgnl(OgnlExpression value) {
    setOgnl(value);
    return this;
  }

  @Override
  public DelayDefinition withPhp(PhpExpression value) {
    setPhp(value);
    return this;
  }

  @Override
  public DelayDefinition withProperty(Object value) {
    setProperty(value);
    return this;
  }

  @Override
  public DelayDefinition withPython(PythonExpression value) {
    setPython(value);
    return this;
  }

  @Override
  public DelayDefinition withRef(RefExpression value) {
    setRef(value);
    return this;
  }

  @Override
  public DelayDefinition withRuby(RubyExpression value) {
    setRuby(value);
    return this;
  }

  @Override
  public DelayDefinition withSimple(SimpleExpression value) {
    setSimple(value);
    return this;
  }

  @Override
  public DelayDefinition withSpel(SpELExpression value) {
    setSpel(value);
    return this;
  }

  @Override
  public DelayDefinition withSql(SqlExpression value) {
    setSql(value);
    return this;
  }

  @Override
  public DelayDefinition withTokenize(TokenizerExpression value) {
    setTokenize(value);
    return this;
  }

  @Override
  public DelayDefinition withVtdxml(VtdXmlExpression value) {
    setVtdxml(value);
    return this;
  }

  @Override
  public DelayDefinition withXtokenize(XmlTokenizerExpression value) {
    setXtokenize(value);
    return this;
  }

  @Override
  public DelayDefinition withXpath(XPathExpression value) {
    setXpath(value);
    return this;
  }

  @Override
  public DelayDefinition withXquery(XQueryExpression value) {
    setXquery(value);
    return this;
  }

  @Override
  public DelayDefinition withAopOrAggregateOrBean(ProcessorDefinition... values) {
    if (values != null) {
      for (ProcessorDefinition value : values) {
        getAopOrAggregateOrBean().add(value);
      }
    }
    return this;
  }

  @Override
  public DelayDefinition withAopOrAggregateOrBean(Collection<ProcessorDefinition> values) {
    if (values != null) {
      getAopOrAggregateOrBean().addAll(values);
    }
    return this;
  }

  @Override
  public DelayDefinition withInheritErrorHandler(Boolean value) {
    setInheritErrorHandler(value);
    return this;
  }

  @Override
  public DelayDefinition withDescription(DescriptionDefinition value) {
    setDescription(value);
    return this;
  }

  @Override
  public DelayDefinition withCustomId(Boolean value) {
    setCustomId(value);
    return this;
  }

  @Override
  public DelayDefinition withId(String value) {
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
