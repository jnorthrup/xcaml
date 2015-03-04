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
 * Java class for sortDefinition complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sortDefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://camel.apache.org/schema/spring}noOutputExpressionNode">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="comparatorRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;anyAttribute processContents='skip' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sortDefinition")
public class SortDefinition extends NoOutputExpressionNode {

  @XmlAttribute(name = "comparatorRef")
  protected String comparatorRef;

  /**
   * Gets the value of the comparatorRef property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getComparatorRef() {
    return comparatorRef;
  }

  /**
   * Sets the value of the comparatorRef property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setComparatorRef(String value) {
    this.comparatorRef = value;
  }

  public SortDefinition withComparatorRef(String value) {
    setComparatorRef(value);
    return this;
  }

  @Override
  public SortDefinition withExpressionDefinition(Expression value) {
    setExpressionDefinition(value);
    return this;
  }

  @Override
  public SortDefinition withConstant(ConstantElement value) {
    setConstant(value);
    return this;
  }

  @Override
  public SortDefinition withEl(ElElement value) {
    setEl(value);
    return this;
  }

  @Override
  public SortDefinition withGroovy(GroovyElement value) {
    setGroovy(value);
    return this;
  }

  @Override
  public SortDefinition withHeader(HeaderElement value) {
    setHeader(value);
    return this;
  }

  @Override
  public SortDefinition withJxpath(JxpathElement value) {
    setJxpath(value);
    return this;
  }

  @Override
  public SortDefinition withJavaScript(JavaScriptElement value) {
    setJavaScript(value);
    return this;
  }

  @Override
  public SortDefinition withJsonpath(JsonpathElement value) {
    setJsonpath(value);
    return this;
  }

  @Override
  public SortDefinition withLanguage(LanguageElement value) {
    setLanguage(value);
    return this;
  }

  @Override
  public SortDefinition withMethod(MethodElement value) {
    setMethod(value);
    return this;
  }

  @Override
  public SortDefinition withMvel(MvelElement value) {
    setMvel(value);
    return this;
  }

  @Override
  public SortDefinition withOgnl(OgnlElement value) {
    setOgnl(value);
    return this;
  }

  @Override
  public SortDefinition withPhp(PhpElement value) {
    setPhp(value);
    return this;
  }

  @Override
  public SortDefinition withProperty(Object value) {
    setProperty(value);
    return this;
  }

  @Override
  public SortDefinition withPython(PythonElement value) {
    setPython(value);
    return this;
  }

  @Override
  public SortDefinition withRef(RefElement value) {
    setRef(value);
    return this;
  }

  @Override
  public SortDefinition withRuby(RubyElement value) {
    setRuby(value);
    return this;
  }

  @Override
  public SortDefinition withSimple(SimpleElement value) {
    setSimple(value);
    return this;
  }

  @Override
  public SortDefinition withSpel(SpELExpression value) {
    setSpel(value);
    return this;
  }

  @Override
  public SortDefinition withSql(SqlElement value) {
    setSql(value);
    return this;
  }

  @Override
  public SortDefinition withTokenize(TokenizerExpression value) {
    setTokenize(value);
    return this;
  }

  @Override
  public SortDefinition withVtdxml(VtdXmlExpression value) {
    setVtdxml(value);
    return this;
  }

  @Override
  public SortDefinition withXtokenize(XmlTokenizerExpression value) {
    setXtokenize(value);
    return this;
  }

  @Override
  public SortDefinition withXpath(XpathElement value) {
    setXpath(value);
    return this;
  }

  @Override
  public SortDefinition withXquery(XqueryElement value) {
    setXquery(value);
    return this;
  }

  @Override
  public SortDefinition withAopOrAggregateOrBean(ProcessorDefinition... values) {
    if (values != null) {
      for (ProcessorDefinition value : values) {
        getAopOrAggregateOrBean().add(value);
      }
    }
    return this;
  }

  @Override
  public SortDefinition withAopOrAggregateOrBean(Collection<ProcessorDefinition> values) {
    if (values != null) {
      getAopOrAggregateOrBean().addAll(values);
    }
    return this;
  }

  @Override
  public SortDefinition withInheritErrorHandler(Boolean value) {
    setInheritErrorHandler(value);
    return this;
  }

  @Override
  public SortDefinition withDescription(DescriptionElement value) {
    setDescription(value);
    return this;
  }

  @Override
  public SortDefinition withCustomId(Boolean value) {
    setCustomId(value);
    return this;
  }

  @Override
  public SortDefinition withId(String value) {
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
