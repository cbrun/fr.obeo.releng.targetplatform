/*
 * generated by Xtext
 */
package fr.obeo.releng.targetplatform;

import org.eclipse.xtext.conversion.IValueConverterService;

import fr.obeo.releng.targetplatform.conversion.TargetPlatformConverter;
import fr.obeo.releng.targetplatform.util.LocationIndexBuilder;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class TargetPlatformRuntimeModule extends fr.obeo.releng.targetplatform.AbstractTargetPlatformRuntimeModule {

	@Override
	public Class<? extends IValueConverterService> bindIValueConverterService() {
		return TargetPlatformConverter.class;
	}
	
	public Class<? extends LocationIndexBuilder> bindLocationIndexBuilder() {
		return LocationIndexBuilder.class;
	}
}
