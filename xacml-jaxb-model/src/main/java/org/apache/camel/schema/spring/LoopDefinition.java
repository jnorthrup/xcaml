//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.10-b140310.1920 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.24 at 02:28:45 PM PDT 
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
 * <p>Java class for loopDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loopDefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://camel.apache.org/schema/spring}expressionNode">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="copy" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;anyAttribute processContents='skip' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loopDefinition")
public class LoopDefinition
    extends ExpressionNode
{

    @XmlAttribute(name = "copy")
    protected Boolean copy;

    /**
     * Gets the value of the copy property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCopy() {
        return copy;
    }

    /**
     * Sets the value of the copy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCopy(Boolean value) {
        this.copy = value;
    }

    public LoopDefinition withCopy(Boolean value) {
        setCopy(value);
        return this;
    }

    @Override
    public LoopDefinition withExpressionDefinition(Expression value) {
        setExpressionDefinition(value);
        return this;
    }

    @Override
    public LoopDefinition withConstant(ConstantElement value) {
        setConstant(value);
        return this;
    }

    @Override
    public LoopDefinition withEl(ElElement value) {
        setEl(value);
        return this;
    }

    @Override
    public LoopDefinition withGroovy(GroovyElement value) {
        setGroovy(value);
        return this;
    }

    @Override
    public LoopDefinition withHeader(HeaderElement value) {
        setHeader(value);
        return this;
    }

    @Override
    public LoopDefinition withJxpath(JxpathElement value) {
        setJxpath(value);
        return this;
    }

    @Override
    public LoopDefinition withJavaScript(JavaScriptElement value) {
        setJavaScript(value);
        return this;
    }

    @Override
    public LoopDefinition withJsonpath(JsonpathElement value) {
        setJsonpath(value);
        return this;
    }

    @Override
    public LoopDefinition withLanguage(LanguageElement value) {
        setLanguage(value);
        return this;
    }

    @Override
    public LoopDefinition withMethod(MethodElement value) {
        setMethod(value);
        return this;
    }

    @Override
    public LoopDefinition withMvel(MvelElement value) {
        setMvel(value);
        return this;
    }

    @Override
    public LoopDefinition withOgnl(OgnlElement value) {
        setOgnl(value);
        return this;
    }

    @Override
    public LoopDefinition withPhp(PhpElement value) {
        setPhp(value);
        return this;
    }

    @Override
    public LoopDefinition withPython(PythonElement value) {
        setPython(value);
        return this;
    }

    @Override
    public LoopDefinition withRef(RefElement value) {
        setRef(value);
        return this;
    }

    @Override
    public LoopDefinition withRuby(RubyElement value) {
        setRuby(value);
        return this;
    }

    @Override
    public LoopDefinition withSimple(SimpleElement value) {
        setSimple(value);
        return this;
    }

    @Override
    public LoopDefinition withSpel(SpELExpression value) {
        setSpel(value);
        return this;
    }

    @Override
    public LoopDefinition withSql(SqlElement value) {
        setSql(value);
        return this;
    }

    @Override
    public LoopDefinition withTokenize(TokenizerExpression value) {
        setTokenize(value);
        return this;
    }

    @Override
    public LoopDefinition withVtdxml(VtdXmlExpression value) {
        setVtdxml(value);
        return this;
    }

    @Override
    public LoopDefinition withXtokenize(XmlTokenizerExpression value) {
        setXtokenize(value);
        return this;
    }

    @Override
    public LoopDefinition withXpath(XpathElement value) {
        setXpath(value);
        return this;
    }

    @Override
    public LoopDefinition withXquery(XqueryElement value) {
        setXquery(value);
        return this;
    }

    @Override
    public LoopDefinition withAopOrAggregateOrBean(ProcessorDefinition... values) {
        if (values!= null) {
            for (ProcessorDefinition value: values) {
                getAopOrAggregateOrBean().add(value);
            }
        }
        return this;
    }

    @Override
    public LoopDefinition withAopOrAggregateOrBean(Collection<ProcessorDefinition> values) {
        if (values!= null) {
            getAopOrAggregateOrBean().addAll(values);
        }
        return this;
    }

    @Override
    public LoopDefinition withInheritErrorHandler(Boolean value) {
        setInheritErrorHandler(value);
        return this;
    }

    @Override
    public LoopDefinition withDescription(DescriptionElement value) {
        setDescription(value);
        return this;
    }

    @Override
    public LoopDefinition withCustomId(Boolean value) {
        setCustomId(value);
        return this;
    }

    @Override
    public LoopDefinition withId(String value) {
        setId(value);
        return this;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.DEFAULT_STYLE);
    }

}
