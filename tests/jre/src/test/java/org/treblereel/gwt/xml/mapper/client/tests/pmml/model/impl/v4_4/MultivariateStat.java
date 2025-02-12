//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.3.0
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2021.08.06 at 04:43:18 PM BST
//

package org.treblereel.gwt.xml.mapper.client.tests.pmml.model.impl.v4_4;

import java.math.BigInteger;
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
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="category" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="exponent" type="{http://www.dmg.org/PMML-4_4}INT-NUMBER" default="1" /&gt;
 *       &lt;attribute name="isIntercept" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="importance" type="{http://www.dmg.org/PMML-4_4}PROB-NUMBER" /&gt;
 *       &lt;attribute name="stdError" type="{http://www.dmg.org/PMML-4_4}NUMBER" /&gt;
 *       &lt;attribute name="tValue" type="{http://www.dmg.org/PMML-4_4}NUMBER" /&gt;
 *       &lt;attribute name="chiSquareValue" type="{http://www.dmg.org/PMML-4_4}NUMBER" /&gt;
 *       &lt;attribute name="fStatistic" type="{http://www.dmg.org/PMML-4_4}NUMBER" /&gt;
 *       &lt;attribute name="dF" type="{http://www.dmg.org/PMML-4_4}NUMBER" /&gt;
 *       &lt;attribute name="pValueAlpha" type="{http://www.dmg.org/PMML-4_4}PROB-NUMBER" /&gt;
 *       &lt;attribute name="pValueInitial" type="{http://www.dmg.org/PMML-4_4}PROB-NUMBER" /&gt;
 *       &lt;attribute name="pValueFinal" type="{http://www.dmg.org/PMML-4_4}PROB-NUMBER" /&gt;
 *       &lt;attribute name="confidenceLevel" type="{http://www.dmg.org/PMML-4_4}PROB-NUMBER" default="0.95" /&gt;
 *       &lt;attribute name="confidenceLowerBound" type="{http://www.dmg.org/PMML-4_4}NUMBER" /&gt;
 *       &lt;attribute name="confidenceUpperBound" type="{http://www.dmg.org/PMML-4_4}NUMBER" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {"extension"})
