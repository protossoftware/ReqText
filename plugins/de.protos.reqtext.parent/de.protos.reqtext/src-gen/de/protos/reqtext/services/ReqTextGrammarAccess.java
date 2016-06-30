/*
 * generated by Xtext 2.10.0
 */
package de.protos.reqtext.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class ReqTextGrammarAccess extends AbstractGrammarElementFinder {
	
	public class RModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.protos.reqtext.ReqText.RModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cImportsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cImportsRImportParserRuleCall_0_0 = (RuleCall)cImportsAssignment_0.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Assignment cStatesAssignment_1_0 = (Assignment)cAlternatives_1.eContents().get(0);
		private final RuleCall cStatesStateParserRuleCall_1_0_0 = (RuleCall)cStatesAssignment_1_0.eContents().get(0);
		private final Assignment cClassesAssignment_1_1 = (Assignment)cAlternatives_1.eContents().get(1);
		private final RuleCall cClassesClassParserRuleCall_1_1_0 = (RuleCall)cClassesAssignment_1_1.eContents().get(0);
		private final Assignment cObjsAssignment_1_2 = (Assignment)cAlternatives_1.eContents().get(2);
		private final RuleCall cObjsSpecObjectParserRuleCall_1_2_0 = (RuleCall)cObjsAssignment_1_2.eContents().get(0);
		
		//RModel:
		//	imports+=RImport* (states+=State | classes+=Class | objs+=SpecObject)*;
		@Override public ParserRule getRule() { return rule; }
		
		//imports+=RImport* (states+=State | classes+=Class | objs+=SpecObject)*
		public Group getGroup() { return cGroup; }
		
		//imports+=RImport*
		public Assignment getImportsAssignment_0() { return cImportsAssignment_0; }
		
		//RImport
		public RuleCall getImportsRImportParserRuleCall_0_0() { return cImportsRImportParserRuleCall_0_0; }
		
		//(states+=State | classes+=Class | objs+=SpecObject)*
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//states+=State
		public Assignment getStatesAssignment_1_0() { return cStatesAssignment_1_0; }
		
		//State
		public RuleCall getStatesStateParserRuleCall_1_0_0() { return cStatesStateParserRuleCall_1_0_0; }
		
		//classes+=Class
		public Assignment getClassesAssignment_1_1() { return cClassesAssignment_1_1; }
		
		//Class
		public RuleCall getClassesClassParserRuleCall_1_1_0() { return cClassesClassParserRuleCall_1_1_0; }
		
		//objs+=SpecObject
		public Assignment getObjsAssignment_1_2() { return cObjsAssignment_1_2; }
		
		//SpecObject
		public RuleCall getObjsSpecObjectParserRuleCall_1_2_0() { return cObjsSpecObjectParserRuleCall_1_2_0; }
	}
	public class SpecObjectElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.protos.reqtext.ReqText.SpecObject");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSpecObjectKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cDescriptionKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cDescriptionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cDescriptionCC_STRINGTerminalRuleCall_4_0 = (RuleCall)cDescriptionAssignment_4.eContents().get(0);
		private final Keyword cStateKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cStateAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final CrossReference cStateStateCrossReference_6_0 = (CrossReference)cStateAssignment_6.eContents().get(0);
		private final RuleCall cStateStateIDTerminalRuleCall_6_0_1 = (RuleCall)cStateStateCrossReference_6_0.eContents().get(1);
		private final Keyword cClassificationKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cClassAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final CrossReference cClassClassCrossReference_8_0 = (CrossReference)cClassAssignment_8.eContents().get(0);
		private final RuleCall cClassClassIDTerminalRuleCall_8_0_1 = (RuleCall)cClassClassCrossReference_8_0.eContents().get(1);
		private final Keyword cVersionKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Assignment cVersionAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final RuleCall cVersionVersionParserRuleCall_10_0 = (RuleCall)cVersionAssignment_10.eContents().get(0);
		private final Group cGroup_11 = (Group)cGroup.eContents().get(11);
		private final Keyword cImageKeyword_11_0 = (Keyword)cGroup_11.eContents().get(0);
		private final Assignment cImageAssignment_11_1 = (Assignment)cGroup_11.eContents().get(1);
		private final RuleCall cImageCC_STRINGTerminalRuleCall_11_1_0 = (RuleCall)cImageAssignment_11_1.eContents().get(0);
		private final Group cGroup_12 = (Group)cGroup.eContents().get(12);
		private final Keyword cReferenceKeyword_12_0 = (Keyword)cGroup_12.eContents().get(0);
		private final Assignment cReferenceAssignment_12_1 = (Assignment)cGroup_12.eContents().get(1);
		private final CrossReference cReferenceSpecObjectCrossReference_12_1_0 = (CrossReference)cReferenceAssignment_12_1.eContents().get(0);
		private final RuleCall cReferenceSpecObjectIDTerminalRuleCall_12_1_0_1 = (RuleCall)cReferenceSpecObjectCrossReference_12_1_0.eContents().get(1);
		private final Assignment cChildrenAssignment_13 = (Assignment)cGroup.eContents().get(13);
		private final RuleCall cChildrenSpecObjectParserRuleCall_13_0 = (RuleCall)cChildrenAssignment_13.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_14 = (Keyword)cGroup.eContents().get(14);
		
		//SpecObject:
		//	'SpecObject' name=ID '{'
		//	'description' description=CC_STRING
		//	'state' state=[State]
		//	'classification' class=[Class]
		//	'version' version=Version ('image' image=CC_STRING)? ('reference' reference=[SpecObject])?
		//	children+=SpecObject*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'SpecObject' name=ID '{' 'description' description=CC_STRING 'state' state=[State] 'classification' class=[Class]
		//'version' version=Version ('image' image=CC_STRING)? ('reference' reference=[SpecObject])? children+=SpecObject* '}'
		public Group getGroup() { return cGroup; }
		
		//'SpecObject'
		public Keyword getSpecObjectKeyword_0() { return cSpecObjectKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//'description'
		public Keyword getDescriptionKeyword_3() { return cDescriptionKeyword_3; }
		
		//description=CC_STRING
		public Assignment getDescriptionAssignment_4() { return cDescriptionAssignment_4; }
		
		//CC_STRING
		public RuleCall getDescriptionCC_STRINGTerminalRuleCall_4_0() { return cDescriptionCC_STRINGTerminalRuleCall_4_0; }
		
		//'state'
		public Keyword getStateKeyword_5() { return cStateKeyword_5; }
		
		//state=[State]
		public Assignment getStateAssignment_6() { return cStateAssignment_6; }
		
		//[State]
		public CrossReference getStateStateCrossReference_6_0() { return cStateStateCrossReference_6_0; }
		
		//ID
		public RuleCall getStateStateIDTerminalRuleCall_6_0_1() { return cStateStateIDTerminalRuleCall_6_0_1; }
		
		//'classification'
		public Keyword getClassificationKeyword_7() { return cClassificationKeyword_7; }
		
		//class=[Class]
		public Assignment getClassAssignment_8() { return cClassAssignment_8; }
		
		//[Class]
		public CrossReference getClassClassCrossReference_8_0() { return cClassClassCrossReference_8_0; }
		
		//ID
		public RuleCall getClassClassIDTerminalRuleCall_8_0_1() { return cClassClassIDTerminalRuleCall_8_0_1; }
		
		//'version'
		public Keyword getVersionKeyword_9() { return cVersionKeyword_9; }
		
		//version=Version
		public Assignment getVersionAssignment_10() { return cVersionAssignment_10; }
		
		//Version
		public RuleCall getVersionVersionParserRuleCall_10_0() { return cVersionVersionParserRuleCall_10_0; }
		
		//('image' image=CC_STRING)?
		public Group getGroup_11() { return cGroup_11; }
		
		//'image'
		public Keyword getImageKeyword_11_0() { return cImageKeyword_11_0; }
		
		//image=CC_STRING
		public Assignment getImageAssignment_11_1() { return cImageAssignment_11_1; }
		
		//CC_STRING
		public RuleCall getImageCC_STRINGTerminalRuleCall_11_1_0() { return cImageCC_STRINGTerminalRuleCall_11_1_0; }
		
		//('reference' reference=[SpecObject])?
		public Group getGroup_12() { return cGroup_12; }
		
		//'reference'
		public Keyword getReferenceKeyword_12_0() { return cReferenceKeyword_12_0; }
		
		//reference=[SpecObject]
		public Assignment getReferenceAssignment_12_1() { return cReferenceAssignment_12_1; }
		
		//[SpecObject]
		public CrossReference getReferenceSpecObjectCrossReference_12_1_0() { return cReferenceSpecObjectCrossReference_12_1_0; }
		
		//ID
		public RuleCall getReferenceSpecObjectIDTerminalRuleCall_12_1_0_1() { return cReferenceSpecObjectIDTerminalRuleCall_12_1_0_1; }
		
		//children+=SpecObject*
		public Assignment getChildrenAssignment_13() { return cChildrenAssignment_13; }
		
		//SpecObject
		public RuleCall getChildrenSpecObjectParserRuleCall_13_0() { return cChildrenSpecObjectParserRuleCall_13_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_14() { return cRightCurlyBracketKeyword_14; }
	}
	public class StateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.protos.reqtext.ReqText.State");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cStateKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//State:
		//	'State' name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'State' name=ID
		public Group getGroup() { return cGroup; }
		
		//'State'
		public Keyword getStateKeyword_0() { return cStateKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class ClassElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.protos.reqtext.ReqText.Class");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cClassificationKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Class:
		//	'Classification' name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'Classification' name=ID
		public Group getGroup() { return cGroup; }
		
		//'Classification'
		public Keyword getClassificationKeyword_0() { return cClassificationKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class VersionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.protos.reqtext.ReqText.Version");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cMajorAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cMajorINTTerminalRuleCall_0_0 = (RuleCall)cMajorAssignment_0.eContents().get(0);
		private final Keyword cFullStopKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cMinorAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cMinorINTTerminalRuleCall_2_0 = (RuleCall)cMinorAssignment_2.eContents().get(0);
		
		//Version:
		//	major=INT '.' minor=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//major=INT '.' minor=INT
		public Group getGroup() { return cGroup; }
		
		//major=INT
		public Assignment getMajorAssignment_0() { return cMajorAssignment_0; }
		
		//INT
		public RuleCall getMajorINTTerminalRuleCall_0_0() { return cMajorINTTerminalRuleCall_0_0; }
		
		//'.'
		public Keyword getFullStopKeyword_1() { return cFullStopKeyword_1; }
		
		//minor=INT
		public Assignment getMinorAssignment_2() { return cMinorAssignment_2; }
		
		//INT
		public RuleCall getMinorINTTerminalRuleCall_2_0() { return cMinorINTTerminalRuleCall_2_0; }
	}
	public class RImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.protos.reqtext.ReqText.RImport");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cImportURIAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cImportURISTRINGTerminalRuleCall_1_0 = (RuleCall)cImportURIAssignment_1.eContents().get(0);
		
		//RImport:
		//	'import' importURI=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'import' importURI=STRING
		public Group getGroup() { return cGroup; }
		
		//'import'
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }
		
		//importURI=STRING
		public Assignment getImportURIAssignment_1() { return cImportURIAssignment_1; }
		
		//STRING
		public RuleCall getImportURISTRINGTerminalRuleCall_1_0() { return cImportURISTRINGTerminalRuleCall_1_0; }
	}
	
	
	private final RModelElements pRModel;
	private final SpecObjectElements pSpecObject;
	private final StateElements pState;
	private final ClassElements pClass;
	private final VersionElements pVersion;
	private final RImportElements pRImport;
	private final TerminalRule tCC_STRING;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ReqTextGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pRModel = new RModelElements();
		this.pSpecObject = new SpecObjectElements();
		this.pState = new StateElements();
		this.pClass = new ClassElements();
		this.pVersion = new VersionElements();
		this.pRImport = new RImportElements();
		this.tCC_STRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "de.protos.reqtext.ReqText.CC_STRING");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("de.protos.reqtext.ReqText".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//RModel:
	//	imports+=RImport* (states+=State | classes+=Class | objs+=SpecObject)*;
	public RModelElements getRModelAccess() {
		return pRModel;
	}
	
	public ParserRule getRModelRule() {
		return getRModelAccess().getRule();
	}
	
	//SpecObject:
	//	'SpecObject' name=ID '{'
	//	'description' description=CC_STRING
	//	'state' state=[State]
	//	'classification' class=[Class]
	//	'version' version=Version ('image' image=CC_STRING)? ('reference' reference=[SpecObject])?
	//	children+=SpecObject*
	//	'}';
	public SpecObjectElements getSpecObjectAccess() {
		return pSpecObject;
	}
	
	public ParserRule getSpecObjectRule() {
		return getSpecObjectAccess().getRule();
	}
	
	//State:
	//	'State' name=ID;
	public StateElements getStateAccess() {
		return pState;
	}
	
	public ParserRule getStateRule() {
		return getStateAccess().getRule();
	}
	
	//Class:
	//	'Classification' name=ID;
	public ClassElements getClassAccess() {
		return pClass;
	}
	
	public ParserRule getClassRule() {
		return getClassAccess().getRule();
	}
	
	//Version:
	//	major=INT '.' minor=INT;
	public VersionElements getVersionAccess() {
		return pVersion;
	}
	
	public ParserRule getVersionRule() {
		return getVersionAccess().getRule();
	}
	
	//RImport:
	//	'import' importURI=STRING;
	public RImportElements getRImportAccess() {
		return pRImport;
	}
	
	public ParserRule getRImportRule() {
		return getRImportAccess().getRule();
	}
	
	//terminal CC_STRING:
	//	"'''"->"'''";
	public TerminalRule getCC_STRINGRule() {
		return tCC_STRING;
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
