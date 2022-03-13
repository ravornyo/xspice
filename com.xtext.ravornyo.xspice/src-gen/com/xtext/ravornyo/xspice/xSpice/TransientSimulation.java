/**
 * generated by Xtext 2.18.0.M3
 */
package com.xtext.ravornyo.xspice.xSpice;

import java.math.BigDecimal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transient Simulation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.TransientSimulation#getArgs <em>Args</em>}</li>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.TransientSimulation#isUic <em>Uic</em>}</li>
 * </ul>
 *
 * @see com.xtext.ravornyo.xspice.xSpice.XSpicePackage#getTransientSimulation()
 * @model
 * @generated
 */
public interface TransientSimulation extends Simulation
{
  /**
   * Returns the value of the '<em><b>Args</b></em>' attribute list.
   * The list contents are of type {@link java.math.BigDecimal}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' attribute list.
   * @see com.xtext.ravornyo.xspice.xSpice.XSpicePackage#getTransientSimulation_Args()
   * @model unique="false"
   * @generated
   */
  EList<BigDecimal> getArgs();

  /**
   * Returns the value of the '<em><b>Uic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uic</em>' attribute.
   * @see #setUic(boolean)
   * @see com.xtext.ravornyo.xspice.xSpice.XSpicePackage#getTransientSimulation_Uic()
   * @model
   * @generated
   */
  boolean isUic();

  /**
   * Sets the value of the '{@link com.xtext.ravornyo.xspice.xSpice.TransientSimulation#isUic <em>Uic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uic</em>' attribute.
   * @see #isUic()
   * @generated
   */
  void setUic(boolean value);

} // TransientSimulation
