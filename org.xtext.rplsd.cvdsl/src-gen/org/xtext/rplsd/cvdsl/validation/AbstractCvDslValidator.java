/*
 * generated by Xtext
 */
package org.xtext.rplsd.cvdsl.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractCvDslValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.xtext.rplsd.cvdsl.cvDsl.CvDslPackage.eINSTANCE);
		return result;
	}
}
