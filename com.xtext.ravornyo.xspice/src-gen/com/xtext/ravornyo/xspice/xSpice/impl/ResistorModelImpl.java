/**
 * generated by Xtext 2.18.0.M3
 */
package com.xtext.ravornyo.xspice.xSpice.impl;

import com.xtext.ravornyo.xspice.xSpice.ResistorModel;
import com.xtext.ravornyo.xspice.xSpice.XSpicePackage;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resistor Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.impl.ResistorModelImpl#getSheetResistance <em>Sheet Resistance</em>}</li>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.impl.ResistorModelImpl#getDefaultWidth <em>Default Width</em>}</li>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.impl.ResistorModelImpl#getNarrow <em>Narrow</em>}</li>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.impl.ResistorModelImpl#getTemperatureCoefficient1 <em>Temperature Coefficient1</em>}</li>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.impl.ResistorModelImpl#getTemperatureCoefficient2 <em>Temperature Coefficient2</em>}</li>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.impl.ResistorModelImpl#getNominalTemperature <em>Nominal Temperature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResistorModelImpl extends EntityImpl implements ResistorModel
{
  /**
   * The default value of the '{@link #getSheetResistance() <em>Sheet Resistance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSheetResistance()
   * @generated
   * @ordered
   */
  protected static final BigDecimal SHEET_RESISTANCE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSheetResistance() <em>Sheet Resistance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSheetResistance()
   * @generated
   * @ordered
   */
  protected BigDecimal sheetResistance = SHEET_RESISTANCE_EDEFAULT;

  /**
   * The default value of the '{@link #getDefaultWidth() <em>Default Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultWidth()
   * @generated
   * @ordered
   */
  protected static final BigDecimal DEFAULT_WIDTH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDefaultWidth() <em>Default Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultWidth()
   * @generated
   * @ordered
   */
  protected BigDecimal defaultWidth = DEFAULT_WIDTH_EDEFAULT;

  /**
   * The default value of the '{@link #getNarrow() <em>Narrow</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNarrow()
   * @generated
   * @ordered
   */
  protected static final BigDecimal NARROW_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNarrow() <em>Narrow</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNarrow()
   * @generated
   * @ordered
   */
  protected BigDecimal narrow = NARROW_EDEFAULT;

  /**
   * The default value of the '{@link #getTemperatureCoefficient1() <em>Temperature Coefficient1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTemperatureCoefficient1()
   * @generated
   * @ordered
   */
  protected static final BigDecimal TEMPERATURE_COEFFICIENT1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTemperatureCoefficient1() <em>Temperature Coefficient1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTemperatureCoefficient1()
   * @generated
   * @ordered
   */
  protected BigDecimal temperatureCoefficient1 = TEMPERATURE_COEFFICIENT1_EDEFAULT;

  /**
   * The default value of the '{@link #getTemperatureCoefficient2() <em>Temperature Coefficient2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTemperatureCoefficient2()
   * @generated
   * @ordered
   */
  protected static final BigDecimal TEMPERATURE_COEFFICIENT2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTemperatureCoefficient2() <em>Temperature Coefficient2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTemperatureCoefficient2()
   * @generated
   * @ordered
   */
  protected BigDecimal temperatureCoefficient2 = TEMPERATURE_COEFFICIENT2_EDEFAULT;

  /**
   * The default value of the '{@link #getNominalTemperature() <em>Nominal Temperature</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNominalTemperature()
   * @generated
   * @ordered
   */
  protected static final BigDecimal NOMINAL_TEMPERATURE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNominalTemperature() <em>Nominal Temperature</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNominalTemperature()
   * @generated
   * @ordered
   */
  protected BigDecimal nominalTemperature = NOMINAL_TEMPERATURE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ResistorModelImpl()
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
    return XSpicePackage.Literals.RESISTOR_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BigDecimal getSheetResistance()
  {
    return sheetResistance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSheetResistance(BigDecimal newSheetResistance)
  {
    BigDecimal oldSheetResistance = sheetResistance;
    sheetResistance = newSheetResistance;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XSpicePackage.RESISTOR_MODEL__SHEET_RESISTANCE, oldSheetResistance, sheetResistance));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BigDecimal getDefaultWidth()
  {
    return defaultWidth;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDefaultWidth(BigDecimal newDefaultWidth)
  {
    BigDecimal oldDefaultWidth = defaultWidth;
    defaultWidth = newDefaultWidth;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XSpicePackage.RESISTOR_MODEL__DEFAULT_WIDTH, oldDefaultWidth, defaultWidth));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BigDecimal getNarrow()
  {
    return narrow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNarrow(BigDecimal newNarrow)
  {
    BigDecimal oldNarrow = narrow;
    narrow = newNarrow;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XSpicePackage.RESISTOR_MODEL__NARROW, oldNarrow, narrow));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BigDecimal getTemperatureCoefficient1()
  {
    return temperatureCoefficient1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTemperatureCoefficient1(BigDecimal newTemperatureCoefficient1)
  {
    BigDecimal oldTemperatureCoefficient1 = temperatureCoefficient1;
    temperatureCoefficient1 = newTemperatureCoefficient1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XSpicePackage.RESISTOR_MODEL__TEMPERATURE_COEFFICIENT1, oldTemperatureCoefficient1, temperatureCoefficient1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BigDecimal getTemperatureCoefficient2()
  {
    return temperatureCoefficient2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTemperatureCoefficient2(BigDecimal newTemperatureCoefficient2)
  {
    BigDecimal oldTemperatureCoefficient2 = temperatureCoefficient2;
    temperatureCoefficient2 = newTemperatureCoefficient2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XSpicePackage.RESISTOR_MODEL__TEMPERATURE_COEFFICIENT2, oldTemperatureCoefficient2, temperatureCoefficient2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BigDecimal getNominalTemperature()
  {
    return nominalTemperature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNominalTemperature(BigDecimal newNominalTemperature)
  {
    BigDecimal oldNominalTemperature = nominalTemperature;
    nominalTemperature = newNominalTemperature;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XSpicePackage.RESISTOR_MODEL__NOMINAL_TEMPERATURE, oldNominalTemperature, nominalTemperature));
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
      case XSpicePackage.RESISTOR_MODEL__SHEET_RESISTANCE:
        return getSheetResistance();
      case XSpicePackage.RESISTOR_MODEL__DEFAULT_WIDTH:
        return getDefaultWidth();
      case XSpicePackage.RESISTOR_MODEL__NARROW:
        return getNarrow();
      case XSpicePackage.RESISTOR_MODEL__TEMPERATURE_COEFFICIENT1:
        return getTemperatureCoefficient1();
      case XSpicePackage.RESISTOR_MODEL__TEMPERATURE_COEFFICIENT2:
        return getTemperatureCoefficient2();
      case XSpicePackage.RESISTOR_MODEL__NOMINAL_TEMPERATURE:
        return getNominalTemperature();
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
      case XSpicePackage.RESISTOR_MODEL__SHEET_RESISTANCE:
        setSheetResistance((BigDecimal)newValue);
        return;
      case XSpicePackage.RESISTOR_MODEL__DEFAULT_WIDTH:
        setDefaultWidth((BigDecimal)newValue);
        return;
      case XSpicePackage.RESISTOR_MODEL__NARROW:
        setNarrow((BigDecimal)newValue);
        return;
      case XSpicePackage.RESISTOR_MODEL__TEMPERATURE_COEFFICIENT1:
        setTemperatureCoefficient1((BigDecimal)newValue);
        return;
      case XSpicePackage.RESISTOR_MODEL__TEMPERATURE_COEFFICIENT2:
        setTemperatureCoefficient2((BigDecimal)newValue);
        return;
      case XSpicePackage.RESISTOR_MODEL__NOMINAL_TEMPERATURE:
        setNominalTemperature((BigDecimal)newValue);
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
      case XSpicePackage.RESISTOR_MODEL__SHEET_RESISTANCE:
        setSheetResistance(SHEET_RESISTANCE_EDEFAULT);
        return;
      case XSpicePackage.RESISTOR_MODEL__DEFAULT_WIDTH:
        setDefaultWidth(DEFAULT_WIDTH_EDEFAULT);
        return;
      case XSpicePackage.RESISTOR_MODEL__NARROW:
        setNarrow(NARROW_EDEFAULT);
        return;
      case XSpicePackage.RESISTOR_MODEL__TEMPERATURE_COEFFICIENT1:
        setTemperatureCoefficient1(TEMPERATURE_COEFFICIENT1_EDEFAULT);
        return;
      case XSpicePackage.RESISTOR_MODEL__TEMPERATURE_COEFFICIENT2:
        setTemperatureCoefficient2(TEMPERATURE_COEFFICIENT2_EDEFAULT);
        return;
      case XSpicePackage.RESISTOR_MODEL__NOMINAL_TEMPERATURE:
        setNominalTemperature(NOMINAL_TEMPERATURE_EDEFAULT);
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
      case XSpicePackage.RESISTOR_MODEL__SHEET_RESISTANCE:
        return SHEET_RESISTANCE_EDEFAULT == null ? sheetResistance != null : !SHEET_RESISTANCE_EDEFAULT.equals(sheetResistance);
      case XSpicePackage.RESISTOR_MODEL__DEFAULT_WIDTH:
        return DEFAULT_WIDTH_EDEFAULT == null ? defaultWidth != null : !DEFAULT_WIDTH_EDEFAULT.equals(defaultWidth);
      case XSpicePackage.RESISTOR_MODEL__NARROW:
        return NARROW_EDEFAULT == null ? narrow != null : !NARROW_EDEFAULT.equals(narrow);
      case XSpicePackage.RESISTOR_MODEL__TEMPERATURE_COEFFICIENT1:
        return TEMPERATURE_COEFFICIENT1_EDEFAULT == null ? temperatureCoefficient1 != null : !TEMPERATURE_COEFFICIENT1_EDEFAULT.equals(temperatureCoefficient1);
      case XSpicePackage.RESISTOR_MODEL__TEMPERATURE_COEFFICIENT2:
        return TEMPERATURE_COEFFICIENT2_EDEFAULT == null ? temperatureCoefficient2 != null : !TEMPERATURE_COEFFICIENT2_EDEFAULT.equals(temperatureCoefficient2);
      case XSpicePackage.RESISTOR_MODEL__NOMINAL_TEMPERATURE:
        return NOMINAL_TEMPERATURE_EDEFAULT == null ? nominalTemperature != null : !NOMINAL_TEMPERATURE_EDEFAULT.equals(nominalTemperature);
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
    result.append(" (sheetResistance: ");
    result.append(sheetResistance);
    result.append(", defaultWidth: ");
    result.append(defaultWidth);
    result.append(", narrow: ");
    result.append(narrow);
    result.append(", temperatureCoefficient1: ");
    result.append(temperatureCoefficient1);
    result.append(", temperatureCoefficient2: ");
    result.append(temperatureCoefficient2);
    result.append(", nominalTemperature: ");
    result.append(nominalTemperature);
    result.append(')');
    return result.toString();
  }

} //ResistorModelImpl
