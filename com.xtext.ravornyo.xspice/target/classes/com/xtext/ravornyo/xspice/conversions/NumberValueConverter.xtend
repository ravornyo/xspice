package com.xtext.ravornyo.xspice.conversions

import org.eclipse.xtext.conversion.impl.AbstractToStringConverter
import java.math.BigDecimal
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.conversion.ValueConverterException

class NumberValueConverter extends AbstractToStringConverter<BigDecimal>{

	override 
	protected internalToValue(String value, INode node) throws ValueConverterException {
		var String suffix = value.substring(value.length() - 1);
		var String prefix = value.substring(0, value.length() - 1);
		switch suffix {
			case 'E': return new BigDecimal(prefix + 'E18')
			case 'P': return new BigDecimal(prefix + 'E15')
			case 'T': return new BigDecimal(prefix + 'E12')
			case 'G': return new BigDecimal(prefix + 'E9')
			case 'M': return new BigDecimal(prefix + 'E6')
			case 'k': return new BigDecimal(prefix + 'E3')
			case 'K': return new BigDecimal(prefix + 'E3')
			case 'H': return new BigDecimal(prefix + 'E2')
			case 'd': return new BigDecimal(prefix + 'E1')
			case 'c': return new BigDecimal(prefix + 'E-2')
			case 'm': return new BigDecimal(prefix + 'E-3')			
			case 'U': return new BigDecimal(prefix + 'E-6')
			case 'u': return new BigDecimal(prefix + 'E-6')
			case 'μ': return new BigDecimal(prefix + 'E-6')
			case 'n': return new BigDecimal(prefix + 'E-9')
			case 'p': return new BigDecimal(prefix + 'E-12')
			case 'f': return new BigDecimal(prefix + 'E-15')
			case 'a': return new BigDecimal(prefix + 'E-18')
			default: return new BigDecimal(value)
		}
	}
}