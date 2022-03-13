/**
 * generated by Xtext 2.18.0.M3
 */
package com.xtext.ravornyo.xspice.validation;

import com.google.common.base.Objects;
import com.xtext.ravornyo.xspice.validation.AbstractXSpiceValidator;
import com.xtext.ravornyo.xspice.xSpice.BJT;
import com.xtext.ravornyo.xspice.xSpice.CCCS;
import com.xtext.ravornyo.xspice.xSpice.CCVS;
import com.xtext.ravornyo.xspice.xSpice.Capacitor;
import com.xtext.ravornyo.xspice.xSpice.Compilation;
import com.xtext.ravornyo.xspice.xSpice.Diode;
import com.xtext.ravornyo.xspice.xSpice.Entity;
import com.xtext.ravornyo.xspice.xSpice.JFET;
import com.xtext.ravornyo.xspice.xSpice.MOSFET;
import com.xtext.ravornyo.xspice.xSpice.MutualInductance;
import com.xtext.ravornyo.xspice.xSpice.Resistor;
import com.xtext.ravornyo.xspice.xSpice.SubCircuitDefinition;
import com.xtext.ravornyo.xspice.xSpice.VoltageSwitch;
import com.xtext.ravornyo.xspice.xSpice.XSpicePackage;
import java.math.BigDecimal;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class XSpiceValidator extends AbstractXSpiceValidator {
  @Check
  public void checkEntityNameIsUnique(final Entity entity) {
    EObject parent = entity.eContainer();
    if ((parent != null)) {
      EList<Entity> _xifexpression = null;
      EClass _eClass = parent.eClass();
      boolean _tripleEquals = (_eClass == XSpicePackage.Literals.SUB_CIRCUIT_DEFINITION);
      if (_tripleEquals) {
        _xifexpression = ((SubCircuitDefinition) parent).getEntities();
      } else {
        _xifexpression = ((Compilation) parent).getEntities();
      }
      EList<Entity> entities = _xifexpression;
      for (final Entity other : entities) {
        if (((entity != other) && Objects.equal(entity.getName(), other.getName()))) {
          this.error("Entity names have to be unique", XSpicePackage.Literals.ENTITY__NAME);
          return;
        }
      }
    }
  }
  
  @Check
  public void checkResistor(final Resistor resistor) {
    BigDecimal _resistance = resistor.getResistance();
    boolean _tripleEquals = (_resistance == null);
    if (_tripleEquals) {
      boolean _isReferencePresent = this.isReferencePresent(resistor, resistor.getModel(), XSpicePackage.Literals.RESISTOR_MODEL);
      boolean _not = (!_isReferencePresent);
      if (_not) {
        String _name = resistor.getName();
        String _plus = ("Resistance value or valid model required for \'" + _name);
        String _plus_1 = (_plus + "\'");
        this.error(_plus_1, XSpicePackage.Literals.RESISTOR__MODEL);
      }
    }
  }
  
  @Check
  public void checkCapacitor(final Capacitor capacitor) {
    BigDecimal _capacitance = capacitor.getCapacitance();
    boolean _tripleEquals = (_capacitance == null);
    if (_tripleEquals) {
      boolean _isReferencePresent = this.isReferencePresent(capacitor, capacitor.getModel(), XSpicePackage.Literals.CAPACITOR_MODEL);
      boolean _not = (!_isReferencePresent);
      if (_not) {
        String _name = capacitor.getName();
        String _plus = ("Capacitance value or valid model required for \'" + _name);
        String _plus_1 = (_plus + "\'");
        this.error(_plus_1, XSpicePackage.Literals.CAPACITOR__MODEL);
      }
    }
  }
  
  @Check
  public void checkMutualInductance(final MutualInductance mutualInductance) {
    boolean _isReferencePresent = this.isReferencePresent(mutualInductance, mutualInductance.getInductor1(), XSpicePackage.Literals.INDUCTOR);
    boolean _not = (!_isReferencePresent);
    if (_not) {
      String _name = mutualInductance.getName();
      String _plus = ("Mutual inductance \'" + _name);
      String _plus_1 = (_plus + "\' L1 not found");
      this.error(_plus_1, XSpicePackage.Literals.MUTUAL_INDUCTANCE__INDUCTOR1);
    }
    boolean _isReferencePresent_1 = this.isReferencePresent(mutualInductance, mutualInductance.getInductor2(), XSpicePackage.Literals.INDUCTOR);
    boolean _not_1 = (!_isReferencePresent_1);
    if (_not_1) {
      String _name_1 = mutualInductance.getName();
      String _plus_2 = ("Mutual inductance \'" + _name_1);
      String _plus_3 = (_plus_2 + "\' L2 not found");
      this.error(_plus_3, XSpicePackage.Literals.MUTUAL_INDUCTANCE__INDUCTOR2);
    }
  }
  
  @Check
  public void checkCCCS(final CCCS cccs) {
    boolean _isReferencePresent = this.isReferencePresent(cccs, cccs.getController(), XSpicePackage.Literals.CURRENT_SOURCE);
    boolean _not = (!_isReferencePresent);
    if (_not) {
      String _name = cccs.getName();
      String _plus = ("CCCS \'" + _name);
      String _plus_1 = (_plus + "\' controller not found");
      this.error(_plus_1, XSpicePackage.Literals.CCCS__CONTROLLER);
    }
  }
  
  @Check
  public void checkCCVS(final CCVS ccvs) {
    boolean _isReferencePresent = this.isReferencePresent(ccvs, ccvs.getController(), XSpicePackage.Literals.CURRENT_SOURCE);
    boolean _not = (!_isReferencePresent);
    if (_not) {
      String _name = ccvs.getName();
      String _plus = ("CCVS \'" + _name);
      String _plus_1 = (_plus + "\' controller not found");
      this.error(_plus_1, XSpicePackage.Literals.CCVS__CONTROLLER);
    }
  }
  
  @Check
  public void checkVoltageSwitch(final VoltageSwitch vswitch) {
    boolean _isReferencePresent = this.isReferencePresent(vswitch, vswitch.getModel(), XSpicePackage.Literals.VOLTAGE_SWITCH_MODEL);
    boolean _not = (!_isReferencePresent);
    if (_not) {
      String _name = vswitch.getName();
      String _plus = ("Voltage Switch \'" + _name);
      String _plus_1 = (_plus + "\' model not found");
      this.error(_plus_1, XSpicePackage.Literals.VOLTAGE_SWITCH__MODEL);
    }
  }
  
  @Check
  public void checkCurrentSwitch(final VoltageSwitch cswitch) {
    boolean _isReferencePresent = this.isReferencePresent(cswitch, cswitch.getModel(), XSpicePackage.Literals.CURRENT_SWITCH_MODEL);
    boolean _not = (!_isReferencePresent);
    if (_not) {
      String _name = cswitch.getName();
      String _plus = ("Voltage Switch \'" + _name);
      String _plus_1 = (_plus + "\' model not found");
      this.error(_plus_1, XSpicePackage.Literals.CURRENT_SWITCH__MODEL);
    }
  }
  
  @Check
  public void checkDiode(final Diode diode) {
    boolean _isReferencePresent = this.isReferencePresent(diode, diode.getModel(), XSpicePackage.Literals.DIODE_MODEL);
    boolean _not = (!_isReferencePresent);
    if (_not) {
      String _name = diode.getName();
      String _plus = ("Diode \'" + _name);
      String _plus_1 = (_plus + "\' model not found");
      this.error(_plus_1, XSpicePackage.Literals.DIODE__MODEL);
    }
  }
  
  @Check
  public void checkBJT(final BJT bjt) {
    boolean _isReferencePresent = this.isReferencePresent(bjt, bjt.getModel(), XSpicePackage.Literals.BJT_MODEL);
    boolean _not = (!_isReferencePresent);
    if (_not) {
      String _name = bjt.getName();
      String _plus = ("BJT \'" + _name);
      String _plus_1 = (_plus + "\' model not found");
      this.error(_plus_1, XSpicePackage.Literals.BJT__MODEL);
    }
  }
  
  @Check
  public void checkJFET(final JFET jfet) {
    boolean _isReferencePresent = this.isReferencePresent(jfet, jfet.getModel(), XSpicePackage.Literals.JFET_MODEL);
    boolean _not = (!_isReferencePresent);
    if (_not) {
      String _name = jfet.getName();
      String _plus = ("JFET \'" + _name);
      String _plus_1 = (_plus + "\' model not found");
      this.error(_plus_1, XSpicePackage.Literals.JFET__MODEL);
    }
  }
  
  @Check
  public void checkMOS(final MOSFET mos) {
    boolean _isReferencePresent = this.isReferencePresent(mos, mos.getModel(), XSpicePackage.Literals.MOSFET_MODEL);
    boolean _not = (!_isReferencePresent);
    if (_not) {
      String _name = mos.getName();
      String _plus = ("MOSFET \'" + _name);
      String _plus_1 = (_plus + "\' model not found");
      this.error(_plus_1, XSpicePackage.Literals.MOSFET__MODEL);
    }
  }
  
  public boolean isReferencePresent(final Entity referrer, final String referenceName, final EClass referenceClass) {
    if (((referenceName == null) || (referenceClass == null))) {
      return false;
    }
    EObject parent = referrer.eContainer();
    if ((parent != null)) {
      EList<Entity> _xifexpression = null;
      EClass _eClass = parent.eClass();
      boolean _tripleEquals = (_eClass == XSpicePackage.Literals.SUB_CIRCUIT_DEFINITION);
      if (_tripleEquals) {
        _xifexpression = ((SubCircuitDefinition) parent).getEntities();
      } else {
        _xifexpression = ((Compilation) parent).getEntities();
      }
      EList<Entity> entities = _xifexpression;
      for (final Entity other : entities) {
        if ((((referrer != other) && Objects.equal(other.getName(), referenceName)) && Objects.equal(other.eClass(), referenceClass))) {
          return true;
        }
      }
    }
    return false;
  }
}
