//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.3.0
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2021.08.06 at 04:43:12 PM BST
//

package org.treblereel.gwt.xml.mapper.client.tests.pmml.model.api;

import java.util.List;

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
 *         &lt;group ref="{http://www.dmg.org/PMML-4_4}PREDICATE"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}ScoreDistribution" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="score" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="recordCount" type="{http://www.dmg.org/PMML-4_4}NUMBER" /&gt;
 *       &lt;attribute name="nbCorrect" type="{http://www.dmg.org/PMML-4_4}NUMBER" /&gt;
 *       &lt;attribute name="confidence" type="{http://www.dmg.org/PMML-4_4}NUMBER" default="1" /&gt;
 *       &lt;attribute name="weight" type="{http://www.dmg.org/PMML-4_4}NUMBER" default="1" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public interface SimpleRule {

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
  List<Extension> getExtension();

  /**
   * Gets the value of the predicate property.
   *
   * @return possible object is {@link SimplePredicate } {@link CompoundPredicate } {@link
   *     SimpleSetPredicate } {@link True } {@link False }
   */
  IPredicate getPredicate();

  /**
   * Sets the value of the predicate property.
   *
   * @param value allowed object is {@link SimplePredicate } {@link CompoundPredicate } {@link
   *     SimpleSetPredicate } {@link True } {@link False }
   */
  void setPredicate(IPredicate value);

  /**
   * Gets the value of the scoreDistribution property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the scoreDistribution property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getScoreDistribution().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link ScoreDistribution }
   */
  List<ScoreDistribution> getScoreDistribution();

  /**
   * Gets the value of the id property.
   *
   * @return possible object is {@link String }
   */
  String getId();

  /**
   * Sets the value of the id property.
   *
   * @param value allowed object is {@link String }
   */
  void setId(String value);

  /**
   * Gets the value of the score property.
   *
   * @return possible object is {@link String }
   */
  String getScore();

  /**
   * Sets the value of the score property.
   *
   * @param value allowed object is {@link String }
   */
  void setScore(String value);

  /**
   * Gets the value of the recordCount property.
   *
   * @return possible object is {@link Double }
   */
  Double getRecordCount();

  /**
   * Sets the value of the recordCount property.
   *
   * @param value allowed object is {@link Double }
   */
  void setRecordCount(Double value);

  /**
   * Gets the value of the nbCorrect property.
   *
   * @return possible object is {@link Double }
   */
  Double getNbCorrect();

  /**
   * Sets the value of the nbCorrect property.
   *
   * @param value allowed object is {@link Double }
   */
  void setNbCorrect(Double value);

  /**
   * Gets the value of the confidence property.
   *
   * @return possible object is {@link Double }
   */
  double getConfidence();

  /**
   * Sets the value of the confidence property.
   *
   * @param value allowed object is {@link Double }
   */
  void setConfidence(Double value);

  /**
   * Gets the value of the weight property.
   *
   * @return possible object is {@link Double }
   */
  double getWeight();

  /**
   * Sets the value of the weight property.
   *
   * @param value allowed object is {@link Double }
   */
  void setWeight(Double value);
}
