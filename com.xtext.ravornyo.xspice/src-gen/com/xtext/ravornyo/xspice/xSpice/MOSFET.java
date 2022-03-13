/**
 * generated by Xtext 2.18.0.M3
 */
package com.xtext.ravornyo.xspice.xSpice;

import java.math.BigDecimal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MOSFET</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.MOSFET#getModel <em>Model</em>}</li>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.MOSFET#getLength <em>Length</em>}</li>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.MOSFET#getWidth <em>Width</em>}</li>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.MOSFET#getDrainArea <em>Drain Area</em>}</li>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.MOSFET#getSourceArea <em>Source Area</em>}</li>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.MOSFET#getDrainPerimeter <em>Drain Perimeter</em>}</li>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.MOSFET#getSourcePerimeter <em>Source Perimeter</em>}</li>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.MOSFET#getDrainSquares <em>Drain Squares</em>}</li>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.MOSFET#getSourceSquares <em>Source Squares</em>}</li>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.MOSFET#isOff <em>Off</em>}</li>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.MOSFET#getIc <em>Ic</em>}</li>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.MOSFET#getTemp <em>Temp</em>}</li>
 * </ul>
 *
 * @see com.xtext.ravornyo.xspice.xSpice.XSpicePackage#getMOSFET()
 * @model
 * @generated
 */
public interface MOSFET extends Component
{
  /**
   * Returns the value of the '<em><b>Model</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model</em>' attribute.
   * @see #setModel(String)
   * @see com.xtext.ravornyo.xspice.xSpice.XSpicePackage#getMOSFET_Model()
   * @model
   * @generated
   */
  String getModel();

  /**
   * Sets the value of the '{@link com.xtext.ravornyo.xspice.xSpice.MOSFET#getModel <em>Model</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model</em>' attribute.
   * @see #getModel()
   * @generated
   */
  void setModel(String value);

  /**
   * Returns the value of the '<em><b>Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Length</em>' attribute.
   * @see #setLength(BigDecimal)
   * @see com.xtext.ravornyo.xspice.xSpice.XSpicePackage#getMOSFET_Length()
   * @model
   * @generated
   */
  BigDecimal getLength();

  /**
   * Sets the value of the '{@link com.xtext.ravornyo.xspice.xSpice.MOSFET#getLength <em>Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Length</em>' attribute.
   * @see #getLength()
   * @generated
   */
  void setLength(BigDecimal value);

  /**
   * Returns the value of the '<em><b>Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Width</em>' attribute.
   * @see #setWidth(BigDecimal)
   * @see com.xtext.ravornyo.xspice.xSpice.XSpicePackage#getMOSFET_Width()
   * @model
   * @generated
   */
  BigDecimal getWidth();

  /**
   * Sets the value of the '{@link com.xtext.ravornyo.xspice.xSpice.MOSFET#getWidth <em>Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Width</em>' attribute.
   * @see #getWidth()
   * @generated
   */
  void setWidth(BigDecimal value);

  /**
   * Returns the value of the '<em><b>Drain Area</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Drain Area</em>' attribute.
   * @see #setDrainArea(BigDecimal)
   * @see com.xtext.ravornyo.xspice.xSpice.XSpicePackage#getMOSFET_DrainArea()
   * @model
   * @generated
   */
  BigDecimal getDrainArea();

  /**
   * Sets the value of the '{@link com.xtext.ravornyo.xspice.xSpice.MOSFET#getDrainArea <em>Drain Area</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Drain Area</em>' attribute.
   * @see #getDrainArea()
   * @generated
   */
  void setDrainArea(BigDecimal value);

  /**
   * Returns the value of the '<em><b>Source Area</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Area</em>' attribute.
   * @see #setSourceArea(BigDecimal)
   * @see com.xtext.ravornyo.xspice.xSpice.XSpicePackage#getMOSFET_SourceArea()
   * @model
   * @generated
   */
  BigDecimal getSourceArea();

  /**
   * Sets the value of the '{@link com.xtext.ravornyo.xspice.xSpice.MOSFET#getSourceArea <em>Source Area</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Area</em>' attribute.
   * @see #getSourceArea()
   * @generated
   */
  void setSourceArea(BigDecimal value);

