//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.01.28 at 12:18:04 PM PST
//

package oasis.names.tc.xacml._3_0.core.schema.wd_17;

import java.util.HashMap;
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
 * Java class for StatusCodeType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusCodeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:xacml:3.0:core:schema:wd-17}StatusCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusCodeType", propOrder = {"statusCode"})
public class StatusCodeType implements Cloneable {

  @XmlElement(name = "StatusCode")
  protected StatusCodeType statusCode;
  @XmlAttribute(name = "Value", required = true)
  @XmlSchemaType(name = "anyURI")
  protected String value;

  /**
   * Gets the value of the statusCode property.
   * 
   * @return possible object is {@link StatusCodeType }
   * 
   */
  public StatusCodeType getStatusCode() {
    return statusCode;
  }

  /**
   * Sets the value of the statusCode property.
   * 
   * @param value allowed object is {@link StatusCodeType }
   * 
   */
  protected void setStatusCode(StatusCodeType value) {
    this.statusCode = value;
  }

  /**
   * Gets the value of the value property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getValue() {
    return value;
  }

  /**
   * Sets the value of the value property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  protected void setValue(String value) {
    this.value = value;
  }

  public static StatusCodeType.Builder<Void> builder() {
    return new StatusCodeType.Builder<Void>(null, null, false);
  }

  public static StatusCodeType.Builder<Void> copyOf(final StatusCodeType other) {
    return new StatusCodeType.Builder<Void>(null, other, true);
  }

  public static StatusCodeType.Builder<Void> copyOf(final StatusCodeType other,
      final PropertyTree propertyTree, final PropertyTreeUse propertyTreeUse) {
    return new StatusCodeType.Builder<Void>(null, other, true, propertyTree, propertyTreeUse);
  }

  public static StatusCodeType.Builder<Void> copyExcept(final StatusCodeType other,
      final PropertyTree propertyTree) {
    return copyOf(other, propertyTree, PropertyTreeUse.EXCLUDE);
  }

  public static StatusCodeType.Builder<Void> copyOnly(final StatusCodeType other,
      final PropertyTree propertyTree) {
    return copyOf(other, propertyTree, PropertyTreeUse.INCLUDE);
  }

  @Override
  public String toString() {
    return ((((("(statusCode = " + statusCode) + "), ") + "(value = ") + value) + ") ");
  }

  @Override
  public StatusCodeType clone() throws CloneNotSupportedException {
    final StatusCodeType newObject = ((StatusCodeType) super.clone());
    newObject.statusCode = ((this.statusCode == null) ? null : this.statusCode.clone());
    return newObject;
  }

  public static class Builder<TParentBuilder> {

    protected final TParentBuilder _parentBuilder;
    protected final StatusCodeType _product;
    private StatusCodeType.Builder<StatusCodeType.Builder<TParentBuilder>> statusCode;
    private String value;

    public Builder(final TParentBuilder parentBuilder, final StatusCodeType other,
        final boolean copy) {
      this._parentBuilder = parentBuilder;
      if (copy) {
        this._product = null;
        this.statusCode =
            ((other.statusCode == null) ? null
                : new StatusCodeType.Builder<StatusCodeType.Builder<TParentBuilder>>(this,
                    other.statusCode, true));
        this.value = other.value;
      } else {
        this._product = other;
      }
    }

    public Builder(final TParentBuilder parentBuilder, final StatusCodeType other,
        final boolean copy, final PropertyTree propertyTree, final PropertyTreeUse treeUse) {
      this._parentBuilder = parentBuilder;
      if (copy) {
        this._product = null;
        final PropertyTree statusCodePropertyTree =
            ((propertyTree == null) ? null : propertyTree.get("statusCode"));
        if (((treeUse == PropertyTreeUse.INCLUDE) ? (statusCodePropertyTree != null)
            : ((statusCodePropertyTree == null) || (!statusCodePropertyTree.isLeaf())))) {
          this.statusCode =
              ((other.statusCode == null) ? null
                  : new StatusCodeType.Builder<StatusCodeType.Builder<TParentBuilder>>(this,
                      other.statusCode, true, statusCodePropertyTree, treeUse));
        }
        final PropertyTree valuePropertyTree =
            ((propertyTree == null) ? null : propertyTree.get("value"));
        if (((treeUse == PropertyTreeUse.INCLUDE) ? (valuePropertyTree != null)
            : ((valuePropertyTree == null) || (!valuePropertyTree.isLeaf())))) {
          this.value = other.value;
        }
      } else {
        this._product = other;
      }
    }

    public TParentBuilder end() {
      return this._parentBuilder;
    }

    protected <P extends StatusCodeType> P init(final P product) {
      product.statusCode = ((this.statusCode == null) ? null : this.statusCode.build());
      product.value = this.value;
      return product;
    }

    public StatusCodeType.Builder<TParentBuilder> withStatusCode(final StatusCodeType statusCode) {
      this.statusCode =
          ((statusCode == null) ? null
              : new StatusCodeType.Builder<StatusCodeType.Builder<TParentBuilder>>(this,
                  statusCode, false));
      return this;
    }

    public StatusCodeType.Builder<? extends StatusCodeType.Builder<TParentBuilder>> withStatusCode() {
      return this.statusCode =
          new StatusCodeType.Builder<StatusCodeType.Builder<TParentBuilder>>(this, null, false);
    }

    public StatusCodeType.Builder<TParentBuilder> withValue(final String value) {
      this.value = value;
      return this;
    }

    public StatusCodeType build() {
      if (this._product == null) {
        return this.init(new StatusCodeType());
      } else {
        return ((StatusCodeType) this._product);
      }
    }

  }

  public static class Select extends StatusCodeType.Selector<StatusCodeType.Select, Void> {

    Select() {
      super(null, null, null);
    }

    public static StatusCodeType.Select _root() {
      return new StatusCodeType.Select();
    }

  }

  public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?>, TParent>
      extends com.kscs.util.jaxb.Selector<TRoot, TParent> {

    private StatusCodeType.Selector<TRoot, StatusCodeType.Selector<TRoot, TParent>> statusCode =
        null;
    private com.kscs.util.jaxb.Selector<TRoot, StatusCodeType.Selector<TRoot, TParent>> value =
        null;

    public Selector(final TRoot root, final TParent parent, final String propertyName) {
      super(root, parent, propertyName);
    }

    @Override
    public Map<String, PropertyTree> buildChildren() {
      final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
      products.putAll(super.buildChildren());
      if (this.statusCode != null) {
        products.put("statusCode", this.statusCode.init());
      }
      if (this.value != null) {
        products.put("value", this.value.init());
      }
      return products;
    }

    public StatusCodeType.Selector<TRoot, StatusCodeType.Selector<TRoot, TParent>> statusCode() {
      return ((this.statusCode == null) ? this.statusCode =
          new StatusCodeType.Selector<TRoot, StatusCodeType.Selector<TRoot, TParent>>(this._root,
              this, "statusCode") : this.statusCode);
    }

    public com.kscs.util.jaxb.Selector<TRoot, StatusCodeType.Selector<TRoot, TParent>> value() {
      return ((this.value == null) ? this.value =
          new com.kscs.util.jaxb.Selector<TRoot, StatusCodeType.Selector<TRoot, TParent>>(
              this._root, this, "value") : this.value);
    }

  }

}
