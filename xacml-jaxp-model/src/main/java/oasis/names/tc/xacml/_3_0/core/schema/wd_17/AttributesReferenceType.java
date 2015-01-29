//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.01.29 at 09:44:49 AM PST
//

package oasis.names.tc.xacml._3_0.core.schema.wd_17;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;

/**
 * <p>
 * Java class for AttributesReferenceType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttributesReferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="ReferenceId" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributesReferenceType")
public class AttributesReferenceType implements Cloneable {

  @XmlAttribute(name = "ReferenceId", required = true)
  @XmlIDREF
  @XmlSchemaType(name = "IDREF")
  protected Object referenceId;

  /**
   * Gets the value of the referenceId property.
   * 
   * @return possible object is {@link Object }
   * 
   */
  public Object getReferenceId() {
    return referenceId;
  }

  /**
   * Sets the value of the referenceId property.
   * 
   * @param value allowed object is {@link Object }
   * 
   */
  public void setReferenceId(Object value) {
    this.referenceId = value;
  }

  public static AttributesReferenceType.Builder<Void> builder() {
    return new AttributesReferenceType.Builder<Void>(null, null, false);
  }

  public static AttributesReferenceType.Builder<Void> copyOf(final AttributesReferenceType other) {
    return new AttributesReferenceType.Builder<Void>(null, other, true);
  }

  public static AttributesReferenceType.Builder<Void> copyOf(final AttributesReferenceType other,
      final PropertyTree propertyTree, final PropertyTreeUse propertyTreeUse) {
    return new AttributesReferenceType.Builder<Void>(null, other, true, propertyTree,
        propertyTreeUse);
  }

  public static AttributesReferenceType.Builder<Void> copyExcept(
      final AttributesReferenceType other, final PropertyTree propertyTree) {
    return copyOf(other, propertyTree, PropertyTreeUse.EXCLUDE);
  }

  public static AttributesReferenceType.Builder<Void> copyOnly(final AttributesReferenceType other,
      final PropertyTree propertyTree) {
    return copyOf(other, propertyTree, PropertyTreeUse.INCLUDE);
  }

  @Override
  public String toString() {
    return (("(referenceId = " + referenceId) + ") ");
  }

  @Override
  public AttributesReferenceType clone() throws CloneNotSupportedException {
    final AttributesReferenceType newObject = ((AttributesReferenceType) super.clone());
    return newObject;
  }

  public static class Builder<TParentBuilder> {

    protected final TParentBuilder _parentBuilder;
    protected final AttributesReferenceType _product;
    private Object referenceId;

    public Builder(final TParentBuilder parentBuilder, final AttributesReferenceType other,
        final boolean copy) {
      this._parentBuilder = parentBuilder;
      if (copy) {
        this._product = null;
        this.referenceId = other.referenceId;
      } else {
        this._product = other;
      }
    }

    public Builder(final TParentBuilder parentBuilder, final AttributesReferenceType other,
        final boolean copy, final PropertyTree propertyTree, final PropertyTreeUse treeUse) {
      this._parentBuilder = parentBuilder;
      if (copy) {
        this._product = null;
        final PropertyTree referenceIdPropertyTree =
            ((propertyTree == null) ? null : propertyTree.get("referenceId"));
        if (((treeUse == PropertyTreeUse.INCLUDE) ? (referenceIdPropertyTree != null)
            : ((referenceIdPropertyTree == null) || (!referenceIdPropertyTree.isLeaf())))) {
          this.referenceId = other.referenceId;
        }
      } else {
        this._product = other;
      }
    }

    public TParentBuilder end() {
      return this._parentBuilder;
    }

    protected <P extends AttributesReferenceType> P init(final P product) {
      product.referenceId = this.referenceId;
      return product;
    }

    public AttributesReferenceType.Builder<TParentBuilder> withReferenceId(final Object referenceId) {
      this.referenceId = referenceId;
      return this;
    }

    public AttributesReferenceType build() {
      if (this._product == null) {
        return this.init(new AttributesReferenceType());
      } else {
        return ((AttributesReferenceType) this._product);
      }
    }

  }

  public static class Select extends
      AttributesReferenceType.Selector<AttributesReferenceType.Select, Void> {

    Select() {
      super(null, null, null);
    }

    public static AttributesReferenceType.Select _root() {
      return new AttributesReferenceType.Select();
    }

  }

  public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?>, TParent>
      extends com.kscs.util.jaxb.Selector<TRoot, TParent> {

    private com.kscs.util.jaxb.Selector<TRoot, AttributesReferenceType.Selector<TRoot, TParent>> referenceId =
        null;

    public Selector(final TRoot root, final TParent parent, final String propertyName) {
      super(root, parent, propertyName);
    }

    @Override
    public Map<String, PropertyTree> buildChildren() {
      final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
      products.putAll(super.buildChildren());
      if (this.referenceId != null) {
        products.put("referenceId", this.referenceId.init());
      }
      return products;
    }

    public com.kscs.util.jaxb.Selector<TRoot, AttributesReferenceType.Selector<TRoot, TParent>> referenceId() {
      return ((this.referenceId == null) ? this.referenceId =
          new com.kscs.util.jaxb.Selector<TRoot, AttributesReferenceType.Selector<TRoot, TParent>>(
              this._root, this, "referenceId") : this.referenceId);
    }

  }

}
