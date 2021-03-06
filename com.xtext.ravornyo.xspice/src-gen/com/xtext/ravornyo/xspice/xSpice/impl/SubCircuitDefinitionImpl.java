/**
 * generated by Xtext 2.18.0.M3
 */
package com.xtext.ravornyo.xspice.xSpice.impl;

import com.xtext.ravornyo.xspice.xSpice.Entity;
import com.xtext.ravornyo.xspice.xSpice.SubCircuitDefinition;
import com.xtext.ravornyo.xspice.xSpice.XSpicePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Circuit Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.impl.SubCircuitDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.impl.SubCircuitDefinitionImpl#getPins <em>Pins</em>}</li>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.impl.SubCircuitDefinitionImpl#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link com.xtext.ravornyo.xspice.xSpice.impl.SubCircuitDefinitionImpl#getEntities <em>Entities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubCircuitDefinitionImpl extends MinimalEObjectImpl.Container implements SubCircuitDefinition
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getPins() <em>Pins</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPins()
   * @generated
   * @ordered
   */
  protected EList<String> pins;

  /**
   * The cached value of the '{@link #getDefinitions() <em>Definitions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefinitions()
   * @generated
   * @ordered
   */
  protected EList<SubCircuitDefinition> definitions;

  /**
   * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntities()
   * @generated
   * @ordered
   */
  protected EList<Entity> entities;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubCircuitDefinitionImpl()
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
    return XSpicePackage.Literals.SUB_CIRCUIT_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XSpicePackage.SUB_CIRCUIT_DEFINITION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getPins()
  {
    if (pins == null)
    {
      pins = new EDataTypeEList<String>(String.class, this, XSpicePackage.SUB_CIRCUIT_DEFINITION__PINS);
    }
    return pins;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<SubCircuitDefinition> getDefinitions()
  {
    if (definitions == null)
    {
      definitions = new EObjectContainmentEList<SubCircuitDefinition>(SubCircuitDefinition.class, this, XSpicePackage.SUB_CIRCUIT_DEFINITION__DEFINITIONS);
    }
    return definitions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Entity> getEntities()
  {
    if (entities == null)
    {
      entities = new EObjectContainmentEList<Entity>(Entity.class, this, XSpicePackage.SUB_CIRCUIT_DEFINITION__ENTITIES);
    }
    return entities;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case XSpicePackage.SUB_CIRCUIT_DEFINITION__DEFINITIONS:
        return ((InternalEList<?>)getDefinitions()).basicRemove(otherEnd, msgs);
      case XSpicePackage.SUB_CIRCUIT_DEFINITION__ENTITIES:
        return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case XSpicePackage.SUB_CIRCUIT_DEFINITION__NAME:
        return getName();
      case XSpicePackage.SUB_CIRCUIT_DEFINITION__PINS:
        return getPins();
      case XSpicePackage.SUB_CIRCUIT_DEFINITION__DEFINITIONS:
        return getDefinitions();
      case XSpicePackage.SUB_CIRCUIT_DEFINITION__ENTITIES:
        return getEntities();
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
      case XSpicePackage.SUB_CIRCUIT_DEFINITION__NAME:
        setName((String)newValue);
        return;
      case XSpicePackage.SUB_CIRCUIT_DEFINITION__PINS:
        getPins().clear();
        getPins().addAll((Collection<? extends String>)newValue);
        return;
      case XSpicePackage.SUB_CIRCUIT_DEFINITION__DEFINITIONS:
        getDefinitions().clear();
        getDefinitions().addAll((Collection<? extends SubCircuitDefinition>)newValue);
        return;
      case XSpicePackage.SUB_CIRCUIT_DEFINITION__ENTITIES:
        getEntities().clear();
        getEntities().addAll((Collection<? extends Entity>)newValue);
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
      case XSpicePackage.SUB_CIRCUIT_DEFINITION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case XSpicePackage.SUB_CIRCUIT_DEFINITION__PINS:
        getPins().clear();
        return;
      case XSpicePackage.SUB_CIRCUIT_DEFINITION__DEFINITIONS:
        getDefinitions().clear();
        return;
      case XSpicePackage.SUB_CIRCUIT_DEFINITION__ENTITIES:
        getEntities().clear();
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
      case XSpicePackage.SUB_CIRCUIT_DEFINITION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case XSpicePackage.SUB_CIRCUIT_DEFINITION__PINS:
        return pins != null && !pins.isEmpty();
      case XSpicePackage.SUB_CIRCUIT_DEFINITION__DEFINITIONS:
        return definitions != null && !definitions.isEmpty();
      case XSpicePackage.SUB_CIRCUIT_DEFINITION__ENTITIES:
        return entities != null && !entities.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(", pins: ");
    result.append(pins);
    result.append(')');
    return result.toString();
  }

} //SubCircuitDefinitionImpl
