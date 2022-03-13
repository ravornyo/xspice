package com.xtext.ravornyo.xspice.services

import com.google.inject.Inject
import com.xtext.ravornyo.xspice.conversions.NumberValueConverter
import java.math.BigDecimal
import org.eclipse.xtext.common.services.DefaultTerminalConverters
import org.eclipse.xtext.conversion.IValueConverter
import org.eclipse.xtext.conversion.ValueConverter

class XSpiceValueConverterService extends DefaultTerminalConverters {
	@Inject NumberValueConverter numberValueConverter;
	
	@ValueConverter(rule = "NUMBER")
	def IValueConverter<BigDecimal> Number() { numberValueConverter }
}