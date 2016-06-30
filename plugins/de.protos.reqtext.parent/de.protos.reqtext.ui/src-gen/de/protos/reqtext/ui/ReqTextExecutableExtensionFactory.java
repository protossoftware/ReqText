/*
 * generated by Xtext 2.9.1
 */
package de.protos.reqtext.ui;

import com.google.inject.Injector;
import de.protos.reqtext.ui.internal.ReqtextActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ReqTextExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return ReqtextActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return ReqtextActivator.getInstance().getInjector(ReqtextActivator.DE_PROTOS_REQTEXT_REQTEXT);
	}
	
}
