/**
 * generated by Xtext 2.18.0.M3
 */
package com.xtext.ravornyo.xspice.xSpice.impl;

import com.xtext.ravornyo.xspice.xSpice.OctaveSweep;
import com.xtext.ravornyo.xspice.xSpice.XSpicePackage;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Octave Sweep</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.impl.OctaveSweepImpl#getPointsPerOctave <em>Points Per Octave</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OctaveSweepImpl extends GeometericSweepImpl implements OctaveSweep
{
  /**
   * The default value of the '{@link #getPointsPerOctave() <em>Points Per Octave</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPointsPerOctave()
   * @generated
   * @ordered
   */
  protected static final BigDecimal POINTS_PER_OCTAVE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPointsPerOctave() <em>Points Per Octave</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPointsPerOctave()
   * @generated
   * @ordered
   */
  protected BigDecimal pointsPerOctave = POINTS_PER_OCTAVE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OctaveSweepImpl()
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
    return XSpicePackage.Literals.OCTAVE_SWEEP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BigDecimal getPointsPerOctave()
  {
    return pointsPerOctave;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPointsPerOctave(BigDecimal newPointsPerOctave)
  {
    BigDecimal oldPointsPerOctave = pointsPerOctave;
    pointsPerOctave = newPointsPerOctave;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XSpicePackage.OCTAVE_SWEEP__POINTS_PER_OCTAVE, oldPointsPerOctave, pointsPerOctave));
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
      case XSpicePackage.OCTAVE_SWEEP__POINTS_PER_OCTAVE:
        return getPointsPerOctave();
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
      case XSpicePackage.OCTAVE_SWEEP__POINTS_PER_OCTAVE:
        setPointsPerOctave((BigDecimal)newValue);
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
      case XSpicePackage.OCTAVE_SWEEP__POINTS_PER_OCTAVE:
        setPointsPerOctave(POINTS_PER_OCTAVE_EDEFAULT);
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
      case XSpicePackage.OCTAVE_SWEEP__POINTS_PER_OCTAVE:
        return POINTS_PER_OCTAVE_EDEFAULT == null ? pointsPerOctave != null : !POINTS_PER_OCTAVE_EDEFAULT.equals(pointsPerOctave);
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
    result.append(" (pointsPerOctave: ");
    result.append(pointsPerOctave);
    result.append(')');
    return result.toString();
  }

} //OctaveSweepImpl