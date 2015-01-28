//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.01.27 at 11:38:39 PM PST
//

package oasis.names.tc.xacml._3_0.core.schema.wd_17;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;

/**
 * <p>
 * Java class for AttributeAssignmentExpressionType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttributeAssignmentExpressionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:xacml:3.0:core:schema:wd-17}Expression"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="AttributeId" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="Category" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="Issuer" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributeAssignmentExpressionType", propOrder = {"expression"})
public class AttributeAssignmentExpressionType implements Cloneable {

  @XmlElementRef(name = "Expression", namespace = "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17", type = JAXBElement.class)
  protected JAXBElement<?> expression;
  @XmlAttribute(name = "AttributeId", required = true)
  @XmlSchemaType(name = "anyURI")
  protected String attributeId;
  @XmlAttribute(name = "Category")
  @XmlSchemaType(name = "anyURI")
  protected String category;
  @XmlAttribute(name = "Issuer")
  protected String issuer;

  /**
   * Gets the value of the expression property.
   * 
   * @return possible object is {@link JAXBElement }{@code <}{@link AttributeDesignatorType }{@code >} {@link JAXBElement }
   *         {@code <}{@link FunctionType }{@code >} {@link JAXBElement }{@code <}{@link ExpressionType }{@code >}
   *         {@link JAXBElement }{@code <}{@link AttributeValueType }{@code >} {@link JAXBElement }{@code <}
   *         {@link VariableReferenceType }{@code >} {@link JAXBElement }{@code <}{@link AttributeSelectorType }{@code >}
   *         {@link JAXBElement }{@code <}{@link ApplyType }{@code >}
   * 
   */
  public JAXBElement<?> getExpression() {
    return expression;
  }

  /**
   * Sets the value of the expression property.
   * 
   * @param value allowed object is {@link JAXBElement }{@code <}{@link AttributeDesignatorType }{@code >}
   *          {@link JAXBElement }{@code <}{@link FunctionType }{@code >} {@link JAXBElement }{@code <}
   *          {@link ExpressionType }{@code >} {@link JAXBElement }{@code <}{@link AttributeValueType }{@code >}
   *          {@link JAXBElement }{@code <}{@link VariableReferenceType }{@code >} {@link JAXBElement }{@code <}
   *          {@link AttributeSelectorType }{@code >} {@link JAXBElement }{@code <}{@link ApplyType }{@code >}
   * 
   */
  protected void setExpression(JAXBElement<?> value) {
    this.expression = value;
  }

  /**
   * Gets the value of the attributeId property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getAttributeId() {
    return attributeId;
  }

  /**
   * Sets the value of the attributeId property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  protected void setAttributeId(String value) {
    this.attributeId = value;
  }

  /**
   * Gets the value of the category property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getCategory() {
    return category;
  }

  /**
   * Sets the value of the category property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  protected void setCategory(String value) {
    this.category = value;
  }

  /**
   * Gets the value of the issuer property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getIssuer() {
    return issuer;
  }

  /**
   * Sets the value of the issuer property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  protected void setIssuer(String value) {
    this.issuer = value;
  }

  public static AttributeAssignmentExpressionType.Builder<Void> builder() {
    return new AttributeAssignmentExpressionType.Builder<Void>(null, null, false);
  }

  public static AttributeAssignmentExpressionType.Builder<Void> copyOf(
      final AttributeAssignmentExpressionType other) {
    return new AttributeAssignmentExpressionType.Builder<Void>(null, other, true);
  }

  public static AttributeAssignmentExpressionType.Builder<Void> copyOf(
      final AttributeAssignmentExpressionType other, final PropertyTree propertyTree,
      final PropertyTreeUse propertyTreeUse) {
    return new AttributeAssignmentExpressionType.Builder<Void>(null, other, true, propertyTree,
        propertyTreeUse);
  }

  public static AttributeAssignmentExpressionType.Builder<Void> copyExcept(
      final AttributeAssignmentExpressionType other, final PropertyTree propertyTree) {
    return copyOf(other, propertyTree, PropertyTreeUse.EXCLUDE);
  }

  public static AttributeAssignmentExpressionType.Builder<Void> copyOnly(
      final AttributeAssignmentExpressionType other, final PropertyTree propertyTree) {
    return copyOf(other, propertyTree, PropertyTreeUse.INCLUDE);
  }

  @Override
  public String toString() {
    return ((((((((((("(expression = " + expression) + "), ") + "(attributeId = ") + attributeId) + "), ") + "(category = ") + category) + "), ") + "(issuer = ") + issuer) + ") ");
  }

  @Override
  public AttributeAssignmentExpressionType clone() throws CloneNotSupportedException {
    final AttributeAssignmentExpressionType newObject =
        ((AttributeAssignmentExpressionType) super.clone());
    return newObject;
  }

  public static class Builder<TParentBuilder> {

    protected final TParentBuilder _parentBuilder;
    protected final AttributeAssignmentExpressionType _product;
    private JAXBElement<?> expression;
    private String attributeId;
    private String category;
    private String issuer;

    public Builder(final TParentBuilder parentBuilder,
        final AttributeAssignmentExpressionType other, final boolean copy) {
      this._parentBuilder = parentBuilder;
      if (copy) {
        this._product = null;
        this.expression = other.expression;
        this.attributeId = other.attributeId;
        this.category = other.category;
        this.issuer = other.issuer;
      } else {
        this._product = other;
      }
    }

    public Builder(final TParentBuilder parentBuilder,
        final AttributeAssignmentExpressionType other, final boolean copy,
        final PropertyTree propertyTree, final PropertyTreeUse treeUse) {
      this._parentBuilder = parentBuilder;
      if (copy) {
        this._product = null;
        final PropertyTree expressionPropertyTree =
            ((propertyTree == null) ? null : propertyTree.get("expression"));
        if (((treeUse == PropertyTreeUse.INCLUDE) ? (expressionPropertyTree != null)
            : ((expressionPropertyTree == null) || (!expressionPropertyTree.isLeaf())))) {
          this.expression = other.expression;
        }
        final PropertyTree attributeIdPropertyTree =
            ((propertyTree == null) ? null : propertyTree.get("attributeId"));
        if (((treeUse == PropertyTreeUse.INCLUDE) ? (attributeIdPropertyTree != null)
            : ((attributeIdPropertyTree == null) || (!attributeIdPropertyTree.isLeaf())))) {
          this.attributeId = other.attributeId;
        }
        final PropertyTree categoryPropertyTree =
            ((propertyTree == null) ? null : propertyTree.get("category"));
        if (((treeUse == PropertyTreeUse.INCLUDE) ? (categoryPropertyTree != null)
            : ((categoryPropertyTree == null) || (!categoryPropertyTree.isLeaf())))) {
          this.category = other.category;
        }
        final PropertyTree issuerPropertyTree =
            ((propertyTree == null) ? null : propertyTree.get("issuer"));
        if (((treeUse == PropertyTreeUse.INCLUDE) ? (issuerPropertyTree != null)
            : ((issuerPropertyTree == null) || (!issuerPropertyTree.isLeaf())))) {
          this.issuer = other.issuer;
        }
      } else {
        this._product = other;
      }
    }

    public TParentBuilder end() {
      return this._parentBuilder;
    }

    protected <P extends AttributeAssignmentExpressionType> P init(final P product) {
      product.expression = this.expression;
      product.attributeId = this.attributeId;
      product.category = this.category;
      product.issuer = this.issuer;
      return product;
    }

    public AttributeAssignmentExpressionType.Builder<TParentBuilder> withExpression(
        final JAXBElement<?> expression) {
      this.expression = expression;
      return this;
    }

    public AttributeAssignmentExpressionType.Builder<TParentBuilder> withAttributeId(
        final String attributeId) {
      this.attributeId = attributeId;
      return this;
    }

    public AttributeAssignmentExpressionType.Builder<TParentBuilder> withCategory(
        final String category) {
      this.category = category;
      return this;
    }

    public AttributeAssignmentExpressionType.Builder<TParentBuilder> withIssuer(final String issuer) {
      this.issuer = issuer;
      return this;
    }

    public AttributeAssignmentExpressionType build() {
      if (this._product == null) {
        return this.init(new AttributeAssignmentExpressionType());
      } else {
        return ((AttributeAssignmentExpressionType) this._product);
      }
    }

  }

  public static class Select extends
      AttributeAssignmentExpressionType.Selector<AttributeAssignmentExpressionType.Select, Void> {

    Select() {
      super(null, null, null);
    }

    public static AttributeAssignmentExpressionType.Select _root() {
      return new AttributeAssignmentExpressionType.Select();
    }

  }

  public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?>, TParent>
      extends com.kscs.util.jaxb.Selector<TRoot, TParent> {

    private com.kscs.util.jaxb.Selector<TRoot, AttributeAssignmentExpressionType.Selector<TRoot, TParent>> expression =
        null;
    private com.kscs.util.jaxb.Selector<TRoot, AttributeAssignmentExpressionType.Selector<TRoot, TParent>> attributeId =
        null;
    private com.kscs.util.jaxb.Selector<TRoot, AttributeAssignmentExpressionType.Selector<TRoot, TParent>> category =
        null;
    private com.kscs.util.jaxb.Selector<TRoot, AttributeAssignmentExpressionType.Selector<TRoot, TParent>> issuer =
        null;

    public Selector(final TRoot root, final TParent parent, final String propertyName) {
      super(root, parent, propertyName);
    }

    @Override
    public Map<String, PropertyTree> buildChildren() {
      final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
      products.putAll(super.buildChildren());
      if (this.expression != null) {
        products.put("expression", this.expression.init());
      }
      if (this.attributeId != null) {
        products.put("attributeId", this.attributeId.init());
      }
      if (this.category != null) {
        products.put("category", this.category.init());
      }
      if (this.issuer != null) {
        products.put("issuer", this.issuer.init());
      }
      return products;
    }

    public com.kscs.util.jaxb.Selector<TRoot, AttributeAssignmentExpressionType.Selector<TRoot, TParent>> expression() {
      return ((this.expression == null)
          ? this.expression =
              new com.kscs.util.jaxb.Selector<TRoot, AttributeAssignmentExpressionType.Selector<TRoot, TParent>>(
                  this._root, this, "expression") : this.expression);
    }

    public com.kscs.util.jaxb.Selector<TRoot, AttributeAssignmentExpressionType.Selector<TRoot, TParent>> attributeId() {
      return ((this.attributeId == null)
          ? this.attributeId =
              new com.kscs.util.jaxb.Selector<TRoot, AttributeAssignmentExpressionType.Selector<TRoot, TParent>>(
                  this._root, this, "attributeId") : this.attributeId);
    }

    public com.kscs.util.jaxb.Selector<TRoot, AttributeAssignmentExpressionType.Selector<TRoot, TParent>> category() {
      return ((this.category == null)
          ? this.category =
              new com.kscs.util.jaxb.Selector<TRoot, AttributeAssignmentExpressionType.Selector<TRoot, TParent>>(
                  this._root, this, "category") : this.category);
    }

    public com.kscs.util.jaxb.Selector<TRoot, AttributeAssignmentExpressionType.Selector<TRoot, TParent>> issuer() {
      return ((this.issuer == null)
          ? this.issuer =
              new com.kscs.util.jaxb.Selector<TRoot, AttributeAssignmentExpressionType.Selector<TRoot, TParent>>(
                  this._root, this, "issuer") : this.issuer);
    }

  }

}
