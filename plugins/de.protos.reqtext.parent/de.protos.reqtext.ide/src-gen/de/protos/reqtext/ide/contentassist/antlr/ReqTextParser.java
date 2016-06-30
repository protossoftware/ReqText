/*
 * generated by Xtext 2.10.0
 */
package de.protos.reqtext.ide.contentassist.antlr;

import com.google.inject.Inject;
import de.protos.reqtext.ide.contentassist.antlr.internal.InternalReqTextParser;
import de.protos.reqtext.services.ReqTextGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class ReqTextParser extends AbstractContentAssistParser {

	@Inject
	private ReqTextGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalReqTextParser createParser() {
		InternalReqTextParser result = new InternalReqTextParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getRModelAccess().getAlternatives_1(), "rule__RModel__Alternatives_1");
					put(grammarAccess.getRModelAccess().getGroup(), "rule__RModel__Group__0");
					put(grammarAccess.getSpecObjectAccess().getGroup(), "rule__SpecObject__Group__0");
					put(grammarAccess.getSpecObjectAccess().getGroup_5_0(), "rule__SpecObject__Group_5_0__0");
					put(grammarAccess.getSpecObjectAccess().getGroup_5_1(), "rule__SpecObject__Group_5_1__0");
					put(grammarAccess.getSpecObjectAccess().getGroup_5_2(), "rule__SpecObject__Group_5_2__0");
					put(grammarAccess.getSpecObjectAccess().getGroup_5_3(), "rule__SpecObject__Group_5_3__0");
					put(grammarAccess.getSpecObjectAccess().getGroup_5_4(), "rule__SpecObject__Group_5_4__0");
					put(grammarAccess.getStateAccess().getGroup(), "rule__State__Group__0");
					put(grammarAccess.getClassAccess().getGroup(), "rule__Class__Group__0");
					put(grammarAccess.getVersionAccess().getGroup(), "rule__Version__Group__0");
					put(grammarAccess.getRImportAccess().getGroup(), "rule__RImport__Group__0");
					put(grammarAccess.getRModelAccess().getImportsAssignment_0(), "rule__RModel__ImportsAssignment_0");
					put(grammarAccess.getRModelAccess().getStatesAssignment_1_0(), "rule__RModel__StatesAssignment_1_0");
					put(grammarAccess.getRModelAccess().getClassesAssignment_1_1(), "rule__RModel__ClassesAssignment_1_1");
					put(grammarAccess.getRModelAccess().getObjsAssignment_1_2(), "rule__RModel__ObjsAssignment_1_2");
					put(grammarAccess.getSpecObjectAccess().getNameAssignment_1(), "rule__SpecObject__NameAssignment_1");
					put(grammarAccess.getSpecObjectAccess().getDescriptionAssignment_4(), "rule__SpecObject__DescriptionAssignment_4");
					put(grammarAccess.getSpecObjectAccess().getStateAssignment_5_0_1(), "rule__SpecObject__StateAssignment_5_0_1");
					put(grammarAccess.getSpecObjectAccess().getClassAssignment_5_1_1(), "rule__SpecObject__ClassAssignment_5_1_1");
					put(grammarAccess.getSpecObjectAccess().getVersionAssignment_5_2_1(), "rule__SpecObject__VersionAssignment_5_2_1");
					put(grammarAccess.getSpecObjectAccess().getImageAssignment_5_3_1(), "rule__SpecObject__ImageAssignment_5_3_1");
					put(grammarAccess.getSpecObjectAccess().getReferenceAssignment_5_4_1(), "rule__SpecObject__ReferenceAssignment_5_4_1");
					put(grammarAccess.getSpecObjectAccess().getChildrenAssignment_6(), "rule__SpecObject__ChildrenAssignment_6");
					put(grammarAccess.getStateAccess().getNameAssignment_1(), "rule__State__NameAssignment_1");
					put(grammarAccess.getClassAccess().getNameAssignment_1(), "rule__Class__NameAssignment_1");
					put(grammarAccess.getVersionAccess().getMajorAssignment_0(), "rule__Version__MajorAssignment_0");
					put(grammarAccess.getVersionAccess().getMinorAssignment_2(), "rule__Version__MinorAssignment_2");
					put(grammarAccess.getRImportAccess().getImportURIAssignment_1(), "rule__RImport__ImportURIAssignment_1");
					put(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5(), "rule__SpecObject__UnorderedGroup_5");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalReqTextParser typedParser = (InternalReqTextParser) parser;
			typedParser.entryRuleRModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public ReqTextGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ReqTextGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
