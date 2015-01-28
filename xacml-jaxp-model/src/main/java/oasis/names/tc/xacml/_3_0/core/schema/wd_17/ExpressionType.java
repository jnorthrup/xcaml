//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.01.27 at 11:38:39 PM PST
//

package oasis.names.tc.xacml._3_0.core.schema.wd_17;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;

/**
 * <p>
 * Java class for ExpressionType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExpressionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpressionType")
@XmlSeeAlso({
    VariableReferenceType.class, AttributeSelectorType.class, AttributeDesignatorType.class,
    FunctionType.class, ApplyType.class})
public abstract class ExpressionType implements Cloneable {

  @Override
  public String toString() {
    return "";
  }

  @Override
  public ExpressionType clone() throws CloneNotSupportedException {
    final ExpressionType newObject = ((ExpressionType) super.clone());
    return newObject;
  }

  public static class Builder<TParentBuilder> {

    protected final TParentBuilder _parentBuilder;
    protected final ExpressionType _product;

    public Builder(final TParentBuilder parentBuilder, final ExpressionType other,
        final boolean copy) {
      this._parentBuilder = parentBuilder;
      if (copy) {
        this._product = null;
      } else {
        this._product = other;
      }
    }

    public Builder(final TParentBuilder parentBuilder, final ExpressionType other,
        final boolean copy, final PropertyTree propertyTree, final PropertyTreeUse treeUse) {
      this._parentBuilder = parentBuilder;
      if (copy) {
        this._product = null;
      } else {
        this._product = other;
      }
    }

    public TParentBuilder end() {
      return this._parentBuilder;
    }

    protected <P extends ExpressionType> P init(final P product) {
      return product;
    }

    public ExpressionType build() {
      return ((ExpressionType) this._product);
    }

  }

  public static class Select extends ExpressionType.Selector<ExpressionType.Select, Void> {

    Select() {
      super(null, null, null);
    }

    public static ExpressionType.Select _root() {
      return new ExpressionType.Select();
    }

  }

  public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?>, TParent>
      extends com.kscs.util.jaxb.Selector<TRoot, TParent> {

    public Selector(final TRoot root, final TParent parent, final String propertyName) {
      super(root, parent, propertyName);
    }

    @Override
    public Map<String, PropertyTree> buildChildren() {
      final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
      products.putAll(super.buildChildren());
      return products;
    }

  }

}
