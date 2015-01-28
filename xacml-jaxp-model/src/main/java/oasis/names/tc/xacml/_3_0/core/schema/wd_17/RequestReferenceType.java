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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;

/**
 * <p>
 * Java class for RequestReferenceType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestReferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:xacml:3.0:core:schema:wd-17}AttributesReference" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestReferenceType", propOrder = {"attributesReference"})
public class RequestReferenceType implements Cloneable {

  @XmlElement(name = "AttributesReference", required = true)
  protected List<AttributesReferenceType> attributesReference;
  protected transient List<AttributesReferenceType> attributesReference_RO = null;

  public static RequestReferenceType.Builder<Void> builder() {
    return new RequestReferenceType.Builder<Void>(null, null, false);
  }

  public static RequestReferenceType.Builder<Void> copyOf(final RequestReferenceType other) {
    return new RequestReferenceType.Builder<Void>(null, other, true);
  }

  public static RequestReferenceType.Builder<Void> copyOf(final RequestReferenceType other,
      final PropertyTree propertyTree, final PropertyTreeUse propertyTreeUse) {
    return new RequestReferenceType.Builder<Void>(null, other, true, propertyTree, propertyTreeUse);
  }

  public static RequestReferenceType.Builder<Void> copyExcept(final RequestReferenceType other,
      final PropertyTree propertyTree) {
    return copyOf(other, propertyTree, PropertyTreeUse.EXCLUDE);
  }

  public static RequestReferenceType.Builder<Void> copyOnly(final RequestReferenceType other,
      final PropertyTree propertyTree) {
    return copyOf(other, propertyTree, PropertyTreeUse.INCLUDE);
  }

  @Override
  public String toString() {
    return (("(attributesReference = " + attributesReference) + ") ");
  }

  @Override
  public RequestReferenceType clone() throws CloneNotSupportedException {
    final RequestReferenceType newObject = ((RequestReferenceType) super.clone());
    if (this.attributesReference == null) {
      newObject.attributesReference = null;
    } else {
      newObject.attributesReference = new ArrayList<AttributesReferenceType>();
      for (AttributesReferenceType item : this.attributesReference) {
        newObject.attributesReference.add(((item == null) ? null : item.clone()));
      }
    }
    newObject.attributesReference_RO =
        ((attributesReference == null) ? null : Collections
            .unmodifiableList(newObject.attributesReference));
    return newObject;
  }

  public List<AttributesReferenceType> getAttributesReference() {
    if (this.attributesReference == null) {
      this.attributesReference = new ArrayList<AttributesReferenceType>();
    }
    if (this.attributesReference_RO == null) {
      this.attributesReference_RO =
          ((attributesReference == null) ? null : Collections
              .unmodifiableList(this.attributesReference));
    }
    return this.attributesReference_RO;
  }

  public static class Builder<TParentBuilder> {

    protected final TParentBuilder _parentBuilder;
    protected final RequestReferenceType _product;
    private List<AttributesReferenceType.Builder<RequestReferenceType.Builder<TParentBuilder>>> attributesReference;

    public Builder(final TParentBuilder parentBuilder, final RequestReferenceType other,
        final boolean copy) {
      this._parentBuilder = parentBuilder;
      if (copy) {
        this._product = null;
        if (other.attributesReference == null) {
          this.attributesReference = null;
        } else {
          this.attributesReference =
              new ArrayList<AttributesReferenceType.Builder<RequestReferenceType.Builder<TParentBuilder>>>();
          for (AttributesReferenceType _item : other.attributesReference) {
            this.attributesReference
                .add(((_item == null)
                    ? null
                    : new AttributesReferenceType.Builder<RequestReferenceType.Builder<TParentBuilder>>(
                        this, _item, true)));
          }
        }
      } else {
        this._product = other;
      }
    }

    public Builder(final TParentBuilder parentBuilder, final RequestReferenceType other,
        final boolean copy, final PropertyTree propertyTree, final PropertyTreeUse treeUse) {
      this._parentBuilder = parentBuilder;
      if (copy) {
        this._product = null;
        final PropertyTree attributesReferencePropertyTree =
            ((propertyTree == null) ? null : propertyTree.get("attributesReference"));
        if (((treeUse == PropertyTreeUse.INCLUDE) ? (attributesReferencePropertyTree != null)
            : ((attributesReferencePropertyTree == null) || (!attributesReferencePropertyTree
                .isLeaf())))) {
          if (other.attributesReference == null) {
            this.attributesReference = null;
          } else {
            this.attributesReference =
                new ArrayList<AttributesReferenceType.Builder<RequestReferenceType.Builder<TParentBuilder>>>();
            for (AttributesReferenceType _item : other.attributesReference) {
              this.attributesReference
                  .add(((_item == null)
                      ? null
                      : new AttributesReferenceType.Builder<RequestReferenceType.Builder<TParentBuilder>>(
                          this, _item, true, attributesReferencePropertyTree, treeUse)));
            }
          }
        }
      } else {
        this._product = other;
      }
    }

    public TParentBuilder end() {
      return this._parentBuilder;
    }

    protected <P extends RequestReferenceType> P init(final P product) {
      if (this.attributesReference != null) {
        final List<AttributesReferenceType> attributesReference =
            new ArrayList<AttributesReferenceType>(this.attributesReference.size());
        for (AttributesReferenceType.Builder<RequestReferenceType.Builder<TParentBuilder>> _item : this.attributesReference) {
          attributesReference.add(_item.build());
        }
        product.attributesReference = attributesReference;
      }
      product.attributesReference_RO =
          ((attributesReference == null) ? null : Collections
              .unmodifiableList(product.attributesReference));
      return product;
    }

    public RequestReferenceType.Builder<TParentBuilder> addAttributesReference(
        final List<? extends AttributesReferenceType> attributesReference) {
      if (this.attributesReference == null) {
        this.attributesReference =
            new ArrayList<AttributesReferenceType.Builder<RequestReferenceType.Builder<TParentBuilder>>>();
      }
      for (AttributesReferenceType _item : attributesReference) {
        this.attributesReference
            .add(new AttributesReferenceType.Builder<RequestReferenceType.Builder<TParentBuilder>>(
                this, _item, false));
      }
      return this;
    }

    public RequestReferenceType.Builder<TParentBuilder> withAttributesReference(
        final List<? extends AttributesReferenceType> attributesReference) {
      if (this.attributesReference != null) {
        this.attributesReference.clear();
      }
      return addAttributesReference(attributesReference);
    }

    public RequestReferenceType.Builder<TParentBuilder> addAttributesReference(
        AttributesReferenceType... attributesReference) {
      addAttributesReference(Arrays.asList(attributesReference));
      return this;
    }

    public RequestReferenceType.Builder<TParentBuilder> withAttributesReference(
        AttributesReferenceType... attributesReference) {
      withAttributesReference(Arrays.asList(attributesReference));
      return this;
    }

    public AttributesReferenceType.Builder<? extends RequestReferenceType.Builder<TParentBuilder>> addAttributesReference() {
      if (this.attributesReference == null) {
        this.attributesReference =
            new ArrayList<AttributesReferenceType.Builder<RequestReferenceType.Builder<TParentBuilder>>>();
      }
      final AttributesReferenceType.Builder<RequestReferenceType.Builder<TParentBuilder>> attributesReferenceBuilder =
          new AttributesReferenceType.Builder<RequestReferenceType.Builder<TParentBuilder>>(this,
              null, false);
      this.attributesReference.add(attributesReferenceBuilder);
      return attributesReferenceBuilder;
    }

    public RequestReferenceType build() {
      if (this._product == null) {
        return this.init(new RequestReferenceType());
      } else {
        return ((RequestReferenceType) this._product);
      }
    }

  }

  public static class Select extends
      RequestReferenceType.Selector<RequestReferenceType.Select, Void> {

    Select() {
      super(null, null, null);
    }

    public static RequestReferenceType.Select _root() {
      return new RequestReferenceType.Select();
    }

  }

  public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?>, TParent>
      extends com.kscs.util.jaxb.Selector<TRoot, TParent> {

    private AttributesReferenceType.Selector<TRoot, RequestReferenceType.Selector<TRoot, TParent>> attributesReference =
        null;

    public Selector(final TRoot root, final TParent parent, final String propertyName) {
      super(root, parent, propertyName);
    }

    @Override
    public Map<String, PropertyTree> buildChildren() {
      final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
      products.putAll(super.buildChildren());
      if (this.attributesReference != null) {
        products.put("attributesReference", this.attributesReference.init());
      }
      return products;
    }

    public AttributesReferenceType.Selector<TRoot, RequestReferenceType.Selector<TRoot, TParent>> attributesReference() {
      return ((this.attributesReference == null)
          ? this.attributesReference =
              new AttributesReferenceType.Selector<TRoot, RequestReferenceType.Selector<TRoot, TParent>>(
                  this._root, this, "attributesReference") : this.attributesReference);
    }

  }

}
