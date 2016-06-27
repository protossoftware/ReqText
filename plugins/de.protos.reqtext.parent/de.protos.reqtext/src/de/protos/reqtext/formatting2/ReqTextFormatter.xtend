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
					append(appendDefault)
			}
		]

		// recursive
		model.eContents.forEach[it.format(document)]
	}

//	def dispatch void format(RMap rMap, extension IFormattableDocument document) {
//		if(rMap.entries.size <= 1) return;
//		
//		rMap.regionFor.feature(Literals.RMAP__NAME).append[newLine]
//		rMap.interior[indent]
//		rMap.entries.forEach[
//			prepend[newLine]
//			regionFor.keyword('=>').prepend[oneSpace].append[oneSpace]
//			regionFor.keyword('[').prepend[oneSpace]
//		]
//	}
}
