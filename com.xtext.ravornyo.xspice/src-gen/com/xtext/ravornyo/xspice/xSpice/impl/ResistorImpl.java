/**
 * generated by Xtext 2.18.0.M3
 */
package com.xtext.ravornyo.xspice.xSpice.impl;

import com.xtext.ravornyo.xspice.xSpice.Resistor;
import com.xtext.ravornyo.xspice.xSpice.XSpicePackage;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resistor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.impl.ResistorImpl#getResistance <em>Resistance</em>}</li>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.impl.ResistorImpl#getModel <em>Model</em>}</li>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.impl.ResistorImpl#getLength <em>Length</em>}</li>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.impl.ResistorImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.impl.ResistorImpl#getTemp <em>Temp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResistorImpl extends ComponentImpl implements Resistor
{
  /**
   * The default value of the '{@link #getResistance() <em>Resistance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResistance()
   * @generated
   * @ordered
   */
  protected static final BigDecimal RESISTANCE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getResistance() <em>Resistance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResistance()
   * @generated
   * @ordered
   */
  protected BigDecimal resistance = RESISTANCE_EDEFAULT;

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
   * The default value of the '{@link #getTemp() <em>Temp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTemp()
   * @generated
   * @ordered
   */
  protected static final BigDecimal TEMP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTemp() <em>Temp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTemp()
   * @generated
   * @ordered
   */
  protected BigDecimal temp = TEMP_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ResistorImpl()
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
    return XSpicePackage.Literals.RESISTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BigDecimal getResistance()
  {
    return resistance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setResistance(BigDecimal newResistance)
  {
    BigDecimal oldResistance = resistance;
    resistance = newResistance;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XSpicePackage.RESISTOR__RESISTANCE, oldResistance, resistance));
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
      eNotify(new ENotificationImpl(this, Notification.SET, XSpicePackage.RESISTOR__MODEL, oldModel, model));
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
      eNotify(new ENotificationImpl(this, Notification.SET, XSpicePackage.RESISTOR__LENGTH, oldLength, length));
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
      eNotify(new ENotificationImpl(this, Notification.SET, XSpicePackage.RESISTOR__WIDTH, oldWidth, width));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BigDecimal getTemp()
  {
    return temp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTemp(BigDecimal newTemp)
  {
    BigDecimal oldTemp = temp;
    temp = newTemp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XSpicePackage.RESISTOR__TEMP, oldTemp, temp));
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
      case XSpicePackage.RESISTOR__RESISTANCE:
        return getResistance();
      case XSpicePackage.RESISTOR__MODEL:
        return getModel();
      case XSpicePackage.RESISTOR__LENGTH:
        return getLength();
      case XSpicePackage.RESISTOR__WIDTH:
        return getWidth();
      case XSpicePackage.RESISTOR__TEMP:
        return getTemp();
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
      case XSpicePackage.RESISTOR__RESISTANCE:
        setResistance((BigDecimal)newValue);
        return;
      case XSpicePackage.RESISTOR__MODEL:
        setModel((String)newValue);
        return;
      case XSpicePackage.RESISTOR__LENGTH:
        setLength((BigDecimal)newValue);
        return;
      case XSpicePackage.RESISTOR__WIDTH:
        setWidth((BigDecimal)newValue);
        return;
      case XSpicePackage.RESISTOR__TEMP:
        setTemp((BigDecimal)newValue);
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
      case XSpicePackage.RESISTOR__RESISTANCE:
        setResistance(RESISTANCE_EDEFAULT);
        return;
      case XSpicePackage.RESISTOR__MODEL:
        setModel(MODEL_EDEFAULT);
        return;
      case XSpicePackage.RESISTOR__LENGTH:
        setLength(LENGTH_EDEFAULT);
        return;
      case XSpicePackage.RESISTOR__WIDTH:
        setWidth(WIDTH_EDEFAULT);
        return;
      case XSpicePackage.RESISTOR__TEMP:
        setTemp(TEMP_EDEFAULT);
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
      case XSpicePackage.RESISTOR__RESISTANCE:
        return RESISTANCE_EDEFAULT == null ? resistance != null : !RESISTANCE_EDEFAULT.equals(resistance);
      case XSpicePackage.RESISTOR__MODEL:
        return MODEL_EDEFAULT == null ? model != null : !MODEL_EDEFAULT.equals(model);
      case XSpicePackage.RESISTOR__LENGTH:
        return LENGTH_EDEFAULT == null ? length != null : !LENGTH_EDEFAULT.equals(length);
      case XSpicePackage.RESISTOR__WIDTH:
        return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
      case XSpicePackage.RESISTOR__TEMP:
        return TEMP_EDEFAULT == null ? temp != null : !TEMP_EDEFAULT.equals(temp);
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
    result.append(" (resistance: ");
    result.append(resistance);
    result.append(", model: ");
    result.append(model);
    result.append(", length: ");
    result.append(length);
    result.append(", width: ");
    result.append(width);
    result.append(", temp: ");
    result.append(temp);
    result.append(')');
    return result.toString();
  }

} //ResistorImpl
