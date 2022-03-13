/**
 * generated by Xtext 2.18.0.M3
 */
package com.xtext.ravornyo.xspice.xSpice.impl;

import com.xtext.ravornyo.xspice.xSpice.MOSFET;
import com.xtext.ravornyo.xspice.xSpice.XSpicePackage;

import java.math.BigDecimal;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MOSFET</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.impl.MOSFETImpl#getModel <em>Model</em>}</li>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.impl.MOSFETImpl#getLength <em>Length</em>}</li>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.impl.MOSFETImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.impl.MOSFETImpl#getDrainArea <em>Drain Area</em>}</li>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.impl.MOSFETImpl#getSourceArea <em>Source Area</em>}</li>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.impl.MOSFETImpl#getDrainPerimeter <em>Drain Perimeter</em>}</li>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.impl.MOSFETImpl#getSourcePerimeter <em>Source Perimeter</em>}</li>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.impl.MOSFETImpl#getDrainSquares <em>Drain Squares</em>}</li>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.impl.MOSFETImpl#getSourceSquares <em>Source Squares</em>}</li>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.impl.MOSFETImpl#isOff <em>Off</em>}</li>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.impl.MOSFETImpl#getIc <em>Ic</em>}</li>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.impl.MOSFETImpl#getTemp <em>Temp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MOSFETImpl extends ComponentImpl implements MOSFET
{
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
   * The default value of the '{@link #getDrainArea() <em>Drain Area</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDrainArea()
   * @generated
   * @ordered
   */
  protected static final BigDecimal DRAIN_AREA_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDrainArea() <em>Drain Area</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDrainArea()
   * @generated
   * @ordered
   */
  protected BigDecimal drainArea = DRAIN_AREA_EDEFAULT;

  /**
   * The default value of the '{@link #getSourceArea() <em>Source Area</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceArea()
   * @generated
   * @ordered
   */
  protected static final BigDecimal SOURCE_AREA_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSourceArea() <em>Source Area</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceArea()
   * @generated
   * @ordered
   */
  protected BigDecimal sourceArea = SOURCE_AREA_EDEFAULT;

  /**
   * The default value of the '{@link #getDrainPerimeter() <em>Drain Perimeter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDrainPerimeter()
   * @generated
   * @ordered
   */
  protected static final BigDecimal DRAIN_PERIMETER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDrainPerimeter() <em>Drain Perimeter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDrainPerimeter()
   * @generated
   * @ordered
   */
  protected BigDecimal drainPerimeter = DRAIN_PERIMETER_EDEFAULT;

  /**
   * The default value of the '{@link #getSourcePerimeter() <em>Source Perimeter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourcePerimeter()
   * @generated
   * @ordered
   */
  protected static final BigDecimal SOURCE_PERIMETER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSourcePerimeter() <em>Source Perimeter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourcePerimeter()
   * @generated
   * @ordered
   */
  protected BigDecimal sourcePerimeter = SOURCE_PERIMETER_EDEFAULT;

  /**
   * The default value of the '{@link #getDrainSquares() <em>Drain Squares</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDrainSquares()
   * @generated
   * @ordered
   */
  protected static final BigDecimal DRAIN_SQUARES_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDrainSquares() <em>Drain Squares</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDrainSquares()
   * @generated
   * @ordered
   */
  protected BigDecimal drainSquares = DRAIN_SQUARES_EDEFAULT;

  /**
   * The default value of the '{@link #getSourceSquares() <em>Source Squares</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceSquares()
   * @generated
   * @ordered
   */
  protected static final BigDecimal SOURCE_SQUARES_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSourceSquares() <em>Source Squares</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceSquares()
   * @generated
   * @ordered
   */
  protected BigDecimal sourceSquares = SOURCE_SQUARES_EDEFAULT;

  /**
   * The default value of the '{@link #isOff() <em>Off</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOff()
   * @generated
   * @ordered
   */
  protected static final boolean OFF_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isOff() <em>Off</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOff()
   * @generated
   * @ordered
   */
  protected boolean off = OFF_EDEFAULT;

  /**
   * The cached value of the '{@link #getIc() <em>Ic</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIc()
   * @generated
   * @ordered
   */
  protected EList<BigDecimal> ic;

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
  protected MOSFETImpl()
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
    return XSpicePackage.Literals.MOSFET;
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
      eNotify(new ENotificationImpl(this, Notification.SET, XSpicePackage.MOSFET__MODEL, oldModel, model));
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
      eNotify(new ENotificationImpl(this, Notification.SET, XSpicePackage.MOSFET__LENGTH, oldLength, length));
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
      eNotify(new ENotificationImpl(this, Notification.SET, XSpicePackage.MOSFET__WIDTH, oldWidth, width));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BigDecimal getDrainArea()
  {
    return drainArea;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDrainArea(BigDecimal newDrainArea)
  {
    BigDecimal oldDrainArea = drainArea;
    drainArea = newDrainArea;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XSpicePackage.MOSFET__DRAIN_AREA, oldDrainArea, drainArea));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BigDecimal getSourceArea()
  {
    return sourceArea;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSourceArea(BigDecimal newSourceArea)
  {
    BigDecimal oldSourceArea = sourceArea;
    sourceArea = newSourceArea;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XSpicePackage.MOSFET__SOURCE_AREA, oldSourceArea, sourceArea));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BigDecimal getDrainPerimeter()
  {
    return drainPerimeter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDrainPerimeter(BigDecimal newDrainPerimeter)
  {
    BigDecimal oldDrainPerimeter = drainPerimeter;
    drainPerimeter = newDrainPerimeter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XSpicePackage.MOSFET__DRAIN_PERIMETER, oldDrainPerimeter, drainPerimeter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BigDecimal getSourcePerimeter()
  {
    return sourcePerimeter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSourcePerimeter(BigDecimal newSourcePerimeter)
  {
    BigDecimal oldSourcePerimeter = sourcePerimeter;
    sourcePerimeter = newSourcePerimeter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XSpicePackage.MOSFET__SOURCE_PERIMETER, oldSourcePerimeter, sourcePerimeter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BigDecimal getDrainSquares()
  {
    return drainSquares;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDrainSquares(BigDecimal newDrainSquares)
  {
    BigDecimal oldDrainSquares = drainSquares;
    drainSquares = newDrainSquares;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XSpicePackage.MOSFET__DRAIN_SQUARES, oldDrainSquares, drainSquares));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BigDecimal getSourceSquares()
  {
    return sourceSquares;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSourceSquares(BigDecimal newSourceSquares)
  {
    BigDecimal oldSourceSquares = sourceSquares;
    sourceSquares = newSourceSquares;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XSpicePackage.MOSFET__SOURCE_SQUARES, oldSourceSquares, sourceSquares));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isOff()
  {
    return off;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOff(boolean newOff)
  {
    boolean oldOff = off;
    off = newOff;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XSpicePackage.MOSFET__OFF, oldOff, off));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<BigDecimal> getIc()
  {
    if (ic == null)
    {
      ic = new EDataTypeEList<BigDecimal>(BigDecimal.class, this, XSpicePackage.MOSFET__IC);
    }
    return ic;
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
      eNotify(new ENotificationImpl(this, Notification.SET, XSpicePackage.MOSFET__TEMP, oldTemp, temp));
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
      case XSpicePackage.MOSFET__MODEL:
        return getModel();
      case XSpicePackage.MOSFET__LENGTH:
        return getLength();
      case XSpicePackage.MOSFET__WIDTH:
        return getWidth();
      case XSpicePackage.MOSFET__DRAIN_AREA:
        return getDrainArea();
      case XSpicePackage.MOSFET__SOURCE_AREA:
        return getSourceArea();
      case XSpicePackage.MOSFET__DRAIN_PERIMETER:
        return getDrainPerimeter();
      case XSpicePackage.MOSFET__SOURCE_PERIMETER:
        return getSourcePerimeter();
      case XSpicePackage.MOSFET__DRAIN_SQUARES:
        return getDrainSquares();
      case XSpicePackage.MOSFET__SOURCE_SQUARES:
        return getSourceSquares();
      case XSpicePackage.MOSFET__OFF:
        return isOff();
      case XSpicePackage.MOSFET__IC:
        return getIc();
      case XSpicePackage.MOSFET__TEMP:
        return getTemp();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case XSpicePackage.MOSFET__MODEL:
        setModel((String)newValue);
        return;
      case XSpicePackage.MOSFET__LENGTH:
        setLength((BigDecimal)newValue);
        return;
      case XSpicePackage.MOSFET__WIDTH:
        setWidth((BigDecimal)newValue);
        return;
      case XSpicePackage.MOSFET__DRAIN_AREA:
        setDrainArea((BigDecimal)newValue);
        return;
      case XSpicePackage.MOSFET__SOURCE_AREA:
        setSourceArea((BigDecimal)newValue);
        return;
      case XSpicePackage.MOSFET__DRAIN_PERIMETER:
        setDrainPerimeter((BigDecimal)newValue);
        return;
      case XSpicePackage.MOSFET__SOURCE_PERIMETER:
        setSourcePerimeter((BigDecimal)newValue);
        return;
      case XSpicePackage.MOSFET__DRAIN_SQUARES:
        setDrainSquares((BigDecimal)newValue);
        return;
      case XSpicePackage.MOSFET__SOURCE_SQUARES:
        setSourceSquares((BigDecimal)newValue);
        return;
      case XSpicePackage.MOSFET__OFF:
        setOff((Boolean)newValue);
        return;
      case XSpicePackage.MOSFET__IC:
        getIc().clear();
        getIc().addAll((Collection<? extends BigDecimal>)newValue);
        return;
      case XSpicePackage.MOSFET__TEMP:
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
      case XSpicePackage.MOSFET__MODEL:
        setModel(MODEL_EDEFAULT);
        return;
      case XSpicePackage.MOSFET__LENGTH:
        setLength(LENGTH_EDEFAULT);
        return;
      case XSpicePackage.MOSFET__WIDTH:
        setWidth(WIDTH_EDEFAULT);
        return;
      case XSpicePackage.MOSFET__DRAIN_AREA:
        setDrainArea(DRAIN_AREA_EDEFAULT);
        return;
      case XSpicePackage.MOSFET__SOURCE_AREA:
        setSourceArea(SOURCE_AREA_EDEFAULT);
        return;
      case XSpicePackage.MOSFET__DRAIN_PERIMETER:
        setDrainPerimeter(DRAIN_PERIMETER_EDEFAULT);
        return;
      case XSpicePackage.MOSFET__SOURCE_PERIMETER:
        setSourcePerimeter(SOURCE_PERIMETER_EDEFAULT);
        return;
      case XSpicePackage.MOSFET__DRAIN_SQUARES:
        setDrainSquares(DRAIN_SQUARES_EDEFAULT);
        return;
      case XSpicePackage.MOSFET__SOURCE_SQUARES:
        setSourceSquares(SOURCE_SQUARES_EDEFAULT);
        return;
      case XSpicePackage.MOSFET__OFF:
        setOff(OFF_EDEFAULT);
        return;
      case XSpicePackage.MOSFET__IC:
        getIc().clear();
        return;
      case XSpicePackage.MOSFET__TEMP:
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
      case XSpicePackage.MOSFET__MODEL:
        return MODEL_EDEFAULT == null ? model != null : !MODEL_EDEFAULT.equals(model);
      case XSpicePackage.MOSFET__LENGTH:
        return LENGTH_EDEFAULT == null ? length != null : !LENGTH_EDEFAULT.equals(length);
      case XSpicePackage.MOSFET__WIDTH:
        return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
      case XSpicePackage.MOSFET__DRAIN_AREA:
        return DRAIN_AREA_EDEFAULT == null ? drainArea != null : !DRAIN_AREA_EDEFAULT.equals(drainArea);
      case XSpicePackage.MOSFET__SOURCE_AREA:
        return SOURCE_AREA_EDEFAULT == null ? sourceArea != null : !SOURCE_AREA_EDEFAULT.equals(sourceArea);
      case XSpicePackage.MOSFET__DRAIN_PERIMETER:
        return DRAIN_PERIMETER_EDEFAULT == null ? drainPerimeter != null : !DRAIN_PERIMETER_EDEFAULT.equals(drainPerimeter);
      case XSpicePackage.MOSFET__SOURCE_PERIMETER:
        return SOURCE_PERIMETER_EDEFAULT == null ? sourcePerimeter != null : !SOURCE_PERIMETER_EDEFAULT.equals(sourcePerimeter);
      case XSpicePackage.MOSFET__DRAIN_SQUARES:
        return DRAIN_SQUARES_EDEFAULT == null ? drainSquares != null : !DRAIN_SQUARES_EDEFAULT.equals(drainSquares);
      case XSpicePackage.MOSFET__SOURCE_SQUARES:
        return SOURCE_SQUARES_EDEFAULT == null ? sourceSquares != null : !SOURCE_SQUARES_EDEFAULT.equals(sourceSquares);
      case XSpicePackage.MOSFET__OFF:
        return off != OFF_EDEFAULT;
      case XSpicePackage.MOSFET__IC:
        return ic != null && !ic.isEmpty();
      case XSpicePackage.MOSFET__TEMP:
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
    result.append(" (model: ");
    result.append(model);
    result.append(", length: ");
    result.append(length);
    result.append(", width: ");
    result.append(width);
    result.append(", drainArea: ");
    result.append(drainArea);
    result.append(", sourceArea: ");
    result.append(sourceArea);
    result.append(", drainPerimeter: ");
    result.append(drainPerimeter);
    result.append(", sourcePerimeter: ");
    result.append(sourcePerimeter);
    result.append(", drainSquares: ");
    result.append(drainSquares);
    result.append(", sourceSquares: ");
    result.append(sourceSquares);
    result.append(", off: ");
    result.append(off);
    result.append(", ic: ");
    result.append(ic);
    result.append(", temp: ");
    result.append(temp);
    result.append(')');
    return result.toString();
  }

} //MOSFETImpl