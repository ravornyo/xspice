/**
 * generated by Xtext 2.18.0.M3
 */
package com.xtext.ravornyo.xspice.xSpice.impl;

import com.xtext.ravornyo.xspice.xSpice.DecadeSweep;
import com.xtext.ravornyo.xspice.xSpice.XSpicePackage;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decade Sweep</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.impl.DecadeSweepImpl#getPointsPerDecade <em>Points Per Decade</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DecadeSweepImpl extends GeometericSweepImpl implements DecadeSweep
{
  /**
   * The default value of the '{@link #getPointsPerDecade() <em>Points Per Decade</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPointsPerDecade()
   * @generated
   * @ordered
   */
  protected static final BigDecimal POINTS_PER_DECADE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPointsPerDecade() <em>Points Per Decade</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPointsPerDecade()
   * @generated
   * @ordered
   */
  protected BigDecimal pointsPerDecade = POINTS_PER_DECADE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DecadeSweepImpl()
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
    return XSpicePackage.Literals.DECADE_SWEEP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BigDecimal getPointsPerDecade()
  {
    return pointsPerDecade;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPointsPerDecade(BigDecimal newPointsPerDecade)
  {
    BigDecimal oldPointsPerDecade = pointsPerDecade;
    pointsPerDecade = newPointsPerDecade;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XSpicePackage.DECADE_SWEEP__POINTS_PER_DECADE, oldPointsPerDecade, pointsPerDecade));
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
      case XSpicePackage.DECADE_SWEEP__POINTS_PER_DECADE:
        return getPointsPerDecade();
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
      case XSpicePackage.DECADE_SWEEP__POINTS_PER_DECADE:
        setPointsPerDecade((BigDecimal)newValue);
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
      case XSpicePackage.DECADE_SWEEP__POINTS_PER_DECADE:
        setPointsPerDecade(POINTS_PER_DECADE_EDEFAULT);
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
      case XSpicePackage.DECADE_SWEEP__POINTS_PER_DECADE:
        return POINTS_PER_DECADE_EDEFAULT == null ? pointsPerDecade != null : !POINTS_PER_DECADE_EDEFAULT.equals(pointsPerDecade);
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
    result.append(" (pointsPerDecade: ");
    result.append(pointsPerDecade);
    result.append(')');
    return result.toString();
  }

} //DecadeSweepImpl