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
 * Java class for AssociatedAdviceType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssociatedAdviceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:xacml:3.0:core:schema:wd-17}Advice" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssociatedAdviceType", propOrder = {"advice"})
public class AssociatedAdviceType implements Cloneable {

  @XmlElement(name = "Advice", required = true)
  protected List<AdviceType> advice;

  /**
   * Gets the value of the advice property.
   * 
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
   * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
   * the advice property.
   * 
   * <p>
   * For example, to add a new item, do as follows:
   * 
   * <pre>
     *    getAdvice().add(newItem);
     * </pre>
   * 
   * 
   * <p>
   * Objects of the following type(s) are allowed in the list {@link AdviceType }
   * 
   * 
   */
  public List<AdviceType> getAdvice() {
    if (advice == null) {
      advice = new ArrayList<AdviceType>();
    }
    return this.advice;
  }

  public static AssociatedAdviceType.Builder<Void> builder() {
    return new AssociatedAdviceType.Builder<Void>(null, null, false);
  }

  public static AssociatedAdviceType.Builder<Void> copyOf(final AssociatedAdviceType other) {
    return new AssociatedAdviceType.Builder<Void>(null, other, true);
  }

  public static AssociatedAdviceType.Builder<Void> copyOf(final AssociatedAdviceType other,
      final PropertyTree propertyTree, final PropertyTreeUse propertyTreeUse) {
    return new AssociatedAdviceType.Builder<Void>(null, other, true, propertyTree, propertyTreeUse);
  }

  public static AssociatedAdviceType.Builder<Void> copyExcept(final AssociatedAdviceType other,
      final PropertyTree propertyTree) {
    return copyOf(other, propertyTree, PropertyTreeUse.EXCLUDE);
  }

  public static AssociatedAdviceType.Builder<Void> copyOnly(final AssociatedAdviceType other,
      final PropertyTree propertyTree) {
    return copyOf(other, propertyTree, PropertyTreeUse.INCLUDE);
  }

  @Override
  public String toString() {
    return (("(advice = " + advice) + ") ");
  }

  @Override
  public AssociatedAdviceType clone() throws CloneNotSupportedException {
    final AssociatedAdviceType newObject = ((AssociatedAdviceType) super.clone());
    if (this.advice == null) {
      newObject.advice = null;
    } else {
      newObject.advice = new ArrayList<AdviceType>();
      for (AdviceType item : this.advice) {
        newObject.advice.add(((item == null) ? null : item.clone()));
      }
    }
    return newObject;
  }

  public static class Builder<TParentBuilder> {

    protected final TParentBuilder _parentBuilder;
    protected final AssociatedAdviceType _product;
    private List<AdviceType.Builder<AssociatedAdviceType.Builder<TParentBuilder>>> advice;

    public Builder(final TParentBuilder parentBuilder, final AssociatedAdviceType other,
        final boolean copy) {
      this._parentBuilder = parentBuilder;
      if (copy) {
        this._product = null;
        if (other.advice == null) {
          this.advice = null;
        } else {
          this.advice =
              new ArrayList<AdviceType.Builder<AssociatedAdviceType.Builder<TParentBuilder>>>();
          for (AdviceType _item : other.advice) {
            this.advice.add(((_item == null) ? null
                : new AdviceType.Builder<AssociatedAdviceType.Builder<TParentBuilder>>(this, _item,
                    true)));
          }
        }
      } else {
        this._product = other;
      }
    }

