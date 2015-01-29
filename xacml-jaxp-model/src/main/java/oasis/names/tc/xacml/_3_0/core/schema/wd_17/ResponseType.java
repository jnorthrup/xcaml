//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.01.29 at 09:44:49 AM PST
//

package oasis.names.tc.xacml._3_0.core.schema.wd_17;

import java.util.ArrayList;
import java.util.Arrays;
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
 * Java class for ResponseType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:xacml:3.0:core:schema:wd-17}Result" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseType", propOrder = {"result"})
public class ResponseType implements Cloneable {

  @XmlElement(name = "Result", required = true)
  protected List<ResultType> result;

  /**
   * Gets the value of the result property.
   * 
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
   * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
   * the result property.
   * 
   * <p>
   * For example, to add a new item, do as follows:
   * 
   * <pre>
     *    getResult().add(newItem);
     * </pre>
   * 
   * 
   * <p>
   * Objects of the following type(s) are allowed in the list {@link ResultType }
   * 
   * 
   */
  public List<ResultType> getResult() {
    if (result == null) {
      result = new ArrayList<ResultType>();
    }
    return this.result;
  }

  public static ResponseType.Builder<Void> builder() {
    return new ResponseType.Builder<Void>(null, null, false);
  }

  public static ResponseType.Builder<Void> copyOf(final ResponseType other) {
    return new ResponseType.Builder<Void>(null, other, true);
  }

  public static ResponseType.Builder<Void> copyOf(final ResponseType other,
      final PropertyTree propertyTree, final PropertyTreeUse propertyTreeUse) {
    return new ResponseType.Builder<Void>(null, other, true, propertyTree, propertyTreeUse);
  }

  public static ResponseType.Builder<Void> copyExcept(final ResponseType other,
      final PropertyTree propertyTree) {
    return copyOf(other, propertyTree, PropertyTreeUse.EXCLUDE);
  }

  public static ResponseType.Builder<Void> copyOnly(final ResponseType other,
      final PropertyTree propertyTree) {
    return copyOf(other, propertyTree, PropertyTreeUse.INCLUDE);
  }

  @Override
  public String toString() {
    return (("(result = " + result) + ") ");
  }

  @Override
  public ResponseType clone() throws CloneNotSupportedException {
    final ResponseType newObject = ((ResponseType) super.clone());
    if (this.result == null) {
      newObject.result = null;
    } else {
      newObject.result = new ArrayList<ResultType>();
      for (ResultType item : this.result) {
        newObject.result.add(((item == null) ? null : item.clone()));
      }
    }
    return newObject;
  }

  public static class Builder<TParentBuilder> {

    protected final TParentBuilder _parentBuilder;
    protected final ResponseType _product;
    private List<ResultType.Builder<ResponseType.Builder<TParentBuilder>>> result;

    public Builder(final TParentBuilder parentBuilder, final ResponseType other, final boolean copy) {
      this._parentBuilder = parentBuilder;
      if (copy) {
        this._product = null;
        if (other.result == null) {
          this.result = null;
        } else {
          this.result = new ArrayList<ResultType.Builder<ResponseType.Builder<TParentBuilder>>>();
          for (ResultType _item : other.result) {
            this.result.add(((_item == null) ? null
                : new ResultType.Builder<ResponseType.Builder<TParentBuilder>>(this, _item, true)));
          }
        }
      } else {
        this._product = other;
      }
    }

    public Builder(final TParentBuilder parentBuilder, final ResponseType other,
        final boolean copy, final PropertyTree propertyTree, final PropertyTreeUse treeUse) {
      this._parentBuilder = parentBuilder;
      if (copy) {
        this._product = null;
        final PropertyTree resultPropertyTree =
            ((propertyTree == null) ? null : propertyTree.get("result"));
        if (((treeUse == PropertyTreeUse.INCLUDE) ? (resultPropertyTree != null)
            : ((resultPropertyTree == null) || (!resultPropertyTree.isLeaf())))) {
          if (other.result == null) {
            this.result = null;
          } else {
            this.result = new ArrayList<ResultType.Builder<ResponseType.Builder<TParentBuilder>>>();
            for (ResultType _item : other.result) {
              this.result.add(((_item == null) ? null
                  : new ResultType.Builder<ResponseType.Builder<TParentBuilder>>(this, _item, true,
                      resultPropertyTree, treeUse)));
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

    protected <P extends ResponseType> P init(final P product) {
      if (this.result != null) {
        final List<ResultType> result = new ArrayList<ResultType>(this.result.size());
        for (ResultType.Builder<ResponseType.Builder<TParentBuilder>> _item : this.result) {
          result.add(_item.build());
        }
        product.result = result;
      }
      return product;
    }

    public ResponseType.Builder<TParentBuilder> addResult(final List<? extends ResultType> result) {
      if (this.result == null) {
        this.result = new ArrayList<ResultType.Builder<ResponseType.Builder<TParentBuilder>>>();
      }
      for (ResultType _item : result) {
        this.result.add(new ResultType.Builder<ResponseType.Builder<TParentBuilder>>(this, _item,
            false));
      }
      return this;
    }

    public ResponseType.Builder<TParentBuilder> withResult(final List<? extends ResultType> result) {
      if (this.result != null) {
        this.result.clear();
      }
      return addResult(result);
    }

    public ResponseType.Builder<TParentBuilder> addResult(ResultType... result) {
      addResult(Arrays.asList(result));
      return this;
    }

    public ResponseType.Builder<TParentBuilder> withResult(ResultType... result) {
      withResult(Arrays.asList(result));
      return this;
    }

    public ResultType.Builder<? extends ResponseType.Builder<TParentBuilder>> addResult() {
      if (this.result == null) {
        this.result = new ArrayList<ResultType.Builder<ResponseType.Builder<TParentBuilder>>>();
      }
      final ResultType.Builder<ResponseType.Builder<TParentBuilder>> resultBuilder =
          new ResultType.Builder<ResponseType.Builder<TParentBuilder>>(this, null, false);
      this.result.add(resultBuilder);
      return resultBuilder;
    }

    public ResponseType build() {
      if (this._product == null) {
        return this.init(new ResponseType());
      } else {
        return ((ResponseType) this._product);
      }
    }

  }

  public static class Select extends ResponseType.Selector<ResponseType.Select, Void> {

    Select() {
      super(null, null, null);
    }

    public static ResponseType.Select _root() {
      return new ResponseType.Select();
    }

  }

  public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?>, TParent>
      extends com.kscs.util.jaxb.Selector<TRoot, TParent> {

    private ResultType.Selector<TRoot, ResponseType.Selector<TRoot, TParent>> result = null;

    public Selector(final TRoot root, final TParent parent, final String propertyName) {
      super(root, parent, propertyName);
    }

    @Override
    public Map<String, PropertyTree> buildChildren() {
      final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
      products.putAll(super.buildChildren());
      if (this.result != null) {
        products.put("result", this.result.init());
      }
      return products;
    }

    public ResultType.Selector<TRoot, ResponseType.Selector<TRoot, TParent>> result() {
      return ((this.result == null) ? this.result =
          new ResultType.Selector<TRoot, ResponseType.Selector<TRoot, TParent>>(this._root, this,
              "result") : this.result);
    }

  }

}
