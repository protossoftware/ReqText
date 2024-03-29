/*
 * generated by Xtext 2.9.2
 */
package de.protos.reqtext.formatting2

import com.google.inject.Inject
import de.protos.reqtext.reqText.RModel
import de.protos.reqtext.services.ReqTextGrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.eclipse.xtext.formatting2.IHiddenRegionFormatter
import de.protos.reqtext.reqText.SpecObject
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EReference
import de.protos.reqtext.reqText.ReqTextPackage.Literals

class ReqTextFormatter extends AbstractFormatter2 {

	@Inject extension ReqTextGrammarAccess

	// defaults
	val (IHiddenRegionFormatter)=>void appendDefault = [setNewLines(1, 1, 2)]

	def dispatch void format(RModel model, extension IFormattableDocument document) {
		model.allRegionsFor.keywords(',').forEach[prepend[noSpace].append[oneSpace]]

		model.eContents.forEach [
			switch it {
				case model.imports.last:
					append[setNewLines(2, 2, 3)]
				default:
					append[setNewLines(1, 2, 2)]
			}
		]

		// recursive
		model.eContents.forEach[it.format(document)]
	}
	
	def dispatch void format(SpecObject obj, extension IFormattableDocument document){
		obj.regionFor.keyword('{').prepend[oneSpace].append(appendDefault)
		obj.interior[indent]
		obj.eClass.EStructuralFeatures.filter(EAttribute).filter[it != Literals.SPEC_OBJECT__NAME].forEach[obj.regionFor.feature(it).prepend[oneSpace].append(appendDefault)]
		obj.eClass.EStructuralFeatures.filter(EReference).filter[!containment].forEach[obj.regionFor.feature(it).prepend[oneSpace].append(appendDefault)]
		obj.eContents.forEach[prepend[oneSpace].append(appendDefault)]
		
		obj.children.forEach[it.format(document)]
	}
}
