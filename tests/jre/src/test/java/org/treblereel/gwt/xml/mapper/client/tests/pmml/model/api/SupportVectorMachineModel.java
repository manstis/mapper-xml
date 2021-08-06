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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}MiningSchema"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}Output" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}ModelStats" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}ModelExplanation" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}Targets" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}LocalTransformations" minOccurs="0"/&gt;
 *         &lt;sequence&gt;
 *           &lt;choice&gt;
 *             &lt;element ref="{http://www.dmg.org/PMML-4_4}LinearKernelType"/&gt;
 *             &lt;element ref="{http://www.dmg.org/PMML-4_4}PolynomialKernelType"/&gt;
 *             &lt;element ref="{http://www.dmg.org/PMML-4_4}RadialBasisKernelType"/&gt;
 *             &lt;element ref="{http://www.dmg.org/PMML-4_4}SigmoidKernelType"/&gt;
 *           &lt;/choice&gt;
 *         &lt;/sequence&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}VectorDictionary"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}SupportVectorMachine" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{http://www.dmg.org/PMML-4_4}ModelVerification" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="modelName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="functionName" use="required" type="{http://www.dmg.org/PMML-4_4}MINING-FUNCTION" /&gt;
 *       &lt;attribute name="algorithmName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="threshold" type="{http://www.dmg.org/PMML-4_4}REAL-NUMBER" default="0" /&gt;
 *       &lt;attribute name="svmRepresentation" type="{http://www.dmg.org/PMML-4_4}SVM-REPRESENTATION" default="SupportVectors" /&gt;
 *       &lt;attribute name="classificationMethod" type="{http://www.dmg.org/PMML-4_4}SVM-CLASSIFICATION-METHOD" default="OneAgainstAll" /&gt;
 *       &lt;attribute name="maxWins" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="isScorable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public interface SupportVectorMachineModel {

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
   * Gets the value of the miningSchema property.
   *
   * @return possible object is {@link MiningSchema }
   */
  MiningSchema getMiningSchema();

  /**
   * Sets the value of the miningSchema property.
   *
   * @param value allowed object is {@link MiningSchema }
   */
  void setMiningSchema(MiningSchema value);

  /**
   * Gets the value of the output property.
   *
   * @return possible object is {@link Output }
   */
  Output getOutput();

  /**
   * Sets the value of the output property.
   *
   * @param value allowed object is {@link Output }
   */
  void setOutput(Output value);

  /**
   * Gets the value of the modelStats property.
   *
   * @return possible object is {@link ModelStats }
   */
  ModelStats getModelStats();

  /**
   * Sets the value of the modelStats property.
   *
   * @param value allowed object is {@link ModelStats }
   */
  void setModelStats(ModelStats value);

  /**
   * Gets the value of the modelExplanation property.
   *
   * @return possible object is {@link ModelExplanation }
   */
  ModelExplanation getModelExplanation();

  /**
   * Sets the value of the modelExplanation property.
   *
   * @param value allowed object is {@link ModelExplanation }
   */
  void setModelExplanation(ModelExplanation value);

  /**
   * Gets the value of the targets property.
   *
   * @return possible object is {@link Targets }
   */
  Targets getTargets();

  /**
   * Sets the value of the targets property.
   *
   * @param value allowed object is {@link Targets }
   */
  void setTargets(Targets value);

  /**
   * Gets the value of the localTransformations property.
   *
   * @return possible object is {@link LocalTransformations }
   */
  LocalTransformations getLocalTransformations();

  /**
   * Sets the value of the localTransformations property.
   *
   * @param value allowed object is {@link LocalTransformations }
   */
  void setLocalTransformations(LocalTransformations value);

  /**
   * Gets the value of the supportVectorMachineModel property.
   *
   * @return possible object is {@link LinearKernelType } {@link PolynomialKernelType } {@link
   *     RadialBasisKernelType } {@link SigmoidKernelType }
   */
  ISupportVectorMachineModel getSupportVectorMachineModel();

  /**
   * Sets the value of the supportVectorMachineModel property.
   *
   * @param value allowed object is {@link LinearKernelType } {@link PolynomialKernelType } {@link
   *     RadialBasisKernelType } {@link SigmoidKernelType }
   */
  void setSupportVectorMachineModel(ISupportVectorMachineModel value);

  /**
   * Gets the value of the vectorDictionary property.
   *
   * @return possible object is {@link VectorDictionary }
   */
  VectorDictionary getVectorDictionary();

  /**
   * Sets the value of the vectorDictionary property.
   *
   * @param value allowed object is {@link VectorDictionary }
   */
  void setVectorDictionary(VectorDictionary value);

  /**
   * Gets the value of the supportVectorMachine property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the supportVectorMachine property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getSupportVectorMachine().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link SupportVectorMachine }
   */
  List<SupportVectorMachine> getSupportVectorMachine();

  /**
   * Gets the value of the modelVerification property.
   *
   * @return possible object is {@link ModelVerification }
   */
  ModelVerification getModelVerification();

  /**
   * Sets the value of the modelVerification property.
   *
   * @param value allowed object is {@link ModelVerification }
   */
  void setModelVerification(ModelVerification value);

  /**
   * Gets the value of the modelName property.
   *
   * @return possible object is {@link String }
   */
  String getModelName();

  /**
   * Sets the value of the modelName property.
   *
   * @param value allowed object is {@link String }
   */
  void setModelName(String value);

  /**
   * Gets the value of the functionName property.
   *
   * @return possible object is {@link MININGFUNCTION }
   */
  MININGFUNCTION getFunctionName();

  /**
   * Sets the value of the functionName property.
   *
   * @param value allowed object is {@link MININGFUNCTION }
   */
  void setFunctionName(MININGFUNCTION value);

  /**
   * Gets the value of the algorithmName property.
   *
   * @return possible object is {@link String }
   */
  String getAlgorithmName();

  /**
   * Sets the value of the algorithmName property.
   *
   * @param value allowed object is {@link String }
   */
  void setAlgorithmName(String value);

  /**
   * Gets the value of the threshold property.
   *
   * @return possible object is {@link Double }
   */
  double getThreshold();

  /**
   * Sets the value of the threshold property.
   *
   * @param value allowed object is {@link Double }
   */
  void setThreshold(Double value);

  /**
   * Gets the value of the svmRepresentation property.
   *
   * @return possible object is {@link SVMREPRESENTATION }
   */
  SVMREPRESENTATION getSvmRepresentation();

  /**
   * Sets the value of the svmRepresentation property.
   *
   * @param value allowed object is {@link SVMREPRESENTATION }
   */
  void setSvmRepresentation(SVMREPRESENTATION value);

  /**
   * Gets the value of the classificationMethod property.
   *
   * @return possible object is {@link SVMCLASSIFICATIONMETHOD }
   */
  SVMCLASSIFICATIONMETHOD getClassificationMethod();

  /**
   * Sets the value of the classificationMethod property.
   *
   * @param value allowed object is {@link SVMCLASSIFICATIONMETHOD }
   */
  void setClassificationMethod(SVMCLASSIFICATIONMETHOD value);

  /**
   * Gets the value of the maxWins property.
   *
   * @return possible object is {@link Boolean }
   */
  boolean isMaxWins();

  /**
   * Sets the value of the maxWins property.
   *
   * @param value allowed object is {@link Boolean }
   */
  void setMaxWins(Boolean value);

  /**
   * Gets the value of the isScorable property.
   *
   * @return possible object is {@link Boolean }
   */
  boolean isIsScorable();

  /**
   * Sets the value of the isScorable property.
   *
   * @param value allowed object is {@link Boolean }
   */
  void setIsScorable(Boolean value);
}
