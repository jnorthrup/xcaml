//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.01.27 at 11:38:39 PM PST
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
 * Java class for MultiRequestsType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultiRequestsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:xacml:3.0:core:schema:wd-17}RequestReference" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiRequestsType", propOrder = {"requestReference"})
public class MultiRequestsType implements Cloneable {

  @XmlElement(name = "RequestReference", required = true)
  protected List<RequestReferenceType> requestReference;
  protected transient List<RequestReferenceType> requestReference_RO = null;

  public static MultiRequestsType.Builder<Void> builder() {
    return new MultiRequestsType.Builder<Void>(null, null, false);
  }

  public static MultiRequestsType.Builder<Void> copyOf(final MultiRequestsType other) {
    return new MultiRequestsType.Builder<Void>(null, other, true);
  }

  public static MultiRequestsType.Builder<Void> copyOf(final MultiRequestsType other,
      final PropertyTree propertyTree, final PropertyTreeUse propertyTreeUse) {
    return new MultiRequestsType.Builder<Void>(null, other, true, propertyTree, propertyTreeUse);
  }

  public static MultiRequestsType.Builder<Void> copyExcept(final MultiRequestsType other,
      final PropertyTree propertyTree) {
    return copyOf(other, propertyTree, PropertyTreeUse.EXCLUDE);
  }

  public static MultiRequestsType.Builder<Void> copyOnly(final MultiRequestsType other,
      final PropertyTree propertyTree) {
    return copyOf(other, propertyTree, PropertyTreeUse.INCLUDE);
  }

  @Override
  public String toString() {
    return (("(requestReference = " + requestReference) + ") ");
  }

  @Override
  public MultiRequestsType clone() throws CloneNotSupportedException {
    final MultiRequestsType newObject = ((MultiRequestsType) super.clone());
    if (this.requestReference == null) {
      newObject.requestReference = null;
    } else {
      newObject.requestReference = new ArrayList<RequestReferenceType>();
      for (RequestReferenceType item : this.requestReference) {
        newObject.requestReference.add(((item == null) ? null : item.clone()));
      }
    }
    newObject.requestReference_RO =
        ((requestReference == null) ? null : Collections
            .unmodifiableList(newObject.requestReference));
    return newObject;
  }

  public List<RequestReferenceType> getRequestReference() {
    if (this.requestReference == null) {
      this.requestReference = new ArrayList<RequestReferenceType>();
    }
    if (this.requestReference_RO == null) {
      this.requestReference_RO =
          ((requestReference == null) ? null : Collections.unmodifiableList(this.requestReference));
    }
    return this.requestReference_RO;
  }

  public static class Builder<TParentBuilder> {

    protected final TParentBuilder _parentBuilder;
    protected final MultiRequestsType _product;
    private List<RequestReferenceType.Builder<MultiRequestsType.Builder<TParentBuilder>>> requestReference;

    public Builder(final TParentBuilder parentBuilder, final MultiRequestsType other,
        final boolean copy) {
      this._parentBuilder = parentBuilder;
      if (copy) {
        this._product = null;
        if (other.requestReference == null) {
          this.requestReference = null;
        } else {
          this.requestReference =
              new ArrayList<RequestReferenceType.Builder<MultiRequestsType.Builder<TParentBuilder>>>();
          for (RequestReferenceType _item : other.requestReference) {
            this.requestReference.add(((_item == null) ? null
                : new RequestReferenceType.Builder<MultiRequestsType.Builder<TParentBuilder>>(this,
                    _item, true)));
          }
        }
      } else {
        this._product = other;
      }
    }

