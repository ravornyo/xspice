/**
 * generated by Xtext 2.18.0.M3
 */
package com.xtext.ravornyo.xspice.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.xtext.ravornyo.xspice.XSpiceRuntimeModule;
import com.xtext.ravornyo.xspice.XSpiceStandaloneSetup;
import com.xtext.ravornyo.xspice.ide.XSpiceIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class XSpiceIdeSetup extends XSpiceStandaloneSetup {
  @Override
  public Injector createInjector() {
    XSpiceRuntimeModule _xSpiceRuntimeModule = new XSpiceRuntimeModule();
    XSpiceIdeModule _xSpiceIdeModule = new XSpiceIdeModule();
    return Guice.createInjector(Modules2.mixin(_xSpiceRuntimeModule, _xSpiceIdeModule));
  }
}
