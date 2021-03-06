/**
 * generated by Xtext 2.18.0.M3
 */
package com.xtext.ravornyo.xspice.xSpice.impl;

import com.xtext.ravornyo.xspice.xSpice.VCCS;
import com.xtext.ravornyo.xspice.xSpice.XSpicePackage;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VCCS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.impl.VCCSImpl#getTransconductance <em>Transconductance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VCCSImpl extends ComponentImpl implements VCCS
{
  /**
   * The default value of the '{@link #getTransconductance() <em>Transconductance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransconductance()
   * @generated
   * @ordered
   */
  protected static final BigDecimal TRANSCONDUCTANCE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTransconductance() <em>Transconductance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransconductance()
   * @generated
   * @ordered
   */
  protected BigDecimal transconductance = TRANSCONDUCTANCE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VCCSImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return XSpicePackage.Literals.VCCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BigDecimal getTransconductance()
  {
    return transconductance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTransconductance(BigDecimal newTransconductance)
  {
    BigDecimal oldTransconductance = transconductance;
    transconductance = newTransconductance;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XSpicePackage.VCCS__TRANSCONDUCTANCE, oldTransconductance, transconductance));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case XSpicePackage.VCCS__TRANSCONDUCTANCE:
        return getTransconductance();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case XSpicePackage.VCCS__TRANSCONDUCTANCE:
        setTransconductance((BigDecimal)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case XSpicePackage.VCCS__TRANSCONDUCTANCE:
        setTransconductance(TRANSCONDUCTANCE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case XSpicePackage.VCCS__TRANSCONDUCTANCE:
        return TRANSCONDUCTANCE_EDEFAULT == null ? transconductance != null : !TRANSCONDUCTANCE_EDEFAULT.equals(transconductance);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (transconductance: ");
    result.append(transconductance);
    result.append(')');
    return result.toString();
  }

} //VCCSImpl