    public Builder(final TParentBuilder parentBuilder, final MultiRequestsType other,
        final boolean copy, final PropertyTree propertyTree, final PropertyTreeUse treeUse) {
      this._parentBuilder = parentBuilder;
      if (copy) {
        this._product = null;
        final PropertyTree requestReferencePropertyTree =
            ((propertyTree == null) ? null : propertyTree.get("requestReference"));
        if (((treeUse == PropertyTreeUse.INCLUDE) ? (requestReferencePropertyTree != null)
            : ((requestReferencePropertyTree == null) || (!requestReferencePropertyTree.isLeaf())))) {
          if (other.requestReference == null) {
            this.requestReference = null;
          } else {
            this.requestReference =
                new ArrayList<RequestReferenceType.Builder<MultiRequestsType.Builder<TParentBuilder>>>();
            for (RequestReferenceType _item : other.requestReference) {
              this.requestReference.add(((_item == null) ? null
                  : new RequestReferenceType.Builder<MultiRequestsType.Builder<TParentBuilder>>(
                      this, _item, true, requestReferencePropertyTree, treeUse)));
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

    protected <P extends MultiRequestsType> P init(final P product) {
      if (this.requestReference != null) {
        final List<RequestReferenceType> requestReference =
            new ArrayList<RequestReferenceType>(this.requestReference.size());
        for (RequestReferenceType.Builder<MultiRequestsType.Builder<TParentBuilder>> _item : this.requestReference) {
          requestReference.add(_item.build());
        }
        product.requestReference = requestReference;
      }
      product.requestReference_RO =
          ((requestReference == null) ? null : Collections
              .unmodifiableList(product.requestReference));
      return product;
    }

    public MultiRequestsType.Builder<TParentBuilder> addRequestReference(
        final List<? extends RequestReferenceType> requestReference) {
      if (this.requestReference == null) {
        this.requestReference =
            new ArrayList<RequestReferenceType.Builder<MultiRequestsType.Builder<TParentBuilder>>>();
      }
      for (RequestReferenceType _item : requestReference) {
        this.requestReference
            .add(new RequestReferenceType.Builder<MultiRequestsType.Builder<TParentBuilder>>(this,
                _item, false));
      }
      return this;
    }

    public MultiRequestsType.Builder<TParentBuilder> withRequestReference(
        final List<? extends RequestReferenceType> requestReference) {
      if (this.requestReference != null) {
        this.requestReference.clear();
      }
      return addRequestReference(requestReference);
    }

    public MultiRequestsType.Builder<TParentBuilder> addRequestReference(
        RequestReferenceType... requestReference) {
      addRequestReference(Arrays.asList(requestReference));
      return this;
    }

    public MultiRequestsType.Builder<TParentBuilder> withRequestReference(
        RequestReferenceType... requestReference) {
      withRequestReference(Arrays.asList(requestReference));
      return this;
    }

    public RequestReferenceType.Builder<? extends MultiRequestsType.Builder<TParentBuilder>> addRequestReference() {
      if (this.requestReference == null) {
        this.requestReference =
            new ArrayList<RequestReferenceType.Builder<MultiRequestsType.Builder<TParentBuilder>>>();
      }
      final RequestReferenceType.Builder<MultiRequestsType.Builder<TParentBuilder>> requestReferenceBuilder =
          new RequestReferenceType.Builder<MultiRequestsType.Builder<TParentBuilder>>(this, null,
              false);
      this.requestReference.add(requestReferenceBuilder);
      return requestReferenceBuilder;
    }

    public MultiRequestsType build() {
      if (this._product == null) {
        return this.init(new MultiRequestsType());
      } else {
        return ((MultiRequestsType) this._product);
      }
    }

  }

  public static class Select extends MultiRequestsType.Selector<MultiRequestsType.Select, Void> {

    Select() {
      super(null, null, null);
    }

    public static MultiRequestsType.Select _root() {
      return new MultiRequestsType.Select();
    }

  }

  public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?>, TParent>
      extends com.kscs.util.jaxb.Selector<TRoot, TParent> {

    private RequestReferenceType.Selector<TRoot, MultiRequestsType.Selector<TRoot, TParent>> requestReference =
        null;

    public Selector(final TRoot root, final TParent parent, final String propertyName) {
      super(root, parent, propertyName);
    }

    @Override
    public Map<String, PropertyTree> buildChildren() {
      final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
      products.putAll(super.buildChildren());
      if (this.requestReference != null) {
        products.put("requestReference", this.requestReference.init());
      }
      return products;
    }

    public RequestReferenceType.Selector<TRoot, MultiRequestsType.Selector<TRoot, TParent>> requestReference() {
      return ((this.requestReference == null) ? this.requestReference =
          new RequestReferenceType.Selector<TRoot, MultiRequestsType.Selector<TRoot, TParent>>(
              this._root, this, "requestReference") : this.requestReference);
    }

  }

}
