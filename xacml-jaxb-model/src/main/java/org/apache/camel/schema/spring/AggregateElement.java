//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.10-b140310.1920 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.24 at 02:28:45 PM PDT 
//


package org.apache.camel.schema.spring;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://camel.apache.org/schema/spring}processorDefinition">
 *       &lt;sequence>
 *         &lt;element name="correlationExpression" type="{http://camel.apache.org/schema/spring}expressionSubElementDefinition"/>
 *         &lt;element name="completionPredicate" type="{http://camel.apache.org/schema/spring}expressionSubElementDefinition" minOccurs="0"/>
 *         &lt;element name="completionTimeout" type="{http://camel.apache.org/schema/spring}expressionSubElementDefinition" minOccurs="0"/>
 *         &lt;element name="completionSize" type="{http://camel.apache.org/schema/spring}expressionSubElementDefinition" minOccurs="0"/>
 *         &lt;element ref="{http://camel.apache.org/schema/spring}optimisticLockRetryPolicy" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://camel.apache.org/schema/spring}aop"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}aggregate"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}bean"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}doCatch"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}when"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}choice"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}otherwise"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}convertBodyTo"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}delay"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}dynamicRouter"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}enrich"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}filter"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}doFinally"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}idempotentConsumer"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}inOnly"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}inOut"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}intercept"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}interceptFrom"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}interceptToEndpoint"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}loadBalance"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}log"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}loop"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}marshal"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}multicast"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}onCompletion"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}onException"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}pipeline"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}policy"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}pollEnrich"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}process"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}recipientList"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}removeHeader"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}removeHeaders"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}removeProperty"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}resequence"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}rollback"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}route"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}routingSlip"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}sample"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}setBody"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}setExchangePattern"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}setFaultBody"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}setHeader"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}setOutHeader"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}setProperty"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}sort"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}split"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}stop"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}threads"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}throttle"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}throwException"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}to"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}transacted"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}transform"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}doTry"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}unmarshal"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}validate"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}wireTap"/>
 *           &lt;element ref="{http://camel.apache.org/schema/spring}restBinding"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="parallelProcessing" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="optimisticLocking" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="executorServiceRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="timeoutCheckerExecutorServiceRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="aggregationRepositoryRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="strategyRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="strategyMethodName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="strategyMethodAllowNull" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="completionSize" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="completionInterval" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="completionTimeout" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="completionFromBatchConsumer" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="groupExchanges" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="eagerCheckCompletion" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ignoreInvalidCorrelationKeys" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="closeCorrelationKeyOnCompletion" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="discardOnCompletionTimeout" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="forceCompletionOnStop" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;anyAttribute processContents='skip' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "correlationExpression",
    "completionPredicate",
    "completionTimeout",
    "completionSize",
    "optimisticLockRetryPolicy",
    "aopOrAggregateOrBean"
})
@XmlRootElement(name = "aggregate")
public class AggregateElement
    extends ProcessorDefinition
{

    @XmlElement(required = true)
    protected ExpressionSubElementDefinition correlationExpression;
    protected ExpressionSubElementDefinition completionPredicate;
    protected ExpressionSubElementDefinition completionTimeout;
    protected ExpressionSubElementDefinition completionSize;
    protected OptimisticLockRetryPolicyDefinition optimisticLockRetryPolicy;
    @XmlElements({
        @XmlElement(name = "aop", type = AopDefinition.class),
        @XmlElement(name = "aggregate", type = AggregateElement.class),
        @XmlElement(name = "bean", type = BeanElement.class),
        @XmlElement(name = "doCatch", type = CatchDefinition.class),
        @XmlElement(name = "when", type = WhenDefinition.class),
        @XmlElement(name = "choice", type = ChoiceElement.class),
        @XmlElement(name = "otherwise", type = OtherwiseElement.class),
        @XmlElement(name = "convertBodyTo", type = ConvertBodyDefinition.class),
        @XmlElement(name = "delay", type = DelayElement.class),
        @XmlElement(name = "dynamicRouter", type = DynamicRouterDefinition.class),
        @XmlElement(name = "enrich", type = EnrichDefinition.class),
        @XmlElement(name = "filter", type = FilterElement.class),
        @XmlElement(name = "doFinally", type = FinallyDefinition.class),
        @XmlElement(name = "idempotentConsumer", type = IdempotentConsumerDefinition.class),
        @XmlElement(name = "inOnly", type = InOnlyDefinition.class),
        @XmlElement(name = "inOut", type = InOutDefinition.class),
        @XmlElement(name = "intercept", type = InterceptDefinition.class),
        @XmlElement(name = "interceptFrom", type = InterceptFromDefinition.class),
        @XmlElement(name = "interceptToEndpoint", type = InterceptSendToEndpointDefinition.class),
        @XmlElement(name = "loadBalance", type = LoadBalanceDefinition.class),
        @XmlElement(name = "log", type = LogElement.class),
        @XmlElement(name = "loop", type = LoopDefinition.class),
        @XmlElement(name = "marshal", type = MarshalDefinition.class),
        @XmlElement(name = "multicast", type = MulticastDefinition.class),
        @XmlElement(name = "onCompletion", type = OnCompletionDefinition.class),
        @XmlElement(name = "onException", type = OnExceptionDefinition.class),
        @XmlElement(name = "pipeline", type = PipelineElement.class),
        @XmlElement(name = "policy", type = PolicyDefinition.class),
        @XmlElement(name = "pollEnrich", type = PollEnrichDefinition.class),
        @XmlElement(name = "process", type = ProcessElement.class),
        @XmlElement(name = "recipientList", type = RecipientListDefinition.class),
        @XmlElement(name = "removeHeader", type = RemoveHeaderDefinition.class),
        @XmlElement(name = "removeHeaders", type = RemoveHeadersDefinition.class),
        @XmlElement(name = "removeProperty", type = RemovePropertyDefinition.class),
        @XmlElement(name = "resequence", type = ResequenceDefinition.class),
        @XmlElement(name = "rollback", type = RollbackDefinition.class),
        @XmlElement(name = "route", type = RouteElement.class),
        @XmlElement(name = "routingSlip", type = RoutingSlipDefinition.class),
        @XmlElement(name = "sample", type = SamplingDefinition.class),
        @XmlElement(name = "setBody", type = SetBodyDefinition.class),
        @XmlElement(name = "setExchangePattern", type = SetExchangePatternDefinition.class),
        @XmlElement(name = "setFaultBody", type = SetFaultBodyDefinition.class),
        @XmlElement(name = "setHeader", type = SetHeaderDefinition.class),
        @XmlElement(name = "setOutHeader", type = SetOutHeaderDefinition.class),
        @XmlElement(name = "setProperty", type = SetPropertyDefinition.class),
        @XmlElement(name = "sort", type = SortDefinition.class),
        @XmlElement(name = "split", type = SplitDefinition.class),
        @XmlElement(name = "stop", type = StopDefinition.class),
        @XmlElement(name = "threads", type = ThreadsDefinition.class),
        @XmlElement(name = "throttle", type = ThrottleDefinition.class),
        @XmlElement(name = "throwException", type = ThrowExceptionDefinition.class),
        @XmlElement(name = "to", type = ToElement.class),
        @XmlElement(name = "transacted", type = TransactedDefinition.class),
        @XmlElement(name = "transform", type = TransformElement.class),
        @XmlElement(name = "doTry", type = TryDefinition.class),
        @XmlElement(name = "unmarshal", type = UnmarshalDefinition.class),
        @XmlElement(name = "validate", type = ValidateDefinition.class),
        @XmlElement(name = "wireTap", type = WireTapDefinition.class),
        @XmlElement(name = "restBinding", type = RestBindingElement.class)
    })
    protected List<ProcessorDefinition> aopOrAggregateOrBean;
    @XmlAttribute(name = "parallelProcessing")
    protected Boolean parallelProcessing;
    @XmlAttribute(name = "optimisticLocking")
    protected Boolean optimisticLocking;
    @XmlAttribute(name = "executorServiceRef")
    protected String executorServiceRef;
    @XmlAttribute(name = "timeoutCheckerExecutorServiceRef")
    protected String timeoutCheckerExecutorServiceRef;
    @XmlAttribute(name = "aggregationRepositoryRef")
    protected String aggregationRepositoryRef;
    @XmlAttribute(name = "strategyRef")
    protected String strategyRef;
    @XmlAttribute(name = "strategyMethodName")
    protected String strategyMethodName;
    @XmlAttribute(name = "strategyMethodAllowNull")
    protected Boolean strategyMethodAllowNull;
    @XmlAttribute(name = "completionSize")
    protected Integer completionSizeInt;
    @XmlAttribute(name = "completionInterval")
    protected Long completionInterval;
    @XmlAttribute(name = "completionTimeout")
    protected Long completionTimeoutLong;
    @XmlAttribute(name = "completionFromBatchConsumer")
    protected Boolean completionFromBatchConsumer;
    @XmlAttribute(name = "groupExchanges")
    protected Boolean groupExchanges;
    @XmlAttribute(name = "eagerCheckCompletion")
    protected Boolean eagerCheckCompletion;
    @XmlAttribute(name = "ignoreInvalidCorrelationKeys")
    protected Boolean ignoreInvalidCorrelationKeys;
    @XmlAttribute(name = "closeCorrelationKeyOnCompletion")
    protected Integer closeCorrelationKeyOnCompletion;
    @XmlAttribute(name = "discardOnCompletionTimeout")
    protected Boolean discardOnCompletionTimeout;
    @XmlAttribute(name = "forceCompletionOnStop")
    protected Boolean forceCompletionOnStop;

    /**
     * Gets the value of the correlationExpression property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionSubElementDefinition }
     *     
     */
    public ExpressionSubElementDefinition getCorrelationExpression() {
        return correlationExpression;
    }

    /**
     * Sets the value of the correlationExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionSubElementDefinition }
     *     
     */
    public void setCorrelationExpression(ExpressionSubElementDefinition value) {
        this.correlationExpression = value;
    }

    /**
     * Gets the value of the completionPredicate property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionSubElementDefinition }
     *     
     */
    public ExpressionSubElementDefinition getCompletionPredicate() {
        return completionPredicate;
    }

    /**
     * Sets the value of the completionPredicate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionSubElementDefinition }
     *     
     */
    public void setCompletionPredicate(ExpressionSubElementDefinition value) {
        this.completionPredicate = value;
    }

    /**
     * Gets the value of the completionTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionSubElementDefinition }
     *     
     */
    public ExpressionSubElementDefinition getCompletionTimeout() {
        return completionTimeout;
    }

    /**
     * Sets the value of the completionTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionSubElementDefinition }
     *     
     */
    public void setCompletionTimeout(ExpressionSubElementDefinition value) {
        this.completionTimeout = value;
    }

    /**
     * Gets the value of the completionSize property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionSubElementDefinition }
     *     
     */
    public ExpressionSubElementDefinition getCompletionSize() {
        return completionSize;
    }

    /**
     * Sets the value of the completionSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionSubElementDefinition }
     *     
     */
    public void setCompletionSize(ExpressionSubElementDefinition value) {
        this.completionSize = value;
    }

    /**
     * Gets the value of the optimisticLockRetryPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link OptimisticLockRetryPolicyDefinition }
     *     
     */
    public OptimisticLockRetryPolicyDefinition getOptimisticLockRetryPolicy() {
        return optimisticLockRetryPolicy;
    }

    /**
     * Sets the value of the optimisticLockRetryPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptimisticLockRetryPolicyDefinition }
     *     
     */
    public void setOptimisticLockRetryPolicy(OptimisticLockRetryPolicyDefinition value) {
        this.optimisticLockRetryPolicy = value;
    }

    /**
     * Gets the value of the aopOrAggregateOrBean property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aopOrAggregateOrBean property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAopOrAggregateOrBean().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AopDefinition }
     * {@link AggregateElement }
     * {@link BeanElement }
     * {@link CatchDefinition }
     * {@link WhenDefinition }
     * {@link ChoiceElement }
     * {@link OtherwiseElement }
     * {@link ConvertBodyDefinition }
     * {@link DelayElement }
     * {@link DynamicRouterDefinition }
     * {@link EnrichDefinition }
     * {@link FilterElement }
     * {@link FinallyDefinition }
     * {@link IdempotentConsumerDefinition }
     * {@link InOnlyDefinition }
     * {@link InOutDefinition }
     * {@link InterceptDefinition }
     * {@link InterceptFromDefinition }
     * {@link InterceptSendToEndpointDefinition }
     * {@link LoadBalanceDefinition }
     * {@link LogElement }
     * {@link LoopDefinition }
     * {@link MarshalDefinition }
     * {@link MulticastDefinition }
     * {@link OnCompletionDefinition }
     * {@link OnExceptionDefinition }
     * {@link PipelineElement }
     * {@link PolicyDefinition }
     * {@link PollEnrichDefinition }
     * {@link ProcessElement }
     * {@link RecipientListDefinition }
     * {@link RemoveHeaderDefinition }
     * {@link RemoveHeadersDefinition }
     * {@link RemovePropertyDefinition }
     * {@link ResequenceDefinition }
     * {@link RollbackDefinition }
     * {@link RouteElement }
     * {@link RoutingSlipDefinition }
     * {@link SamplingDefinition }
     * {@link SetBodyDefinition }
     * {@link SetExchangePatternDefinition }
     * {@link SetFaultBodyDefinition }
     * {@link SetHeaderDefinition }
     * {@link SetOutHeaderDefinition }
     * {@link SetPropertyDefinition }
     * {@link SortDefinition }
     * {@link SplitDefinition }
     * {@link StopDefinition }
     * {@link ThreadsDefinition }
     * {@link ThrottleDefinition }
     * {@link ThrowExceptionDefinition }
     * {@link ToElement }
     * {@link TransactedDefinition }
     * {@link TransformElement }
     * {@link TryDefinition }
     * {@link UnmarshalDefinition }
     * {@link ValidateDefinition }
     * {@link WireTapDefinition }
     * {@link RestBindingElement }
     * 
     * 
     */
    public List<ProcessorDefinition> getAopOrAggregateOrBean() {
        if (aopOrAggregateOrBean == null) {
            aopOrAggregateOrBean = new ArrayList<ProcessorDefinition>();
        }
        return this.aopOrAggregateOrBean;
    }

    /**
     * Gets the value of the parallelProcessing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isParallelProcessing() {
        return parallelProcessing;
    }

    /**
     * Sets the value of the parallelProcessing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setParallelProcessing(Boolean value) {
        this.parallelProcessing = value;
    }

    /**
     * Gets the value of the optimisticLocking property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOptimisticLocking() {
        return optimisticLocking;
    }

    /**
     * Sets the value of the optimisticLocking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOptimisticLocking(Boolean value) {
        this.optimisticLocking = value;
    }

    /**
     * Gets the value of the executorServiceRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecutorServiceRef() {
        return executorServiceRef;
    }

    /**
     * Sets the value of the executorServiceRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecutorServiceRef(String value) {
        this.executorServiceRef = value;
    }

    /**
     * Gets the value of the timeoutCheckerExecutorServiceRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeoutCheckerExecutorServiceRef() {
        return timeoutCheckerExecutorServiceRef;
    }

    /**
     * Sets the value of the timeoutCheckerExecutorServiceRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeoutCheckerExecutorServiceRef(String value) {
        this.timeoutCheckerExecutorServiceRef = value;
    }

    /**
     * Gets the value of the aggregationRepositoryRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAggregationRepositoryRef() {
        return aggregationRepositoryRef;
    }

    /**
     * Sets the value of the aggregationRepositoryRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAggregationRepositoryRef(String value) {
        this.aggregationRepositoryRef = value;
    }

    /**
     * Gets the value of the strategyRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrategyRef() {
        return strategyRef;
    }

    /**
     * Sets the value of the strategyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrategyRef(String value) {
        this.strategyRef = value;
    }

    /**
     * Gets the value of the strategyMethodName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrategyMethodName() {
        return strategyMethodName;
    }

    /**
     * Sets the value of the strategyMethodName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrategyMethodName(String value) {
        this.strategyMethodName = value;
    }

    /**
     * Gets the value of the strategyMethodAllowNull property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStrategyMethodAllowNull() {
        return strategyMethodAllowNull;
    }

    /**
     * Sets the value of the strategyMethodAllowNull property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStrategyMethodAllowNull(Boolean value) {
        this.strategyMethodAllowNull = value;
    }

    /**
     * Gets the value of the completionSizeInt property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCompletionSizeInt() {
        return completionSizeInt;
    }

    /**
     * Sets the value of the completionSizeInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCompletionSizeInt(Integer value) {
        this.completionSizeInt = value;
    }

    /**
     * Gets the value of the completionInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCompletionInterval() {
        return completionInterval;
    }

    /**
     * Sets the value of the completionInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCompletionInterval(Long value) {
        this.completionInterval = value;
    }

    /**
     * Gets the value of the completionTimeoutLong property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCompletionTimeoutLong() {
        return completionTimeoutLong;
    }

    /**
     * Sets the value of the completionTimeoutLong property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCompletionTimeoutLong(Long value) {
        this.completionTimeoutLong = value;
    }

    /**
     * Gets the value of the completionFromBatchConsumer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCompletionFromBatchConsumer() {
        return completionFromBatchConsumer;
    }

    /**
     * Sets the value of the completionFromBatchConsumer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCompletionFromBatchConsumer(Boolean value) {
        this.completionFromBatchConsumer = value;
    }

    /**
     * Gets the value of the groupExchanges property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGroupExchanges() {
        return groupExchanges;
    }

    /**
     * Sets the value of the groupExchanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGroupExchanges(Boolean value) {
        this.groupExchanges = value;
    }

    /**
     * Gets the value of the eagerCheckCompletion property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEagerCheckCompletion() {
        return eagerCheckCompletion;
    }

    /**
     * Sets the value of the eagerCheckCompletion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEagerCheckCompletion(Boolean value) {
        this.eagerCheckCompletion = value;
    }

    /**
     * Gets the value of the ignoreInvalidCorrelationKeys property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreInvalidCorrelationKeys() {
        return ignoreInvalidCorrelationKeys;
    }

    /**
     * Sets the value of the ignoreInvalidCorrelationKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreInvalidCorrelationKeys(Boolean value) {
        this.ignoreInvalidCorrelationKeys = value;
    }

    /**
     * Gets the value of the closeCorrelationKeyOnCompletion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCloseCorrelationKeyOnCompletion() {
        return closeCorrelationKeyOnCompletion;
    }

    /**
     * Sets the value of the closeCorrelationKeyOnCompletion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCloseCorrelationKeyOnCompletion(Integer value) {
        this.closeCorrelationKeyOnCompletion = value;
    }

    /**
     * Gets the value of the discardOnCompletionTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDiscardOnCompletionTimeout() {
        return discardOnCompletionTimeout;
    }

    /**
     * Sets the value of the discardOnCompletionTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDiscardOnCompletionTimeout(Boolean value) {
        this.discardOnCompletionTimeout = value;
    }

    /**
     * Gets the value of the forceCompletionOnStop property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForceCompletionOnStop() {
        return forceCompletionOnStop;
    }

    /**
     * Sets the value of the forceCompletionOnStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForceCompletionOnStop(Boolean value) {
        this.forceCompletionOnStop = value;
    }

    public AggregateElement withCorrelationExpression(ExpressionSubElementDefinition value) {
        setCorrelationExpression(value);
        return this;
    }

    public AggregateElement withCompletionPredicate(ExpressionSubElementDefinition value) {
        setCompletionPredicate(value);
        return this;
    }

    public AggregateElement withCompletionTimeout(ExpressionSubElementDefinition value) {
        setCompletionTimeout(value);
        return this;
    }

    public AggregateElement withCompletionSize(ExpressionSubElementDefinition value) {
        setCompletionSize(value);
        return this;
    }

    public AggregateElement withOptimisticLockRetryPolicy(OptimisticLockRetryPolicyDefinition value) {
        setOptimisticLockRetryPolicy(value);
        return this;
    }

    public AggregateElement withAopOrAggregateOrBean(ProcessorDefinition... values) {
        if (values!= null) {
            for (ProcessorDefinition value: values) {
                getAopOrAggregateOrBean().add(value);
            }
        }
        return this;
    }

    public AggregateElement withAopOrAggregateOrBean(Collection<ProcessorDefinition> values) {
        if (values!= null) {
            getAopOrAggregateOrBean().addAll(values);
        }
        return this;
    }

    public AggregateElement withParallelProcessing(Boolean value) {
        setParallelProcessing(value);
        return this;
    }

    public AggregateElement withOptimisticLocking(Boolean value) {
        setOptimisticLocking(value);
        return this;
    }

    public AggregateElement withExecutorServiceRef(String value) {
        setExecutorServiceRef(value);
        return this;
    }

    public AggregateElement withTimeoutCheckerExecutorServiceRef(String value) {
        setTimeoutCheckerExecutorServiceRef(value);
        return this;
    }

    public AggregateElement withAggregationRepositoryRef(String value) {
        setAggregationRepositoryRef(value);
        return this;
    }

    public AggregateElement withStrategyRef(String value) {
        setStrategyRef(value);
        return this;
    }

    public AggregateElement withStrategyMethodName(String value) {
        setStrategyMethodName(value);
        return this;
    }

    public AggregateElement withStrategyMethodAllowNull(Boolean value) {
        setStrategyMethodAllowNull(value);
        return this;
    }

    public AggregateElement withCompletionSizeInt(Integer value) {
        setCompletionSizeInt(value);
        return this;
    }

    public AggregateElement withCompletionInterval(Long value) {
        setCompletionInterval(value);
        return this;
    }

    public AggregateElement withCompletionTimeoutLong(Long value) {
        setCompletionTimeoutLong(value);
        return this;
    }

    public AggregateElement withCompletionFromBatchConsumer(Boolean value) {
        setCompletionFromBatchConsumer(value);
        return this;
    }

    public AggregateElement withGroupExchanges(Boolean value) {
        setGroupExchanges(value);
        return this;
    }

    public AggregateElement withEagerCheckCompletion(Boolean value) {
        setEagerCheckCompletion(value);
        return this;
    }

    public AggregateElement withIgnoreInvalidCorrelationKeys(Boolean value) {
        setIgnoreInvalidCorrelationKeys(value);
        return this;
    }

    public AggregateElement withCloseCorrelationKeyOnCompletion(Integer value) {
        setCloseCorrelationKeyOnCompletion(value);
        return this;
    }

    public AggregateElement withDiscardOnCompletionTimeout(Boolean value) {
        setDiscardOnCompletionTimeout(value);
        return this;
    }

    public AggregateElement withForceCompletionOnStop(Boolean value) {
        setForceCompletionOnStop(value);
        return this;
    }

    @Override
    public AggregateElement withInheritErrorHandler(Boolean value) {
        setInheritErrorHandler(value);
        return this;
    }

    @Override
    public AggregateElement withDescription(DescriptionElement value) {
        setDescription(value);
        return this;
    }

    @Override
    public AggregateElement withCustomId(Boolean value) {
        setCustomId(value);
        return this;
    }

    @Override
    public AggregateElement withId(String value) {
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
