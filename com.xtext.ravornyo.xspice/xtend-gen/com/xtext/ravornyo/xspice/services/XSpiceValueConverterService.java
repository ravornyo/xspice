package com.xtext.ravornyo.xspice.services;

import com.google.inject.Inject;
import com.xtext.ravornyo.xspice.conversions.NumberValueConverter;
import java.math.BigDecimal;
import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;

@SuppressWarnings("all")
public class XSpiceValueConverterService extends DefaultTerminalConverters {
  @Inject
  private NumberValueConverter numberValueConverter;
  
  @ValueConverter(rule = "NUMBER")
  public IValueConverter<BigDecimal> Number() {
    return this.numberValueConverter;
  }
}
