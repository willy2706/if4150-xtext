/*
 * generated by Xtext
 */
package org.xtext.rplsd.cvdsl;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class CvDslUiInjectorProvider implements IInjectorProvider {
	
	@Override
	public Injector getInjector() {
		return org.xtext.rplsd.cvdsl.ui.internal.CvDslActivator.getInstance().getInjector("org.xtext.rplsd.cvdsl.CvDsl");
	}
	
}
