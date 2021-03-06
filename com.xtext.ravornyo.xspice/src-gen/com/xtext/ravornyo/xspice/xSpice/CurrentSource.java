/**
 * generated by Xtext 2.18.0.M3
 */
package com.xtext.ravornyo.xspice.xSpice;

import java.math.BigDecimal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Current Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.CurrentSource#getDc <em>Dc</em>}</li>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.CurrentSource#getAc <em>Ac</em>}</li>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.CurrentSource#getWaveform <em>Waveform</em>}</li>
 * </ul>
 *
 * @see com.xtext.ravornyo.xspice.xSpice.XSpicePackage#getCurrentSource()
 * @model
 * @generated
 */
public interface CurrentSource extends Component
{
  /**
   * Returns the value of the '<em><b>Dc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dc</em>' attribute.
   * @see #setDc(BigDecimal)
   * @see com.xtext.ravornyo.xspice.xSpice.XSpicePackage#getCurrentSource_Dc()
   * @model
   * @generated
   */
  BigDecimal getDc();

  /**
   * Sets the value of the '{@link com.xtext.ravornyo.xspice.xSpice.CurrentSource#getDc <em>Dc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dc</em>' attribute.
   * @see #getDc()
   * @generated
   */
  void setDc(BigDecimal value);

  /**
   * Returns the value of the '<em><b>Ac</b></em>' attribute list.
   * The list contents are of type {@link java.math.BigDecimal}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ac</em>' attribute list.
   * @see com.xtext.ravornyo.xspice.xSpice.XSpicePackage#getCurrentSource_Ac()
   * @model unique="false"
   * @generated
   */
  EList<BigDecimal> getAc();

  /**
   * Returns the value of the '<em><b>Waveform</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Waveform</em>' containment reference.
   * @see #setWaveform(Waveform)
   * @see com.xtext.ravornyo.xspice.xSpice.XSpicePackage#getCurrentSource_Waveform()
   * @model containment="true"
   * @generated
   */
  Waveform getWaveform();

  /**
   * Sets the value of the '{@link com.xtext.ravornyo.xspice.xSpice.CurrentSource#getWaveform <em>Waveform</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Waveform</em>' containment reference.
   * @see #getWaveform()
   * @generated
   */
  void setWaveform(Waveform value);

} // CurrentSource
