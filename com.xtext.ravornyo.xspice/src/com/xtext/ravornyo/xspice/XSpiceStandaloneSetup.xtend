/*
 * generated by Xtext 2.18.0.M3
 */
package com.xtext.ravornyo.xspice


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class XSpiceStandaloneSetup extends XSpiceStandaloneSetupGenerated {

	def static void doSetup() {
		new XSpiceStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
