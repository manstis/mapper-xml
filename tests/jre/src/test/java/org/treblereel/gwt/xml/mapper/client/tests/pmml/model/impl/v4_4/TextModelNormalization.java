//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.3.0
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2021.08.06 at 04:43:18 PM BST
//

package org.treblereel.gwt.xml.mapper.client.tests.pmml.model.impl.v4_4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}Extension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="localTermWeights" default="termFrequency"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="termFrequency"/&gt;
 *             &lt;enumeration value="binary"/&gt;
 *             &lt;enumeration value="logarithmic"/&gt;
 *             &lt;enumeration value="augmentedNormalizedTermFrequency"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="globalTermWeights" default="inverseDocumentFrequency"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="inverseDocumentFrequency"/&gt;
 *             &lt;enumeration value="none"/&gt;
 *             &lt;enumeration value="GFIDF"/&gt;
 *             &lt;enumeration value="normal"/&gt;
 *             &lt;enumeration value="probabilisticInverse"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="documentNormalization" default="none"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="none"/&gt;
 *             &lt;enumeration value="cosine"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {"extension"})
@XmlRootElement(name = "TextModelNormalization")
public class TextModelNormalization {

  @XmlElement(name = "Extension")
  protected List<Extension> extension;

  @XmlAttribute(name = "localTermWeights")
  protected String localTermWeights;

  @XmlAttribute(name = "globalTermWeights")
  protected String globalTermWeights;

  @XmlAttribute(name = "documentNormalization")
  protected String documentNormalization;

  /**
   * Gets the value of the extension property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the extension property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getExtension().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link Extension }
   */
  public List<Extension> getExtension() {
    if (extension == null) {
      extension = new ArrayList<Extension>();
    }
    return this.extension;
  }

  /**
   * Gets the value of the localTermWeights property.
   *
   * @return possible object is {@link String }
   */
  public String getLocalTermWeights() {
    if (localTermWeights == null) {
      return "termFrequency";
    } else {
      return localTermWeights;
    }
  }

  /**
   * Sets the value of the localTermWeights property.
   *
   * @param value allowed object is {@link String }
   */
  public void setLocalTermWeights(String value) {
    this.localTermWeights = value;
  }

  /**
   * Gets the value of the globalTermWeights property.
   *
   * @return possible object is {@link String }
   */
  public String getGlobalTermWeights() {
    if (globalTermWeights == null) {
      return "inverseDocumentFrequency";
    } else {
      return globalTermWeights;
    }
  }

  /**
   * Sets the value of the globalTermWeights property.
   *
   * @param value allowed object is {@link String }
   */
  public void setGlobalTermWeights(String value) {
    this.globalTermWeights = value;
  }

  /**
   * Gets the value of the documentNormalization property.
   *
   * @return possible object is {@link String }
   */
  public String getDocumentNormalization() {
    if (documentNormalization == null) {
      return "none";
    } else {
      return documentNormalization;
    }
  }

  /**
   * Sets the value of the documentNormalization property.
   *
   * @param value allowed object is {@link String }
   */
  public void setDocumentNormalization(String value) {
    this.documentNormalization = value;
  }
}
