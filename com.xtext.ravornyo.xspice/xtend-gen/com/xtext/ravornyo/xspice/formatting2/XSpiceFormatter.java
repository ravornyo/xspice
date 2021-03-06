/**
 * generated by Xtext 2.18.0.M3
 */
package com.xtext.ravornyo.xspice.formatting2;

import com.xtext.ravornyo.xspice.xSpice.Compilation;
import com.xtext.ravornyo.xspice.xSpice.Entity;
import com.xtext.ravornyo.xspice.xSpice.Output;
import com.xtext.ravornyo.xspice.xSpice.Simulation;
import com.xtext.ravornyo.xspice.xSpice.XSpicePackage;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.IHiddenRegionFormatter;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class XSpiceFormatter extends AbstractFormatter2 {
  protected void _format(final Compilation compilation, @Extension final IFormattableDocument document) {
    final EList<Entity> list = compilation.getEntities();
    final Entity lastComponent = IterableExtensions.<Entity>last(list);
    int _size = list.size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
    for (final Integer i : _doubleDotLessThan) {
      {
        final Entity component = list.get((i).intValue());
        Entity _xifexpression = null;
        int _size_1 = list.size();
        boolean _lessThan = (((i).intValue() + 1) < _size_1);
        if (_lessThan) {
          _xifexpression = list.get(((i).intValue() + 1));
        } else {
          _xifexpression = null;
        }
        final Entity nextComponent = _xifexpression;
        document.<Entity>format(component);
        if (((component == lastComponent) || ((nextComponent != null) && (nextComponent.eClass() == XSpicePackage.Literals.SUB_CIRCUIT)))) {
          final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
            it.setNewLines(1, 1, 2);
          };
          document.<Entity>append(component, _function);
        } else {
          final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
            it.newLine();
          };
          document.<Entity>append(component, _function_1);
        }
      }
    }
    EList<Simulation> _simulations = compilation.getSimulations();
    for (final Simulation simulation : _simulations) {
      {
        document.<Simulation>format(simulation);
        final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
          it.setNewLines(1);
        };
        document.<Simulation>append(simulation, _function);
      }
    }
    final Output lastOutput = IterableExtensions.<Output>last(compilation.getOutputs());
    EList<Output> _outputs = compilation.getOutputs();
    for (final Output outputCommand : _outputs) {
      {
        document.<Output>format(outputCommand);
        if ((outputCommand == lastOutput)) {
          final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
            it.setNewLines(1, 1, 2);
          };
          document.<Output>append(outputCommand, _function);
        } else {
          final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
            it.newLine();
          };
          document.<Output>append(outputCommand, _function_1);
        }
      }
    }
  }
  
  public void format(final Object compilation, final IFormattableDocument document) {
    if (compilation instanceof XtextResource) {
      _format((XtextResource)compilation, document);
      return;
    } else if (compilation instanceof Compilation) {
      _format((Compilation)compilation, document);
      return;
    } else if (compilation instanceof EObject) {
      _format((EObject)compilation, document);
      return;
    } else if (compilation == null) {
      _format((Void)null, document);
      return;
    } else if (compilation != null) {
      _format(compilation, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(compilation, document).toString());
    }
  }
}
