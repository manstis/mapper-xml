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
 *         &lt;group ref="{http://www.dmg.org/PMML-4_4}MODEL-ELEMENT"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}VariableWeight" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="weight" type="{http://www.dmg.org/PMML-4_4}NUMBER" default="1" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public interface Segment {

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
   * Gets the value of the model property.
   *
   * @return possible object is {@link AnomalyDetectionModel } {@link AssociationModel } {@link
   *     BayesianNetworkModel } {@link BaselineModel } {@link ClusteringModel } {@link
   *     GaussianProcessModel } {@link GeneralRegressionModel } {@link MiningModel } {@link
   *     NaiveBayesModel } {@link NearestNeighborModel } {@link NeuralNetwork } {@link
   *     RegressionModel } {@link RuleSetModel } {@link SequenceModel } {@link Scorecard } {@link
   *     SupportVectorMachineModel } {@link TextModel } {@link TimeSeriesModel } {@link TreeModel }
   */
  IModel getModel();

  /**
   * Sets the value of the model property.
   *
   * @param value allowed object is {@link AnomalyDetectionModel } {@link AssociationModel } {@link
   *     BayesianNetworkModel } {@link BaselineModel } {@link ClusteringModel } {@link
   *     GaussianProcessModel } {@link GeneralRegressionModel } {@link MiningModel } {@link
   *     NaiveBayesModel } {@link NearestNeighborModel } {@link NeuralNetwork } {@link
   *     RegressionModel } {@link RuleSetModel } {@link SequenceModel } {@link Scorecard } {@link
   *     SupportVectorMachineModel } {@link TextModel } {@link TimeSeriesModel } {@link TreeModel }
   */
  void setModel(IModel value);

  /**
   * Gets the value of the variableWeight property.
   *
   * @return possible object is {@link VariableWeight }
   */
  VariableWeight getVariableWeight();

  /**
   * Sets the value of the variableWeight property.
   *
   * @param value allowed object is {@link VariableWeight }
   */
  void setVariableWeight(VariableWeight value);

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
