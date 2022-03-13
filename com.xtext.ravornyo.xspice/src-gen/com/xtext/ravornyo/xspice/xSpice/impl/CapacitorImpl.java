/**
 * generated by Xtext 2.18.0.M3
 */
package com.xtext.ravornyo.xspice.xSpice.impl;

import com.xtext.ravornyo.xspice.xSpice.Capacitor;
import com.xtext.ravornyo.xspice.xSpice.XSpicePackage;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capacitor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.impl.CapacitorImpl#getCapacitance <em>Capacitance</em>}</li>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.impl.CapacitorImpl#getModel <em>Model</em>}</li>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.impl.CapacitorImpl#getLength <em>Length</em>}</li>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.impl.CapacitorImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.impl.CapacitorImpl#getInitialCondition <em>Initial Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapacitorImpl extends ComponentImpl implements Capacitor
{
  /**
   * The default value of the '{@link #getCapacitance() <em>Capacitance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCapacitance()
   * @generated
   * @ordered
   */
  protected static final BigDecimal CAPACITANCE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCapacitance() <em>Capacitance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCapacitance()
   * @generated
   * @ordered
   */
  protected BigDecimal capacitance = CAPACITANCE_EDEFAULT;

  /**
   * The default value of the '{@link #getModel() <em>Model</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModel()
   * @generated
   * @ordered
   */
  protected static final String MODEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getModel() <em>Model</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModel()
   * @generated
   * @ordered
   */
  protected String model = MODEL_EDEFAULT;

  /**
   * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLength()
   * @generated
   * @ordered
   */
  protected static final BigDecimal LENGTH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLength()
   * @generated
   * @ordered
   */
  protected BigDecimal length = LENGTH_EDEFAULT;

  /**
   * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWidth()
   * @generated
   * @ordered
   */
  protected static final BigDecimal WIDTH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWidth()
   * @generated
   * @ordered
   */
  protected BigDecimal width = WIDTH_EDEFAULT;

  /**
   * The default value of the '{@link #getInitialCondition() <em>Initial Condition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitialCondition()
   * @generated
   * @ordered
   */
  protected static final BigDecimal INITIAL_CONDITION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInitialCondition() <em>Initial Condition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitialCondition()
   * @generated
   * @ordered
   */
  protected BigDecimal initialCondition = INITIAL_CONDITION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CapacitorImpl()
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
    return XSpicePackage.Literals.CAPACITOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BigDecimal getCapacitance()
  {
    return capacitance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCapacitance(BigDecimal newCapacitance)
  {
    BigDecimal oldCapacitance = capacitance;
    capacitance = newCapacitance;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XSpicePackage.CAPACITOR__CAPACITANCE, oldCapacitance, capacitance));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getModel()
  {
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setModel(String newModel)
  {
    String oldModel = model;
    model = newModel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XSpicePackage.CAPACITOR__MODEL, oldModel, model));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BigDecimal getLength()
  {
    return length;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLength(BigDecimal newLength)
  {
    BigDecimal oldLength = length;
    length = newLength;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XSpicePackage.CAPACITOR__LENGTH, oldLength, length));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BigDecimal getWidth()
  {
    return width;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setWidth(BigDecimal newWidth)
  {
    BigDecimal oldWidth = width;
    width = newWidth;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XSpicePackage.CAPACITOR__WIDTH, oldWidth, width));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BigDecimal getInitialCondition()
  {
    return initialCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setInitialCondition(BigDecimal newInitialCondition)
  {
    BigDecimal oldInitialCondition = initialCondition;
    initialCondition = newInitialCondition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XSpicePackage.CAPACITOR__INITIAL_CONDITION, oldInitialCondition, initialCondition));
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
      case XSpicePackage.CAPACITOR__CAPACITANCE:
        return getCapacitance();
      case XSpicePackage.CAPACITOR__MODEL:
        return getModel();
      case XSpicePackage.CAPACITOR__LENGTH:
        return getLength();
      case XSpicePackage.CAPACITOR__WIDTH:
        return getWidth();
      case XSpicePackage.CAPACITOR__INITIAL_CONDITION:
        return getInitialCondition();
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
      case XSpicePackage.CAPACITOR__CAPACITANCE:
        setCapacitance((BigDecimal)newValue);
        return;
      case XSpicePackage.CAPACITOR__MODEL:
        setModel((String)newValue);
        return;
      case XSpicePackage.CAPACITOR__LENGTH:
        setLength((BigDecimal)newValue);
        return;
      case XSpicePackage.CAPACITOR__WIDTH:
        setWidth((BigDecimal)newValue);
        return;
      case XSpicePackage.CAPACITOR__INITIAL_CONDITION:
        setInitialCondition((BigDecimal)newValue);
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
      case XSpicePackage.CAPACITOR__CAPACITANCE:
        setCapacitance(CAPACITANCE_EDEFAULT);
        return;
      case XSpicePackage.CAPACITOR__MODEL:
        setModel(MODEL_EDEFAULT);
        return;
      case XSpicePackage.CAPACITOR__LENGTH:
        setLength(LENGTH_EDEFAULT);
        return;
      case XSpicePackage.CAPACITOR__WIDTH:
        setWidth(WIDTH_EDEFAULT);
        return;
      case XSpicePackage.CAPACITOR__INITIAL_CONDITION:
        setInitialCondition(INITIAL_CONDITION_EDEFAULT);
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
      case XSpicePackage.CAPACITOR__CAPACITANCE:
        return CAPACITANCE_EDEFAULT == null ? capacitance != null : !CAPACITANCE_EDEFAULT.equals(capacitance);
      case XSpicePackage.CAPACITOR__MODEL:
        return MODEL_EDEFAULT == null ? model != null : !MODEL_EDEFAULT.equals(model);
      case XSpicePackage.CAPACITOR__LENGTH:
        return LENGTH_EDEFAULT == null ? length != null : !LENGTH_EDEFAULT.equals(length);
      case XSpicePackage.CAPACITOR__WIDTH:
        return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
      case XSpicePackage.CAPACITOR__INITIAL_CONDITION:
        return INITIAL_CONDITION_EDEFAULT == null ? initialCondition != null : !INITIAL_CONDITION_EDEFAULT.equals(initialCondition);
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
    result.append(" (capacitance: ");
    result.append(capacitance);
    result.append(", model: ");
    result.append(model);
    result.append(", length: ");
    result.append(length);
    result.append(", width: ");
    result.append(width);
    result.append(", initialCondition: ");
    result.append(initialCondition);
    result.append(')');
    return result.toString();
  }

} //CapacitorImpl
