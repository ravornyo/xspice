/**
 * generated by Xtext 2.18.0.M3
 */
package com.xtext.ravornyo.xspice.web;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.xtext.ravornyo.xspice.XSpiceRuntimeModule;
import com.xtext.ravornyo.xspice.XSpiceStandaloneSetup;
import com.xtext.ravornyo.xspice.ide.XSpiceIdeModule;
import com.xtext.ravornyo.xspice.web.XSpiceWebModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages in web applications.
 */
@SuppressWarnings("all")
public class XSpiceWebSetup extends XSpiceStandaloneSetup {
  @Override
  public Injector createInjector() {
    XSpiceRuntimeModule _xSpiceRuntimeModule = new XSpiceRuntimeModule();
    XSpiceIdeModule _xSpiceIdeModule = new XSpiceIdeModule();
    XSpiceWebModule _xSpiceWebModule = new XSpiceWebModule();
    return Guice.createInjector(Modules2.mixin(_xSpiceRuntimeModule, _xSpiceIdeModule, _xSpiceWebModule));
  }
}
