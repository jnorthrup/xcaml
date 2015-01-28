/**
 * <h1>7 Functional requirements</h1>
 * 
 * <p>
 * This section specifies certain functional requirements that are not directly associated with the production or
 * consumption of a particular XACML element.
 * </p>
 * 
 * <p>
 * Note that in each case an implementation is conformant as long as it produces the same result as is specified here,
 * regardless of how and in what order the implementation behaves internally.
 * </p>
 * 
 * <h2>7.1 Unicode issues</h2>
 * 
 * <h3>7.1.1 Normalization</h3>
 * 
 * <p>
 * In Unicode, some equivalent characters can be represented by more than one different Unicode character sequence. See
 * [CMF]. The process of converting Unicode strings into equivalent character sequences is called "normalization"
 * [UAX15]. Some operations, such as string comparison, are sensitive to normalization. An operation is
 * normalization-sensitive if its output(s) are different depending on the state of normalization of the input(s); if
 * the output(s) are textual, they are deemed different only if they would remain different were they to be normalized.
 * </p>
 * 
 * <p>
 * For more information on normalization see [CM].
 * </p>
 * 
 * <p>
 * An XACML implementation MUST behave as if each normalization-sensitive operation normalizes input strings into
 * Unicode Normalization Form C ("NFC"). An implementation MAY use some other form of internal processing (such as using
 * a non-Unicode, "legacy" character encoding) as long as the externally visible results are identical to this
 * specification.
 * </p>
 * 
 * <h3>7.1.2 Version of Unicode</h3>
 * 
 * <p>
 * The version of Unicode used by XACML is implementation defined. It is RECOMMENDED that the latest version is used.
 * Also note security issues in section 9.3.
 * </p>
 * 
 * <h2>7.2 Policy enforcement point</h2>
 * 
 * <p>
 * This section describes the requirements for the PEP.
 * </p>
 * 
 * <p>
 * An application functions in the role of the PEP if it guards access to a set of resources and asks the PDP for an
 * authorization decision. The PEP MUST abide by the authorization decision as described in one of the following
 * sub-sections
 * </p>
 * 
 * <p>
 * In any case any advice in the decision may be safely ignored by the PEP.
 * </p>
 * 
 * <h3>7.2.1 Base PEP</h3>
 * 
 * <p>
 * If the decision is "Permit", then the PEP SHALL permit access.  If obligations accompany the decision, then the PEP
 * SHALL permit access only if it understands and it can and will discharge those obligations.
 * </p>
 * 
 * <p>
 * If the decision is "Deny", then the PEP SHALL deny access.  If obligations accompany the decision, then the PEP shall
 * deny access only if it understands, and it can and will discharge those obligations.
 * </p>
 * 
 * <p>
 * If the decision is “Not Applicable”, then the PEP’s behavior is undefined.
 * </p>
 * 
 * <p>
 * If the decision is “Indeterminate”, then the PEP’s behavior is undefined.
 * </p>
 * 
 * <h3>7.2.2 Deny-biased PEP</h3>
 * 
 * <p>
 * If the decision is "Permit", then the PEP SHALL permit access.  If obligations accompany the decision, then the PEP
 * SHALL permit access only if it understands and it can and will discharge those obligations.
 * </p>
 * 
 * <p>
 * All other decisions SHALL result in the denial of access.
 * </p>
 * 
 * <p>
 * Note: other actions, e.g. consultation of additional PDPs, reformulation/resubmission of the decision request, etc.,
 * are not prohibited.
 * </p>
 * 
 * <h3>7.2.3 Permit-biased PEP</h3>
 * 
 * <p>
 * If the decision is "Deny", then the PEP SHALL deny access.  If obligations accompany the decision, then the PEP shall
 * deny access only if it understands, and it can and will discharge those obligations.
 * </p>
 * 
 * <p>
 * All other decisions SHALL result in the permission of access.
 * </p>
 * 
 * <p>
 * Note: other actions, e.g. consultation of additional PDPs, reformulation/resubmission of the decision request, etc.,
 * are not prohibited.
 * </p>
 * 
 * <h2>7.3 Attribute evaluation</h2>
 * 
 * <p>
 * Attributes are represented in the request context by the context handler, regardless of whether or not they appeared
 * in the original decision request, and are referred to in the policy by attribute designators and attribute
 * selectors.  A named attribute is the term used for the criteria that the specific attribute designators use to refer
 * to particular attributes in the &lt;Attributes&gt; elements of the request context.
 * </p>
 * 
 * <h3>7.3.1 Structured attributes</h3>
 * 
 * <p>
 * &lt;AttributeValue&gt; elements MAY contain an instance of a structured XML data-type, for example
 * &lt;ds:KeyInfo&gt;.  XACML 3.0 supports several ways for comparing the contents of such elements.
 * </p>
 * <ol>
 * <li>
 * <p>
 * <span>1.</span>In some cases, such elements MAY be compared using one of the XACML string functions, such as
 * “string-regexp-match”, described below.  This requires that the element be given the data-type
 * "http://www.w3.org/2001/XMLSchema#string".  For example, a structured data-type that is actually a ds:KeyInfo/KeyName
 * would appear in the Context as:  
 * </p>
 * </li>
 * </ol>
 * <p>
 * &lt;AttributeValue DataType="http://www.w3.org/2001/XMLSchema#string"&gt;
 * </p>
 * 
 * <p>
 *    &amp;lt;ds:KeyName&amp;gt;jhibbert-key&amp;lt;/ds:KeyName&amp;gt;
 * </p>
 * 
 * <p>
 * &lt;/AttributeValue&gt;
 * </p>
 * 
 * <p>
 * In general, this method will not be adequate unless the structured data-type is quite simple.
 * </p>
 * <ol>
 * <li>
 * <p>
 * <span>2.</span>The structured attribute MAY be made available in the &lt;Content&gt; element of the appropriate
 * attribute category and an &lt;AttributeSelector&gt; element MAY be used to select the contents of a leaf sub-element
 * of the structured data-type by means of an XPath expression.  That value MAY then be compared using one of the
 * supported XACML functions appropriate for its primitive data-type.  This method requires support by the PDP for the
 * optional XPath expressions feature.  
 * </p>
 * </li>
 * <li>
 * <p>
 * <span>3.</span>The structured attribute MAY be made available in the &lt;Content&gt; element of the appropriate
 * attribute category and an &lt;AttributeSelector&gt; element MAY be used to select any node in the structured
 * data-type by means of an XPath expression.  This node MAY then be compared using one of the XPath-based functions
 * described in Section A.3.15.  This method requires support by the PDP for the optional XPath expressions and XPath
 * functions features.  
 * </p>
 * </li>
 * </ol>
 * <p>
 * See also Section 7.3.
 * </p>
 * 
 * <h3>7.3.2 Attribute bags</h3>
 * 
 * <p>
 * XACML defines implicit collections of its data-types.  XACML refers to a collection of values that are of a single
 * data-type as a bag.  Bags of data-types are needed because selections of nodes from an XML resource or XACML request
 * context may return more than one value.
 * </p>
 * 
 * <p>
 * The &lt;AttributeSelector&gt; element uses an XPath expression to specify the selection of data from free form XML. 
 * The result of an XPath expression is termed a node-set, which contains all the nodes from the XML content that match
 * the predicate in the XPath expression.  Based on the various indexing functions provided in the XPath specification,
 * it SHALL be implied that a resultant node-set is the collection of the matching nodes.  XACML also defines the
 * &lt;AttributeDesignator&gt; element to have the same matching methodology for attributes in the XACML request
 * context.
 * </p>
 * 
 * <p>
 * The values in a bag are not ordered, and some of the values may be duplicates.  There SHALL be no notion of a bag
 * containing bags, or a bag containing values of differing types;  i.e., a bag in XACML SHALL contain only values that
 * are of the same data-type.
 * </p>
 * 
 * <h3>7.3.3 Multivalued attributes</h3>
 * 
 * <p>
 * If a single &lt;Attribute&gt; element in a request context contains multiple &lt;AttributeValue&gt; child elements,
 * then the bag of values resulting from evaluation of the &lt;Attribute&gt; element MUST be identical to the bag of
 * values that results from evaluating a context in which each &lt;AttributeValue&gt; element appears in a separate
 * &lt;Attribute&gt; element, each carrying identical meta-data.
 * </p>
 * 
 * <h3>7.3.4 Attribute Matching</h3>
 * 
 * <p>
 * A named attribute includes specific criteria with which to match attributes in the context.  An attribute specifies a
 * Category, AttributeId and DataType, and a named attribute also specifies the Issuer.  A named attribute SHALL match
 * an attribute if the values of their respective Category, AttributeId, DataType and optional Issuer attributes match.
 * The Category of the named attribute MUST match, by identifier equality, the Category of the corresponding context
 * attribute. The AttributeId of the named attribute MUST match, by identifier equality, the AttributeId of the
 * corresponding context attribute.  The DataType of the named attribute MUST match, by identifier equality, the
 * DataType of the corresponding context attribute.  If Issuer is supplied in the named attribute, then it MUST match,
 * using the urn:oasis:names:tc:xacml:1.0:function:string-equal function, the Issuer of the corresponding context
 * attribute.  If Issuer is not supplied in the named attribute, then the matching of the context attribute to the named
 * attribute SHALL be governed by AttributeId and DataType alone, regardless of the presence, absence, or actual value
 * of Issuer in the corresponding context attribute.  In the case of an attribute selector, the matching of the
 * attribute to the named attribute SHALL be governed by the XPath expression and DataType.
 * </p>
 * 
 * <h3>7.3.5 Attribute Retrieval</h3>
 * 
 * <p>
 * The PDP SHALL request the values of attributes in the request context from the context handler. The context handler
 * MAY also add attributes to the request context without the PDP requesting them. The PDP SHALL reference the
 * attributes as if they were in a physical request context document, but the context handler is responsible for
 * obtaining and supplying the requested values by whatever means it deems appropriate, including by retrieving them
 * from one or more Policy Information Points.  The context handler SHALL return the values of attributes that match the
 * attribute designator or attribute selector and form them into a bag of values with the specified data-type.  If no
 * attributes from the request context match, then the attribute SHALL be considered missing.  If the attribute is
 * missing, then MustBePresent governs whether the attribute designator or attribute selector returns an empty bag or an
 * “Indeterminate” result.  If MustBePresent is “False” (default value), then a missing attribute SHALL result in an
 * empty bag.  If MustBePresent is “True”, then a missing attribute SHALL result in “Indeterminate”.  This
 * “Indeterminate” result SHALL be handled in accordance with the specification of the encompassing expressions, rules,
 * policies and policy sets.  If the result is “Indeterminate”, then the AttributeId, DataType and Issuer of the
 * attribute MAY be listed in the authorization decision as described in Section 7.17.  However, a PDP MAY choose not to
 * return such information for security reasons.
 * </p>
 * 
 * <p>
 * Regardless of any dynamic modifications of the request context during policy evaluation, the PDP SHALL behave as if
 * each bag of attribute values is fully populated in the context before it is first tested, and is thereafter immutable
 * during evaluation. (That is, every subsequent test of that attribute shall use the same bag of values that was
 * initially tested.)
 * </p>
 * 
 * <h3>7.3.6 Environment Attributes</h3>
 * 
 * <p>
 * Standard environment attributes are listed in Section B.7.  If a value for one of these attributes is supplied in the
 * decision request, then the context handler SHALL use that value.  Otherwise, the context handler SHALL supply a
 * value.  In the case of date and time attributes, the supplied value SHALL have the semantics of the "date and time
 * that apply to the decision request".
 * </p>
 * 
 * <h3>7.3.7 AttributeSelector evaluation</h3>
 * 
 * <p>
 * An &lt;AttributeSelector&gt; element will be evaluated according to the following processing model.
 * </p>
 * 
 * <p>
 *  
 * </p>
 * 
 * <p>
 * NOTE: It is not necessary for an implementation to actually follow these steps.  It is only necessary to produce
 * results identical to those that would be produced by following these steps.
 * </p>
 * <ol>
 * <li>
 * <p>
 * <span>1.</span>Construct an XML data structure suitable for xpath processing from the &lt;Content&gt; element in the
 * attributes category given by the Category attribute.  The data structure shall be constructed so that the document
 * node of this structure contains a single document element which corresponds to the single child element of the
 * &lt;Content&gt; element.  The constructed data structure shall be equivalent to one that would result from parsing a
 * stand-alone XML document consisting of the contents of the &lt;Content&gt; element (including any comment and
 * processing-instruction markup). Namespace declarations which are not “visibly utilized”, as defined by [exc-c14n],
 * MAY not be present and MUST NOT be utilized by the XPath expression in step 3. The data structure must meet the
 * requirements of the applicable xpath version.  
 * </p>
 * </li>
 * <li>
 * <p>
 * <span>2.</span>Select a context node for xpath processing from this data structure. If there is a ContextSelectorId
 * attribute, the context node shall be the node selected by applying the XPath expression given in the attribute value
 * of the designated attribute (in the attributes category given by the &lt;AttributeSelector&gt; Category attribute). 
 * It shall be an error if this evaluation returns no node or more than one node, in which case the return value MUST be
 * an “Indeterminate” with a status code "urn:oasis:names:tc:xacml:1.0:status:syntax-error".  If there is no
 * ContextSelectorId, the document node of the data structure shall be the context node.  
 * </p>
 * </li>
 * <li>
 * <p>
 * <span>3.</span>Evaluate the XPath expression given in the Path attribute against the xml data structure, using the
 * context node selected in the previous step.  It shall be an error if this evaluation returns anything other than a
 * sequence of nodes (possibly empty), in which case the &lt;AttributeSelector&gt; MUST return “Indeterminate” with a
 * status code "urn:oasis:names:tc:xacml:1.0:status:syntax-error".  
 * </p>
 * </li>
 * <li>
 * <p>
 * <span>4.</span>If the data type is a primitive data type, convert the text value of each selected node to the desired
 * data type, as specified in the DataType attribute. Each value shall be constructed using the appropriate constructor
 * function from [XF] Section 5 listed below, corresponding to the specified data type.<br/>
 * <br/>
 * xs:string()<br/>
 * xs:boolean()<br/>
 * xs:integer()<br/>
 * xs:double()<br/>
 * xs:dateTime()<br/>
 * xs:date()<br/>
 * xs:time()<br/>
 * xs:hexBinary()<br/>
 * xs:base64Binary()<br/>
 * xs:anyURI()<br/>
 * xs:yearMonthDuration()<br/>
 * xs:dayTimeDuration()<br/>
 * <br/>
 * If the DataType is not one of the primitive types listed above, then the return values shall be constructed from the
 * nodeset in a manner specified by the particular DataType extension specification. If the data type extension does not
 * specify an appropriate contructor function, then the &lt;AttributeSelector&gt; MUST return “Indeterminate” with a
 * status code "urn:oasis:names:tc:xacml:1.0:status:syntax-error".<br/>
 * <br/>
 * If an error occurs when converting the values returned by the XPath expression to the specified DataType, then the
 * result of the &lt;AttributeSelector&gt; MUST be "Indeterminate", with a status code
 * "urn:oasis:names:tc:xacml:1.0:status:processing-error"  
 * </p>
 * </li>
 * </ol>
 * <h2>7.4 Expression evaluation</h2>
 * 
 * <p>
 * XACML specifies expressions in terms of the elements listed below, of which the &lt;Apply&gt; and &lt;Condition&gt;
 * elements recursively compose greater expressions.  Valid expressions SHALL be type correct, which means that the
 * types of each of the elements contained within &lt;Apply&gt; elements SHALL agree with the respective argument types
 * of the function that is named by the FunctionId attribute.  The resultant type of the &lt;Apply&gt; element SHALL be
 * the resultant type of the function, which MAY be narrowed to a primitive data-type, or a bag of a primitive
 * data-type, by type-unification.  XACML defines an evaluation result of "Indeterminate", which is said to be the
 * result of an invalid expression, or an operational error occurring during the evaluation of the expression.
 * </p>
 * 
 * <p>
 * XACML defines these elements to be in the substitution group of the &lt;Expression&gt; element:
 * </p>
 * 
 * <p>
 * <span>·</span><span>         </span>&lt;xacml:AttributeValue&gt;
 * </p>
 * 
 * <p>
 * <span>·</span><span>         </span>&lt;xacml:AttributeDesignator&gt;
 * </p>
 * 
 * <p>
 * <span>·</span><span>         </span>&lt;xacml:AttributeSelector&gt;
 * </p>
 * 
 * <p>
 * <span>·</span><span>         </span>&lt;xacml:Apply&gt;
 * </p>
 * 
 * <p>
 * <span>·</span><span>         </span>&lt;xacml:Function&gt;
 * </p>
 * 
 * <p>
 * <span>·</span><span>         </span>&lt;xacml:VariableReference&gt;
 * </p>
 * 
 * <h2>7.5 Arithmetic evaluation</h2>
 * 
 * <p>
 * IEEE 754 [IEEE754] specifies how to evaluate arithmetic functions in a context, which specifies defaults for
 * precision, rounding, etc.  XACML SHALL use this specification for the evaluation of all integer and double functions
 * relying on the Extended Default Context, enhanced with double precision:
 * </p>
 * 
 * <p>
 *             flags -  all set to 0
 * </p>
 * 
 * <p>
 *             trap-enablers -  all set to 0 (IEEE 854 §7) with the exception of the “division-by-zero” trap enabler,
 * which SHALL be set to 1
 * </p>
 * 
 * <p>
 *             precision - is set to the designated double precision
 * </p>
 * 
 * <p>
 *             rounding -  is set to round-half-even (IEEE 854 §4.1)
 * </p>
 * 
 * <h2>7.6 Match evaluation</h2>
 * 
 * <p>
 * The attribute matching element &lt;Match&gt; appears in the &lt;Target&gt; element of rules, policies and policy
 * sets.
 * </p>
 * 
 * <p>
 * This element represents a Boolean expression over attributes of the request context.  A matching element contains a
 * MatchId attribute that specifies the function to be used in performing the match evaluation, an
 * &lt;AttributeValue&gt; and an &lt;AttributeDesignator&gt; or &lt;AttributeSelector&gt; element that specifies the
 * attribute in the context that is to be matched against the specified value.
 * </p>
 * 
 * <p>
 * The MatchId attribute SHALL specify a function that takes two arguments, returning a result type of
 * "http://www.w3.org/2001/XMLSchema#boolean".   The attribute value specified in the matching element SHALL be supplied
 * to the MatchId function as its first argument.  An element of the bag returned by the &lt;AttributeDesignator&gt; or
 * &lt;AttributeSelector&gt; element SHALL be supplied to the MatchId function as its second argument, as explained
 * below.   The DataType of the &lt;AttributeValue&gt; SHALL match the data-type of the first argument expected by the
 * MatchId function.  The DataType of the &lt;AttributeDesignator&gt; or &lt;AttributeSelector&gt; element SHALL match
 * the data-type of the second argument expected by the MatchId function.
 * </p>
 * 
 * <p>
 * In addition, functions that are strictly within an extension to XACML MAY appear as a value for the MatchId
 * attribute, and those functions MAY use data-types that are also extensions, so long as the extension function returns
 * a Boolean result and takes two single base types as its inputs.  The function used as the value for the MatchId
 * attribute SHOULD be easily indexable.  Use of non-indexable or complex functions may prevent efficient evaluation of
 * decision requests.
 * </p>
 * 
 * <p>
 * The evaluation semantics for a matching element is as follows.  If an operational error were to occur while
 * evaluating the &lt;AttributeDesignator&gt; or &lt;AttributeSelector&gt; element, then the result of the entire
 * expression SHALL be "Indeterminate".  If the &lt;AttributeDesignator&gt; or &lt;AttributeSelector&gt; element were to
 * evaluate to an empty bag, then the result of the expression SHALL be "False".  Otherwise, the MatchId function SHALL
 * be applied between the &lt;AttributeValue&gt; and each element of the bag returned from the
 * &lt;AttributeDesignator&gt; or &lt;AttributeSelector&gt; element.  If at least one of those function applications
 * were to evaluate to "True", then the result of the entire expression SHALL be "True".  Otherwise, if at least one of
 * the function applications results in "Indeterminate", then the result SHALL be "Indeterminate".  Finally, if all
 * function applications evaluate to "False", then the result of the entire expression SHALL be "False".
 * </p>
 * 
 * <p>
 * It is also possible to express the semantics of a target matching element in a condition.  For instance, the target
 * match expression that compares a “subject-name” starting with the name “John” can be expressed as follows:
 * </p>
 * 
 * <p>
 * &lt;Match
 * </p>
 * 
 * <p>
 * MatchId=”urn:oasis:names:tc:xacml:1.0:function:string-regexp-match”&gt;
 * </p>
 * 
 * <p>
 *     &lt;AttributeValue DataType=”http://www.w3.org/2001/XMLSchema#string”&gt;
 * </p>
 * 
 * <p>
 *        John.*
 * </p>
 * 
 * <p>
 *     &lt;/AttributeValue&gt;
 * </p>
 * 
 * <p>
 *     &lt;AttributeDesignator
 * </p>
 * 
 * <p>
 *           Category="urn:oasis:names:tc:xacml:1.0:subject-category:access-subject"
 * </p>
 * 
 * <p>
 *           AttributeId=”urn:oasis:names:tc:xacml:1.0:subject:subject-id”
 * </p>
 * 
 * <p>
 *           DataType=”http://www.w3.org/2001/XMLSchema#string”/&gt;
 * </p>
 * 
 * <p>
 * &lt;/Match&gt;
 * </p>
 * 
 * <p>
 * Alternatively, the same match semantics can be expressed as an &lt;Apply&gt; element in a condition by using the
 * “urn:oasis:names:tc:xacml:3.0:function:any-of” function, as follows:
 * </p>
 * 
 * <p>
 * &lt;Apply FunctionId=”urn:oasis:names:tc:xacml:3.0:function:any-of”&gt;
 * </p>
 * 
 * <p>
 *     &lt;Function
 * </p>
 * 
 * <p>
 * FunctionId=”urn:oasis:names:tc:xacml:1.0:function:string-regexp-match”/&gt;
 * </p>
 * 
 * <p>
 *     &lt;AttributeValue DataType=”http://www.w3.org/2001/XMLSchema#string”&gt;
 * </p>
 * 
 * <p>
 *         John.*
 * </p>
 * 
 * <p>
 *     &lt;/AttributeValue&gt;
 * </p>
 * 
 * <p>
 *     &lt;AttributeDesignator
 * </p>
 * 
 * <p>
 *          Category="urn:oasis:names:tc:xacml:1.0:subject-category:access-subject"
 * </p>
 * 
 * <p>
 *          AttributeId=”urn:oasis:names:tc:xacml:1.0:subject:subject-id”
 * </p>
 * 
 * <p>
 *          DataType=”http://www.w3.org/2001/XMLSchema#string”/&gt;
 * </p>
 * 
 * <p>
 * &lt;/Apply&gt;
 * </p>
 * 
 * <h2>7.7 Target evaluation</h2>
 * 
 * <p>
 * An empty target matches any request. Otherwise the target value SHALL be "Match" if all the AnyOf specified in the
 * target match values in the request context.  Otherwise, if any one of the AnyOf specified in the target is “No
 * Match”, then the target SHALL be “No Match”.  Otherwise, the target SHALL be “Indeterminate”.  The target match table
 * is shown in Table 1.
 * </p>
 * <table>
 * <colgroup> <col/> <col/> </colgroup>
 * <tr>
 * <td>
 * <p>
 * &lt;AnyOf&gt; values
 * </p>
 * </td>
 * <td>
 * <p>
 *  Target value
 * </p>
 * </td>
 * </tr>
 * <tr>
 * <td>
 * <p>
 * All “Match”
 * </p>
 * </td>
 * <td>
 * <p>
 * “Match”
 * </p>
 * </td>
 * </tr>
 * <tr>
 * <td>
 * <p>
 * At least one “No Match”
 * </p>
 * </td>
 * <td>
 * <p>
 * “No Match”
 * </p>
 * </td>
 * </tr>
 * <tr>
 * <td>
 * <p>
 * Otherwise
 * </p>
 * </td>
 * <td>
 * <p>
 * “Indeterminate”
 * </p>
 * </td>
 * </tr>
 * </table>
 * <p>
 * Table 1 Target match table
 * </p>
 * 
 * <p>
 * The AnyOf SHALL match values in the request context if at least one of their &lt;AllOf&gt; elements matches a value
 * in the request context.  The AnyOf table is shown in Table 2.
 * </p>
 * <table>
 * <colgroup> <col/> <col/> </colgroup>
 * <tr>
 * <td>
 * <p>
 * <span>&lt;AllOf&gt;</span> values
 * </p>
 * </td>
 * <td>
 * <p>
 *  <span>&lt;AnyOf&gt;</span> Value
 * </p>
 * </td>
 * </tr>
 * <tr>
 * <td>
 * <p>
 * At least one “Match”
 * </p>
 * </td>
 * <td>
 * <p>
 * “Match”
 * </p>
 * </td>
 * </tr>
 * <tr>
 * <td>
 * <p>
 * None matches and at least one “Indeterminate”
 * </p>
 * </td>
 * <td>
 * <p>
 * “Indeterminate”
 * </p>
 * </td>
 * </tr>
 * <tr>
 * <td>
 * <p>
 * All “No match”
 * </p>
 * </td>
 * <td>
 * <p>
 * “No match”
 * </p>
 * </td>
 * </tr>
 * </table>
 * <p>
 * Table 2 AnyOf match table
 * </p>
 * 
 * <p>
 * An AllOf SHALL match a value in the request context if the value of all its &lt;Match&gt; elements is “True”.
 * </p>
 * 
 * <p>
 * The AllOf table is shown in Table 3.
 * </p>
 * <table>
 * <colgroup> <col/> <col/> </colgroup>
 * <tr>
 * <td>
 * <p>
 * <span>&lt;Match&gt;</span> values
 * </p>
 * </td>
 * <td>
 * <p>
 *  <span>&lt;AllOf&gt;</span> Value
 * </p>
 * </td>
 * </tr>
 * <tr>
 * <td>
 * <p>
 * All “True”
 * </p>
 * </td>
 * <td>
 * <p>
 * “Match”
 * </p>
 * </td>
 * </tr>
 * <tr>
 * <td>
 * <p>
 * No “False” and at least one “Indeterminate”
 * </p>
 * </td>
 * <td>
 * <p>
 * “Indeterminate”
 * </p>
 * </td>
 * </tr>
 * <tr>
 * <td>
 * <p>
 * At least one “False”
 * </p>
 * </td>
 * <td>
 * <p>
 * “No match”
 * </p>
 * </td>
 * </tr>
 * </table>
 * <p>
 * Table 3 AllOf match table
 * </p>
 * 
 * <h2>7.8 VariableReference Evaluation</h2>
 * 
 * <p>
 * The &lt;VariableReference&gt; element references a single &lt;VariableDefinition&gt; element contained within the
 * same &lt;Policy&gt; element.  A &lt;VariableReference&gt; that does not reference a particular
 * &lt;VariableDefinition&gt; element within the encompassing &lt;Policy&gt; element is called an undefined reference. 
 * Policies with undefined references are invalid.
 * </p>
 * 
 * <p>
 * In any place where a &lt;VariableReference&gt; occurs, it has the effect as if the text of the &lt;Expression&gt;
 * element defined in the &lt;VariableDefinition&gt; element replaces the &lt;VariableReference&gt; element.  Any
 * evaluation scheme that preserves this semantic is acceptable.  For instance, the expression in the
 * &lt;VariableDefinition&gt; element may be evaluated to a particular value and cached for multiple references without
 * consequence.  (I.e. the value of an &lt;Expression&gt; element remains the same for the entire policy evaluation.) 
 * This characteristic is one of the benefits of XACML being a declarative language.
 * </p>
 * 
 * <p>
 * A variable reference containing circular references is invalid. The PDP MUST detect circular references either at
 * policy loading time or during runtime evaluation. If the PDP detects a circular reference during runtime the variable
 * reference evaluates to “Indeterminate” with status code urn:oasis:names:tc:xacml:1.0:status:processing-error.
 * </p>
 * 
 * <h2>7.9 Condition evaluation</h2>
 * 
 * <p>
 * The condition value SHALL be "True" if the &lt;Condition&gt; element is absent, or if it evaluates to "True".  Its
 * value SHALL be "False" if the &lt;Condition&gt; element evaluates to "False".  The condition value SHALL be
 * "Indeterminate", if the expression contained in the &lt;Condition&gt; element evaluates to "Indeterminate."
 * </p>
 * 
 * <h2>7.10 Extended Indeterminate</h2>
 * 
 * <p>
 * Some combining algorithms are defined in terms of an extended set of “Indeterminate” values. The extended set
 * associated with the “Indeterminate” contains the potential effect values which could have occurred if there would not
 * have been an error causing the “Indeterminate”. The possible extended set “Indeterminate” values are
 * </p>
 * 
 * <p>
 * <span>·</span><span>         </span>“Indeterminate{D}”: an “Indeterminate” from a policy or rule which could have
 * evaluated to “Deny”, but not “Permit”
 * </p>
 * 
 * <p>
 * <span>·</span><span>         </span>“Indeterminate{P}”: an “Indeterminate” from a policy or rule which could have
 * evaluated to “Permit”, but not “Deny”
 * </p>
 * 
 * <p>
 * <span>·</span><span>         </span>“Indeterminate{DP}”: an “Indeterminate” from a policy or rule which could have
 * evaluated to “Deny” or “Permit”.
 * </p>
 * 
 * <p>
 * The combining algorithms which are defined in terms of the extended “Indeterminate” make use of the additional
 * information to allow for better treatment of errors in the algorithms.
 * </p>
 * 
 * <p>
 * The final decision returned by a PDP cannot be an extended Indeterminate. Any such decision at the top level policy
 * or policy set is returned as a plain Indeterminate in the response from the PDP.
 * </p>
 * 
 * <p>
 * The tables in the following four sections define how extended “Indeterminate” values are produced during Rule, Policy
 * and PolicySet evaluation.
 * </p>
 * 
 * <h2>7.11 Rule evaluation</h2>
 * 
 * <p>
 * A rule has a value that can be calculated by evaluating its contents.  Rule evaluation involves separate evaluation
 * of the rule's target and condition.  The rule truth table is shown in Table 4.
 * </p>
 * <table>
 * <colgroup> <col/> <col/> <col/> </colgroup>
 * <tr>
 * <td>
 * <p>
 * Target
 * </p>
 * </td>
 * <td>
 * <p>
 * Condition
 * </p>
 * </td>
 * <td>
 * <p>
 *  Rule Value
 * </p>
 * </td>
 * </tr>
 * <tr>
 * <td>
 * <p>
 * “Match” or no target
 * </p>
 * </td>
 * <td>
 * <p>
 * “True”
 * </p>
 * </td>
 * <td>
 * <p>
 * Effect
 * </p>
 * </td>
 * </tr>
 * <tr>
 * <td>
 * <p>
 * “Match” or no target
 * </p>
 * </td>
 * <td>
 * <p>
 * “False”
 * </p>
 * </td>
 * <td>
 * <p>
 * “NotApplicable”
 * </p>
 * </td>
 * </tr>
 * <tr>
 * <td>
 * <p>
 * “Match” or no target
 * </p>
 * </td>
 * <td>
 * <p>
 * “Indeterminate”
 * </p>
 * </td>
 * <td>
 * <p>
 * “Indeterminate{P}” if the Effect is Permit, or “Indeterminate{D}” if the Effect is Deny
 * </p>
 * </td>
 * </tr>
 * <tr>
 * <td>
 * <p>
 * “No-match”
 * </p>
 * </td>
 * <td>
 * <p>
 * Don’t care
 * </p>
 * </td>
 * <td>
 * <p>
 * “NotApplicable”
 * </p>
 * </td>
 * </tr>
 * <tr>
 * <td>
 * <p>
 * “Indeterminate”
 * </p>
 * </td>
 * <td>
 * <p>
 * Don’t care
 * </p>
 * </td>
 * <td>
 * <p>
 * “Indeterminate{P}” if the Effect is Permit, or “Indeterminate{D}” if the Effect is Deny
 * </p>
 * </td>
 * </tr>
 * </table>
 * <p>
 * Table 4 Rule truth table.
 * </p>
 * 
 * <h2>7.12 Policy evaluation</h2>
 * 
 * <p>
 * The value of a policy SHALL be determined only by its contents, considered in relation to the contents of the request
 * context.  A policy's value SHALL be determined by evaluation of the policy's target and, according to the specified
 * rule-combining algorithm, rules,.
 * </p>
 * 
 * <p>
 * The policy truth table is shown in Table 5.
 * </p>
 * <table>
 * <colgroup> <col/> <col/> <col/> </colgroup>
 * <tr>
 * <td>
 * <p>
 * Target
 * </p>
 * </td>
 * <td>
 * <p>
 * Rule values
 * </p>
 * </td>
 * <td>
 * <p>
 *  Policy Value
 * </p>
 * </td>
 * </tr>
 * <tr>
 * <td>
 * <p>
 * “Match”
 * </p>
 * </td>
 * <td>
 * <p>
 * Don’t care
 * </p>
 * </td>
 * <td>
 * <p>
 * Specified by the rule-combining algorithm
 * </p>
 * </td>
 * </tr>
 * <tr>
 * <td>
 * <p>
 * “No-match”
 * </p>
 * </td>
 * <td>
 * <p>
 * Don’t care
 * </p>
 * </td>
 * <td>
 * <p>
 * “NotApplicable”
 * </p>
 * </td>
 * </tr>
 * <tr>
 * <td>
 * <p>
 * “Indeterminate”
 * </p>
 * </td>
 * <td>
 * <p>
 * See Table 7
 * </p>
 * </td>
 * <td>
 * <p>
 * See Table 7
 * </p>
 * </td>
 * </tr>
 * </table>
 * <p>
 * Table 5 Policy truth table
 * </p>
 * 
 * <p>
 * Note that none of the rule-combining algorithms defined by XACML 3.0 take parameters.  However, non-standard
 * combining algorithms MAY take parameters.  In such a case, the values of these parameters associated with the rules,
 * MUST be taken into account when evaluating the policy.  The parameters and their types should be defined in the
 * specification of the combining algorithm.  If the implementation supports combiner parameters and if combiner
 * parameters are present in a policy, then the parameter values MUST be supplied to the combining algorithm
 * implementation.
 * </p>
 * 
 * <h2>7.13 Policy Set evaluation</h2>
 * 
 * <p>
 * The value of a policy set SHALL be determined by its contents, considered in relation to the contents of the request
 * context.  A policy set's value SHALL be determined by evaluation of the policy set's target, and, according to the
 * specified policy-combining algorithm, policies and policy sets,
 * </p>
 * 
 * <p>
 * The policy set truth table is shown in Table 6.
 * </p>
 * <table>
 * <colgroup> <col/> <col/> <col/> </colgroup>
 * <tr>
 * <td>
 * <p>
 * Target
 * </p>
 * </td>
 * <td>
 * <p>
 * Policy values
 * </p>
 * </td>
 * <td>
 * <p>
 * Policy set Value
 * </p>
 * </td>
 * </tr>
 * <tr>
 * <td>
 * <p>
 * “Match”
 * </p>
 * </td>
 * <td>
 * <p>
 * Don’t care
 * </p>
 * </td>
 * <td>
 * <p>
 * Specified by the policy-combining algorithm
 * </p>
 * </td>
 * </tr>
 * <tr>
 * <td>
 * <p>
 * “No-match”
 * </p>
 * </td>
 * <td>
 * <p>
 * Don’t care
 * </p>
 * </td>
 * <td>
 * <p>
 * “NotApplicable”
 * </p>
 * </td>
 * </tr>
 * <tr>
 * <td>
 * <p>
 * “Indeterminate”
 * </p>
 * </td>
 * <td>
 * <p>
 * See Table 7
 * </p>
 * </td>
 * <td>
 * <p>
 * See Table 7
 * </p>
 * </td>
 * </tr>
 * </table>
 * <p>
 * Table 6 Policy set truth table
 * </p>
 * 
 * <p>
 * Note that none of the policy-combining algorithms defined by XACML 3.0 take parameters.  However, non-standard
 * combining algorithms MAY take parameters.  In such a case, the values of these parameters associated with the
 * policies, MUST be taken into account when evaluating the policy set.  The parameters and their types should be
 * defined in the specification of the combining algorithm.  If the implementation supports combiner parameters and if
 * combiner parameters are present in a policy, then the parameter values MUST be supplied to the combining algorithm
 * implementation.
 * </p>
 * 
 * <h2>7.14 Policy and Policy set value for Indeterminate Target</h2>
 * 
 * <p>
 * If the target of a policy or policy set evaluates to “Indeterminate”, the value of the policy or policy set as a
 * whole is determined by the value of the combining algorithm according to Table 7.
 * </p>
 * <table>
 * <colgroup> <col/> <col/> </colgroup>
 * <tr>
 * <td>
 * <p>
 * Combining algorithm Value
 * </p>
 * </td>
 * <td>
 * <p>
 * Policy set or policy Value
 * </p>
 * </td>
 * </tr>
 * <tr>
 * <td>
 * <p>
 * “NotApplicable”
 * </p>
 * </td>
 * <td>
 * <p>
 * “NotApplicable”
 * </p>
 * </td>
 * </tr>
 * <tr>
 * <td>
 * <p>
 * “Permit”
 * </p>
 * </td>
 * <td>
 * <p>
 * “Indeterminate{P}”
 * </p>
 * </td>
 * </tr>
 * <tr>
 * <td>
 * <p>
 * “Deny”
 * </p>
 * </td>
 * <td>
 * <p>
 * “Indeterminate{D}”
 * </p>
 * </td>
 * </tr>
 * <tr>
 * <td>
 * <p>
 * “Indeterminate”
 * </p>
 * </td>
 * <td>
 * <p>
 * “Indeterminate{DP}”
 * </p>
 * </td>
 * </tr>
 * <tr>
 * <td>
 * <p>
 * “Indeterminate{DP}”
 * </p>
 * </td>
 * <td>
 * <p>
 * “Indeterminate{DP}”
 * </p>
 * </td>
 * </tr>
 * <tr>
 * <td>
 * <p>
 * “Indeterminate{P}”
 * </p>
 * </td>
 * <td>
 * <p>
 * “Indeterminate{P}”
 * </p>
 * </td>
 * </tr>
 * <tr>
 * <td>
 * <p>
 * “Indeterminate{D}”
 * </p>
 * </td>
 * <td>
 * <p>
 * “Indeterminate{D}”
 * </p>
 * </td>
 * </tr>
 * </table>
 * <p>
 * Table 7 The value of a <span>policy</span> or <span>policy set</span> when the target is “Indeterminate”.
 * </p>
 * 
 * <h2>7.15 PolicySetIdReference and PolicyIdReference evaluation</h2>
 * 
 * <p>
 * A policy set id reference or a policy id reference is evaluated by resolving the reference and evaluating the
 * referenced policy set or policy.
 * </p>
 * 
 * <p>
 * If resolving the reference fails, the reference evaluates to “Indeterminate” with status code
 * urn:oasis:names:tc:xacml:1.0:status:processing-error.
 * </p>
 * 
 * <p>
 * A policy set id reference or a policy id reference containing circular references is invalid. The PDP MUST detect
 * circular references either at policy loading time or during runtime evaluation. If the PDP detects a circular
 * reference during runtime the reference evaluates to “Indeterminate” with status code
 * urn:oasis:names:tc:xacml:1.0:status:processing-error.
 * </p>
 * 
 * <h2>7.16 Hierarchical resources</h2>
 * 
 * <p>
 * It is often the case that a resource is organized as a hierarchy (e.g. file system, XML document).  XACML provides
 * several optional mechanisms for supporting hierarchical resources.  These are described in the XACML Profile for
 * Hierarchical Resources [Hier] and in the XACML Profile for Requests for Multiple Resources [Multi].
 * </p>
 * 
 * <h2>7.17 Authorization decision</h2>
 * 
 * <p>
 * In relation to a particular decision request, the PDP is defined by a policy-combining algorithm and a set of
 * policies and/or policy sets.  The PDP SHALL return a response context as if it had evaluated a single policy set
 * consisting of this policy-combining algorithm and the set of policies and/or policy sets.
 * </p>
 * 
 * <p>
 * The PDP MUST evaluate the policy set as specified in Sections 5 and 7.  The PDP MUST return a response context, with
 * one &lt;Decision&gt; element of value "Permit", "Deny", "Indeterminate" or "NotApplicable".
 * </p>
 * 
 * <p>
 * If the PDP cannot make a decision, then an "Indeterminate" &lt;Decision&gt; element SHALL be returned.
 * </p>
 * 
 * <h2>7.18 Obligations and advice</h2>
 * 
 * <p>
 * A rule, policy, or policy set may contain one or more obligation or advice expressions.  When such a rule, policy, or
 * policy set is evaluated, the obligation or advice expression SHALL be evaluated to an obligation or advice
 * respectively, which SHALL be passed up to the next level of evaluation (the enclosing or referencing policy, policy
 * set, or authorization decision) only if the result of the rule, policy, or policy set being evaluated matches the
 * value of the FulfillOn attribute of the obligation or the AppliesTo attribute of the advice. If any of the attribute
 * assignment expressions in an obligation or advice expression with a matching FulfillOn or AppliesTo attribute
 * evaluates to “Indeterminate”, then the whole rule, policy, or policy set SHALL be “Indeterminate”. If the FulfillOn
 * or AppliesTo attribute does not match the result of the combining algorithm or the rule evaluation, then any
 * indeterminate in an obligation or advice expression has no effect.
 * </p>
 * 
 * <p>
 * As a consequence of this procedure, no obligations or advice SHALL be returned to the PEP if the rule, policies, or
 * policy sets from which they are drawn are not evaluated, or if their evaluated result is "Indeterminate" or
 * "NotApplicable", or if the decision resulting from evaluating the rule, policy, or policy set does not match the
 * decision resulting from evaluating an enclosing policy set.
 * </p>
 * 
 * <p>
 * If the PDP's evaluation is viewed as a tree of rules, policy sets and policies, each of which returns "Permit" or
 * "Deny", then the set of obligations and advice returned by the PDP to the PEP will include only the obligations and
 * advice associated with those paths where the result at each level of evaluation is the same as the result being
 * returned by the PDP.  In situations where any lack of determinism is unacceptable, a deterministic combining
 * algorithm, such as ordered-deny-overrides, should be used.
 * </p>
 * 
 * <p>
 * Also see Section 7.2.
 * </p>
 * 
 * <h2>7.19 Exception handling</h2>
 * 
 * <p>
 * XACML specifies behavior for the PDP in the following situations.
 * </p>
 * 
 * <h3>7.19.1 Unsupported functionality</h3>
 * 
 * <p>
 * If the PDP attempts to evaluate a policy set or policy that contains an optional element type or function that the
 * PDP does not support, then the PDP SHALL return a &lt;Decision&gt; value of "Indeterminate".  If a &lt;StatusCode&gt;
 * element is also returned, then its value SHALL be "urn:oasis:names:tc:xacml:1.0:status:syntax-error" in the case of
 * an unsupported element type, and "urn:oasis:names:tc:xacml:1.0:status:processing-error" in the case of an unsupported
 * function.
 * </p>
 * 
 * <h3>7.19.2 Syntax and type errors</h3>
 * 
 * <p>
 * If a policy that contains invalid syntax is evaluated by the XACML PDP at the time a decision request is received,
 * then the result of that policy SHALL be "Indeterminate" with a StatusCode value of
 * "urn:oasis:names:tc:xacml:1.0:status:syntax-error".
 * </p>
 * 
 * <p>
 * If a policy that contains invalid static data-types is evaluated by the XACML PDP at the time a decision request is
 * received, then the result of that policy SHALL be "Indeterminate" with a StatusCode value of
 * "urn:oasis:names:tc:xacml:1.0:status:processing-error".
 * </p>
 * 
 * <h3>7.19.3 Missing attributes</h3>
 * 
 * <p>
 * The absence of matching attributes in the request context for any of the attribute designators attribute or selectors
 * that are found in the policy will result in an enclosing &lt;AllOf&gt; element to return a value of
 * "Indeterminate",if the designator or selector has the MustBePresent XML attribute set to true, as described in
 * Sections 5.29 and 5.30 and may result in a &lt;Decision&gt; element containing the "Indeterminate" value.  If, in
 * this case a status code is supplied, then the value
 * </p>
 * 
 * <p>
 * "urn:oasis:names:tc:xacml:1.0:status:missing-attribute"
 * </p>
 * 
 * <p>
 * SHALL be used, to indicate that more information is needed in order for a definitive decision to be rendered.  In
 * this case, the &lt;Status&gt; element MAY list the names and data-types of any attributes that are needed by the PDP
 * to refine its decision (see Section 5.58).  A PEP MAY resubmit a refined request context in response to a
 * &lt;Decision&gt; element contents of "Indeterminate" with a status code of
 * </p>
 * 
 * <p>
 * "urn:oasis:names:tc:xacml:1.0:status:missing-attribute"
 * </p>
 * 
 * <p>
 * by adding attribute values for the attribute names that were listed in the previous response.  When the PDP returns a
 * &lt;Decision&gt; element contents of "Indeterminate", with a status code of
 * </p>
 * 
 * <p>
 * "urn:oasis:names:tc:xacml:1.0:status:missing-attribute",
 * </p>
 * 
 * <p>
 * it MUST NOT list the names and data-types of any attribute for which values were supplied in the original request. 
 * Note, this requirement forces the PDP to eventually return an authorization decision of "Permit", "Deny", or
 * "Indeterminate" with some other status code, in response to successively-refined requests.
 * </p>
 * 
 * <h2>7.20 Identifier equality</h2>
 * 
 * <p>
 * XACML makes use of URIs and strings as identifiers. When such identifiers are compared for equality, the comparison
 * MUST be done so that the identifiers are equal if they have the same length and the characters in the two identifiers
 * are equal codepoint by codepoint.
 * </p>
 * 
 * <p>
 * The following is a list of the identifiers which MUST use this definition of equality.
 * </p>
 * 
 * <p>
 * The content of the element &lt;XPathVersion&gt;.
 * </p>
 * 
 * <p>
 * The XML attribute Value in the element &lt;StatusCode&gt;.
 * </p>
 * 
 * <p>
 * The XML attributes Category, AttributeId, DataType and Issuer in the element &lt;MissingAttributeDetail&gt;.
 * </p>
 * 
 * <p>
 * The XML attribute Category in the element &lt;Attributes&gt;.
 * </p>
 * 
 * <p>
 * The XML attributes AttributeId and Issuer in the element &lt;Attribute&gt;.
 * </p>
 * 
 * <p>
 * The XML attribute ObligationId in the element &lt;Obligation&gt;.
 * </p>
 * 
 * <p>
 * The XML attribute AdviceId in the element &lt;Advice&gt;.
 * </p>
 * 
 * <p>
 * The XML attributes AttributeId and Category in the element &lt;AttributeAssignment&gt;.
 * </p>
 * 
 * <p>
 * The XML attribute ObligationId in the element &lt;ObligationExpression&gt;.
 * </p>
 * 
 * <p>
 * The XML attribute AdviceId in the element &lt;AdviceExpression&gt;.
 * </p>
 * 
 * <p>
 * The XML attributes AttributeId, Category and Issuer in the element &lt;AttributeAssignmentExpression&gt;.
 * </p>
 * 
 * <p>
 * The XML attributes PolicySetId and PolicyCombiningAlgId in the element &lt;PolicySet&gt;.
 * </p>
 * 
 * <p>
 * The XML attribute ParameterName in the element &lt;CombinerParameter&gt;.
 * </p>
 * 
 * <p>
 * The XML attribute RuleIdRef in the element &lt;RuleCombinerParameters&gt;.
 * </p>
 * 
 * <p>
 * The XML attribute PolicyIdRef in the element &lt;PolicyCombinerParameters&gt;.
 * </p>
 * 
 * <p>
 * The XML attribute PolicySetIdRef in the element &lt;PolicySetCombinerParameters&gt;.
 * </p>
 * 
 * <p>
 * The anyURI in the content of the complex type IdReferenceType.
 * </p>
 * 
 * <p>
 * The XML attributes PolicyId and RuleCombiningAlgId in the element &lt;Policy&gt;.
 * </p>
 * 
 * <p>
 * The XML attribute RuleId in the element &lt;Rule&gt;.
 * </p>
 * 
 * <p>
 * The XML attribute MatchId in the element &lt;Match&gt;.
 * </p>
 * 
 * <p>
 * The XML attribute VariableId in the element &lt;VariableDefinition&gt;.
 * </p>
 * 
 * <p>
 * The XML attribute VariableId in the element &lt;VariableReference&gt;.
 * </p>
 * 
 * <p>
 * The XML attributes Category, ContextSelectorId and DataType in the element &lt;AttributeSelector&gt;.
 * </p>
 * 
 * <p>
 * The XML attributes Category, AttributeId, DataType and Issuer in the element &lt;AttributeDesignator&gt;.
 * </p>
 * 
 * <p>
 * The XML attribute DataType in the element &lt;AttributeValue&gt;.
 * </p>
 * 
 * <p>
 * The XML attribute FunctionId in the element &lt;Function&gt;.
 * </p>
 * 
 * <p>
 * The XML attribute FunctionId in the element &lt;Apply&gt;.
 * </p>
 * 
 * <p>
 *  
 * </p>
 * 
 * <p>
 * It is RECOMMENDED that extensions to XACML use the same definition of identifier equality for similar identifiers.
 * </p>
 * 
 * <p>
 * It is RECOMMENDED that extensions which define identifiers do not define identifiers which could be easily
 * misinterpreted by people as being subject to other kind of processing, such as URL character escaping, before
 * matching.
 * </p>
 * 
 * <p>
 *  
 * </p>
 */
package xcaml.pdp;