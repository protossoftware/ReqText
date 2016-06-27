package de.protos.reqtext.converter;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;

public class FeaturizerConverterService extends DefaultTerminalConverters {

	@ValueConverter(rule = "CC_STRING")
	public IValueConverter<String> getCC_StringConverter() {
		return new CC_StringConveter();
	}
}
