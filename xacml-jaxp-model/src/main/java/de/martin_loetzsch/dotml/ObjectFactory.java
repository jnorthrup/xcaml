//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation,
// v2.2.10-b140310.1920
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.01.30 at 05:51:02 PM PST
//

package de.martin_loetzsch.dotml;

import javax.xml.bind.annotation.XmlRegistry;

/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the
 * de.martin_loetzsch.dotml package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the Java representation for XML content.
 * The Java representation of XML content can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory methods for each of these are provided in
 * this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

  /**
   * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package:
   * de.martin_loetzsch.dotml
   * 
   */
  public ObjectFactory() {
  }

  /**
   * Create an instance of {@link Graph }
   * 
   */
  public Graph createGraph() {
    return new Graph();
  }

  /**
   * Create an instance of {@link ClusterOrGraph }
   * 
   */
  public ClusterOrGraph createClusterOrGraph() {
    return new ClusterOrGraph();
  }

  /**
   * Create an instance of {@link Node }
   * 
   */
  public Node createNode() {
    return new Node();
  }

  /**
   * Create an instance of {@link Cluster }
   * 
   */
  public Cluster createCluster() {
    return new Cluster();
  }

  /**
   * Create an instance of {@link SubGraph }
   * 
   */
  public SubGraph createSubGraph() {
    return new SubGraph();
  }

  /**
   * Create an instance of {@link RecordNode }
   * 
   */
  public RecordNode createRecordNode() {
    return new RecordNode();
  }

  /**
   * Create an instance of {@link Edge }
   * 
   */
  public Edge createEdge() {
    return new Edge();
  }

  /**
   * Create an instance of {@link Record }
   * 
   */
  public Record createRecord() {
    return new Record();
  }

}
