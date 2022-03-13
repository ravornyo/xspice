/*
 * generated by Xtext 2.18.0.M3
 */
package com.xtext.ravornyo.xspice.formatting2

import com.xtext.ravornyo.xspice.xSpice.Compilation
import com.xtext.ravornyo.xspice.xSpice.XSpicePackage
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class XSpiceFormatter extends AbstractFormatter2 {

	def dispatch void format(Compilation compilation, extension IFormattableDocument document) {
		val list = compilation.entities;
		val lastComponent = list.last
		for (i : 0 ..< list.size) {
			val component = list.get(i)
			val nextComponent = (i+1 < list.size)?list.get(i+1):null
			
			component.format
			if (component === lastComponent||(nextComponent !== null && nextComponent.eClass === XSpicePackage.Literals.SUB_CIRCUIT))
      			component.append[setNewLines(1,1,2)]
      		else
      			component.append[newLine]
		}
		for (simulation : compilation.simulations) {
			simulation.format
			simulation.append[setNewLines(1)]
		}
		
		val lastOutput= compilation.outputs.last
		for (outputCommand : compilation.outputs) {
			outputCommand.format
			if (outputCommand === lastOutput)
      			outputCommand.append[setNewLines(1,1,2)]
      		else
      			outputCommand.append[newLine]
		}
	}

}
