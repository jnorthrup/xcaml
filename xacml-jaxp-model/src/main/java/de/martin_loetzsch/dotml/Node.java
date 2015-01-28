//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.01.27 at 11:38:39 PM PST
//

package de.martin_loetzsch.dotml;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.kscs.util.jaxb.PropertyTree;
import com.kscs.util.jaxb.PropertyTreeUse;

/**
 * Represents a single node in the graph.
 * 
 * <p>
 * Java class for node complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="node"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attGroup ref="{http://www.martin-loetzsch.de/DOTML}node-and-record-attributes"/&gt;
 *       &lt;attribute name="fixedsize" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.martin-loetzsch.de/DOTML}id" /&gt;
 *       &lt;attribute name="label" type="{http://www.martin-loetzsch.de/DOTML}label" /&gt;
 *       &lt;attribute name="shape" type="{http://www.martin-loetzsch.de/DOTML}shape" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "node")
public class Node implements Cloneable, NodeAndRecordAttributes {

  @XmlAttribute(name = "fixedsize")
  protected Boolean fixedsize;
  @XmlAttribute(name = "id", required = true)
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected String id;
  @XmlAttribute(name = "label")
  protected String label;
  @XmlAttribute(name = "shape")
  protected Shape shape;
  @XmlAttribute(name = "color")
  protected String color;
  @XmlAttribute(name = "fillcolor")
  protected String fillcolor;
  @XmlAttribute(name = "height")
  protected BigDecimal height;
  @XmlAttribute(name = "style")
  protected Style style;
  @XmlAttribute(name = "width")
  protected BigDecimal width;
  @XmlAttribute(name = "fontname")
  protected String fontname;
  @XmlAttribute(name = "fontsize")
  protected BigDecimal fontsize;
  @XmlAttribute(name = "fontcolor")
  protected String fontcolor;

  /**
   * Gets the value of the fixedsize property.
   * 
   * @return possible object is {@link Boolean }
   * 
   */
  public Boolean isFixedsize() {
    return fixedsize;
  }

  /**
   * Sets the value of the fixedsize property.
   * 
   * @param value allowed object is {@link Boolean }
   * 
   */
  protected void setFixedsize(Boolean value) {
    this.fixedsize = value;
  }

  /**
   * Gets the value of the id property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getId() {
    return id;
  }

  /**
   * Sets the value of the id property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  protected void setId(String value) {
    this.id = value;
  }

  /**
   * Gets the value of the label property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getLabel() {
    return label;
  }

  /**
   * Sets the value of the label property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  protected void setLabel(String value) {
    this.label = value;
  }

  /**
   * Gets the value of the shape property.
   * 
   * @return possible object is {@link Shape }
   * 
   */
  public Shape getShape() {
    return shape;
  }

  /**
   * Sets the value of the shape property.
   * 
   * @param value allowed object is {@link Shape }
   * 
   */
  protected void setShape(Shape value) {
    this.shape = value;
  }

  /**
   * Gets the value of the color property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getColor() {
    return color;
  }

  /**
   * Sets the value of the color property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  protected void setColor(String value) {
    this.color = value;
  }

  /**
   * Gets the value of the fillcolor property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getFillcolor() {
    return fillcolor;
  }

  /**
   * Sets the value of the fillcolor property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  protected void setFillcolor(String value) {
    this.fillcolor = value;
  }

  /**
   * Gets the value of the height property.
   * 
   * @return possible object is {@link BigDecimal }
   * 
   */
  public BigDecimal getHeight() {
    return height;
  }

  /**
   * Sets the value of the height property.
   * 
   * @param value allowed object is {@link BigDecimal }
   * 
   */
  protected void setHeight(BigDecimal value) {
    this.height = value;
  }

  /**
   * Gets the value of the style property.
   * 
   * @return possible object is {@link Style }
   * 
   */
  public Style getStyle() {
    return style;
  }

  /**
   * Sets the value of the style property.
   * 
   * @param value allowed object is {@link Style }
   * 
   */
  protected void setStyle(Style value) {
    this.style = value;
  }

  /**
   * Gets the value of the width property.
   * 
   * @return possible object is {@link BigDecimal }
   * 
   */
  public BigDecimal getWidth() {
    return width;
  }

  /**
   * Sets the value of the width property.
   * 
   * @param value allowed object is {@link BigDecimal }
   * 
   */
  protected void setWidth(BigDecimal value) {
    this.width = value;
  }

  /**
   * Gets the value of the fontname property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getFontname() {
    return fontname;
  }

  /**
   * Sets the value of the fontname property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  protected void setFontname(String value) {
    this.fontname = value;
  }

  /**
   * Gets the value of the fontsize property.
   * 
   * @return possible object is {@link BigDecimal }
   * 
   */
  public BigDecimal getFontsize() {
    return fontsize;
  }

  /**
   * Sets the value of the fontsize property.
   * 
   * @param value allowed object is {@link BigDecimal }
   * 
   */
  protected void setFontsize(BigDecimal value) {
    this.fontsize = value;
  }

  /**
   * Gets the value of the fontcolor property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getFontcolor() {
    return fontcolor;
  }

  /**
   * Sets the value of the fontcolor property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  protected void setFontcolor(String value) {
    this.fontcolor = value;
  }

  public static Node.Builder<Void> builder() {
    return new Node.Builder<Void>(null, null, false);
  }

  public static Node.Builder<Void> copyOf(final Node other) {
    return new Node.Builder<Void>(null, other, true);
  }

  public static Node.Builder<Void> copyOf(final Node other, final PropertyTree propertyTree,
      final PropertyTreeUse propertyTreeUse) {
    return new Node.Builder<Void>(null, other, true, propertyTree, propertyTreeUse);
  }

  public static Node.Builder<Void> copyExcept(final Node other, final PropertyTree propertyTree) {
    return copyOf(other, propertyTree, PropertyTreeUse.EXCLUDE);
  }

  public static Node.Builder<Void> copyOnly(final Node other, final PropertyTree propertyTree) {
    return copyOf(other, propertyTree, PropertyTreeUse.INCLUDE);
  }

  @Override
  public String toString() {
    return ((((((((((((((((((((((((((((((((((("(fixedsize = " + fixedsize) + "), ") + "(id = ") + id) + "), ") + "(label = ") + label) + "), ") + "(shape = ") + shape) + "), ") + "(color = ") + color) + "), ") + "(fillcolor = ") + fillcolor) + "), ") + "(height = ") + height) + "), ") + "(style = ") + style) + "), ") + "(width = ") + width) + "), ") + "(fontname = ") + fontname) + "), ") + "(fontsize = ") + fontsize) + "), ") + "(fontcolor = ") + fontcolor) + ") ");
  }

  @Override
  public Node clone() throws CloneNotSupportedException {
    final Node newObject = ((Node) super.clone());
    return newObject;
  }

  public static class Builder<TParentBuilder> implements
      NodeAndRecordAttributes.BuildSupport<TParentBuilder> {

    protected final TParentBuilder _parentBuilder;
    protected final Node _product;
    private Boolean fixedsize;
    private String id;
    private String label;
    private Shape shape;
    private String color;
    private String fillcolor;
    private BigDecimal height;
    private Style style;
    private BigDecimal width;
    private String fontname;
    private BigDecimal fontsize;
    private String fontcolor;

    public Builder(final TParentBuilder parentBuilder, final Node other, final boolean copy) {
      this._parentBuilder = parentBuilder;
      if (copy) {
        this._product = null;
        this.fixedsize = other.fixedsize;
        this.id = other.id;
        this.label = other.label;
        this.shape = other.shape;
        this.color = other.color;
        this.fillcolor = other.fillcolor;
        this.height = other.height;
        this.style = other.style;
        this.width = other.width;
        this.fontname = other.fontname;
        this.fontsize = other.fontsize;
        this.fontcolor = other.fontcolor;
      } else {
        this._product = other;
      }
    }

    public Builder(final TParentBuilder parentBuilder, final Node other, final boolean copy,
        final PropertyTree propertyTree, final PropertyTreeUse treeUse) {
      this._parentBuilder = parentBuilder;
      if (copy) {
        this._product = null;
        final PropertyTree fixedsizePropertyTree =
            ((propertyTree == null) ? null : propertyTree.get("fixedsize"));
        if (((treeUse == PropertyTreeUse.INCLUDE) ? (fixedsizePropertyTree != null)
            : ((fixedsizePropertyTree == null) || (!fixedsizePropertyTree.isLeaf())))) {
          this.fixedsize = other.fixedsize;
        }
        final PropertyTree idPropertyTree =
            ((propertyTree == null) ? null : propertyTree.get("id"));
        if (((treeUse == PropertyTreeUse.INCLUDE) ? (idPropertyTree != null)
            : ((idPropertyTree == null) || (!idPropertyTree.isLeaf())))) {
          this.id = other.id;
        }
        final PropertyTree labelPropertyTree =
            ((propertyTree == null) ? null : propertyTree.get("label"));
        if (((treeUse == PropertyTreeUse.INCLUDE) ? (labelPropertyTree != null)
            : ((labelPropertyTree == null) || (!labelPropertyTree.isLeaf())))) {
          this.label = other.label;
        }
        final PropertyTree shapePropertyTree =
            ((propertyTree == null) ? null : propertyTree.get("shape"));
        if (((treeUse == PropertyTreeUse.INCLUDE) ? (shapePropertyTree != null)
            : ((shapePropertyTree == null) || (!shapePropertyTree.isLeaf())))) {
          this.shape = other.shape;
        }
        final PropertyTree colorPropertyTree =
            ((propertyTree == null) ? null : propertyTree.get("color"));
        if (((treeUse == PropertyTreeUse.INCLUDE) ? (colorPropertyTree != null)
            : ((colorPropertyTree == null) || (!colorPropertyTree.isLeaf())))) {
          this.color = other.color;
        }
        final PropertyTree fillcolorPropertyTree =
            ((propertyTree == null) ? null : propertyTree.get("fillcolor"));
        if (((treeUse == PropertyTreeUse.INCLUDE) ? (fillcolorPropertyTree != null)
            : ((fillcolorPropertyTree == null) || (!fillcolorPropertyTree.isLeaf())))) {
          this.fillcolor = other.fillcolor;
        }
        final PropertyTree heightPropertyTree =
            ((propertyTree == null) ? null : propertyTree.get("height"));
        if (((treeUse == PropertyTreeUse.INCLUDE) ? (heightPropertyTree != null)
            : ((heightPropertyTree == null) || (!heightPropertyTree.isLeaf())))) {
          this.height = other.height;
        }
        final PropertyTree stylePropertyTree =
            ((propertyTree == null) ? null : propertyTree.get("style"));
        if (((treeUse == PropertyTreeUse.INCLUDE) ? (stylePropertyTree != null)
            : ((stylePropertyTree == null) || (!stylePropertyTree.isLeaf())))) {
          this.style = other.style;
        }
        final PropertyTree widthPropertyTree =
            ((propertyTree == null) ? null : propertyTree.get("width"));
        if (((treeUse == PropertyTreeUse.INCLUDE) ? (widthPropertyTree != null)
            : ((widthPropertyTree == null) || (!widthPropertyTree.isLeaf())))) {
          this.width = other.width;
        }
        final PropertyTree fontnamePropertyTree =
            ((propertyTree == null) ? null : propertyTree.get("fontname"));
        if (((treeUse == PropertyTreeUse.INCLUDE) ? (fontnamePropertyTree != null)
            : ((fontnamePropertyTree == null) || (!fontnamePropertyTree.isLeaf())))) {
          this.fontname = other.fontname;
        }
        final PropertyTree fontsizePropertyTree =
            ((propertyTree == null) ? null : propertyTree.get("fontsize"));
        if (((treeUse == PropertyTreeUse.INCLUDE) ? (fontsizePropertyTree != null)
            : ((fontsizePropertyTree == null) || (!fontsizePropertyTree.isLeaf())))) {
          this.fontsize = other.fontsize;
        }
        final PropertyTree fontcolorPropertyTree =
            ((propertyTree == null) ? null : propertyTree.get("fontcolor"));
        if (((treeUse == PropertyTreeUse.INCLUDE) ? (fontcolorPropertyTree != null)
            : ((fontcolorPropertyTree == null) || (!fontcolorPropertyTree.isLeaf())))) {
          this.fontcolor = other.fontcolor;
        }
      } else {
        this._product = other;
      }
    }

    public TParentBuilder end() {
      return this._parentBuilder;
    }

    protected <P extends Node> P init(final P product) {
      product.fixedsize = this.fixedsize;
      product.id = this.id;
      product.label = this.label;
      product.shape = this.shape;
      product.color = this.color;
      product.fillcolor = this.fillcolor;
      product.height = this.height;
      product.style = this.style;
      product.width = this.width;
      product.fontname = this.fontname;
      product.fontsize = this.fontsize;
      product.fontcolor = this.fontcolor;
      return product;
    }

    public Node.Builder<TParentBuilder> withFixedsize(final Boolean fixedsize) {
      this.fixedsize = fixedsize;
      return this;
    }

    public Node.Builder<TParentBuilder> withId(final String id) {
      this.id = id;
      return this;
    }

    public Node.Builder<TParentBuilder> withLabel(final String label) {
      this.label = label;
      return this;
    }

    public Node.Builder<TParentBuilder> withShape(final Shape shape) {
      this.shape = shape;
      return this;
    }

    public Node.Builder<TParentBuilder> withColor(final String color) {
      this.color = color;
      return this;
    }

    public Node.Builder<TParentBuilder> withFillcolor(final String fillcolor) {
      this.fillcolor = fillcolor;
      return this;
    }

    public Node.Builder<TParentBuilder> withHeight(final BigDecimal height) {
      this.height = height;
      return this;
    }

    public Node.Builder<TParentBuilder> withStyle(final Style style) {
      this.style = style;
      return this;
    }

    public Node.Builder<TParentBuilder> withWidth(final BigDecimal width) {
      this.width = width;
      return this;
    }

    public Node.Builder<TParentBuilder> withFontname(final String fontname) {
      this.fontname = fontname;
      return this;
    }

    public Node.Builder<TParentBuilder> withFontsize(final BigDecimal fontsize) {
      this.fontsize = fontsize;
      return this;
    }

    public Node.Builder<TParentBuilder> withFontcolor(final String fontcolor) {
      this.fontcolor = fontcolor;
      return this;
    }

    public Node build() {
      if (this._product == null) {
        return this.init(new Node());
      } else {
        return ((Node) this._product);
      }
    }

  }

  public static class Select extends Node.Selector<Node.Select, Void> {

    Select() {
      super(null, null, null);
    }

    public static Node.Select _root() {
      return new Node.Select();
    }

  }

  public static class Selector<TRoot extends com.kscs.util.jaxb.Selector<TRoot, ?>, TParent>
      extends com.kscs.util.jaxb.Selector<TRoot, TParent> {

    private com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>> fixedsize = null;
    private com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>> id = null;
    private com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>> label = null;
    private com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>> shape = null;
    private com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>> color = null;
    private com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>> fillcolor = null;
    private com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>> height = null;
    private com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>> style = null;
    private com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>> width = null;
    private com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>> fontname = null;
    private com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>> fontsize = null;
    private com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>> fontcolor = null;

    public Selector(final TRoot root, final TParent parent, final String propertyName) {
      super(root, parent, propertyName);
    }

    @Override
    public Map<String, PropertyTree> buildChildren() {
      final Map<String, PropertyTree> products = new HashMap<String, PropertyTree>();
      products.putAll(super.buildChildren());
      if (this.fixedsize != null) {
        products.put("fixedsize", this.fixedsize.init());
      }
      if (this.id != null) {
        products.put("id", this.id.init());
      }
      if (this.label != null) {
        products.put("label", this.label.init());
      }
      if (this.shape != null) {
        products.put("shape", this.shape.init());
      }
      if (this.color != null) {
        products.put("color", this.color.init());
      }
      if (this.fillcolor != null) {
        products.put("fillcolor", this.fillcolor.init());
      }
      if (this.height != null) {
        products.put("height", this.height.init());
      }
      if (this.style != null) {
        products.put("style", this.style.init());
      }
      if (this.width != null) {
        products.put("width", this.width.init());
      }
      if (this.fontname != null) {
        products.put("fontname", this.fontname.init());
      }
      if (this.fontsize != null) {
        products.put("fontsize", this.fontsize.init());
      }
      if (this.fontcolor != null) {
        products.put("fontcolor", this.fontcolor.init());
      }
      return products;
    }

    public com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>> fixedsize() {
      return ((this.fixedsize == null) ? this.fixedsize =
          new com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>>(this._root, this,
              "fixedsize") : this.fixedsize);
    }

    public com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>> id() {
      return ((this.id == null) ? this.id =
          new com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>>(this._root, this,
              "id") : this.id);
    }

    public com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>> label() {
      return ((this.label == null) ? this.label =
          new com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>>(this._root, this,
              "label") : this.label);
    }

    public com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>> shape() {
      return ((this.shape == null) ? this.shape =
          new com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>>(this._root, this,
              "shape") : this.shape);
    }

    public com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>> color() {
      return ((this.color == null) ? this.color =
          new com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>>(this._root, this,
              "color") : this.color);
    }

    public com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>> fillcolor() {
      return ((this.fillcolor == null) ? this.fillcolor =
          new com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>>(this._root, this,
              "fillcolor") : this.fillcolor);
    }

    public com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>> height() {
      return ((this.height == null) ? this.height =
          new com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>>(this._root, this,
              "height") : this.height);
    }

    public com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>> style() {
      return ((this.style == null) ? this.style =
          new com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>>(this._root, this,
              "style") : this.style);
    }

    public com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>> width() {
      return ((this.width == null) ? this.width =
          new com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>>(this._root, this,
              "width") : this.width);
    }

    public com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>> fontname() {
      return ((this.fontname == null) ? this.fontname =
          new com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>>(this._root, this,
              "fontname") : this.fontname);
    }

    public com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>> fontsize() {
      return ((this.fontsize == null) ? this.fontsize =
          new com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>>(this._root, this,
              "fontsize") : this.fontsize);
    }

    public com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>> fontcolor() {
      return ((this.fontcolor == null) ? this.fontcolor =
          new com.kscs.util.jaxb.Selector<TRoot, Node.Selector<TRoot, TParent>>(this._root, this,
              "fontcolor") : this.fontcolor);
    }

  }

}