  /**
   * Returns the value of the '<em><b>Drain Perimeter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Drain Perimeter</em>' attribute.
   * @see #setDrainPerimeter(BigDecimal)
   * @see com.xtext.ravornyo.xspice.xSpice.XSpicePackage#getMOSFET_DrainPerimeter()
   * @model
   * @generated
   */
  BigDecimal getDrainPerimeter();

  /**
   * Sets the value of the '{@link com.xtext.ravornyo.xspice.xSpice.MOSFET#getDrainPerimeter <em>Drain Perimeter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Drain Perimeter</em>' attribute.
   * @see #getDrainPerimeter()
   * @generated
   */
  void setDrainPerimeter(BigDecimal value);

  /**
   * Returns the value of the '<em><b>Source Perimeter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Perimeter</em>' attribute.
   * @see #setSourcePerimeter(BigDecimal)
   * @see com.xtext.ravornyo.xspice.xSpice.XSpicePackage#getMOSFET_SourcePerimeter()
   * @model
   * @generated
   */
  BigDecimal getSourcePerimeter();

  /**
   * Sets the value of the '{@link com.xtext.ravornyo.xspice.xSpice.MOSFET#getSourcePerimeter <em>Source Perimeter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Perimeter</em>' attribute.
   * @see #getSourcePerimeter()
   * @generated
   */
  void setSourcePerimeter(BigDecimal value);

  /**
   * Returns the value of the '<em><b>Drain Squares</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Drain Squares</em>' attribute.
   * @see #setDrainSquares(BigDecimal)
   * @see com.xtext.ravornyo.xspice.xSpice.XSpicePackage#getMOSFET_DrainSquares()
   * @model
   * @generated
   */
  BigDecimal getDrainSquares();

  /**
   * Sets the value of the '{@link com.xtext.ravornyo.xspice.xSpice.MOSFET#getDrainSquares <em>Drain Squares</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Drain Squares</em>' attribute.
   * @see #getDrainSquares()
   * @generated
   */
  void setDrainSquares(BigDecimal value);

  /**
   * Returns the value of the '<em><b>Source Squares</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Squares</em>' attribute.
   * @see #setSourceSquares(BigDecimal)
   * @see com.xtext.ravornyo.xspice.xSpice.XSpicePackage#getMOSFET_SourceSquares()
   * @model
   * @generated
   */
  BigDecimal getSourceSquares();

  /**
   * Sets the value of the '{@link com.xtext.ravornyo.xspice.xSpice.MOSFET#getSourceSquares <em>Source Squares</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Squares</em>' attribute.
   * @see #getSourceSquares()
   * @generated
   */
  void setSourceSquares(BigDecimal value);

  /**
   * Returns the value of the '<em><b>Off</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Off</em>' attribute.
   * @see #setOff(boolean)
   * @see com.xtext.ravornyo.xspice.xSpice.XSpicePackage#getMOSFET_Off()
   * @model
   * @generated
   */
  boolean isOff();

  /**
   * Sets the value of the '{@link com.xtext.ravornyo.xspice.xSpice.MOSFET#isOff <em>Off</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Off</em>' attribute.
   * @see #isOff()
   * @generated
   */
  void setOff(boolean value);

  /**
   * Returns the value of the '<em><b>Ic</b></em>' attribute list.
   * The list contents are of type {@link java.math.BigDecimal}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ic</em>' attribute list.
   * @see com.xtext.ravornyo.xspice.xSpice.XSpicePackage#getMOSFET_Ic()
   * @model unique="false"
   * @generated
   */
  EList<BigDecimal> getIc();

  /**
   * Returns the value of the '<em><b>Temp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Temp</em>' attribute.
   * @see #setTemp(BigDecimal)
   * @see com.xtext.ravornyo.xspice.xSpice.XSpicePackage#getMOSFET_Temp()
   * @model
   * @generated
   */
  BigDecimal getTemp();

  /**
   * Sets the value of the '{@link com.xtext.ravornyo.xspice.xSpice.MOSFET#getTemp <em>Temp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Temp</em>' attribute.
   * @see #getTemp()
   * @generated
   */
  void setTemp(BigDecimal value);

} // MOSFET