    public Builder(final TParentBuilder parentBuilder, final AssociatedAdviceType other,
        final boolean copy, final PropertyTree propertyTree, final PropertyTreeUse treeUse) {
      this._parentBuilder = parentBuilder;
      if (copy) {
        this._product = null;
        final PropertyTree advicePropertyTree =
            ((propertyTree == null) ? null : propertyTree.get("advice"));
        if (((treeUse == PropertyTreeUse.INCLUDE) ? (advicePropertyTree != null)
            : ((advicePropertyTree == null) || (!advicePropertyTree.isLeaf())))) {
          if (other.advice == null) {
            this.advice = null;
          } else {
            this.advice =
                new ArrayList<AdviceType.Builder<AssociatedAdviceType.Builder<TParentBuilder>>>();
            for (AdviceType _item : other.advice) {
              this.advice.add(((_item == null) ? null
                  : new AdviceType.Builder<AssociatedAdviceType.Builder<TParentBuilder>>(this,
                      _item, true, advicePropertyTree, treeUse)));
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

    protected <P extends AssociatedAdviceType> P init(final P product) {
      if (this.advice != null) {
        final List<AdviceType> advice = new ArrayList<AdviceType>(this.advice.size());
        for (AdviceType.Builder<AssociatedAdviceType.Builder<TParentBuilder>> _item : this.advice) {
          advice.add(_item.build());
        }
        product.advice = advice;
      }
      return product;
    }

    public AssociatedAdviceType.Builder<TParentBuilder> addAdvice(
        final List<? extends AdviceType> advice) {
      if (this.advice == null) {
        this.advice =
            new ArrayList<AdviceType.Builder<AssociatedAdviceType.Builder<TParentBuilder>>>();
      }
      for (AdviceType _item : advice) {
        this.advice.add(new AdviceType.Builder<AssociatedAdviceType.Builder<TParentBuilder>>(this,
            _item, false));
      }
      return this;
    }

    public AssociatedAdviceType.Builder<TParentBuilder> withAdvice(
        final List<? extends AdviceType> advice) {
      if (this.advice != null) {
        this.advice.clear();
      }
      return addAdvice(advice);
    }

    public AssociatedAdviceType.Builder<TParentBuilder> addAdvice(AdviceType... advice) {
      addAdvice(Arrays.asList(advice));
      return this;
    }

    public AssociatedAdviceType.Builder<TParentBuilder> withAdvice(AdviceType... advice) {
      withAdvice(Arrays.asList(advice));
      return this;
    }

    public AdviceType.Builder<? extends AssociatedAdviceType.Builder<TParentBuilder>> addAdvice() {
      if (this.advice == null) {
        this.advice =
            new ArrayList<AdviceType.Builder<AssociatedAdviceType.Builder<TParentBuilder>>>();
      }
      final AdviceType.Builder<AssociatedAdviceType.Builder<TParentBuilder>> adviceBuilder =
          new AdviceType.Builder<AssociatedAdviceType.Builder<TParentBuilder>>(this, null, false);
      this.advice.add(adviceBuilder);
      return adviceBuilder;
    }

    public AssociatedAdviceType build() {
      if (this._product == null) {
        return this.init(new AssociatedAdviceType());
      } else {
        return ((AssociatedAdviceType) this._product);
      }
    }

  }

  public static class Select extends
      AssociatedAdviceType.Selector<AssociatedAdviceType.Select, Void> {

    Select() {
      super(null, null, null);
    }

    public static AssociatedAdviceType.Select _root() {
      return new AssociatedAdviceType.Select();
    }

  }

  public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?>, TParent>
      extends com.kscs.util.jaxb.Selector<TRoot, TParent> {

    private AdviceType.Selector<TRoot, AssociatedAdviceType.Selector<TRoot, TParent>> advice = null;

    public Selector(final TRoot root, final TParent parent, final String propertyName) {
      super(root, parent, propertyName);
    }

    @Override
    public Map<String, PropertyTree> buildChildren() {
      final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
      products.putAll(super.buildChildren());
      if (this.advice != null) {
        products.put("advice", this.advice.init());
      }
      return products;
    }

    public AdviceType.Selector<TRoot, AssociatedAdviceType.Selector<TRoot, TParent>> advice() {
      return ((this.advice == null) ? this.advice =
          new AdviceType.Selector<TRoot, AssociatedAdviceType.Selector<TRoot, TParent>>(this._root,
              this, "advice") : this.advice);
    }

  }

}