@XmlRootElement(name = "MultivariateStat")
public class MultivariateStat
    implements org.treblereel.gwt.xml.mapper.client.tests.pmml.model.api.MultivariateStat {

  @XmlElement(name = "Extension", type = Extension.class)
  protected List<org.treblereel.gwt.xml.mapper.client.tests.pmml.model.api.Extension> extension;

  @XmlAttribute(name = "name")
  protected String name;

  @XmlAttribute(name = "category")
  protected String category;

  @XmlAttribute(name = "exponent")
  protected BigInteger exponent;

  @XmlAttribute(name = "isIntercept")
  protected Boolean isIntercept;

  @XmlAttribute(name = "importance")
  protected Double importance;

  @XmlAttribute(name = "stdError")
  protected Double stdError;

  @XmlAttribute(name = "tValue")
  protected Double tValue;

  @XmlAttribute(name = "chiSquareValue")
  protected Double chiSquareValue;

  @XmlAttribute(name = "fStatistic")
  protected Double fStatistic;

  @XmlAttribute(name = "dF")
  protected Double df;

  @XmlAttribute(name = "pValueAlpha")
  protected Double pValueAlpha;

  @XmlAttribute(name = "pValueInitial")
  protected Double pValueInitial;

  @XmlAttribute(name = "pValueFinal")
  protected Double pValueFinal;

  @XmlAttribute(name = "confidenceLevel")
  protected Double confidenceLevel;

  @XmlAttribute(name = "confidenceLowerBound")
  protected Double confidenceLowerBound;

  @XmlAttribute(name = "confidenceUpperBound")
  protected Double confidenceUpperBound;

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
  public List<org.treblereel.gwt.xml.mapper.client.tests.pmml.model.api.Extension> getExtension() {
    if (extension == null) {
      extension =
          new ArrayList<org.treblereel.gwt.xml.mapper.client.tests.pmml.model.api.Extension>();
    }
    return this.extension;
  }

  /**
   * Gets the value of the name property.
   *
   * @return possible object is {@link String }
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the value of the name property.
   *
   * @param value allowed object is {@link String }
   */
  public void setName(String value) {
    this.name = value;
  }

  /**
   * Gets the value of the category property.
   *
   * @return possible object is {@link String }
   */
  public String getCategory() {
    return category;
  }

  /**
   * Sets the value of the category property.
   *
   * @param value allowed object is {@link String }
   */
  public void setCategory(String value) {
    this.category = value;
  }

  /**
   * Gets the value of the exponent property.
   *
   * @return possible object is {@link BigInteger }
   */
  public BigInteger getExponent() {
    if (exponent == null) {
      return new BigInteger("1");
    } else {
      return exponent;
    }
  }

  /**
   * Sets the value of the exponent property.
   *
   * @param value allowed object is {@link BigInteger }
   */
  public void setExponent(BigInteger value) {
    this.exponent = value;
  }

  /**
   * Gets the value of the isIntercept property.
   *
   * @return possible object is {@link Boolean }
   */
  public boolean isIsIntercept() {
    if (isIntercept == null) {
      return false;
    } else {
      return isIntercept;
    }
  }

  /**
   * Sets the value of the isIntercept property.
   *
   * @param value allowed object is {@link Boolean }
   */
  public void setIsIntercept(Boolean value) {
    this.isIntercept = value;
  }

  /**
   * Gets the value of the importance property.
   *
   * @return possible object is {@link Double }
   */
  public Double getImportance() {
    return importance;
  }

  /**
   * Sets the value of the importance property.
   *
   * @param value allowed object is {@link Double }
   */
  public void setImportance(Double value) {
    this.importance = value;
  }

  /**
   * Gets the value of the stdError property.
   *
   * @return possible object is {@link Double }
   */
  public Double getStdError() {
    return stdError;
  }

  /**
   * Sets the value of the stdError property.
   *
   * @param value allowed object is {@link Double }
   */
  public void setStdError(Double value) {
    this.stdError = value;
  }

  /**
   * Gets the value of the tValue property.
   *
   * @return possible object is {@link Double }
   */
  public Double getTValue() {
    return tValue;
  }

  /**
   * Sets the value of the tValue property.
   *
   * @param value allowed object is {@link Double }
   */
  public void setTValue(Double value) {
    this.tValue = value;
  }

  /**
   * Gets the value of the chiSquareValue property.
   *
   * @return possible object is {@link Double }
   */
  public Double getChiSquareValue() {
    return chiSquareValue;
  }

  /**
   * Sets the value of the chiSquareValue property.
   *
   * @param value allowed object is {@link Double }
   */
  public void setChiSquareValue(Double value) {
    this.chiSquareValue = value;
  }

  /**
   * Gets the value of the fStatistic property.
   *
   * @return possible object is {@link Double }
   */
  public Double getFStatistic() {
    return fStatistic;
  }

  /**
   * Sets the value of the fStatistic property.
   *
   * @param value allowed object is {@link Double }
   */
  public void setFStatistic(Double value) {
    this.fStatistic = value;
  }

  /**
   * Gets the value of the df property.
   *
   * @return possible object is {@link Double }
   */
  public Double getDF() {
    return df;
  }

  /**
   * Sets the value of the df property.
   *
   * @param value allowed object is {@link Double }
   */
  public void setDF(Double value) {
    this.df = value;
  }

  /**
   * Gets the value of the pValueAlpha property.
   *
   * @return possible object is {@link Double }
   */
  public Double getPValueAlpha() {
    return pValueAlpha;
  }

  /**
   * Sets the value of the pValueAlpha property.
   *
   * @param value allowed object is {@link Double }
   */
  public void setPValueAlpha(Double value) {
    this.pValueAlpha = value;
  }

  /**
   * Gets the value of the pValueInitial property.
   *
   * @return possible object is {@link Double }
   */
  public Double getPValueInitial() {
    return pValueInitial;
  }

  /**
   * Sets the value of the pValueInitial property.
   *
   * @param value allowed object is {@link Double }
   */
  public void setPValueInitial(Double value) {
    this.pValueInitial = value;
  }

  /**
   * Gets the value of the pValueFinal property.
   *
   * @return possible object is {@link Double }
   */
  public Double getPValueFinal() {
    return pValueFinal;
  }

  /**
   * Sets the value of the pValueFinal property.
   *
   * @param value allowed object is {@link Double }
   */
  public void setPValueFinal(Double value) {
    this.pValueFinal = value;
  }

  /**
   * Gets the value of the confidenceLevel property.
   *
   * @return possible object is {@link Double }
   */
  public double getConfidenceLevel() {
    if (confidenceLevel == null) {
      return 0.95D;
    } else {
      return confidenceLevel;
    }
  }

  /**
   * Sets the value of the confidenceLevel property.
   *
   * @param value allowed object is {@link Double }
   */
  public void setConfidenceLevel(Double value) {
    this.confidenceLevel = value;
  }

  /**
   * Gets the value of the confidenceLowerBound property.
   *
   * @return possible object is {@link Double }
   */
  public Double getConfidenceLowerBound() {
    return confidenceLowerBound;
  }

  /**
   * Sets the value of the confidenceLowerBound property.
   *
   * @param value allowed object is {@link Double }
   */
  public void setConfidenceLowerBound(Double value) {
    this.confidenceLowerBound = value;
  }

  /**
   * Gets the value of the confidenceUpperBound property.
   *
   * @return possible object is {@link Double }
   */
  public Double getConfidenceUpperBound() {
    return confidenceUpperBound;
  }

  /**
   * Sets the value of the confidenceUpperBound property.
   *
   * @param value allowed object is {@link Double }
   */
  public void setConfidenceUpperBound(Double value) {
    this.confidenceUpperBound = value;
  }
}
