//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.01.28 at 12:18:04 PM PST
//

package oasis.names.tc.xacml._3_0.core.schema.wd_17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;

/**
 * <p>
 * Java class for ObligationExpressionType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObligationExpressionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:xacml:3.0:core:schema:wd-17}AttributeAssignmentExpression" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ObligationId" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="FulfillOn" use="required" type="{urn:oasis:names:tc:xacml:3.0:core:schema:wd-17}EffectType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObligationExpressionType", propOrder = {"attributeAssignmentExpression"})
public class ObligationExpressionType implements Cloneable {

  @XmlElement(name = "AttributeAssignmentExpression")
  protected List<AttributeAssignmentExpressionType> attributeAssignmentExpression;
  @XmlAttribute(name = "ObligationId", required = true)
  @XmlSchemaType(name = "anyURI")
  protected String obligationId;
  @XmlAttribute(name = "FulfillOn", required = true)
  protected EffectType fulfillOn;
  protected transient List<AttributeAssignmentExpressionType> attributeAssignmentExpression_RO =
      null;

  /**
   * Gets the value of the obligationId property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getObligationId() {
    return obligationId;
  }

  /**
   * Sets the value of the obligationId property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  protected void setObligationId(String value) {
    this.obligationId = value;
  }

  /**
   * Gets the value of the fulfillOn property.
   * 
   * @return possible object is {@link EffectType }
   * 
   */
  public EffectType getFulfillOn() {
    return fulfillOn;
  }

  /**
   * Sets the value of the fulfillOn property.
   * 
   * @param value allowed object is {@link EffectType }
   * 
   */
  protected void setFulfillOn(EffectType value) {
    this.fulfillOn = value;
  }

  public static ObligationExpressionType.Builder<Void> builder() {
    return new ObligationExpressionType.Builder<Void>(null, null, false);
  }

  public static ObligationExpressionType.Builder<Void> copyOf(final ObligationExpressionType other) {
    return new ObligationExpressionType.Builder<Void>(null, other, true);
  }

  public static ObligationExpressionType.Builder<Void> copyOf(final ObligationExpressionType other,
      final PropertyTree propertyTree, final PropertyTreeUse propertyTreeUse) {
    return new ObligationExpressionType.Builder<Void>(null, other, true, propertyTree,
        propertyTreeUse);
  }

  public static ObligationExpressionType.Builder<Void> copyExcept(
      final ObligationExpressionType other, final PropertyTree propertyTree) {
    return copyOf(other, propertyTree, PropertyTreeUse.EXCLUDE);
  }

  public static ObligationExpressionType.Builder<Void> copyOnly(
      final ObligationExpressionType other, final PropertyTree propertyTree) {
    return copyOf(other, propertyTree, PropertyTreeUse.INCLUDE);
  }

  @Override
  public String toString() {
    return (((((((("(attributeAssignmentExpression = " + attributeAssignmentExpression) + "), ") + "(obligationId = ") + obligationId) + "), ") + "(fulfillOn = ") + fulfillOn) + ") ");
  }

  @Override
  public ObligationExpressionType clone() throws CloneNotSupportedException {
    final ObligationExpressionType newObject = ((ObligationExpressionType) super.clone());
    if (this.attributeAssignmentExpression == null) {
      newObject.attributeAssignmentExpression = null;
    } else {
      newObject.attributeAssignmentExpression = new ArrayList<AttributeAssignmentExpressionType>();
      for (AttributeAssignmentExpressionType item : this.attributeAssignmentExpression) {
        newObject.attributeAssignmentExpression.add(((item == null) ? null : item.clone()));
      }
    }
    newObject.attributeAssignmentExpression_RO =
        ((attributeAssignmentExpression == null) ? null : Collections
            .unmodifiableList(newObject.attributeAssignmentExpression));
    return newObject;
  }

  public List<AttributeAssignmentExpressionType> getAttributeAssignmentExpression() {
    if (this.attributeAssignmentExpression == null) {
      this.attributeAssignmentExpression = new ArrayList<AttributeAssignmentExpressionType>();
    }
    if (this.attributeAssignmentExpression_RO == null) {
      this.attributeAssignmentExpression_RO =
          ((attributeAssignmentExpression == null) ? null : Collections
              .unmodifiableList(this.attributeAssignmentExpression));
    }
    return this.attributeAssignmentExpression_RO;
  }

  public static class Builder<TParentBuilder> {

    protected final TParentBuilder _parentBuilder;
    protected final ObligationExpressionType _product;
    private List<AttributeAssignmentExpressionType.Builder<ObligationExpressionType.Builder<TParentBuilder>>> attributeAssignmentExpression;
    private String obligationId;
    private EffectType fulfillOn;

    public Builder(final TParentBuilder parentBuilder, final ObligationExpressionType other,
        final boolean copy) {
      this._parentBuilder = parentBuilder;
      if (copy) {
        this._product = null;
        if (other.attributeAssignmentExpression == null) {
          this.attributeAssignmentExpression = null;
        } else {
          this.attributeAssignmentExpression =
              new ArrayList<AttributeAssignmentExpressionType.Builder<ObligationExpressionType.Builder<TParentBuilder>>>();
          for (AttributeAssignmentExpressionType _item : other.attributeAssignmentExpression) {
            this.attributeAssignmentExpression
                .add(((_item == null)
                    ? null
                    : new AttributeAssignmentExpressionType.Builder<ObligationExpressionType.Builder<TParentBuilder>>(
                        this, _item, true)));
          }
        }
        this.obligationId = other.obligationId;
        this.fulfillOn = other.fulfillOn;
      } else {
        this._product = other;
      }
    }

    public Builder(final TParentBuilder parentBuilder, final ObligationExpressionType other,
        final boolean copy, final PropertyTree propertyTree, final PropertyTreeUse treeUse) {
      this._parentBuilder = parentBuilder;
      if (copy) {
        this._product = null;
        final PropertyTree attributeAssignmentExpressionPropertyTree =
            ((propertyTree == null) ? null : propertyTree.get("attributeAssignmentExpression"));
        if (((treeUse == PropertyTreeUse.INCLUDE)
            ? (attributeAssignmentExpressionPropertyTree != null)
            : ((attributeAssignmentExpressionPropertyTree == null) || (!attributeAssignmentExpressionPropertyTree
                .isLeaf())))) {
          if (other.attributeAssignmentExpression == null) {
            this.attributeAssignmentExpression = null;
          } else {
            this.attributeAssignmentExpression =
                new ArrayList<AttributeAssignmentExpressionType.Builder<ObligationExpressionType.Builder<TParentBuilder>>>();
            for (AttributeAssignmentExpressionType _item : other.attributeAssignmentExpression) {
              this.attributeAssignmentExpression
                  .add(((_item == null)
                      ? null
                      : new AttributeAssignmentExpressionType.Builder<ObligationExpressionType.Builder<TParentBuilder>>(
                          this, _item, true, attributeAssignmentExpressionPropertyTree, treeUse)));
            }
          }
        }
        final PropertyTree obligationIdPropertyTree =
            ((propertyTree == null) ? null : propertyTree.get("obligationId"));
        if (((treeUse == PropertyTreeUse.INCLUDE) ? (obligationIdPropertyTree != null)
            : ((obligationIdPropertyTree == null) || (!obligationIdPropertyTree.isLeaf())))) {
          this.obligationId = other.obligationId;
        }
        final PropertyTree fulfillOnPropertyTree =
            ((propertyTree == null) ? null : propertyTree.get("fulfillOn"));
        if (((treeUse == PropertyTreeUse.INCLUDE) ? (fulfillOnPropertyTree != null)
            : ((fulfillOnPropertyTree == null) || (!fulfillOnPropertyTree.isLeaf())))) {
          this.fulfillOn = other.fulfillOn;
        }
      } else {
        this._product = other;
      }
    }

    public TParentBuilder end() {
      return this._parentBuilder;
    }

    protected <P extends ObligationExpressionType> P init(final P product) {
      if (this.attributeAssignmentExpression != null) {
        final List<AttributeAssignmentExpressionType> attributeAssignmentExpression =
            new ArrayList<AttributeAssignmentExpressionType>(this.attributeAssignmentExpression
                .size());
        for (AttributeAssignmentExpressionType.Builder<ObligationExpressionType.Builder<TParentBuilder>> _item : this.attributeAssignmentExpression) {
          attributeAssignmentExpression.add(_item.build());
        }
        product.attributeAssignmentExpression = attributeAssignmentExpression;
      }
      product.attributeAssignmentExpression_RO =
          ((attributeAssignmentExpression == null) ? null : Collections
              .unmodifiableList(product.attributeAssignmentExpression));
      product.obligationId = this.obligationId;
      product.fulfillOn = this.fulfillOn;
      return product;
    }

    public ObligationExpressionType.Builder<TParentBuilder> addAttributeAssignmentExpression(
        final List<? extends AttributeAssignmentExpressionType> attributeAssignmentExpression) {
      if (this.attributeAssignmentExpression == null) {
        this.attributeAssignmentExpression =
            new ArrayList<AttributeAssignmentExpressionType.Builder<ObligationExpressionType.Builder<TParentBuilder>>>();
      }
      for (AttributeAssignmentExpressionType _item : attributeAssignmentExpression) {
        this.attributeAssignmentExpression
            .add(new AttributeAssignmentExpressionType.Builder<ObligationExpressionType.Builder<TParentBuilder>>(
                this, _item, false));
      }
      return this;
    }

    public ObligationExpressionType.Builder<TParentBuilder> withAttributeAssignmentExpression(
        final List<? extends AttributeAssignmentExpressionType> attributeAssignmentExpression) {
      if (this.attributeAssignmentExpression != null) {
        this.attributeAssignmentExpression.clear();
      }
      return addAttributeAssignmentExpression(attributeAssignmentExpression);
    }

    public ObligationExpressionType.Builder<TParentBuilder> addAttributeAssignmentExpression(
        AttributeAssignmentExpressionType... attributeAssignmentExpression) {
      addAttributeAssignmentExpression(Arrays.asList(attributeAssignmentExpression));
      return this;
    }

    public ObligationExpressionType.Builder<TParentBuilder> withAttributeAssignmentExpression(
        AttributeAssignmentExpressionType... attributeAssignmentExpression) {
      withAttributeAssignmentExpression(Arrays.asList(attributeAssignmentExpression));
      return this;
    }

    public AttributeAssignmentExpressionType.Builder<? extends ObligationExpressionType.Builder<TParentBuilder>> addAttributeAssignmentExpression() {
      if (this.attributeAssignmentExpression == null) {
        this.attributeAssignmentExpression =
            new ArrayList<AttributeAssignmentExpressionType.Builder<ObligationExpressionType.Builder<TParentBuilder>>>();
      }
      final AttributeAssignmentExpressionType.Builder<ObligationExpressionType.Builder<TParentBuilder>> attributeAssignmentExpressionBuilder =
          new AttributeAssignmentExpressionType.Builder<ObligationExpressionType.Builder<TParentBuilder>>(
              this, null, false);
      this.attributeAssignmentExpression.add(attributeAssignmentExpressionBuilder);
      return attributeAssignmentExpressionBuilder;
    }

    public ObligationExpressionType.Builder<TParentBuilder> withObligationId(
        final String obligationId) {
      this.obligationId = obligationId;
      return this;
    }

    public ObligationExpressionType.Builder<TParentBuilder> withFulfillOn(final EffectType fulfillOn) {
      this.fulfillOn = fulfillOn;
      return this;
    }

    public ObligationExpressionType build() {
      if (this._product == null) {
        return this.init(new ObligationExpressionType());
      } else {
        return ((ObligationExpressionType) this._product);
      }
    }

  }

  public static class Select extends
      ObligationExpressionType.Selector<ObligationExpressionType.Select, Void> {

    Select() {
      super(null, null, null);
    }

    public static ObligationExpressionType.Select _root() {
      return new ObligationExpressionType.Select();
    }

  }

  public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?>, TParent>
      extends com.kscs.util.jaxb.Selector<TRoot, TParent> {

    private AttributeAssignmentExpressionType.Selector<TRoot, ObligationExpressionType.Selector<TRoot, TParent>> attributeAssignmentExpression =
        null;
    private com.kscs.util.jaxb.Selector<TRoot, ObligationExpressionType.Selector<TRoot, TParent>> obligationId =
        null;
    private com.kscs.util.jaxb.Selector<TRoot, ObligationExpressionType.Selector<TRoot, TParent>> fulfillOn =
        null;

    public Selector(final TRoot root, final TParent parent, final String propertyName) {
      super(root, parent, propertyName);
    }

    @Override
    public Map<String, PropertyTree> buildChildren() {
      final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
      products.putAll(super.buildChildren());
      if (this.attributeAssignmentExpression != null) {
        products.put("attributeAssignmentExpression", this.attributeAssignmentExpression.init());
      }
      if (this.obligationId != null) {
        products.put("obligationId", this.obligationId.init());
      }
      if (this.fulfillOn != null) {
        products.put("fulfillOn", this.fulfillOn.init());
      }
      return products;
    }

    public AttributeAssignmentExpressionType.Selector<TRoot, ObligationExpressionType.Selector<TRoot, TParent>> attributeAssignmentExpression() {
      return ((this.attributeAssignmentExpression == null)
          ? this.attributeAssignmentExpression =
              new AttributeAssignmentExpressionType.Selector<TRoot, ObligationExpressionType.Selector<TRoot, TParent>>(
                  this._root, this, "attributeAssignmentExpression")
          : this.attributeAssignmentExpression);
    }

    public com.kscs.util.jaxb.Selector<TRoot, ObligationExpressionType.Selector<TRoot, TParent>> obligationId() {
      return ((this.obligationId == null)
          ? this.obligationId =
              new com.kscs.util.jaxb.Selector<TRoot, ObligationExpressionType.Selector<TRoot, TParent>>(
                  this._root, this, "obligationId") : this.obligationId);
    }

    public com.kscs.util.jaxb.Selector<TRoot, ObligationExpressionType.Selector<TRoot, TParent>> fulfillOn() {
      return ((this.fulfillOn == null)
          ? this.fulfillOn =
              new com.kscs.util.jaxb.Selector<TRoot, ObligationExpressionType.Selector<TRoot, TParent>>(
                  this._root, this, "fulfillOn") : this.fulfillOn);
    }

  }

}
