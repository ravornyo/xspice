/**
 * generated by Xtext 2.18.0.M3
 */
package com.xtext.ravornyo.xspice.xSpice;

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capacitor Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.CapacitorModel#getJunctionCap <em>Junction Cap</em>}</li>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.CapacitorModel#getJunctionCapSidewall <em>Junction Cap Sidewall</em>}</li>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.CapacitorModel#getDefaultWidth <em>Default Width</em>}</li>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.CapacitorModel#getNarrow <em>Narrow</em>}</li>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.CapacitorModel#getTemperatureCoefficient1 <em>Temperature Coefficient1</em>}</li>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.CapacitorModel#getTemperatureCoefficient2 <em>Temperature Coefficient2</em>}</li>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.CapacitorModel#getNominalTemperature <em>Nominal Temperature</em>}</li>
 * </ul>
 *
 * @see com.xtext.ravornyo.xspice.xSpice.XSpicePackage#getCapacitorModel()
 * @model
 * @generated
 */
public interface CapacitorModel extends Entity
{
  /**
   * Returns the value of the '<em><b>Junction Cap</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Junction Cap</em>' attribute.
   * @see #setJunctionCap(BigDecimal)
   * @see com.xtext.ravornyo.xspice.xSpice.XSpicePackage#getCapacitorModel_JunctionCap()
   * @model
   * @generated
   */
  BigDecimal getJunctionCap();

  /**
   * Sets the value of the '{@link com.xtext.ravornyo.xspice.xSpice.CapacitorModel#getJunctionCap <em>Junction Cap</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Junction Cap</em>' attribute.
   * @see #getJunctionCap()
   * @generated
   */
  void setJunctionCap(BigDecimal value);

  /**
   * Returns the value of the '<em><b>Junction Cap Sidewall</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Junction Cap Sidewall</em>' attribute.
   * @see #setJunctionCapSidewall(BigDecimal)
   * @see com.xtext.ravornyo.xspice.xSpice.XSpicePackage#getCapacitorModel_JunctionCapSidewall()
   * @model
   * @generated
   */
  BigDecimal getJunctionCapSidewall();

  /**
   * Sets the value of the '{@link com.xtext.ravornyo.xspice.xSpice.CapacitorModel#getJunctionCapSidewall <em>Junction Cap Sidewall</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Junction Cap Sidewall</em>' attribute.
   * @see #getJunctionCapSidewall()
   * @generated
   */
  void setJunctionCapSidewall(BigDecimal value);

  /**
   * Returns the value of the '<em><b>Default Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Width</em>' attribute.
   * @see #setDefaultWidth(BigDecimal)
   * @see com.xtext.ravornyo.xspice.xSpice.XSpicePackage#getCapacitorModel_DefaultWidth()
   * @model
   * @generated
   */
  BigDecimal getDefaultWidth();

  /**
   * Sets the value of the '{@link com.xtext.ravornyo.xspice.xSpice.CapacitorModel#getDefaultWidth <em>Default Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Width</em>' attribute.
   * @see #getDefaultWidth()
   * @generated
   */
  void setDefaultWidth(BigDecimal value);

  /**
   * Returns the value of the '<em><b>Narrow</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Narrow</em>' attribute.
   * @see #setNarrow(BigDecimal)
   * @see com.xtext.ravornyo.xspice.xSpice.XSpicePackage#getCapacitorModel_Narrow()
   * @model
   * @generated
   */
  BigDecimal getNarrow();

  /**
   * Sets the value of the '{@link com.xtext.ravornyo.xspice.xSpice.CapacitorModel#getNarrow <em>Narrow</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Narrow</em>' attribute.
   * @see #getNarrow()
   * @generated
   */
  void setNarrow(BigDecimal value);

  /**
   * Returns the value of the '<em><b>Temperature Coefficient1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Temperature Coefficient1</em>' attribute.
   * @see #setTemperatureCoefficient1(BigDecimal)
   * @see com.xtext.ravornyo.xspice.xSpice.XSpicePackage#getCapacitorModel_TemperatureCoefficient1()
   * @model
   * @generated
   */
  BigDecimal getTemperatureCoefficient1();

  /**
   * Sets the value of the '{@link com.xtext.ravornyo.xspice.xSpice.CapacitorModel#getTemperatureCoefficient1 <em>Temperature Coefficient1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Temperature Coefficient1</em>' attribute.
   * @see #getTemperatureCoefficient1()
   * @generated
   */
  void setTemperatureCoefficient1(BigDecimal value);

  /**
   * Returns the value of the '<em><b>Temperature Coefficient2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Temperature Coefficient2</em>' attribute.
   * @see #setTemperatureCoefficient2(BigDecimal)
   * @see com.xtext.ravornyo.xspice.xSpice.XSpicePackage#getCapacitorModel_TemperatureCoefficient2()
   * @model
   * @generated
   */
  BigDecimal getTemperatureCoefficient2();

  /**
   * Sets the value of the '{@link com.xtext.ravornyo.xspice.xSpice.CapacitorModel#getTemperatureCoefficient2 <em>Temperature Coefficient2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Temperature Coefficient2</em>' attribute.
   * @see #getTemperatureCoefficient2()
   * @generated
   */
  void setTemperatureCoefficient2(BigDecimal value);

  /**
   * Returns the value of the '<em><b>Nominal Temperature</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nominal Temperature</em>' attribute.
   * @see #setNominalTemperature(BigDecimal)
   * @see com.xtext.ravornyo.xspice.xSpice.XSpicePackage#getCapacitorModel_NominalTemperature()
   * @model
   * @generated
   */
  BigDecimal getNominalTemperature();

  /**
   * Sets the value of the '{@link com.xtext.ravornyo.xspice.xSpice.CapacitorModel#getNominalTemperature <em>Nominal Temperature</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nominal Temperature</em>' attribute.
   * @see #getNominalTemperature()
   * @generated
   */
  void setNominalTemperature(BigDecimal value);

} // CapacitorModel
