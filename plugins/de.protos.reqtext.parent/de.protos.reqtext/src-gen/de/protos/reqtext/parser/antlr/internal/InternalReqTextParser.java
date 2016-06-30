package de.protos.reqtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.protos.reqtext.services.ReqTextGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalReqTextParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_CC_STRING", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SpecObject'", "'{'", "'description'", "'state'", "'classification'", "'version'", "'image'", "'reference'", "'}'", "'State'", "'Classification'", "'.'", "'import'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int RULE_CC_STRING=5;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalReqTextParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalReqTextParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalReqTextParser.tokenNames; }
    public String getGrammarFileName() { return "InternalReqText.g"; }



     	private ReqTextGrammarAccess grammarAccess;

        public InternalReqTextParser(TokenStream input, ReqTextGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "RModel";
       	}

       	@Override
       	protected ReqTextGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRModel"
    // InternalReqText.g:64:1: entryRuleRModel returns [EObject current=null] : iv_ruleRModel= ruleRModel EOF ;
    public final EObject entryRuleRModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRModel = null;


        try {
            // InternalReqText.g:64:47: (iv_ruleRModel= ruleRModel EOF )
            // InternalReqText.g:65:2: iv_ruleRModel= ruleRModel EOF
            {
             newCompositeNode(grammarAccess.getRModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRModel=ruleRModel();

            state._fsp--;

             current =iv_ruleRModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRModel"


    // $ANTLR start "ruleRModel"
    // InternalReqText.g:71:1: ruleRModel returns [EObject current=null] : ( ( (lv_imports_0_0= ruleRImport ) )* ( ( (lv_states_1_0= ruleState ) ) | ( (lv_classes_2_0= ruleClass ) ) | ( (lv_objs_3_0= ruleSpecObject ) ) ) ) ;
    public final EObject ruleRModel() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_states_1_0 = null;

        EObject lv_classes_2_0 = null;

        EObject lv_objs_3_0 = null;



        	enterRule();

        try {
            // InternalReqText.g:77:2: ( ( ( (lv_imports_0_0= ruleRImport ) )* ( ( (lv_states_1_0= ruleState ) ) | ( (lv_classes_2_0= ruleClass ) ) | ( (lv_objs_3_0= ruleSpecObject ) ) ) ) )
            // InternalReqText.g:78:2: ( ( (lv_imports_0_0= ruleRImport ) )* ( ( (lv_states_1_0= ruleState ) ) | ( (lv_classes_2_0= ruleClass ) ) | ( (lv_objs_3_0= ruleSpecObject ) ) ) )
            {
            // InternalReqText.g:78:2: ( ( (lv_imports_0_0= ruleRImport ) )* ( ( (lv_states_1_0= ruleState ) ) | ( (lv_classes_2_0= ruleClass ) ) | ( (lv_objs_3_0= ruleSpecObject ) ) ) )
            // InternalReqText.g:79:3: ( (lv_imports_0_0= ruleRImport ) )* ( ( (lv_states_1_0= ruleState ) ) | ( (lv_classes_2_0= ruleClass ) ) | ( (lv_objs_3_0= ruleSpecObject ) ) )
            {
            // InternalReqText.g:79:3: ( (lv_imports_0_0= ruleRImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==24) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalReqText.g:80:4: (lv_imports_0_0= ruleRImport )
            	    {
            	    // InternalReqText.g:80:4: (lv_imports_0_0= ruleRImport )
            	    // InternalReqText.g:81:5: lv_imports_0_0= ruleRImport
            	    {

            	    					newCompositeNode(grammarAccess.getRModelAccess().getImportsRImportParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_imports_0_0=ruleRImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_0_0,
            	    						"de.protos.reqtext.ReqText.RImport");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalReqText.g:98:3: ( ( (lv_states_1_0= ruleState ) ) | ( (lv_classes_2_0= ruleClass ) ) | ( (lv_objs_3_0= ruleSpecObject ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt2=1;
                }
                break;
            case 22:
                {
                alt2=2;
                }
                break;
            case 12:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalReqText.g:99:4: ( (lv_states_1_0= ruleState ) )
                    {
                    // InternalReqText.g:99:4: ( (lv_states_1_0= ruleState ) )
                    // InternalReqText.g:100:5: (lv_states_1_0= ruleState )
                    {
                    // InternalReqText.g:100:5: (lv_states_1_0= ruleState )
                    // InternalReqText.g:101:6: lv_states_1_0= ruleState
                    {

                    						newCompositeNode(grammarAccess.getRModelAccess().getStatesStateParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_states_1_0=ruleState();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRModelRule());
                    						}
                    						add(
                    							current,
                    							"states",
                    							lv_states_1_0,
                    							"de.protos.reqtext.ReqText.State");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalReqText.g:119:4: ( (lv_classes_2_0= ruleClass ) )
                    {
                    // InternalReqText.g:119:4: ( (lv_classes_2_0= ruleClass ) )
                    // InternalReqText.g:120:5: (lv_classes_2_0= ruleClass )
                    {
                    // InternalReqText.g:120:5: (lv_classes_2_0= ruleClass )
                    // InternalReqText.g:121:6: lv_classes_2_0= ruleClass
                    {

                    						newCompositeNode(grammarAccess.getRModelAccess().getClassesClassParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_classes_2_0=ruleClass();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRModelRule());
                    						}
                    						add(
                    							current,
                    							"classes",
                    							lv_classes_2_0,
                    							"de.protos.reqtext.ReqText.Class");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalReqText.g:139:4: ( (lv_objs_3_0= ruleSpecObject ) )
                    {
                    // InternalReqText.g:139:4: ( (lv_objs_3_0= ruleSpecObject ) )
                    // InternalReqText.g:140:5: (lv_objs_3_0= ruleSpecObject )
                    {
                    // InternalReqText.g:140:5: (lv_objs_3_0= ruleSpecObject )
                    // InternalReqText.g:141:6: lv_objs_3_0= ruleSpecObject
                    {

                    						newCompositeNode(grammarAccess.getRModelAccess().getObjsSpecObjectParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_objs_3_0=ruleSpecObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRModelRule());
                    						}
                    						add(
                    							current,
                    							"objs",
                    							lv_objs_3_0,
                    							"de.protos.reqtext.ReqText.SpecObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRModel"


    // $ANTLR start "entryRuleSpecObject"
    // InternalReqText.g:163:1: entryRuleSpecObject returns [EObject current=null] : iv_ruleSpecObject= ruleSpecObject EOF ;
    public final EObject entryRuleSpecObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecObject = null;


        try {
            // InternalReqText.g:163:51: (iv_ruleSpecObject= ruleSpecObject EOF )
            // InternalReqText.g:164:2: iv_ruleSpecObject= ruleSpecObject EOF
            {
             newCompositeNode(grammarAccess.getSpecObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpecObject=ruleSpecObject();

            state._fsp--;

             current =iv_ruleSpecObject; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpecObject"


    // $ANTLR start "ruleSpecObject"
    // InternalReqText.g:170:1: ruleSpecObject returns [EObject current=null] : (otherlv_0= 'SpecObject' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= RULE_CC_STRING ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'state' ( (otherlv_7= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'classification' ( (otherlv_9= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'version' ( (lv_version_11_0= ruleVersion ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'image' ( (lv_image_13_0= RULE_CC_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'reference' ( (otherlv_15= RULE_ID ) ) ) ) ) ) )+ {...}?) ) ) ( (lv_children_16_0= ruleSpecObject ) )* otherlv_17= '}' ) ;
    public final EObject ruleSpecObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token lv_image_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        EObject lv_version_11_0 = null;

        EObject lv_children_16_0 = null;



        	enterRule();

        try {
            // InternalReqText.g:176:2: ( (otherlv_0= 'SpecObject' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= RULE_CC_STRING ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'state' ( (otherlv_7= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'classification' ( (otherlv_9= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'version' ( (lv_version_11_0= ruleVersion ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'image' ( (lv_image_13_0= RULE_CC_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'reference' ( (otherlv_15= RULE_ID ) ) ) ) ) ) )+ {...}?) ) ) ( (lv_children_16_0= ruleSpecObject ) )* otherlv_17= '}' ) )
            // InternalReqText.g:177:2: (otherlv_0= 'SpecObject' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= RULE_CC_STRING ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'state' ( (otherlv_7= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'classification' ( (otherlv_9= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'version' ( (lv_version_11_0= ruleVersion ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'image' ( (lv_image_13_0= RULE_CC_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'reference' ( (otherlv_15= RULE_ID ) ) ) ) ) ) )+ {...}?) ) ) ( (lv_children_16_0= ruleSpecObject ) )* otherlv_17= '}' )
            {
            // InternalReqText.g:177:2: (otherlv_0= 'SpecObject' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= RULE_CC_STRING ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'state' ( (otherlv_7= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'classification' ( (otherlv_9= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'version' ( (lv_version_11_0= ruleVersion ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'image' ( (lv_image_13_0= RULE_CC_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'reference' ( (otherlv_15= RULE_ID ) ) ) ) ) ) )+ {...}?) ) ) ( (lv_children_16_0= ruleSpecObject ) )* otherlv_17= '}' )
            // InternalReqText.g:178:3: otherlv_0= 'SpecObject' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= RULE_CC_STRING ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'state' ( (otherlv_7= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'classification' ( (otherlv_9= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'version' ( (lv_version_11_0= ruleVersion ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'image' ( (lv_image_13_0= RULE_CC_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'reference' ( (otherlv_15= RULE_ID ) ) ) ) ) ) )+ {...}?) ) ) ( (lv_children_16_0= ruleSpecObject ) )* otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSpecObjectAccess().getSpecObjectKeyword_0());
            		
            // InternalReqText.g:182:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalReqText.g:183:4: (lv_name_1_0= RULE_ID )
            {
            // InternalReqText.g:183:4: (lv_name_1_0= RULE_ID )
            // InternalReqText.g:184:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSpecObjectAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSpecObjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getSpecObjectAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getSpecObjectAccess().getDescriptionKeyword_3());
            		
            // InternalReqText.g:208:3: ( (lv_description_4_0= RULE_CC_STRING ) )
            // InternalReqText.g:209:4: (lv_description_4_0= RULE_CC_STRING )
            {
            // InternalReqText.g:209:4: (lv_description_4_0= RULE_CC_STRING )
            // InternalReqText.g:210:5: lv_description_4_0= RULE_CC_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_CC_STRING,FOLLOW_8); 

            					newLeafNode(lv_description_4_0, grammarAccess.getSpecObjectAccess().getDescriptionCC_STRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSpecObjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_4_0,
            						"de.protos.reqtext.ReqText.CC_STRING");
            				

            }


            }

            // InternalReqText.g:226:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'state' ( (otherlv_7= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'classification' ( (otherlv_9= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'version' ( (lv_version_11_0= ruleVersion ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'image' ( (lv_image_13_0= RULE_CC_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'reference' ( (otherlv_15= RULE_ID ) ) ) ) ) ) )+ {...}?) ) )
            // InternalReqText.g:227:4: ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'state' ( (otherlv_7= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'classification' ( (otherlv_9= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'version' ( (lv_version_11_0= ruleVersion ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'image' ( (lv_image_13_0= RULE_CC_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'reference' ( (otherlv_15= RULE_ID ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalReqText.g:227:4: ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'state' ( (otherlv_7= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'classification' ( (otherlv_9= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'version' ( (lv_version_11_0= ruleVersion ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'image' ( (lv_image_13_0= RULE_CC_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'reference' ( (otherlv_15= RULE_ID ) ) ) ) ) ) )+ {...}?) )
            // InternalReqText.g:228:5: ( ( ({...}? => ( ({...}? => (otherlv_6= 'state' ( (otherlv_7= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'classification' ( (otherlv_9= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'version' ( (lv_version_11_0= ruleVersion ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'image' ( (lv_image_13_0= RULE_CC_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'reference' ( (otherlv_15= RULE_ID ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5());
            				
            // InternalReqText.g:231:5: ( ( ({...}? => ( ({...}? => (otherlv_6= 'state' ( (otherlv_7= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'classification' ( (otherlv_9= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'version' ( (lv_version_11_0= ruleVersion ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'image' ( (lv_image_13_0= RULE_CC_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'reference' ( (otherlv_15= RULE_ID ) ) ) ) ) ) )+ {...}?)
            // InternalReqText.g:232:6: ( ({...}? => ( ({...}? => (otherlv_6= 'state' ( (otherlv_7= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'classification' ( (otherlv_9= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'version' ( (lv_version_11_0= ruleVersion ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'image' ( (lv_image_13_0= RULE_CC_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'reference' ( (otherlv_15= RULE_ID ) ) ) ) ) ) )+ {...}?
            {
            // InternalReqText.g:232:6: ( ({...}? => ( ({...}? => (otherlv_6= 'state' ( (otherlv_7= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'classification' ( (otherlv_9= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'version' ( (lv_version_11_0= ruleVersion ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'image' ( (lv_image_13_0= RULE_CC_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'reference' ( (otherlv_15= RULE_ID ) ) ) ) ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=6;
                int LA3_0 = input.LA(1);

                if ( LA3_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5(), 0) ) {
                    alt3=1;
                }
                else if ( LA3_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5(), 1) ) {
                    alt3=2;
                }
                else if ( LA3_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5(), 2) ) {
                    alt3=3;
                }
                else if ( LA3_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5(), 3) ) {
                    alt3=4;
                }
                else if ( LA3_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5(), 4) ) {
                    alt3=5;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalReqText.g:233:4: ({...}? => ( ({...}? => (otherlv_6= 'state' ( (otherlv_7= RULE_ID ) ) ) ) ) )
            	    {
            	    // InternalReqText.g:233:4: ({...}? => ( ({...}? => (otherlv_6= 'state' ( (otherlv_7= RULE_ID ) ) ) ) ) )
            	    // InternalReqText.g:234:5: {...}? => ( ({...}? => (otherlv_6= 'state' ( (otherlv_7= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSpecObject", "getUnorderedGroupHelper().canSelect(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5(), 0)");
            	    }
            	    // InternalReqText.g:234:107: ( ({...}? => (otherlv_6= 'state' ( (otherlv_7= RULE_ID ) ) ) ) )
            	    // InternalReqText.g:235:6: ({...}? => (otherlv_6= 'state' ( (otherlv_7= RULE_ID ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5(), 0);
            	    					
            	    // InternalReqText.g:238:9: ({...}? => (otherlv_6= 'state' ( (otherlv_7= RULE_ID ) ) ) )
            	    // InternalReqText.g:238:10: {...}? => (otherlv_6= 'state' ( (otherlv_7= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSpecObject", "true");
            	    }
            	    // InternalReqText.g:238:19: (otherlv_6= 'state' ( (otherlv_7= RULE_ID ) ) )
            	    // InternalReqText.g:238:20: otherlv_6= 'state' ( (otherlv_7= RULE_ID ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_4); 

            	    									newLeafNode(otherlv_6, grammarAccess.getSpecObjectAccess().getStateKeyword_5_0_0());
            	    								
            	    // InternalReqText.g:242:9: ( (otherlv_7= RULE_ID ) )
            	    // InternalReqText.g:243:10: (otherlv_7= RULE_ID )
            	    {
            	    // InternalReqText.g:243:10: (otherlv_7= RULE_ID )
            	    // InternalReqText.g:244:11: otherlv_7= RULE_ID
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getSpecObjectRule());
            	    											}
            	    										
            	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_9); 

            	    											newLeafNode(otherlv_7, grammarAccess.getSpecObjectAccess().getStateStateCrossReference_5_0_1_0());
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalReqText.g:261:4: ({...}? => ( ({...}? => (otherlv_8= 'classification' ( (otherlv_9= RULE_ID ) ) ) ) ) )
            	    {
            	    // InternalReqText.g:261:4: ({...}? => ( ({...}? => (otherlv_8= 'classification' ( (otherlv_9= RULE_ID ) ) ) ) ) )
            	    // InternalReqText.g:262:5: {...}? => ( ({...}? => (otherlv_8= 'classification' ( (otherlv_9= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSpecObject", "getUnorderedGroupHelper().canSelect(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5(), 1)");
            	    }
            	    // InternalReqText.g:262:107: ( ({...}? => (otherlv_8= 'classification' ( (otherlv_9= RULE_ID ) ) ) ) )
            	    // InternalReqText.g:263:6: ({...}? => (otherlv_8= 'classification' ( (otherlv_9= RULE_ID ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5(), 1);
            	    					
            	    // InternalReqText.g:266:9: ({...}? => (otherlv_8= 'classification' ( (otherlv_9= RULE_ID ) ) ) )
            	    // InternalReqText.g:266:10: {...}? => (otherlv_8= 'classification' ( (otherlv_9= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSpecObject", "true");
            	    }
            	    // InternalReqText.g:266:19: (otherlv_8= 'classification' ( (otherlv_9= RULE_ID ) ) )
            	    // InternalReqText.g:266:20: otherlv_8= 'classification' ( (otherlv_9= RULE_ID ) )
            	    {
            	    otherlv_8=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_8, grammarAccess.getSpecObjectAccess().getClassificationKeyword_5_1_0());
            	    								
            	    // InternalReqText.g:270:9: ( (otherlv_9= RULE_ID ) )
            	    // InternalReqText.g:271:10: (otherlv_9= RULE_ID )
            	    {
            	    // InternalReqText.g:271:10: (otherlv_9= RULE_ID )
            	    // InternalReqText.g:272:11: otherlv_9= RULE_ID
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getSpecObjectRule());
            	    											}
            	    										
            	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_9); 

            	    											newLeafNode(otherlv_9, grammarAccess.getSpecObjectAccess().getClassClassCrossReference_5_1_1_0());
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalReqText.g:289:4: ({...}? => ( ({...}? => (otherlv_10= 'version' ( (lv_version_11_0= ruleVersion ) ) ) ) ) )
            	    {
            	    // InternalReqText.g:289:4: ({...}? => ( ({...}? => (otherlv_10= 'version' ( (lv_version_11_0= ruleVersion ) ) ) ) ) )
            	    // InternalReqText.g:290:5: {...}? => ( ({...}? => (otherlv_10= 'version' ( (lv_version_11_0= ruleVersion ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleSpecObject", "getUnorderedGroupHelper().canSelect(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5(), 2)");
            	    }
            	    // InternalReqText.g:290:107: ( ({...}? => (otherlv_10= 'version' ( (lv_version_11_0= ruleVersion ) ) ) ) )
            	    // InternalReqText.g:291:6: ({...}? => (otherlv_10= 'version' ( (lv_version_11_0= ruleVersion ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5(), 2);
            	    					
            	    // InternalReqText.g:294:9: ({...}? => (otherlv_10= 'version' ( (lv_version_11_0= ruleVersion ) ) ) )
            	    // InternalReqText.g:294:10: {...}? => (otherlv_10= 'version' ( (lv_version_11_0= ruleVersion ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSpecObject", "true");
            	    }
            	    // InternalReqText.g:294:19: (otherlv_10= 'version' ( (lv_version_11_0= ruleVersion ) ) )
            	    // InternalReqText.g:294:20: otherlv_10= 'version' ( (lv_version_11_0= ruleVersion ) )
            	    {
            	    otherlv_10=(Token)match(input,17,FOLLOW_10); 

            	    									newLeafNode(otherlv_10, grammarAccess.getSpecObjectAccess().getVersionKeyword_5_2_0());
            	    								
            	    // InternalReqText.g:298:9: ( (lv_version_11_0= ruleVersion ) )
            	    // InternalReqText.g:299:10: (lv_version_11_0= ruleVersion )
            	    {
            	    // InternalReqText.g:299:10: (lv_version_11_0= ruleVersion )
            	    // InternalReqText.g:300:11: lv_version_11_0= ruleVersion
            	    {

            	    											newCompositeNode(grammarAccess.getSpecObjectAccess().getVersionVersionParserRuleCall_5_2_1_0());
            	    										
            	    pushFollow(FOLLOW_9);
            	    lv_version_11_0=ruleVersion();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSpecObjectRule());
            	    											}
            	    											set(
            	    												current,
            	    												"version",
            	    												lv_version_11_0,
            	    												"de.protos.reqtext.ReqText.Version");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalReqText.g:323:4: ({...}? => ( ({...}? => (otherlv_12= 'image' ( (lv_image_13_0= RULE_CC_STRING ) ) ) ) ) )
            	    {
            	    // InternalReqText.g:323:4: ({...}? => ( ({...}? => (otherlv_12= 'image' ( (lv_image_13_0= RULE_CC_STRING ) ) ) ) ) )
            	    // InternalReqText.g:324:5: {...}? => ( ({...}? => (otherlv_12= 'image' ( (lv_image_13_0= RULE_CC_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleSpecObject", "getUnorderedGroupHelper().canSelect(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5(), 3)");
            	    }
            	    // InternalReqText.g:324:107: ( ({...}? => (otherlv_12= 'image' ( (lv_image_13_0= RULE_CC_STRING ) ) ) ) )
            	    // InternalReqText.g:325:6: ({...}? => (otherlv_12= 'image' ( (lv_image_13_0= RULE_CC_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5(), 3);
            	    					
            	    // InternalReqText.g:328:9: ({...}? => (otherlv_12= 'image' ( (lv_image_13_0= RULE_CC_STRING ) ) ) )
            	    // InternalReqText.g:328:10: {...}? => (otherlv_12= 'image' ( (lv_image_13_0= RULE_CC_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSpecObject", "true");
            	    }
            	    // InternalReqText.g:328:19: (otherlv_12= 'image' ( (lv_image_13_0= RULE_CC_STRING ) ) )
            	    // InternalReqText.g:328:20: otherlv_12= 'image' ( (lv_image_13_0= RULE_CC_STRING ) )
            	    {
            	    otherlv_12=(Token)match(input,18,FOLLOW_7); 

            	    									newLeafNode(otherlv_12, grammarAccess.getSpecObjectAccess().getImageKeyword_5_3_0());
            	    								
            	    // InternalReqText.g:332:9: ( (lv_image_13_0= RULE_CC_STRING ) )
            	    // InternalReqText.g:333:10: (lv_image_13_0= RULE_CC_STRING )
            	    {
            	    // InternalReqText.g:333:10: (lv_image_13_0= RULE_CC_STRING )
            	    // InternalReqText.g:334:11: lv_image_13_0= RULE_CC_STRING
            	    {
            	    lv_image_13_0=(Token)match(input,RULE_CC_STRING,FOLLOW_9); 

            	    											newLeafNode(lv_image_13_0, grammarAccess.getSpecObjectAccess().getImageCC_STRINGTerminalRuleCall_5_3_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getSpecObjectRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"image",
            	    												lv_image_13_0,
            	    												"de.protos.reqtext.ReqText.CC_STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalReqText.g:356:4: ({...}? => ( ({...}? => (otherlv_14= 'reference' ( (otherlv_15= RULE_ID ) ) ) ) ) )
            	    {
            	    // InternalReqText.g:356:4: ({...}? => ( ({...}? => (otherlv_14= 'reference' ( (otherlv_15= RULE_ID ) ) ) ) ) )
            	    // InternalReqText.g:357:5: {...}? => ( ({...}? => (otherlv_14= 'reference' ( (otherlv_15= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleSpecObject", "getUnorderedGroupHelper().canSelect(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5(), 4)");
            	    }
            	    // InternalReqText.g:357:107: ( ({...}? => (otherlv_14= 'reference' ( (otherlv_15= RULE_ID ) ) ) ) )
            	    // InternalReqText.g:358:6: ({...}? => (otherlv_14= 'reference' ( (otherlv_15= RULE_ID ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5(), 4);
            	    					
            	    // InternalReqText.g:361:9: ({...}? => (otherlv_14= 'reference' ( (otherlv_15= RULE_ID ) ) ) )
            	    // InternalReqText.g:361:10: {...}? => (otherlv_14= 'reference' ( (otherlv_15= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSpecObject", "true");
            	    }
            	    // InternalReqText.g:361:19: (otherlv_14= 'reference' ( (otherlv_15= RULE_ID ) ) )
            	    // InternalReqText.g:361:20: otherlv_14= 'reference' ( (otherlv_15= RULE_ID ) )
            	    {
            	    otherlv_14=(Token)match(input,19,FOLLOW_4); 

            	    									newLeafNode(otherlv_14, grammarAccess.getSpecObjectAccess().getReferenceKeyword_5_4_0());
            	    								
            	    // InternalReqText.g:365:9: ( (otherlv_15= RULE_ID ) )
            	    // InternalReqText.g:366:10: (otherlv_15= RULE_ID )
            	    {
            	    // InternalReqText.g:366:10: (otherlv_15= RULE_ID )
            	    // InternalReqText.g:367:11: otherlv_15= RULE_ID
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getSpecObjectRule());
            	    											}
            	    										
            	    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_9); 

            	    											newLeafNode(otherlv_15, grammarAccess.getSpecObjectAccess().getReferenceSpecObjectCrossReference_5_4_1_0());
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5()) ) {
                throw new FailedPredicateException(input, "ruleSpecObject", "getUnorderedGroupHelper().canLeave(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5());
            				

            }

            // InternalReqText.g:392:3: ( (lv_children_16_0= ruleSpecObject ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==12) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalReqText.g:393:4: (lv_children_16_0= ruleSpecObject )
            	    {
            	    // InternalReqText.g:393:4: (lv_children_16_0= ruleSpecObject )
            	    // InternalReqText.g:394:5: lv_children_16_0= ruleSpecObject
            	    {

            	    					newCompositeNode(grammarAccess.getSpecObjectAccess().getChildrenSpecObjectParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_children_16_0=ruleSpecObject();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSpecObjectRule());
            	    					}
            	    					add(
            	    						current,
            	    						"children",
            	    						lv_children_16_0,
            	    						"de.protos.reqtext.ReqText.SpecObject");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_17=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getSpecObjectAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpecObject"


    // $ANTLR start "entryRuleState"
    // InternalReqText.g:419:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalReqText.g:419:46: (iv_ruleState= ruleState EOF )
            // InternalReqText.g:420:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalReqText.g:426:1: ruleState returns [EObject current=null] : (otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalReqText.g:432:2: ( (otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalReqText.g:433:2: (otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalReqText.g:433:2: (otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalReqText.g:434:3: otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
            		
            // InternalReqText.g:438:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalReqText.g:439:4: (lv_name_1_0= RULE_ID )
            {
            // InternalReqText.g:439:4: (lv_name_1_0= RULE_ID )
            // InternalReqText.g:440:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleClass"
    // InternalReqText.g:460:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalReqText.g:460:46: (iv_ruleClass= ruleClass EOF )
            // InternalReqText.g:461:2: iv_ruleClass= ruleClass EOF
            {
             newCompositeNode(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClass=ruleClass();

            state._fsp--;

             current =iv_ruleClass; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalReqText.g:467:1: ruleClass returns [EObject current=null] : (otherlv_0= 'Classification' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalReqText.g:473:2: ( (otherlv_0= 'Classification' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalReqText.g:474:2: (otherlv_0= 'Classification' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalReqText.g:474:2: (otherlv_0= 'Classification' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalReqText.g:475:3: otherlv_0= 'Classification' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getClassAccess().getClassificationKeyword_0());
            		
            // InternalReqText.g:479:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalReqText.g:480:4: (lv_name_1_0= RULE_ID )
            {
            // InternalReqText.g:480:4: (lv_name_1_0= RULE_ID )
            // InternalReqText.g:481:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getClassAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleVersion"
    // InternalReqText.g:501:1: entryRuleVersion returns [EObject current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final EObject entryRuleVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersion = null;


        try {
            // InternalReqText.g:501:48: (iv_ruleVersion= ruleVersion EOF )
            // InternalReqText.g:502:2: iv_ruleVersion= ruleVersion EOF
            {
             newCompositeNode(grammarAccess.getVersionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVersion=ruleVersion();

            state._fsp--;

             current =iv_ruleVersion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVersion"


    // $ANTLR start "ruleVersion"
    // InternalReqText.g:508:1: ruleVersion returns [EObject current=null] : ( ( (lv_major_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_minor_2_0= RULE_INT ) ) ) ;
    public final EObject ruleVersion() throws RecognitionException {
        EObject current = null;

        Token lv_major_0_0=null;
        Token otherlv_1=null;
        Token lv_minor_2_0=null;


        	enterRule();

        try {
            // InternalReqText.g:514:2: ( ( ( (lv_major_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_minor_2_0= RULE_INT ) ) ) )
            // InternalReqText.g:515:2: ( ( (lv_major_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_minor_2_0= RULE_INT ) ) )
            {
            // InternalReqText.g:515:2: ( ( (lv_major_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_minor_2_0= RULE_INT ) ) )
            // InternalReqText.g:516:3: ( (lv_major_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_minor_2_0= RULE_INT ) )
            {
            // InternalReqText.g:516:3: ( (lv_major_0_0= RULE_INT ) )
            // InternalReqText.g:517:4: (lv_major_0_0= RULE_INT )
            {
            // InternalReqText.g:517:4: (lv_major_0_0= RULE_INT )
            // InternalReqText.g:518:5: lv_major_0_0= RULE_INT
            {
            lv_major_0_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            					newLeafNode(lv_major_0_0, grammarAccess.getVersionAccess().getMajorINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVersionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"major",
            						lv_major_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getVersionAccess().getFullStopKeyword_1());
            		
            // InternalReqText.g:538:3: ( (lv_minor_2_0= RULE_INT ) )
            // InternalReqText.g:539:4: (lv_minor_2_0= RULE_INT )
            {
            // InternalReqText.g:539:4: (lv_minor_2_0= RULE_INT )
            // InternalReqText.g:540:5: lv_minor_2_0= RULE_INT
            {
            lv_minor_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_minor_2_0, grammarAccess.getVersionAccess().getMinorINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVersionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"minor",
            						lv_minor_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVersion"


    // $ANTLR start "entryRuleRImport"
    // InternalReqText.g:560:1: entryRuleRImport returns [EObject current=null] : iv_ruleRImport= ruleRImport EOF ;
    public final EObject entryRuleRImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRImport = null;


        try {
            // InternalReqText.g:560:48: (iv_ruleRImport= ruleRImport EOF )
            // InternalReqText.g:561:2: iv_ruleRImport= ruleRImport EOF
            {
             newCompositeNode(grammarAccess.getRImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRImport=ruleRImport();

            state._fsp--;

             current =iv_ruleRImport; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRImport"


    // $ANTLR start "ruleRImport"
    // InternalReqText.g:567:1: ruleRImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleRImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;


        	enterRule();

        try {
            // InternalReqText.g:573:2: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // InternalReqText.g:574:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // InternalReqText.g:574:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // InternalReqText.g:575:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getRImportAccess().getImportKeyword_0());
            		
            // InternalReqText.g:579:3: ( (lv_importURI_1_0= RULE_STRING ) )
            // InternalReqText.g:580:4: (lv_importURI_1_0= RULE_STRING )
            {
            // InternalReqText.g:580:4: (lv_importURI_1_0= RULE_STRING )
            // InternalReqText.g:581:5: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_importURI_1_0, grammarAccess.getRImportAccess().getImportURISTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRImportRule());
            					}
            					setWithLastConsumed(
            						current,
            						"importURI",
            						lv_importURI_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRImport"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001601000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000F8000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000007F9000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000701000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000080L});

}
