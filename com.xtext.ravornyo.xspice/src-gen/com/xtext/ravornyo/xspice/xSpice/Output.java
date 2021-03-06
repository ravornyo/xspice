/**
 * generated by Xtext 2.18.0.M3
 */
package com.xtext.ravornyo.xspice.xSpice;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.Output#getPrtype <em>Prtype</em>}</li>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.Output#getExports <em>Exports</em>}</li>
 * </ul>
 *
 * @see com.xtext.ravornyo.xspice.xSpice.XSpicePackage#getOutput()
 * @model
 * @generated
 */
public interface Output extends EObject
{
  /**
   * Returns the value of the '<em><b>Prtype</b></em>' attribute.
   * The literals are from the enumeration {@link com.xtext.ravornyo.xspice.xSpice.PRTYPE}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prtype</em>' attribute.
   * @see com.xtext.ravornyo.xspice.xSpice.PRTYPE
   * @see #setPrtype(PRTYPE)
   * @see com.xtext.ravornyo.xspice.xSpice.XSpicePackage#getOutput_Prtype()
   * @model
   * @generated
   */
  PRTYPE getPrtype();

  /**
   * Sets the value of the '{@link com.xtext.ravornyo.xspice.xSpice.Output#getPrtype <em>Prtype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prtype</em>' attribute.
   * @see com.xtext.ravornyo.xspice.xSpice.PRTYPE
   * @see #getPrtype()
   * @generated
   */
  void setPrtype(PRTYPE value);

  /**
   * Returns the value of the '<em><b>Exports</b></em>' containment reference list.
   * The list contents are of type {@link com.xtext.ravornyo.xspice.xSpice.Export}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exports</em>' containment reference list.
   * @see com.xtext.ravornyo.xspice.xSpice.XSpicePackage#getOutput_Exports()
   * @model containment="true"
   * @generated
   */
  EList<Export> getExports();

} // Output
