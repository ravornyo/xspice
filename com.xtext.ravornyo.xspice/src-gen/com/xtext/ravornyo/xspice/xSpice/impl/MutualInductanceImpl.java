/**
 * generated by Xtext 2.18.0.M3
 */
package com.xtext.ravornyo.xspice.xSpice.impl;

import com.xtext.ravornyo.xspice.xSpice.MutualInductance;
import com.xtext.ravornyo.xspice.xSpice.XSpicePackage;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mutual Inductance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.impl.MutualInductanceImpl#getInductor1 <em>Inductor1</em>}</li>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.impl.MutualInductanceImpl#getInductor2 <em>Inductor2</em>}</li>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.impl.MutualInductanceImpl#getCoupling <em>Coupling</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MutualInductanceImpl extends EntityImpl implements MutualInductance
{
  /**
   * The default value of the '{@link #getInductor1() <em>Inductor1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInductor1()
   * @generated
   * @ordered
   */
  protected static final String INDUCTOR1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInductor1() <em>Inductor1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInductor1()
   * @generated
   * @ordered
   */
  protected String inductor1 = INDUCTOR1_EDEFAULT;

  /**
   * The default value of the '{@link #getInductor2() <em>Inductor2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInductor2()
   * @generated
   * @ordered
   */
  protected static final String INDUCTOR2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInductor2() <em>Inductor2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInductor2()
   * @generated
   * @ordered
   */
  protected String inductor2 = INDUCTOR2_EDEFAULT;

  /**
   * The default value of the '{@link #getCoupling() <em>Coupling</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCoupling()
   * @generated
   * @ordered
   */
  protected static final BigDecimal COUPLING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCoupling() <em>Coupling</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCoupling()
   * @generated
   * @ordered
   */
  protected BigDecimal coupling = COUPLING_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MutualInductanceImpl()
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
    return XSpicePackage.Literals.MUTUAL_INDUCTANCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getInductor1()
  {
    return inductor1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setInductor1(String newInductor1)
  {
    String oldInductor1 = inductor1;
    inductor1 = newInductor1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XSpicePackage.MUTUAL_INDUCTANCE__INDUCTOR1, oldInductor1, inductor1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getInductor2()
  {
    return inductor2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setInductor2(String newInductor2)
  {
    String oldInductor2 = inductor2;
    inductor2 = newInductor2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XSpicePackage.MUTUAL_INDUCTANCE__INDUCTOR2, oldInductor2, inductor2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BigDecimal getCoupling()
  {
    return coupling;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCoupling(BigDecimal newCoupling)
  {
    BigDecimal oldCoupling = coupling;
    coupling = newCoupling;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XSpicePackage.MUTUAL_INDUCTANCE__COUPLING, oldCoupling, coupling));
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
      case XSpicePackage.MUTUAL_INDUCTANCE__INDUCTOR1:
        return getInductor1();
      case XSpicePackage.MUTUAL_INDUCTANCE__INDUCTOR2:
        return getInductor2();
      case XSpicePackage.MUTUAL_INDUCTANCE__COUPLING:
        return getCoupling();
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
      case XSpicePackage.MUTUAL_INDUCTANCE__INDUCTOR1:
        setInductor1((String)newValue);
        return;
      case XSpicePackage.MUTUAL_INDUCTANCE__INDUCTOR2:
        setInductor2((String)newValue);
        return;
      case XSpicePackage.MUTUAL_INDUCTANCE__COUPLING:
        setCoupling((BigDecimal)newValue);
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
      case XSpicePackage.MUTUAL_INDUCTANCE__INDUCTOR1:
        setInductor1(INDUCTOR1_EDEFAULT);
        return;
      case XSpicePackage.MUTUAL_INDUCTANCE__INDUCTOR2:
        setInductor2(INDUCTOR2_EDEFAULT);
        return;
      case XSpicePackage.MUTUAL_INDUCTANCE__COUPLING:
        setCoupling(COUPLING_EDEFAULT);
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
      case XSpicePackage.MUTUAL_INDUCTANCE__INDUCTOR1:
        return INDUCTOR1_EDEFAULT == null ? inductor1 != null : !INDUCTOR1_EDEFAULT.equals(inductor1);
      case XSpicePackage.MUTUAL_INDUCTANCE__INDUCTOR2:
        return INDUCTOR2_EDEFAULT == null ? inductor2 != null : !INDUCTOR2_EDEFAULT.equals(inductor2);
      case XSpicePackage.MUTUAL_INDUCTANCE__COUPLING:
        return COUPLING_EDEFAULT == null ? coupling != null : !COUPLING_EDEFAULT.equals(coupling);
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
    result.append(" (inductor1: ");
    result.append(inductor1);
    result.append(", inductor2: ");
    result.append(inductor2);
    result.append(", coupling: ");
    result.append(coupling);
    result.append(')');
    return result.toString();
  }

} //MutualInductanceImpl
