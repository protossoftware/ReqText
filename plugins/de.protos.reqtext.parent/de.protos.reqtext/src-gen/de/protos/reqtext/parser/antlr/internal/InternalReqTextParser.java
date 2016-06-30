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
    // InternalReqText.g:71:1: ruleRModel returns [EObject current=null] : ( ( (lv_imports_0_0= ruleRImport ) )* ( ( (lv_states_1_0= ruleState ) ) | ( (lv_classes_2_0= ruleClass ) ) | ( (lv_objs_3_0= ruleSpecObject ) ) )* ) ;
    public final EObject ruleRModel() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_states_1_0 = null;

        EObject lv_classes_2_0 = null;

        EObject lv_objs_3_0 = null;



        	enterRule();

        try {
            // InternalReqText.g:77:2: ( ( ( (lv_imports_0_0= ruleRImport ) )* ( ( (lv_states_1_0= ruleState ) ) | ( (lv_classes_2_0= ruleClass ) ) | ( (lv_objs_3_0= ruleSpecObject ) ) )* ) )
            // InternalReqText.g:78:2: ( ( (lv_imports_0_0= ruleRImport ) )* ( ( (lv_states_1_0= ruleState ) ) | ( (lv_classes_2_0= ruleClass ) ) | ( (lv_objs_3_0= ruleSpecObject ) ) )* )
            {
            // InternalReqText.g:78:2: ( ( (lv_imports_0_0= ruleRImport ) )* ( ( (lv_states_1_0= ruleState ) ) | ( (lv_classes_2_0= ruleClass ) ) | ( (lv_objs_3_0= ruleSpecObject ) ) )* )
            // InternalReqText.g:79:3: ( (lv_imports_0_0= ruleRImport ) )* ( ( (lv_states_1_0= ruleState ) ) | ( (lv_classes_2_0= ruleClass ) ) | ( (lv_objs_3_0= ruleSpecObject ) ) )*
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

            // InternalReqText.g:98:3: ( ( (lv_states_1_0= ruleState ) ) | ( (lv_classes_2_0= ruleClass ) ) | ( (lv_objs_3_0= ruleSpecObject ) ) )*
            loop2:
            do {
                int alt2=4;
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
            	    					
            	    pushFollow(FOLLOW_4);
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
            	    					
            	    pushFollow(FOLLOW_4);
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
            	    					
            	    pushFollow(FOLLOW_4);
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

            	default :
            	    break loop2;
                }
            } while (true);


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
    // InternalReqText.g:170:1: ruleSpecObject returns [EObject current=null] : (otherlv_0= 'SpecObject' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= RULE_CC_STRING ) ) otherlv_5= 'state' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'classification' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'version' ( (lv_version_10_0= ruleVersion ) ) (otherlv_11= 'image' ( (lv_image_12_0= RULE_CC_STRING ) ) )? (otherlv_13= 'reference' ( (otherlv_14= RULE_ID ) ) )? ( (lv_children_15_0= ruleSpecObject ) )* otherlv_16= '}' ) ;
    public final EObject ruleSpecObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token lv_image_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        EObject lv_version_10_0 = null;

        EObject lv_children_15_0 = null;



        	enterRule();

        try {
            // InternalReqText.g:176:2: ( (otherlv_0= 'SpecObject' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= RULE_CC_STRING ) ) otherlv_5= 'state' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'classification' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'version' ( (lv_version_10_0= ruleVersion ) ) (otherlv_11= 'image' ( (lv_image_12_0= RULE_CC_STRING ) ) )? (otherlv_13= 'reference' ( (otherlv_14= RULE_ID ) ) )? ( (lv_children_15_0= ruleSpecObject ) )* otherlv_16= '}' ) )
            // InternalReqText.g:177:2: (otherlv_0= 'SpecObject' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= RULE_CC_STRING ) ) otherlv_5= 'state' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'classification' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'version' ( (lv_version_10_0= ruleVersion ) ) (otherlv_11= 'image' ( (lv_image_12_0= RULE_CC_STRING ) ) )? (otherlv_13= 'reference' ( (otherlv_14= RULE_ID ) ) )? ( (lv_children_15_0= ruleSpecObject ) )* otherlv_16= '}' )
            {
            // InternalReqText.g:177:2: (otherlv_0= 'SpecObject' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= RULE_CC_STRING ) ) otherlv_5= 'state' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'classification' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'version' ( (lv_version_10_0= ruleVersion ) ) (otherlv_11= 'image' ( (lv_image_12_0= RULE_CC_STRING ) ) )? (otherlv_13= 'reference' ( (otherlv_14= RULE_ID ) ) )? ( (lv_children_15_0= ruleSpecObject ) )* otherlv_16= '}' )
            // InternalReqText.g:178:3: otherlv_0= 'SpecObject' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= RULE_CC_STRING ) ) otherlv_5= 'state' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'classification' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'version' ( (lv_version_10_0= ruleVersion ) ) (otherlv_11= 'image' ( (lv_image_12_0= RULE_CC_STRING ) ) )? (otherlv_13= 'reference' ( (otherlv_14= RULE_ID ) ) )? ( (lv_children_15_0= ruleSpecObject ) )* otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSpecObjectAccess().getSpecObjectKeyword_0());
            		
            // InternalReqText.g:182:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalReqText.g:183:4: (lv_name_1_0= RULE_ID )
            {
            // InternalReqText.g:183:4: (lv_name_1_0= RULE_ID )
            // InternalReqText.g:184:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getSpecObjectAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getSpecObjectAccess().getDescriptionKeyword_3());
            		
            // InternalReqText.g:208:3: ( (lv_description_4_0= RULE_CC_STRING ) )
            // InternalReqText.g:209:4: (lv_description_4_0= RULE_CC_STRING )
            {
            // InternalReqText.g:209:4: (lv_description_4_0= RULE_CC_STRING )
            // InternalReqText.g:210:5: lv_description_4_0= RULE_CC_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_CC_STRING,FOLLOW_9); 

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

            otherlv_5=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getSpecObjectAccess().getStateKeyword_5());
            		
            // InternalReqText.g:230:3: ( (otherlv_6= RULE_ID ) )
            // InternalReqText.g:231:4: (otherlv_6= RULE_ID )
            {
            // InternalReqText.g:231:4: (otherlv_6= RULE_ID )
            // InternalReqText.g:232:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSpecObjectRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_6, grammarAccess.getSpecObjectAccess().getStateStateCrossReference_6_0());
            				

            }


            }

            otherlv_7=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getSpecObjectAccess().getClassificationKeyword_7());
            		
            // InternalReqText.g:247:3: ( (otherlv_8= RULE_ID ) )
            // InternalReqText.g:248:4: (otherlv_8= RULE_ID )
            {
            // InternalReqText.g:248:4: (otherlv_8= RULE_ID )
            // InternalReqText.g:249:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSpecObjectRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_8, grammarAccess.getSpecObjectAccess().getClassClassCrossReference_8_0());
            				

            }


            }

            otherlv_9=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_9, grammarAccess.getSpecObjectAccess().getVersionKeyword_9());
            		
            // InternalReqText.g:264:3: ( (lv_version_10_0= ruleVersion ) )
            // InternalReqText.g:265:4: (lv_version_10_0= ruleVersion )
            {
            // InternalReqText.g:265:4: (lv_version_10_0= ruleVersion )
            // InternalReqText.g:266:5: lv_version_10_0= ruleVersion
            {

            					newCompositeNode(grammarAccess.getSpecObjectAccess().getVersionVersionParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_13);
            lv_version_10_0=ruleVersion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSpecObjectRule());
            					}
            					set(
            						current,
            						"version",
            						lv_version_10_0,
            						"de.protos.reqtext.ReqText.Version");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalReqText.g:283:3: (otherlv_11= 'image' ( (lv_image_12_0= RULE_CC_STRING ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalReqText.g:284:4: otherlv_11= 'image' ( (lv_image_12_0= RULE_CC_STRING ) )
                    {
                    otherlv_11=(Token)match(input,18,FOLLOW_8); 

                    				newLeafNode(otherlv_11, grammarAccess.getSpecObjectAccess().getImageKeyword_11_0());
                    			
                    // InternalReqText.g:288:4: ( (lv_image_12_0= RULE_CC_STRING ) )
                    // InternalReqText.g:289:5: (lv_image_12_0= RULE_CC_STRING )
                    {
                    // InternalReqText.g:289:5: (lv_image_12_0= RULE_CC_STRING )
                    // InternalReqText.g:290:6: lv_image_12_0= RULE_CC_STRING
                    {
                    lv_image_12_0=(Token)match(input,RULE_CC_STRING,FOLLOW_14); 

                    						newLeafNode(lv_image_12_0, grammarAccess.getSpecObjectAccess().getImageCC_STRINGTerminalRuleCall_11_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSpecObjectRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"image",
                    							lv_image_12_0,
                    							"de.protos.reqtext.ReqText.CC_STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalReqText.g:307:3: (otherlv_13= 'reference' ( (otherlv_14= RULE_ID ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalReqText.g:308:4: otherlv_13= 'reference' ( (otherlv_14= RULE_ID ) )
                    {
                    otherlv_13=(Token)match(input,19,FOLLOW_5); 

                    				newLeafNode(otherlv_13, grammarAccess.getSpecObjectAccess().getReferenceKeyword_12_0());
                    			
                    // InternalReqText.g:312:4: ( (otherlv_14= RULE_ID ) )
                    // InternalReqText.g:313:5: (otherlv_14= RULE_ID )
                    {
                    // InternalReqText.g:313:5: (otherlv_14= RULE_ID )
                    // InternalReqText.g:314:6: otherlv_14= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSpecObjectRule());
                    						}
                    					
                    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_15); 

                    						newLeafNode(otherlv_14, grammarAccess.getSpecObjectAccess().getReferenceSpecObjectCrossReference_12_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalReqText.g:326:3: ( (lv_children_15_0= ruleSpecObject ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==12) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalReqText.g:327:4: (lv_children_15_0= ruleSpecObject )
            	    {
            	    // InternalReqText.g:327:4: (lv_children_15_0= ruleSpecObject )
            	    // InternalReqText.g:328:5: lv_children_15_0= ruleSpecObject
            	    {

            	    					newCompositeNode(grammarAccess.getSpecObjectAccess().getChildrenSpecObjectParserRuleCall_13_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_children_15_0=ruleSpecObject();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSpecObjectRule());
            	    					}
            	    					add(
            	    						current,
            	    						"children",
            	    						lv_children_15_0,
            	    						"de.protos.reqtext.ReqText.SpecObject");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_16=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getSpecObjectAccess().getRightCurlyBracketKeyword_14());
            		

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
    // InternalReqText.g:353:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalReqText.g:353:46: (iv_ruleState= ruleState EOF )
            // InternalReqText.g:354:2: iv_ruleState= ruleState EOF
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
    // InternalReqText.g:360:1: ruleState returns [EObject current=null] : (otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalReqText.g:366:2: ( (otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalReqText.g:367:2: (otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalReqText.g:367:2: (otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalReqText.g:368:3: otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
            		
            // InternalReqText.g:372:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalReqText.g:373:4: (lv_name_1_0= RULE_ID )
            {
            // InternalReqText.g:373:4: (lv_name_1_0= RULE_ID )
            // InternalReqText.g:374:5: lv_name_1_0= RULE_ID
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
    // InternalReqText.g:394:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalReqText.g:394:46: (iv_ruleClass= ruleClass EOF )
            // InternalReqText.g:395:2: iv_ruleClass= ruleClass EOF
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
    // InternalReqText.g:401:1: ruleClass returns [EObject current=null] : (otherlv_0= 'Classification' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalReqText.g:407:2: ( (otherlv_0= 'Classification' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalReqText.g:408:2: (otherlv_0= 'Classification' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalReqText.g:408:2: (otherlv_0= 'Classification' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalReqText.g:409:3: otherlv_0= 'Classification' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getClassAccess().getClassificationKeyword_0());
            		
            // InternalReqText.g:413:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalReqText.g:414:4: (lv_name_1_0= RULE_ID )
            {
            // InternalReqText.g:414:4: (lv_name_1_0= RULE_ID )
            // InternalReqText.g:415:5: lv_name_1_0= RULE_ID
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
    // InternalReqText.g:435:1: entryRuleVersion returns [EObject current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final EObject entryRuleVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersion = null;


        try {
            // InternalReqText.g:435:48: (iv_ruleVersion= ruleVersion EOF )
            // InternalReqText.g:436:2: iv_ruleVersion= ruleVersion EOF
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
    // InternalReqText.g:442:1: ruleVersion returns [EObject current=null] : ( ( (lv_major_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_minor_2_0= RULE_INT ) ) ) ;
    public final EObject ruleVersion() throws RecognitionException {
        EObject current = null;

        Token lv_major_0_0=null;
        Token otherlv_1=null;
        Token lv_minor_2_0=null;


        	enterRule();

        try {
            // InternalReqText.g:448:2: ( ( ( (lv_major_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_minor_2_0= RULE_INT ) ) ) )
            // InternalReqText.g:449:2: ( ( (lv_major_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_minor_2_0= RULE_INT ) ) )
            {
            // InternalReqText.g:449:2: ( ( (lv_major_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_minor_2_0= RULE_INT ) ) )
            // InternalReqText.g:450:3: ( (lv_major_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_minor_2_0= RULE_INT ) )
            {
            // InternalReqText.g:450:3: ( (lv_major_0_0= RULE_INT ) )
            // InternalReqText.g:451:4: (lv_major_0_0= RULE_INT )
            {
            // InternalReqText.g:451:4: (lv_major_0_0= RULE_INT )
            // InternalReqText.g:452:5: lv_major_0_0= RULE_INT
            {
            lv_major_0_0=(Token)match(input,RULE_INT,FOLLOW_16); 

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

            otherlv_1=(Token)match(input,23,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getVersionAccess().getFullStopKeyword_1());
            		
            // InternalReqText.g:472:3: ( (lv_minor_2_0= RULE_INT ) )
            // InternalReqText.g:473:4: (lv_minor_2_0= RULE_INT )
            {
            // InternalReqText.g:473:4: (lv_minor_2_0= RULE_INT )
            // InternalReqText.g:474:5: lv_minor_2_0= RULE_INT
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
    // InternalReqText.g:494:1: entryRuleRImport returns [EObject current=null] : iv_ruleRImport= ruleRImport EOF ;
    public final EObject entryRuleRImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRImport = null;


        try {
            // InternalReqText.g:494:48: (iv_ruleRImport= ruleRImport EOF )
            // InternalReqText.g:495:2: iv_ruleRImport= ruleRImport EOF
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
    // InternalReqText.g:501:1: ruleRImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleRImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;


        	enterRule();

        try {
            // InternalReqText.g:507:2: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // InternalReqText.g:508:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // InternalReqText.g:508:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // InternalReqText.g:509:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getRImportAccess().getImportKeyword_0());
            		
            // InternalReqText.g:513:3: ( (lv_importURI_1_0= RULE_STRING ) )
            // InternalReqText.g:514:4: (lv_importURI_1_0= RULE_STRING )
            {
            // InternalReqText.g:514:4: (lv_importURI_1_0= RULE_STRING )
            // InternalReqText.g:515:5: lv_importURI_1_0= RULE_STRING
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001601002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000601002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000007C1000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000781000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000701000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000080L});

}