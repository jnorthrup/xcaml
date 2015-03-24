//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.10-b140310.1920 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.24 at 02:18:22 PM PDT 
//


package org.apache.camel.schema.spring;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for validateDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="validateDefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://camel.apache.org/schema/spring}noOutputExpressionNode">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='skip' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validateDefinition")
public class ValidateDefinition
    extends NoOutputExpressionNode
{


    @Override
    public ValidateDefinition withExpressionDefinition(Expression value) {
        setExpressionDefinition(value);
        return this;
    }

    @Override
    public ValidateDefinition withConstant(ConstantElement value) {
        setConstant(value);
        return this;
    }

    @Override
    public ValidateDefinition withEl(ElElement value) {
        setEl(value);
        return this;
    }

    @Override
    public ValidateDefinition withGroovy(GroovyElement value) {
        setGroovy(value);
        return this;
    }

    @Override
    public ValidateDefinition withHeader(HeaderElement value) {
        setHeader(value);
        return this;
    }

    @Override
    public ValidateDefinition withJxpath(JxpathElement value) {
        setJxpath(value);
        return this;
    }

    @Override
    public ValidateDefinition withJavaScript(JavaScriptElement value) {
        setJavaScript(value);
        return this;
    }

    @Override
    public ValidateDefinition withJsonpath(JsonpathElement value) {
        setJsonpath(value);
        return this;
    }

    @Override
    public ValidateDefinition withLanguage(LanguageElement value) {
        setLanguage(value);
        return this;
    }

    @Override
    public ValidateDefinition withMethod(MethodElement value) {
        setMethod(value);
        return this;
    }

    @Override
    public ValidateDefinition withMvel(MvelElement value) {
        setMvel(value);
        return this;
    }

    @Override
    public ValidateDefinition withOgnl(OgnlElement value) {
        setOgnl(value);
        return this;
    }

    @Override
    public ValidateDefinition withPhp(PhpElement value) {
        setPhp(value);
        return this;
    }

    @Override
    public ValidateDefinition withPython(PythonElement value) {
        setPython(value);
        return this;
    }

    @Override
    public ValidateDefinition withRef(RefElement value) {
        setRef(value);
        return this;
    }

    @Override
    public ValidateDefinition withRuby(RubyElement value) {
        setRuby(value);
        return this;
    }

    @Override
    public ValidateDefinition withSimple(SimpleElement value) {
        setSimple(value);
        return this;
    }

    @Override
    public ValidateDefinition withSpel(SpELExpression value) {
        setSpel(value);
        return this;
    }

    @Override
    public ValidateDefinition withSql(SqlElement value) {
        setSql(value);
        return this;
    }

    @Override
    public ValidateDefinition withTokenize(TokenizerExpression value) {
        setTokenize(value);
        return this;
    }

    @Override
    public ValidateDefinition withVtdxml(VtdXmlExpression value) {
        setVtdxml(value);
        return this;
    }

    @Override
    public ValidateDefinition withXtokenize(XmlTokenizerExpression value) {
        setXtokenize(value);
        return this;
    }

    @Override
    public ValidateDefinition withXpath(XpathElement value) {
        setXpath(value);
        return this;
    }

    @Override
    public ValidateDefinition withXquery(XqueryElement value) {
        setXquery(value);
        return this;
    }

    @Override
    public ValidateDefinition withAopOrAggregateOrBean(ProcessorDefinition... values) {
        if (values!= null) {
            for (ProcessorDefinition value: values) {
                getAopOrAggregateOrBean().add(value);
            }
        }
        return this;
    }

    @Override
    public ValidateDefinition withAopOrAggregateOrBean(Collection<ProcessorDefinition> values) {
        if (values!= null) {
            getAopOrAggregateOrBean().addAll(values);
        }
        return this;
    }

    @Override
    public ValidateDefinition withInheritErrorHandler(Boolean value) {
        setInheritErrorHandler(value);
        return this;
    }

    @Override
    public ValidateDefinition withDescription(DescriptionElement value) {
        setDescription(value);
        return this;
    }

    @Override
    public ValidateDefinition withCustomId(Boolean value) {
        setCustomId(value);
        return this;
    }

    @Override
    public ValidateDefinition withId(String value) {
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
