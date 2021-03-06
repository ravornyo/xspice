/**
 * generated by Xtext 2.18.0.M3
 */
package com.xtext.ravornyo.xspice.xSpice;

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VCCS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.VCCS#getTransconductance <em>Transconductance</em>}</li>
 * </ul>
 *
 * @see com.xtext.ravornyo.xspice.xSpice.XSpicePackage#getVCCS()
 * @model
 * @generated
 */
public interface VCCS extends Component
{
  /**
   * Returns the value of the '<em><b>Transconductance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transconductance</em>' attribute.
   * @see #setTransconductance(BigDecimal)
   * @see com.xtext.ravornyo.xspice.xSpice.XSpicePackage#getVCCS_Transconductance()
   * @model
   * @generated
   */
  BigDecimal getTransconductance();

  /**
   * Sets the value of the '{@link com.xtext.ravornyo.xspice.xSpice.VCCS#getTransconductance <em>Transconductance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Transconductance</em>' attribute.
   * @see #getTransconductance()
   * @generated
   */
  void setTransconductance(BigDecimal value);

} // VCCS
