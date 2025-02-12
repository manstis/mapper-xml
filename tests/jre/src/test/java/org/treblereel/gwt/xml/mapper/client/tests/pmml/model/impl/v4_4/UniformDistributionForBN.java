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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.treblereel.gwt.xml.mapper.client.tests.pmml.model.api.IContinuousDistribution;

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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}Lower"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}Upper"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {"extension", "lower", "upper"})
@XmlRootElement(name = "UniformDistributionForBN")
public class UniformDistributionForBN implements IContinuousDistribution {

  @XmlElement(name = "Extension")
  protected List<Extension> extension;

  @XmlElement(name = "Lower", required = true)
  protected Lower lower;

  @XmlElement(name = "Upper", required = true)
  protected Upper upper;

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
   * Gets the value of the lower property.
   *
   * @return possible object is {@link Lower }
   */
  public Lower getLower() {
    return lower;
  }

  /**
   * Sets the value of the lower property.
   *
   * @param value allowed object is {@link Lower }
   */
  public void setLower(Lower value) {
    this.lower = value;
  }

  /**
   * Gets the value of the upper property.
   *
   * @return possible object is {@link Upper }
   */
  public Upper getUpper() {
    return upper;
  }

  /**
   * Sets the value of the upper property.
   *
   * @param value allowed object is {@link Upper }
   */
  public void setUpper(Upper value) {
    this.upper = value;
  }
}
