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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_CC_STRING", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'List'", "'['", "','", "']'", "'Map'", "'=>'", "'ref'", "'import'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_INT=7;
    public static final int RULE_ML_COMMENT=8;

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
    // InternalReqText.g:71:1: ruleRModel returns [EObject current=null] : ( ( (lv_imports_0_0= ruleRImport ) )* ( (lv_contents_1_0= ruleContent ) )* ) ;
    public final EObject ruleRModel() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_contents_1_0 = null;



        	enterRule();

        try {
            // InternalReqText.g:77:2: ( ( ( (lv_imports_0_0= ruleRImport ) )* ( (lv_contents_1_0= ruleContent ) )* ) )
            // InternalReqText.g:78:2: ( ( (lv_imports_0_0= ruleRImport ) )* ( (lv_contents_1_0= ruleContent ) )* )
            {
            // InternalReqText.g:78:2: ( ( (lv_imports_0_0= ruleRImport ) )* ( (lv_contents_1_0= ruleContent ) )* )
            // InternalReqText.g:79:3: ( (lv_imports_0_0= ruleRImport ) )* ( (lv_contents_1_0= ruleContent ) )*
            {
            // InternalReqText.g:79:3: ( (lv_imports_0_0= ruleRImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==19) ) {
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

            // InternalReqText.g:98:3: ( (lv_contents_1_0= ruleContent ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12||LA2_0==16||LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalReqText.g:99:4: (lv_contents_1_0= ruleContent )
            	    {
            	    // InternalReqText.g:99:4: (lv_contents_1_0= ruleContent )
            	    // InternalReqText.g:100:5: lv_contents_1_0= ruleContent
            	    {

            	    					newCompositeNode(grammarAccess.getRModelAccess().getContentsContentParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_contents_1_0=ruleContent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"contents",
            	    						lv_contents_1_0,
            	    						"de.protos.reqtext.ReqText.Content");
            	    					afterParserOrEnumRuleCall();
            	    				

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


    // $ANTLR start "entryRuleContent"
    // InternalReqText.g:121:1: entryRuleContent returns [EObject current=null] : iv_ruleContent= ruleContent EOF ;
    public final EObject entryRuleContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContent = null;


        try {
            // InternalReqText.g:121:48: (iv_ruleContent= ruleContent EOF )
            // InternalReqText.g:122:2: iv_ruleContent= ruleContent EOF
            {
             newCompositeNode(grammarAccess.getContentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContent=ruleContent();

            state._fsp--;

             current =iv_ruleContent; 
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
    // $ANTLR end "entryRuleContent"


    // $ANTLR start "ruleContent"
    // InternalReqText.g:128:1: ruleContent returns [EObject current=null] : (this_RList_0= ruleRList | this_RMap_1= ruleRMap | this_CrossRef_2= ruleCrossRef ) ;
    public final EObject ruleContent() throws RecognitionException {
        EObject current = null;

        EObject this_RList_0 = null;

        EObject this_RMap_1 = null;

        EObject this_CrossRef_2 = null;



        	enterRule();

        try {
            // InternalReqText.g:134:2: ( (this_RList_0= ruleRList | this_RMap_1= ruleRMap | this_CrossRef_2= ruleCrossRef ) )
            // InternalReqText.g:135:2: (this_RList_0= ruleRList | this_RMap_1= ruleRMap | this_CrossRef_2= ruleCrossRef )
            {
            // InternalReqText.g:135:2: (this_RList_0= ruleRList | this_RMap_1= ruleRMap | this_CrossRef_2= ruleCrossRef )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                alt3=2;
                }
                break;
            case 18:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalReqText.g:136:3: this_RList_0= ruleRList
                    {

                    			newCompositeNode(grammarAccess.getContentAccess().getRListParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RList_0=ruleRList();

                    state._fsp--;


                    			current = this_RList_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalReqText.g:145:3: this_RMap_1= ruleRMap
                    {

                    			newCompositeNode(grammarAccess.getContentAccess().getRMapParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RMap_1=ruleRMap();

                    state._fsp--;


                    			current = this_RMap_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalReqText.g:154:3: this_CrossRef_2= ruleCrossRef
                    {

                    			newCompositeNode(grammarAccess.getContentAccess().getCrossRefParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CrossRef_2=ruleCrossRef();

                    state._fsp--;


                    			current = this_CrossRef_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

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
    // $ANTLR end "ruleContent"


    // $ANTLR start "entryRuleRList"
    // InternalReqText.g:166:1: entryRuleRList returns [EObject current=null] : iv_ruleRList= ruleRList EOF ;
    public final EObject entryRuleRList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRList = null;


        try {
            // InternalReqText.g:166:46: (iv_ruleRList= ruleRList EOF )
            // InternalReqText.g:167:2: iv_ruleRList= ruleRList EOF
            {
             newCompositeNode(grammarAccess.getRListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRList=ruleRList();

            state._fsp--;

             current =iv_ruleRList; 
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
    // $ANTLR end "entryRuleRList"


    // $ANTLR start "ruleRList"
    // InternalReqText.g:173:1: ruleRList returns [EObject current=null] : (otherlv_0= 'List' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( ( (lv_entries_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_entries_5_0= RULE_ID ) ) )* )? otherlv_6= ']' )? ) ;
    public final EObject ruleRList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_entries_3_0=null;
        Token otherlv_4=null;
        Token lv_entries_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalReqText.g:179:2: ( (otherlv_0= 'List' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( ( (lv_entries_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_entries_5_0= RULE_ID ) ) )* )? otherlv_6= ']' )? ) )
            // InternalReqText.g:180:2: (otherlv_0= 'List' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( ( (lv_entries_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_entries_5_0= RULE_ID ) ) )* )? otherlv_6= ']' )? )
            {
            // InternalReqText.g:180:2: (otherlv_0= 'List' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( ( (lv_entries_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_entries_5_0= RULE_ID ) ) )* )? otherlv_6= ']' )? )
            // InternalReqText.g:181:3: otherlv_0= 'List' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( ( (lv_entries_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_entries_5_0= RULE_ID ) ) )* )? otherlv_6= ']' )?
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getRListAccess().getListKeyword_0());
            		
            // InternalReqText.g:185:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalReqText.g:186:4: (lv_name_1_0= RULE_ID )
            {
            // InternalReqText.g:186:4: (lv_name_1_0= RULE_ID )
            // InternalReqText.g:187:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRListAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRListRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalReqText.g:203:3: (otherlv_2= '[' ( ( (lv_entries_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_entries_5_0= RULE_ID ) ) )* )? otherlv_6= ']' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalReqText.g:204:4: otherlv_2= '[' ( ( (lv_entries_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_entries_5_0= RULE_ID ) ) )* )? otherlv_6= ']'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getRListAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalReqText.g:208:4: ( ( (lv_entries_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_entries_5_0= RULE_ID ) ) )* )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==RULE_ID) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalReqText.g:209:5: ( (lv_entries_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_entries_5_0= RULE_ID ) ) )*
                            {
                            // InternalReqText.g:209:5: ( (lv_entries_3_0= RULE_ID ) )
                            // InternalReqText.g:210:6: (lv_entries_3_0= RULE_ID )
                            {
                            // InternalReqText.g:210:6: (lv_entries_3_0= RULE_ID )
                            // InternalReqText.g:211:7: lv_entries_3_0= RULE_ID
                            {
                            lv_entries_3_0=(Token)match(input,RULE_ID,FOLLOW_8); 

                            							newLeafNode(lv_entries_3_0, grammarAccess.getRListAccess().getEntriesIDTerminalRuleCall_2_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getRListRule());
                            							}
                            							addWithLastConsumed(
                            								current,
                            								"entries",
                            								lv_entries_3_0,
                            								"org.eclipse.xtext.common.Terminals.ID");
                            						

                            }


                            }

                            // InternalReqText.g:227:5: (otherlv_4= ',' ( (lv_entries_5_0= RULE_ID ) ) )*
                            loop4:
                            do {
                                int alt4=2;
                                int LA4_0 = input.LA(1);

                                if ( (LA4_0==14) ) {
                                    alt4=1;
                                }


                                switch (alt4) {
                            	case 1 :
                            	    // InternalReqText.g:228:6: otherlv_4= ',' ( (lv_entries_5_0= RULE_ID ) )
                            	    {
                            	    otherlv_4=(Token)match(input,14,FOLLOW_5); 

                            	    						newLeafNode(otherlv_4, grammarAccess.getRListAccess().getCommaKeyword_2_1_1_0());
                            	    					
                            	    // InternalReqText.g:232:6: ( (lv_entries_5_0= RULE_ID ) )
                            	    // InternalReqText.g:233:7: (lv_entries_5_0= RULE_ID )
                            	    {
                            	    // InternalReqText.g:233:7: (lv_entries_5_0= RULE_ID )
                            	    // InternalReqText.g:234:8: lv_entries_5_0= RULE_ID
                            	    {
                            	    lv_entries_5_0=(Token)match(input,RULE_ID,FOLLOW_8); 

                            	    								newLeafNode(lv_entries_5_0, grammarAccess.getRListAccess().getEntriesIDTerminalRuleCall_2_1_1_1_0());
                            	    							

                            	    								if (current==null) {
                            	    									current = createModelElement(grammarAccess.getRListRule());
                            	    								}
                            	    								addWithLastConsumed(
                            	    									current,
                            	    									"entries",
                            	    									lv_entries_5_0,
                            	    									"org.eclipse.xtext.common.Terminals.ID");
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop4;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getRListAccess().getRightSquareBracketKeyword_2_2());
                    			

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
    // $ANTLR end "ruleRList"


    // $ANTLR start "entryRuleRMap"
    // InternalReqText.g:261:1: entryRuleRMap returns [EObject current=null] : iv_ruleRMap= ruleRMap EOF ;
    public final EObject entryRuleRMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRMap = null;


        try {
            // InternalReqText.g:261:45: (iv_ruleRMap= ruleRMap EOF )
            // InternalReqText.g:262:2: iv_ruleRMap= ruleRMap EOF
            {
             newCompositeNode(grammarAccess.getRMapRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRMap=ruleRMap();

            state._fsp--;

             current =iv_ruleRMap; 
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
    // $ANTLR end "entryRuleRMap"


    // $ANTLR start "ruleRMap"
    // InternalReqText.g:268:1: ruleRMap returns [EObject current=null] : (otherlv_0= 'Map' ( (lv_name_1_0= RULE_ID ) ) ( (lv_entries_2_0= ruleRMapEntry ) )* ) ;
    public final EObject ruleRMap() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_entries_2_0 = null;



        	enterRule();

        try {
            // InternalReqText.g:274:2: ( (otherlv_0= 'Map' ( (lv_name_1_0= RULE_ID ) ) ( (lv_entries_2_0= ruleRMapEntry ) )* ) )
            // InternalReqText.g:275:2: (otherlv_0= 'Map' ( (lv_name_1_0= RULE_ID ) ) ( (lv_entries_2_0= ruleRMapEntry ) )* )
            {
            // InternalReqText.g:275:2: (otherlv_0= 'Map' ( (lv_name_1_0= RULE_ID ) ) ( (lv_entries_2_0= ruleRMapEntry ) )* )
            // InternalReqText.g:276:3: otherlv_0= 'Map' ( (lv_name_1_0= RULE_ID ) ) ( (lv_entries_2_0= ruleRMapEntry ) )*
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getRMapAccess().getMapKeyword_0());
            		
            // InternalReqText.g:280:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalReqText.g:281:4: (lv_name_1_0= RULE_ID )
            {
            // InternalReqText.g:281:4: (lv_name_1_0= RULE_ID )
            // InternalReqText.g:282:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRMapAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRMapRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalReqText.g:298:3: ( (lv_entries_2_0= ruleRMapEntry ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalReqText.g:299:4: (lv_entries_2_0= ruleRMapEntry )
            	    {
            	    // InternalReqText.g:299:4: (lv_entries_2_0= ruleRMapEntry )
            	    // InternalReqText.g:300:5: lv_entries_2_0= ruleRMapEntry
            	    {

            	    					newCompositeNode(grammarAccess.getRMapAccess().getEntriesRMapEntryParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_entries_2_0=ruleRMapEntry();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRMapRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entries",
            	    						lv_entries_2_0,
            	    						"de.protos.reqtext.ReqText.RMapEntry");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // $ANTLR end "ruleRMap"


    // $ANTLR start "entryRuleRMapEntry"
    // InternalReqText.g:321:1: entryRuleRMapEntry returns [EObject current=null] : iv_ruleRMapEntry= ruleRMapEntry EOF ;
    public final EObject entryRuleRMapEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRMapEntry = null;


        try {
            // InternalReqText.g:321:50: (iv_ruleRMapEntry= ruleRMapEntry EOF )
            // InternalReqText.g:322:2: iv_ruleRMapEntry= ruleRMapEntry EOF
            {
             newCompositeNode(grammarAccess.getRMapEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRMapEntry=ruleRMapEntry();

            state._fsp--;

             current =iv_ruleRMapEntry; 
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
    // $ANTLR end "entryRuleRMapEntry"


    // $ANTLR start "ruleRMapEntry"
    // InternalReqText.g:328:1: ruleRMapEntry returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_value_2_0= RULE_CC_STRING ) ) (otherlv_3= '[' ( (otherlv_4= RULE_ID ) )? otherlv_5= ']' )? ) ;
    public final EObject ruleRMapEntry() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalReqText.g:334:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_value_2_0= RULE_CC_STRING ) ) (otherlv_3= '[' ( (otherlv_4= RULE_ID ) )? otherlv_5= ']' )? ) )
            // InternalReqText.g:335:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_value_2_0= RULE_CC_STRING ) ) (otherlv_3= '[' ( (otherlv_4= RULE_ID ) )? otherlv_5= ']' )? )
            {
            // InternalReqText.g:335:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_value_2_0= RULE_CC_STRING ) ) (otherlv_3= '[' ( (otherlv_4= RULE_ID ) )? otherlv_5= ']' )? )
            // InternalReqText.g:336:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_value_2_0= RULE_CC_STRING ) ) (otherlv_3= '[' ( (otherlv_4= RULE_ID ) )? otherlv_5= ']' )?
            {
            // InternalReqText.g:336:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalReqText.g:337:4: (lv_name_0_0= RULE_ID )
            {
            // InternalReqText.g:337:4: (lv_name_0_0= RULE_ID )
            // InternalReqText.g:338:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_0_0, grammarAccess.getRMapEntryAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRMapEntryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getRMapEntryAccess().getEqualsSignGreaterThanSignKeyword_1());
            		
            // InternalReqText.g:358:3: ( (lv_value_2_0= RULE_CC_STRING ) )
            // InternalReqText.g:359:4: (lv_value_2_0= RULE_CC_STRING )
            {
            // InternalReqText.g:359:4: (lv_value_2_0= RULE_CC_STRING )
            // InternalReqText.g:360:5: lv_value_2_0= RULE_CC_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_CC_STRING,FOLLOW_6); 

            					newLeafNode(lv_value_2_0, grammarAccess.getRMapEntryAccess().getValueCC_STRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRMapEntryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"de.protos.reqtext.ReqText.CC_STRING");
            				

            }


            }

            // InternalReqText.g:376:3: (otherlv_3= '[' ( (otherlv_4= RULE_ID ) )? otherlv_5= ']' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==13) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalReqText.g:377:4: otherlv_3= '[' ( (otherlv_4= RULE_ID ) )? otherlv_5= ']'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getRMapEntryAccess().getLeftSquareBracketKeyword_3_0());
                    			
                    // InternalReqText.g:381:4: ( (otherlv_4= RULE_ID ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==RULE_ID) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalReqText.g:382:5: (otherlv_4= RULE_ID )
                            {
                            // InternalReqText.g:382:5: (otherlv_4= RULE_ID )
                            // InternalReqText.g:383:6: otherlv_4= RULE_ID
                            {

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getRMapEntryRule());
                            						}
                            					
                            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_12); 

                            						newLeafNode(otherlv_4, grammarAccess.getRMapEntryAccess().getRefRMapEntryCrossReference_3_1_0());
                            					

                            }


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getRMapEntryAccess().getRightSquareBracketKeyword_3_2());
                    			

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
    // $ANTLR end "ruleRMapEntry"


    // $ANTLR start "entryRuleCrossRef"
    // InternalReqText.g:403:1: entryRuleCrossRef returns [EObject current=null] : iv_ruleCrossRef= ruleCrossRef EOF ;
    public final EObject entryRuleCrossRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCrossRef = null;


        try {
            // InternalReqText.g:403:49: (iv_ruleCrossRef= ruleCrossRef EOF )
            // InternalReqText.g:404:2: iv_ruleCrossRef= ruleCrossRef EOF
            {
             newCompositeNode(grammarAccess.getCrossRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCrossRef=ruleCrossRef();

            state._fsp--;

             current =iv_ruleCrossRef; 
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
    // $ANTLR end "entryRuleCrossRef"


    // $ANTLR start "ruleCrossRef"
    // InternalReqText.g:410:1: ruleCrossRef returns [EObject current=null] : (otherlv_0= 'ref' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleCrossRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalReqText.g:416:2: ( (otherlv_0= 'ref' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalReqText.g:417:2: (otherlv_0= 'ref' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalReqText.g:417:2: (otherlv_0= 'ref' ( (otherlv_1= RULE_ID ) ) )
            // InternalReqText.g:418:3: otherlv_0= 'ref' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getCrossRefAccess().getRefKeyword_0());
            		
            // InternalReqText.g:422:3: ( (otherlv_1= RULE_ID ) )
            // InternalReqText.g:423:4: (otherlv_1= RULE_ID )
            {
            // InternalReqText.g:423:4: (otherlv_1= RULE_ID )
            // InternalReqText.g:424:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCrossRefRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getCrossRefAccess().getRefContentCrossReference_1_0());
            				

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
    // $ANTLR end "ruleCrossRef"


    // $ANTLR start "entryRuleRImport"
    // InternalReqText.g:439:1: entryRuleRImport returns [EObject current=null] : iv_ruleRImport= ruleRImport EOF ;
    public final EObject entryRuleRImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRImport = null;


        try {
            // InternalReqText.g:439:48: (iv_ruleRImport= ruleRImport EOF )
            // InternalReqText.g:440:2: iv_ruleRImport= ruleRImport EOF
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
    // InternalReqText.g:446:1: ruleRImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleRImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;


        	enterRule();

        try {
            // InternalReqText.g:452:2: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // InternalReqText.g:453:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // InternalReqText.g:453:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // InternalReqText.g:454:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getRImportAccess().getImportKeyword_0());
            		
            // InternalReqText.g:458:3: ( (lv_importURI_1_0= RULE_STRING ) )
            // InternalReqText.g:459:4: (lv_importURI_1_0= RULE_STRING )
            {
            // InternalReqText.g:459:4: (lv_importURI_1_0= RULE_STRING )
            // InternalReqText.g:460:5: lv_importURI_1_0= RULE_STRING
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000D1002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000051002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});

}