/**
 * generated by Xtext 2.18.0.M3
 */
package com.xtext.ravornyo.xspice;

import com.xtext.ravornyo.xspice.XSpiceStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class XSpiceStandaloneSetup extends XSpiceStandaloneSetupGenerated {
  public static void doSetup() {
    new XSpiceStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}