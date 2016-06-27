package de.protos.reqtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import de.protos.reqtext.services.ReqTextGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalReqTextParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_CC_STRING", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'List'", "'['", "']'", "','", "'Map'", "'=>'", "'ref'", "'import'"
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

    	public void setGrammarAccess(ReqTextGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleRModel"
    // InternalReqText.g:53:1: entryRuleRModel : ruleRModel EOF ;
    public final void entryRuleRModel() throws RecognitionException {
        try {
            // InternalReqText.g:54:1: ( ruleRModel EOF )
            // InternalReqText.g:55:1: ruleRModel EOF
            {
             before(grammarAccess.getRModelRule()); 
            pushFollow(FOLLOW_1);
            ruleRModel();

            state._fsp--;

             after(grammarAccess.getRModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRModel"


    // $ANTLR start "ruleRModel"
    // InternalReqText.g:62:1: ruleRModel : ( ( rule__RModel__Group__0 ) ) ;
    public final void ruleRModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:66:2: ( ( ( rule__RModel__Group__0 ) ) )
            // InternalReqText.g:67:2: ( ( rule__RModel__Group__0 ) )
            {
            // InternalReqText.g:67:2: ( ( rule__RModel__Group__0 ) )
            // InternalReqText.g:68:3: ( rule__RModel__Group__0 )
            {
             before(grammarAccess.getRModelAccess().getGroup()); 
            // InternalReqText.g:69:3: ( rule__RModel__Group__0 )
            // InternalReqText.g:69:4: rule__RModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRModel"


    // $ANTLR start "entryRuleContent"
    // InternalReqText.g:78:1: entryRuleContent : ruleContent EOF ;
    public final void entryRuleContent() throws RecognitionException {
        try {
            // InternalReqText.g:79:1: ( ruleContent EOF )
            // InternalReqText.g:80:1: ruleContent EOF
            {
             before(grammarAccess.getContentRule()); 
            pushFollow(FOLLOW_1);
            ruleContent();

            state._fsp--;

             after(grammarAccess.getContentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContent"


    // $ANTLR start "ruleContent"
    // InternalReqText.g:87:1: ruleContent : ( ( rule__Content__Alternatives ) ) ;
    public final void ruleContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:91:2: ( ( ( rule__Content__Alternatives ) ) )
            // InternalReqText.g:92:2: ( ( rule__Content__Alternatives ) )
            {
            // InternalReqText.g:92:2: ( ( rule__Content__Alternatives ) )
            // InternalReqText.g:93:3: ( rule__Content__Alternatives )
            {
             before(grammarAccess.getContentAccess().getAlternatives()); 
            // InternalReqText.g:94:3: ( rule__Content__Alternatives )
            // InternalReqText.g:94:4: rule__Content__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Content__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getContentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContent"


    // $ANTLR start "entryRuleRList"
    // InternalReqText.g:103:1: entryRuleRList : ruleRList EOF ;
    public final void entryRuleRList() throws RecognitionException {
        try {
            // InternalReqText.g:104:1: ( ruleRList EOF )
            // InternalReqText.g:105:1: ruleRList EOF
            {
             before(grammarAccess.getRListRule()); 
            pushFollow(FOLLOW_1);
            ruleRList();

            state._fsp--;

             after(grammarAccess.getRListRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRList"


    // $ANTLR start "ruleRList"
    // InternalReqText.g:112:1: ruleRList : ( ( rule__RList__Group__0 ) ) ;
    public final void ruleRList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:116:2: ( ( ( rule__RList__Group__0 ) ) )
            // InternalReqText.g:117:2: ( ( rule__RList__Group__0 ) )
            {
            // InternalReqText.g:117:2: ( ( rule__RList__Group__0 ) )
            // InternalReqText.g:118:3: ( rule__RList__Group__0 )
            {
             before(grammarAccess.getRListAccess().getGroup()); 
            // InternalReqText.g:119:3: ( rule__RList__Group__0 )
            // InternalReqText.g:119:4: rule__RList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRList"


    // $ANTLR start "entryRuleRMap"
    // InternalReqText.g:128:1: entryRuleRMap : ruleRMap EOF ;
    public final void entryRuleRMap() throws RecognitionException {
        try {
            // InternalReqText.g:129:1: ( ruleRMap EOF )
            // InternalReqText.g:130:1: ruleRMap EOF
            {
             before(grammarAccess.getRMapRule()); 
            pushFollow(FOLLOW_1);
            ruleRMap();

            state._fsp--;

             after(grammarAccess.getRMapRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRMap"


    // $ANTLR start "ruleRMap"
    // InternalReqText.g:137:1: ruleRMap : ( ( rule__RMap__Group__0 ) ) ;
    public final void ruleRMap() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:141:2: ( ( ( rule__RMap__Group__0 ) ) )
            // InternalReqText.g:142:2: ( ( rule__RMap__Group__0 ) )
            {
            // InternalReqText.g:142:2: ( ( rule__RMap__Group__0 ) )
            // InternalReqText.g:143:3: ( rule__RMap__Group__0 )
            {
             before(grammarAccess.getRMapAccess().getGroup()); 
            // InternalReqText.g:144:3: ( rule__RMap__Group__0 )
            // InternalReqText.g:144:4: rule__RMap__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RMap__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRMapAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRMap"


    // $ANTLR start "entryRuleRMapEntry"
    // InternalReqText.g:153:1: entryRuleRMapEntry : ruleRMapEntry EOF ;
    public final void entryRuleRMapEntry() throws RecognitionException {
        try {
            // InternalReqText.g:154:1: ( ruleRMapEntry EOF )
            // InternalReqText.g:155:1: ruleRMapEntry EOF
            {
             before(grammarAccess.getRMapEntryRule()); 
            pushFollow(FOLLOW_1);
            ruleRMapEntry();

            state._fsp--;

             after(grammarAccess.getRMapEntryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRMapEntry"


    // $ANTLR start "ruleRMapEntry"
    // InternalReqText.g:162:1: ruleRMapEntry : ( ( rule__RMapEntry__Group__0 ) ) ;
    public final void ruleRMapEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:166:2: ( ( ( rule__RMapEntry__Group__0 ) ) )
            // InternalReqText.g:167:2: ( ( rule__RMapEntry__Group__0 ) )
            {
            // InternalReqText.g:167:2: ( ( rule__RMapEntry__Group__0 ) )
            // InternalReqText.g:168:3: ( rule__RMapEntry__Group__0 )
            {
             before(grammarAccess.getRMapEntryAccess().getGroup()); 
            // InternalReqText.g:169:3: ( rule__RMapEntry__Group__0 )
            // InternalReqText.g:169:4: rule__RMapEntry__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RMapEntry__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRMapEntryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRMapEntry"


    // $ANTLR start "entryRuleCrossRef"
    // InternalReqText.g:178:1: entryRuleCrossRef : ruleCrossRef EOF ;
    public final void entryRuleCrossRef() throws RecognitionException {
        try {
            // InternalReqText.g:179:1: ( ruleCrossRef EOF )
            // InternalReqText.g:180:1: ruleCrossRef EOF
            {
             before(grammarAccess.getCrossRefRule()); 
            pushFollow(FOLLOW_1);
            ruleCrossRef();

            state._fsp--;

             after(grammarAccess.getCrossRefRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCrossRef"


    // $ANTLR start "ruleCrossRef"
    // InternalReqText.g:187:1: ruleCrossRef : ( ( rule__CrossRef__Group__0 ) ) ;
    public final void ruleCrossRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:191:2: ( ( ( rule__CrossRef__Group__0 ) ) )
            // InternalReqText.g:192:2: ( ( rule__CrossRef__Group__0 ) )
            {
            // InternalReqText.g:192:2: ( ( rule__CrossRef__Group__0 ) )
            // InternalReqText.g:193:3: ( rule__CrossRef__Group__0 )
            {
             before(grammarAccess.getCrossRefAccess().getGroup()); 
            // InternalReqText.g:194:3: ( rule__CrossRef__Group__0 )
            // InternalReqText.g:194:4: rule__CrossRef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CrossRef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCrossRefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCrossRef"


    // $ANTLR start "entryRuleRImport"
    // InternalReqText.g:203:1: entryRuleRImport : ruleRImport EOF ;
    public final void entryRuleRImport() throws RecognitionException {
        try {
            // InternalReqText.g:204:1: ( ruleRImport EOF )
            // InternalReqText.g:205:1: ruleRImport EOF
            {
             before(grammarAccess.getRImportRule()); 
            pushFollow(FOLLOW_1);
            ruleRImport();

            state._fsp--;

             after(grammarAccess.getRImportRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRImport"


    // $ANTLR start "ruleRImport"
    // InternalReqText.g:212:1: ruleRImport : ( ( rule__RImport__Group__0 ) ) ;
    public final void ruleRImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:216:2: ( ( ( rule__RImport__Group__0 ) ) )
            // InternalReqText.g:217:2: ( ( rule__RImport__Group__0 ) )
            {
            // InternalReqText.g:217:2: ( ( rule__RImport__Group__0 ) )
            // InternalReqText.g:218:3: ( rule__RImport__Group__0 )
            {
             before(grammarAccess.getRImportAccess().getGroup()); 
            // InternalReqText.g:219:3: ( rule__RImport__Group__0 )
            // InternalReqText.g:219:4: rule__RImport__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RImport__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRImport"


    // $ANTLR start "rule__Content__Alternatives"
    // InternalReqText.g:227:1: rule__Content__Alternatives : ( ( ruleRList ) | ( ruleRMap ) | ( ruleCrossRef ) );
    public final void rule__Content__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:231:1: ( ( ruleRList ) | ( ruleRMap ) | ( ruleCrossRef ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt1=1;
                }
                break;
            case 16:
                {
                alt1=2;
                }
                break;
            case 18:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalReqText.g:232:2: ( ruleRList )
                    {
                    // InternalReqText.g:232:2: ( ruleRList )
                    // InternalReqText.g:233:3: ruleRList
                    {
                     before(grammarAccess.getContentAccess().getRListParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRList();

                    state._fsp--;

                     after(grammarAccess.getContentAccess().getRListParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReqText.g:238:2: ( ruleRMap )
                    {
                    // InternalReqText.g:238:2: ( ruleRMap )
                    // InternalReqText.g:239:3: ruleRMap
                    {
                     before(grammarAccess.getContentAccess().getRMapParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRMap();

                    state._fsp--;

                     after(grammarAccess.getContentAccess().getRMapParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalReqText.g:244:2: ( ruleCrossRef )
                    {
                    // InternalReqText.g:244:2: ( ruleCrossRef )
                    // InternalReqText.g:245:3: ruleCrossRef
                    {
                     before(grammarAccess.getContentAccess().getCrossRefParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCrossRef();

                    state._fsp--;

                     after(grammarAccess.getContentAccess().getCrossRefParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Alternatives"


    // $ANTLR start "rule__RModel__Group__0"
    // InternalReqText.g:254:1: rule__RModel__Group__0 : rule__RModel__Group__0__Impl rule__RModel__Group__1 ;
    public final void rule__RModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:258:1: ( rule__RModel__Group__0__Impl rule__RModel__Group__1 )
            // InternalReqText.g:259:2: rule__RModel__Group__0__Impl rule__RModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__RModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RModel__Group__0"


    // $ANTLR start "rule__RModel__Group__0__Impl"
    // InternalReqText.g:266:1: rule__RModel__Group__0__Impl : ( ( rule__RModel__ImportsAssignment_0 )* ) ;
    public final void rule__RModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:270:1: ( ( ( rule__RModel__ImportsAssignment_0 )* ) )
            // InternalReqText.g:271:1: ( ( rule__RModel__ImportsAssignment_0 )* )
            {
            // InternalReqText.g:271:1: ( ( rule__RModel__ImportsAssignment_0 )* )
            // InternalReqText.g:272:2: ( rule__RModel__ImportsAssignment_0 )*
            {
             before(grammarAccess.getRModelAccess().getImportsAssignment_0()); 
            // InternalReqText.g:273:2: ( rule__RModel__ImportsAssignment_0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalReqText.g:273:3: rule__RModel__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__RModel__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getRModelAccess().getImportsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RModel__Group__0__Impl"


    // $ANTLR start "rule__RModel__Group__1"
    // InternalReqText.g:281:1: rule__RModel__Group__1 : rule__RModel__Group__1__Impl ;
    public final void rule__RModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:285:1: ( rule__RModel__Group__1__Impl )
            // InternalReqText.g:286:2: rule__RModel__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RModel__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RModel__Group__1"


    // $ANTLR start "rule__RModel__Group__1__Impl"
    // InternalReqText.g:292:1: rule__RModel__Group__1__Impl : ( ( rule__RModel__ContentsAssignment_1 )* ) ;
    public final void rule__RModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:296:1: ( ( ( rule__RModel__ContentsAssignment_1 )* ) )
            // InternalReqText.g:297:1: ( ( rule__RModel__ContentsAssignment_1 )* )
            {
            // InternalReqText.g:297:1: ( ( rule__RModel__ContentsAssignment_1 )* )
            // InternalReqText.g:298:2: ( rule__RModel__ContentsAssignment_1 )*
            {
             before(grammarAccess.getRModelAccess().getContentsAssignment_1()); 
            // InternalReqText.g:299:2: ( rule__RModel__ContentsAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12||LA3_0==16||LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalReqText.g:299:3: rule__RModel__ContentsAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__RModel__ContentsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getRModelAccess().getContentsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RModel__Group__1__Impl"


    // $ANTLR start "rule__RList__Group__0"
    // InternalReqText.g:308:1: rule__RList__Group__0 : rule__RList__Group__0__Impl rule__RList__Group__1 ;
    public final void rule__RList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:312:1: ( rule__RList__Group__0__Impl rule__RList__Group__1 )
            // InternalReqText.g:313:2: rule__RList__Group__0__Impl rule__RList__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__RList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RList__Group__0"


    // $ANTLR start "rule__RList__Group__0__Impl"
    // InternalReqText.g:320:1: rule__RList__Group__0__Impl : ( 'List' ) ;
    public final void rule__RList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:324:1: ( ( 'List' ) )
            // InternalReqText.g:325:1: ( 'List' )
            {
            // InternalReqText.g:325:1: ( 'List' )
            // InternalReqText.g:326:2: 'List'
            {
             before(grammarAccess.getRListAccess().getListKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRListAccess().getListKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RList__Group__0__Impl"


    // $ANTLR start "rule__RList__Group__1"
    // InternalReqText.g:335:1: rule__RList__Group__1 : rule__RList__Group__1__Impl rule__RList__Group__2 ;
    public final void rule__RList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:339:1: ( rule__RList__Group__1__Impl rule__RList__Group__2 )
            // InternalReqText.g:340:2: rule__RList__Group__1__Impl rule__RList__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__RList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RList__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RList__Group__1"


    // $ANTLR start "rule__RList__Group__1__Impl"
    // InternalReqText.g:347:1: rule__RList__Group__1__Impl : ( ( rule__RList__NameAssignment_1 ) ) ;
    public final void rule__RList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:351:1: ( ( ( rule__RList__NameAssignment_1 ) ) )
            // InternalReqText.g:352:1: ( ( rule__RList__NameAssignment_1 ) )
            {
            // InternalReqText.g:352:1: ( ( rule__RList__NameAssignment_1 ) )
            // InternalReqText.g:353:2: ( rule__RList__NameAssignment_1 )
            {
             before(grammarAccess.getRListAccess().getNameAssignment_1()); 
            // InternalReqText.g:354:2: ( rule__RList__NameAssignment_1 )
            // InternalReqText.g:354:3: rule__RList__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RList__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRListAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RList__Group__1__Impl"


    // $ANTLR start "rule__RList__Group__2"
    // InternalReqText.g:362:1: rule__RList__Group__2 : rule__RList__Group__2__Impl ;
    public final void rule__RList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:366:1: ( rule__RList__Group__2__Impl )
            // InternalReqText.g:367:2: rule__RList__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RList__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RList__Group__2"


    // $ANTLR start "rule__RList__Group__2__Impl"
    // InternalReqText.g:373:1: rule__RList__Group__2__Impl : ( ( rule__RList__Group_2__0 )? ) ;
    public final void rule__RList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:377:1: ( ( ( rule__RList__Group_2__0 )? ) )
            // InternalReqText.g:378:1: ( ( rule__RList__Group_2__0 )? )
            {
            // InternalReqText.g:378:1: ( ( rule__RList__Group_2__0 )? )
            // InternalReqText.g:379:2: ( rule__RList__Group_2__0 )?
            {
             before(grammarAccess.getRListAccess().getGroup_2()); 
            // InternalReqText.g:380:2: ( rule__RList__Group_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalReqText.g:380:3: rule__RList__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RList__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRListAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RList__Group__2__Impl"


    // $ANTLR start "rule__RList__Group_2__0"
    // InternalReqText.g:389:1: rule__RList__Group_2__0 : rule__RList__Group_2__0__Impl rule__RList__Group_2__1 ;
    public final void rule__RList__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:393:1: ( rule__RList__Group_2__0__Impl rule__RList__Group_2__1 )
            // InternalReqText.g:394:2: rule__RList__Group_2__0__Impl rule__RList__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__RList__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RList__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RList__Group_2__0"


    // $ANTLR start "rule__RList__Group_2__0__Impl"
    // InternalReqText.g:401:1: rule__RList__Group_2__0__Impl : ( '[' ) ;
    public final void rule__RList__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:405:1: ( ( '[' ) )
            // InternalReqText.g:406:1: ( '[' )
            {
            // InternalReqText.g:406:1: ( '[' )
            // InternalReqText.g:407:2: '['
            {
             before(grammarAccess.getRListAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRListAccess().getLeftSquareBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RList__Group_2__0__Impl"


    // $ANTLR start "rule__RList__Group_2__1"
    // InternalReqText.g:416:1: rule__RList__Group_2__1 : rule__RList__Group_2__1__Impl rule__RList__Group_2__2 ;
    public final void rule__RList__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:420:1: ( rule__RList__Group_2__1__Impl rule__RList__Group_2__2 )
            // InternalReqText.g:421:2: rule__RList__Group_2__1__Impl rule__RList__Group_2__2
            {
            pushFollow(FOLLOW_8);
            rule__RList__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RList__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RList__Group_2__1"


    // $ANTLR start "rule__RList__Group_2__1__Impl"
    // InternalReqText.g:428:1: rule__RList__Group_2__1__Impl : ( ( rule__RList__Group_2_1__0 )? ) ;
    public final void rule__RList__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:432:1: ( ( ( rule__RList__Group_2_1__0 )? ) )
            // InternalReqText.g:433:1: ( ( rule__RList__Group_2_1__0 )? )
            {
            // InternalReqText.g:433:1: ( ( rule__RList__Group_2_1__0 )? )
            // InternalReqText.g:434:2: ( rule__RList__Group_2_1__0 )?
            {
             before(grammarAccess.getRListAccess().getGroup_2_1()); 
            // InternalReqText.g:435:2: ( rule__RList__Group_2_1__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalReqText.g:435:3: rule__RList__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RList__Group_2_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRListAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RList__Group_2__1__Impl"


    // $ANTLR start "rule__RList__Group_2__2"
    // InternalReqText.g:443:1: rule__RList__Group_2__2 : rule__RList__Group_2__2__Impl ;
    public final void rule__RList__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:447:1: ( rule__RList__Group_2__2__Impl )
            // InternalReqText.g:448:2: rule__RList__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RList__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RList__Group_2__2"


    // $ANTLR start "rule__RList__Group_2__2__Impl"
    // InternalReqText.g:454:1: rule__RList__Group_2__2__Impl : ( ']' ) ;
    public final void rule__RList__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:458:1: ( ( ']' ) )
            // InternalReqText.g:459:1: ( ']' )
            {
            // InternalReqText.g:459:1: ( ']' )
            // InternalReqText.g:460:2: ']'
            {
             before(grammarAccess.getRListAccess().getRightSquareBracketKeyword_2_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRListAccess().getRightSquareBracketKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RList__Group_2__2__Impl"


    // $ANTLR start "rule__RList__Group_2_1__0"
    // InternalReqText.g:470:1: rule__RList__Group_2_1__0 : rule__RList__Group_2_1__0__Impl rule__RList__Group_2_1__1 ;
    public final void rule__RList__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:474:1: ( rule__RList__Group_2_1__0__Impl rule__RList__Group_2_1__1 )
            // InternalReqText.g:475:2: rule__RList__Group_2_1__0__Impl rule__RList__Group_2_1__1
            {
            pushFollow(FOLLOW_9);
            rule__RList__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RList__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RList__Group_2_1__0"


    // $ANTLR start "rule__RList__Group_2_1__0__Impl"
    // InternalReqText.g:482:1: rule__RList__Group_2_1__0__Impl : ( ( rule__RList__EntriesAssignment_2_1_0 ) ) ;
    public final void rule__RList__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:486:1: ( ( ( rule__RList__EntriesAssignment_2_1_0 ) ) )
            // InternalReqText.g:487:1: ( ( rule__RList__EntriesAssignment_2_1_0 ) )
            {
            // InternalReqText.g:487:1: ( ( rule__RList__EntriesAssignment_2_1_0 ) )
            // InternalReqText.g:488:2: ( rule__RList__EntriesAssignment_2_1_0 )
            {
             before(grammarAccess.getRListAccess().getEntriesAssignment_2_1_0()); 
            // InternalReqText.g:489:2: ( rule__RList__EntriesAssignment_2_1_0 )
            // InternalReqText.g:489:3: rule__RList__EntriesAssignment_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__RList__EntriesAssignment_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getRListAccess().getEntriesAssignment_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RList__Group_2_1__0__Impl"


    // $ANTLR start "rule__RList__Group_2_1__1"
    // InternalReqText.g:497:1: rule__RList__Group_2_1__1 : rule__RList__Group_2_1__1__Impl ;
    public final void rule__RList__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:501:1: ( rule__RList__Group_2_1__1__Impl )
            // InternalReqText.g:502:2: rule__RList__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RList__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RList__Group_2_1__1"


    // $ANTLR start "rule__RList__Group_2_1__1__Impl"
    // InternalReqText.g:508:1: rule__RList__Group_2_1__1__Impl : ( ( rule__RList__Group_2_1_1__0 )* ) ;
    public final void rule__RList__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:512:1: ( ( ( rule__RList__Group_2_1_1__0 )* ) )
            // InternalReqText.g:513:1: ( ( rule__RList__Group_2_1_1__0 )* )
            {
            // InternalReqText.g:513:1: ( ( rule__RList__Group_2_1_1__0 )* )
            // InternalReqText.g:514:2: ( rule__RList__Group_2_1_1__0 )*
            {
             before(grammarAccess.getRListAccess().getGroup_2_1_1()); 
            // InternalReqText.g:515:2: ( rule__RList__Group_2_1_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalReqText.g:515:3: rule__RList__Group_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__RList__Group_2_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getRListAccess().getGroup_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RList__Group_2_1__1__Impl"


    // $ANTLR start "rule__RList__Group_2_1_1__0"
    // InternalReqText.g:524:1: rule__RList__Group_2_1_1__0 : rule__RList__Group_2_1_1__0__Impl rule__RList__Group_2_1_1__1 ;
    public final void rule__RList__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:528:1: ( rule__RList__Group_2_1_1__0__Impl rule__RList__Group_2_1_1__1 )
            // InternalReqText.g:529:2: rule__RList__Group_2_1_1__0__Impl rule__RList__Group_2_1_1__1
            {
            pushFollow(FOLLOW_6);
            rule__RList__Group_2_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RList__Group_2_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RList__Group_2_1_1__0"


    // $ANTLR start "rule__RList__Group_2_1_1__0__Impl"
    // InternalReqText.g:536:1: rule__RList__Group_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__RList__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:540:1: ( ( ',' ) )
            // InternalReqText.g:541:1: ( ',' )
            {
            // InternalReqText.g:541:1: ( ',' )
            // InternalReqText.g:542:2: ','
            {
             before(grammarAccess.getRListAccess().getCommaKeyword_2_1_1_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRListAccess().getCommaKeyword_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RList__Group_2_1_1__0__Impl"


    // $ANTLR start "rule__RList__Group_2_1_1__1"
    // InternalReqText.g:551:1: rule__RList__Group_2_1_1__1 : rule__RList__Group_2_1_1__1__Impl ;
    public final void rule__RList__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:555:1: ( rule__RList__Group_2_1_1__1__Impl )
            // InternalReqText.g:556:2: rule__RList__Group_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RList__Group_2_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RList__Group_2_1_1__1"


    // $ANTLR start "rule__RList__Group_2_1_1__1__Impl"
    // InternalReqText.g:562:1: rule__RList__Group_2_1_1__1__Impl : ( ( rule__RList__EntriesAssignment_2_1_1_1 ) ) ;
    public final void rule__RList__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:566:1: ( ( ( rule__RList__EntriesAssignment_2_1_1_1 ) ) )
            // InternalReqText.g:567:1: ( ( rule__RList__EntriesAssignment_2_1_1_1 ) )
            {
            // InternalReqText.g:567:1: ( ( rule__RList__EntriesAssignment_2_1_1_1 ) )
            // InternalReqText.g:568:2: ( rule__RList__EntriesAssignment_2_1_1_1 )
            {
             before(grammarAccess.getRListAccess().getEntriesAssignment_2_1_1_1()); 
            // InternalReqText.g:569:2: ( rule__RList__EntriesAssignment_2_1_1_1 )
            // InternalReqText.g:569:3: rule__RList__EntriesAssignment_2_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__RList__EntriesAssignment_2_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRListAccess().getEntriesAssignment_2_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RList__Group_2_1_1__1__Impl"


    // $ANTLR start "rule__RMap__Group__0"
    // InternalReqText.g:578:1: rule__RMap__Group__0 : rule__RMap__Group__0__Impl rule__RMap__Group__1 ;
    public final void rule__RMap__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:582:1: ( rule__RMap__Group__0__Impl rule__RMap__Group__1 )
            // InternalReqText.g:583:2: rule__RMap__Group__0__Impl rule__RMap__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__RMap__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RMap__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RMap__Group__0"


    // $ANTLR start "rule__RMap__Group__0__Impl"
    // InternalReqText.g:590:1: rule__RMap__Group__0__Impl : ( 'Map' ) ;
    public final void rule__RMap__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:594:1: ( ( 'Map' ) )
            // InternalReqText.g:595:1: ( 'Map' )
            {
            // InternalReqText.g:595:1: ( 'Map' )
            // InternalReqText.g:596:2: 'Map'
            {
             before(grammarAccess.getRMapAccess().getMapKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRMapAccess().getMapKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RMap__Group__0__Impl"


    // $ANTLR start "rule__RMap__Group__1"
    // InternalReqText.g:605:1: rule__RMap__Group__1 : rule__RMap__Group__1__Impl rule__RMap__Group__2 ;
    public final void rule__RMap__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:609:1: ( rule__RMap__Group__1__Impl rule__RMap__Group__2 )
            // InternalReqText.g:610:2: rule__RMap__Group__1__Impl rule__RMap__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__RMap__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RMap__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RMap__Group__1"


    // $ANTLR start "rule__RMap__Group__1__Impl"
    // InternalReqText.g:617:1: rule__RMap__Group__1__Impl : ( ( rule__RMap__NameAssignment_1 ) ) ;
    public final void rule__RMap__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:621:1: ( ( ( rule__RMap__NameAssignment_1 ) ) )
            // InternalReqText.g:622:1: ( ( rule__RMap__NameAssignment_1 ) )
            {
            // InternalReqText.g:622:1: ( ( rule__RMap__NameAssignment_1 ) )
            // InternalReqText.g:623:2: ( rule__RMap__NameAssignment_1 )
            {
             before(grammarAccess.getRMapAccess().getNameAssignment_1()); 
            // InternalReqText.g:624:2: ( rule__RMap__NameAssignment_1 )
            // InternalReqText.g:624:3: rule__RMap__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RMap__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRMapAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RMap__Group__1__Impl"


    // $ANTLR start "rule__RMap__Group__2"
    // InternalReqText.g:632:1: rule__RMap__Group__2 : rule__RMap__Group__2__Impl ;
    public final void rule__RMap__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:636:1: ( rule__RMap__Group__2__Impl )
            // InternalReqText.g:637:2: rule__RMap__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RMap__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RMap__Group__2"


    // $ANTLR start "rule__RMap__Group__2__Impl"
    // InternalReqText.g:643:1: rule__RMap__Group__2__Impl : ( ( rule__RMap__EntriesAssignment_2 )* ) ;
    public final void rule__RMap__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:647:1: ( ( ( rule__RMap__EntriesAssignment_2 )* ) )
            // InternalReqText.g:648:1: ( ( rule__RMap__EntriesAssignment_2 )* )
            {
            // InternalReqText.g:648:1: ( ( rule__RMap__EntriesAssignment_2 )* )
            // InternalReqText.g:649:2: ( rule__RMap__EntriesAssignment_2 )*
            {
             before(grammarAccess.getRMapAccess().getEntriesAssignment_2()); 
            // InternalReqText.g:650:2: ( rule__RMap__EntriesAssignment_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalReqText.g:650:3: rule__RMap__EntriesAssignment_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__RMap__EntriesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getRMapAccess().getEntriesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RMap__Group__2__Impl"


    // $ANTLR start "rule__RMapEntry__Group__0"
    // InternalReqText.g:659:1: rule__RMapEntry__Group__0 : rule__RMapEntry__Group__0__Impl rule__RMapEntry__Group__1 ;
    public final void rule__RMapEntry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:663:1: ( rule__RMapEntry__Group__0__Impl rule__RMapEntry__Group__1 )
            // InternalReqText.g:664:2: rule__RMapEntry__Group__0__Impl rule__RMapEntry__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__RMapEntry__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RMapEntry__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RMapEntry__Group__0"


    // $ANTLR start "rule__RMapEntry__Group__0__Impl"
    // InternalReqText.g:671:1: rule__RMapEntry__Group__0__Impl : ( ( rule__RMapEntry__NameAssignment_0 ) ) ;
    public final void rule__RMapEntry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:675:1: ( ( ( rule__RMapEntry__NameAssignment_0 ) ) )
            // InternalReqText.g:676:1: ( ( rule__RMapEntry__NameAssignment_0 ) )
            {
            // InternalReqText.g:676:1: ( ( rule__RMapEntry__NameAssignment_0 ) )
            // InternalReqText.g:677:2: ( rule__RMapEntry__NameAssignment_0 )
            {
             before(grammarAccess.getRMapEntryAccess().getNameAssignment_0()); 
            // InternalReqText.g:678:2: ( rule__RMapEntry__NameAssignment_0 )
            // InternalReqText.g:678:3: rule__RMapEntry__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RMapEntry__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRMapEntryAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RMapEntry__Group__0__Impl"


    // $ANTLR start "rule__RMapEntry__Group__1"
    // InternalReqText.g:686:1: rule__RMapEntry__Group__1 : rule__RMapEntry__Group__1__Impl rule__RMapEntry__Group__2 ;
    public final void rule__RMapEntry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:690:1: ( rule__RMapEntry__Group__1__Impl rule__RMapEntry__Group__2 )
            // InternalReqText.g:691:2: rule__RMapEntry__Group__1__Impl rule__RMapEntry__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__RMapEntry__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RMapEntry__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RMapEntry__Group__1"


    // $ANTLR start "rule__RMapEntry__Group__1__Impl"
    // InternalReqText.g:698:1: rule__RMapEntry__Group__1__Impl : ( '=>' ) ;
    public final void rule__RMapEntry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:702:1: ( ( '=>' ) )
            // InternalReqText.g:703:1: ( '=>' )
            {
            // InternalReqText.g:703:1: ( '=>' )
            // InternalReqText.g:704:2: '=>'
            {
             before(grammarAccess.getRMapEntryAccess().getEqualsSignGreaterThanSignKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRMapEntryAccess().getEqualsSignGreaterThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RMapEntry__Group__1__Impl"


    // $ANTLR start "rule__RMapEntry__Group__2"
    // InternalReqText.g:713:1: rule__RMapEntry__Group__2 : rule__RMapEntry__Group__2__Impl rule__RMapEntry__Group__3 ;
    public final void rule__RMapEntry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:717:1: ( rule__RMapEntry__Group__2__Impl rule__RMapEntry__Group__3 )
            // InternalReqText.g:718:2: rule__RMapEntry__Group__2__Impl rule__RMapEntry__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__RMapEntry__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RMapEntry__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RMapEntry__Group__2"


    // $ANTLR start "rule__RMapEntry__Group__2__Impl"
    // InternalReqText.g:725:1: rule__RMapEntry__Group__2__Impl : ( ( rule__RMapEntry__ValueAssignment_2 ) ) ;
    public final void rule__RMapEntry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:729:1: ( ( ( rule__RMapEntry__ValueAssignment_2 ) ) )
            // InternalReqText.g:730:1: ( ( rule__RMapEntry__ValueAssignment_2 ) )
            {
            // InternalReqText.g:730:1: ( ( rule__RMapEntry__ValueAssignment_2 ) )
            // InternalReqText.g:731:2: ( rule__RMapEntry__ValueAssignment_2 )
            {
             before(grammarAccess.getRMapEntryAccess().getValueAssignment_2()); 
            // InternalReqText.g:732:2: ( rule__RMapEntry__ValueAssignment_2 )
            // InternalReqText.g:732:3: rule__RMapEntry__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RMapEntry__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRMapEntryAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RMapEntry__Group__2__Impl"


    // $ANTLR start "rule__RMapEntry__Group__3"
    // InternalReqText.g:740:1: rule__RMapEntry__Group__3 : rule__RMapEntry__Group__3__Impl ;
    public final void rule__RMapEntry__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:744:1: ( rule__RMapEntry__Group__3__Impl )
            // InternalReqText.g:745:2: rule__RMapEntry__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RMapEntry__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RMapEntry__Group__3"


    // $ANTLR start "rule__RMapEntry__Group__3__Impl"
    // InternalReqText.g:751:1: rule__RMapEntry__Group__3__Impl : ( ( rule__RMapEntry__Group_3__0 )? ) ;
    public final void rule__RMapEntry__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:755:1: ( ( ( rule__RMapEntry__Group_3__0 )? ) )
            // InternalReqText.g:756:1: ( ( rule__RMapEntry__Group_3__0 )? )
            {
            // InternalReqText.g:756:1: ( ( rule__RMapEntry__Group_3__0 )? )
            // InternalReqText.g:757:2: ( rule__RMapEntry__Group_3__0 )?
            {
             before(grammarAccess.getRMapEntryAccess().getGroup_3()); 
            // InternalReqText.g:758:2: ( rule__RMapEntry__Group_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalReqText.g:758:3: rule__RMapEntry__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RMapEntry__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRMapEntryAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RMapEntry__Group__3__Impl"


    // $ANTLR start "rule__RMapEntry__Group_3__0"
    // InternalReqText.g:767:1: rule__RMapEntry__Group_3__0 : rule__RMapEntry__Group_3__0__Impl rule__RMapEntry__Group_3__1 ;
    public final void rule__RMapEntry__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:771:1: ( rule__RMapEntry__Group_3__0__Impl rule__RMapEntry__Group_3__1 )
            // InternalReqText.g:772:2: rule__RMapEntry__Group_3__0__Impl rule__RMapEntry__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__RMapEntry__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RMapEntry__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RMapEntry__Group_3__0"


    // $ANTLR start "rule__RMapEntry__Group_3__0__Impl"
    // InternalReqText.g:779:1: rule__RMapEntry__Group_3__0__Impl : ( '[' ) ;
    public final void rule__RMapEntry__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:783:1: ( ( '[' ) )
            // InternalReqText.g:784:1: ( '[' )
            {
            // InternalReqText.g:784:1: ( '[' )
            // InternalReqText.g:785:2: '['
            {
             before(grammarAccess.getRMapEntryAccess().getLeftSquareBracketKeyword_3_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRMapEntryAccess().getLeftSquareBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RMapEntry__Group_3__0__Impl"


    // $ANTLR start "rule__RMapEntry__Group_3__1"
    // InternalReqText.g:794:1: rule__RMapEntry__Group_3__1 : rule__RMapEntry__Group_3__1__Impl rule__RMapEntry__Group_3__2 ;
    public final void rule__RMapEntry__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:798:1: ( rule__RMapEntry__Group_3__1__Impl rule__RMapEntry__Group_3__2 )
            // InternalReqText.g:799:2: rule__RMapEntry__Group_3__1__Impl rule__RMapEntry__Group_3__2
            {
            pushFollow(FOLLOW_8);
            rule__RMapEntry__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RMapEntry__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RMapEntry__Group_3__1"


    // $ANTLR start "rule__RMapEntry__Group_3__1__Impl"
    // InternalReqText.g:806:1: rule__RMapEntry__Group_3__1__Impl : ( ( rule__RMapEntry__RefAssignment_3_1 )? ) ;
    public final void rule__RMapEntry__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:810:1: ( ( ( rule__RMapEntry__RefAssignment_3_1 )? ) )
            // InternalReqText.g:811:1: ( ( rule__RMapEntry__RefAssignment_3_1 )? )
            {
            // InternalReqText.g:811:1: ( ( rule__RMapEntry__RefAssignment_3_1 )? )
            // InternalReqText.g:812:2: ( rule__RMapEntry__RefAssignment_3_1 )?
            {
             before(grammarAccess.getRMapEntryAccess().getRefAssignment_3_1()); 
            // InternalReqText.g:813:2: ( rule__RMapEntry__RefAssignment_3_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalReqText.g:813:3: rule__RMapEntry__RefAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__RMapEntry__RefAssignment_3_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRMapEntryAccess().getRefAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RMapEntry__Group_3__1__Impl"


    // $ANTLR start "rule__RMapEntry__Group_3__2"
    // InternalReqText.g:821:1: rule__RMapEntry__Group_3__2 : rule__RMapEntry__Group_3__2__Impl ;
    public final void rule__RMapEntry__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:825:1: ( rule__RMapEntry__Group_3__2__Impl )
            // InternalReqText.g:826:2: rule__RMapEntry__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RMapEntry__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RMapEntry__Group_3__2"


    // $ANTLR start "rule__RMapEntry__Group_3__2__Impl"
    // InternalReqText.g:832:1: rule__RMapEntry__Group_3__2__Impl : ( ']' ) ;
    public final void rule__RMapEntry__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:836:1: ( ( ']' ) )
            // InternalReqText.g:837:1: ( ']' )
            {
            // InternalReqText.g:837:1: ( ']' )
            // InternalReqText.g:838:2: ']'
            {
             before(grammarAccess.getRMapEntryAccess().getRightSquareBracketKeyword_3_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRMapEntryAccess().getRightSquareBracketKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RMapEntry__Group_3__2__Impl"


    // $ANTLR start "rule__CrossRef__Group__0"
    // InternalReqText.g:848:1: rule__CrossRef__Group__0 : rule__CrossRef__Group__0__Impl rule__CrossRef__Group__1 ;
    public final void rule__CrossRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:852:1: ( rule__CrossRef__Group__0__Impl rule__CrossRef__Group__1 )
            // InternalReqText.g:853:2: rule__CrossRef__Group__0__Impl rule__CrossRef__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__CrossRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CrossRef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossRef__Group__0"


    // $ANTLR start "rule__CrossRef__Group__0__Impl"
    // InternalReqText.g:860:1: rule__CrossRef__Group__0__Impl : ( 'ref' ) ;
    public final void rule__CrossRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:864:1: ( ( 'ref' ) )
            // InternalReqText.g:865:1: ( 'ref' )
            {
            // InternalReqText.g:865:1: ( 'ref' )
            // InternalReqText.g:866:2: 'ref'
            {
             before(grammarAccess.getCrossRefAccess().getRefKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCrossRefAccess().getRefKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossRef__Group__0__Impl"


    // $ANTLR start "rule__CrossRef__Group__1"
    // InternalReqText.g:875:1: rule__CrossRef__Group__1 : rule__CrossRef__Group__1__Impl ;
    public final void rule__CrossRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:879:1: ( rule__CrossRef__Group__1__Impl )
            // InternalReqText.g:880:2: rule__CrossRef__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CrossRef__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossRef__Group__1"


    // $ANTLR start "rule__CrossRef__Group__1__Impl"
    // InternalReqText.g:886:1: rule__CrossRef__Group__1__Impl : ( ( rule__CrossRef__RefAssignment_1 ) ) ;
    public final void rule__CrossRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:890:1: ( ( ( rule__CrossRef__RefAssignment_1 ) ) )
            // InternalReqText.g:891:1: ( ( rule__CrossRef__RefAssignment_1 ) )
            {
            // InternalReqText.g:891:1: ( ( rule__CrossRef__RefAssignment_1 ) )
            // InternalReqText.g:892:2: ( rule__CrossRef__RefAssignment_1 )
            {
             before(grammarAccess.getCrossRefAccess().getRefAssignment_1()); 
            // InternalReqText.g:893:2: ( rule__CrossRef__RefAssignment_1 )
            // InternalReqText.g:893:3: rule__CrossRef__RefAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CrossRef__RefAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCrossRefAccess().getRefAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossRef__Group__1__Impl"


    // $ANTLR start "rule__RImport__Group__0"
    // InternalReqText.g:902:1: rule__RImport__Group__0 : rule__RImport__Group__0__Impl rule__RImport__Group__1 ;
    public final void rule__RImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:906:1: ( rule__RImport__Group__0__Impl rule__RImport__Group__1 )
            // InternalReqText.g:907:2: rule__RImport__Group__0__Impl rule__RImport__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__RImport__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RImport__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RImport__Group__0"


    // $ANTLR start "rule__RImport__Group__0__Impl"
    // InternalReqText.g:914:1: rule__RImport__Group__0__Impl : ( 'import' ) ;
    public final void rule__RImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:918:1: ( ( 'import' ) )
            // InternalReqText.g:919:1: ( 'import' )
            {
            // InternalReqText.g:919:1: ( 'import' )
            // InternalReqText.g:920:2: 'import'
            {
             before(grammarAccess.getRImportAccess().getImportKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RImport__Group__0__Impl"


    // $ANTLR start "rule__RImport__Group__1"
    // InternalReqText.g:929:1: rule__RImport__Group__1 : rule__RImport__Group__1__Impl ;
    public final void rule__RImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:933:1: ( rule__RImport__Group__1__Impl )
            // InternalReqText.g:934:2: rule__RImport__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RImport__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RImport__Group__1"


    // $ANTLR start "rule__RImport__Group__1__Impl"
    // InternalReqText.g:940:1: rule__RImport__Group__1__Impl : ( ( rule__RImport__ImportURIAssignment_1 ) ) ;
    public final void rule__RImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:944:1: ( ( ( rule__RImport__ImportURIAssignment_1 ) ) )
            // InternalReqText.g:945:1: ( ( rule__RImport__ImportURIAssignment_1 ) )
            {
            // InternalReqText.g:945:1: ( ( rule__RImport__ImportURIAssignment_1 ) )
            // InternalReqText.g:946:2: ( rule__RImport__ImportURIAssignment_1 )
            {
             before(grammarAccess.getRImportAccess().getImportURIAssignment_1()); 
            // InternalReqText.g:947:2: ( rule__RImport__ImportURIAssignment_1 )
            // InternalReqText.g:947:3: rule__RImport__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RImport__ImportURIAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRImportAccess().getImportURIAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RImport__Group__1__Impl"


    // $ANTLR start "rule__RModel__ImportsAssignment_0"
    // InternalReqText.g:956:1: rule__RModel__ImportsAssignment_0 : ( ruleRImport ) ;
    public final void rule__RModel__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:960:1: ( ( ruleRImport ) )
            // InternalReqText.g:961:2: ( ruleRImport )
            {
            // InternalReqText.g:961:2: ( ruleRImport )
            // InternalReqText.g:962:3: ruleRImport
            {
             before(grammarAccess.getRModelAccess().getImportsRImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRImport();

            state._fsp--;

             after(grammarAccess.getRModelAccess().getImportsRImportParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RModel__ImportsAssignment_0"


    // $ANTLR start "rule__RModel__ContentsAssignment_1"
    // InternalReqText.g:971:1: rule__RModel__ContentsAssignment_1 : ( ruleContent ) ;
    public final void rule__RModel__ContentsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:975:1: ( ( ruleContent ) )
            // InternalReqText.g:976:2: ( ruleContent )
            {
            // InternalReqText.g:976:2: ( ruleContent )
            // InternalReqText.g:977:3: ruleContent
            {
             before(grammarAccess.getRModelAccess().getContentsContentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleContent();

            state._fsp--;

             after(grammarAccess.getRModelAccess().getContentsContentParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RModel__ContentsAssignment_1"


    // $ANTLR start "rule__RList__NameAssignment_1"
    // InternalReqText.g:986:1: rule__RList__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RList__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:990:1: ( ( RULE_ID ) )
            // InternalReqText.g:991:2: ( RULE_ID )
            {
            // InternalReqText.g:991:2: ( RULE_ID )
            // InternalReqText.g:992:3: RULE_ID
            {
             before(grammarAccess.getRListAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRListAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RList__NameAssignment_1"


    // $ANTLR start "rule__RList__EntriesAssignment_2_1_0"
    // InternalReqText.g:1001:1: rule__RList__EntriesAssignment_2_1_0 : ( RULE_ID ) ;
    public final void rule__RList__EntriesAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1005:1: ( ( RULE_ID ) )
            // InternalReqText.g:1006:2: ( RULE_ID )
            {
            // InternalReqText.g:1006:2: ( RULE_ID )
            // InternalReqText.g:1007:3: RULE_ID
            {
             before(grammarAccess.getRListAccess().getEntriesIDTerminalRuleCall_2_1_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRListAccess().getEntriesIDTerminalRuleCall_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RList__EntriesAssignment_2_1_0"


    // $ANTLR start "rule__RList__EntriesAssignment_2_1_1_1"
    // InternalReqText.g:1016:1: rule__RList__EntriesAssignment_2_1_1_1 : ( RULE_ID ) ;
    public final void rule__RList__EntriesAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1020:1: ( ( RULE_ID ) )
            // InternalReqText.g:1021:2: ( RULE_ID )
            {
            // InternalReqText.g:1021:2: ( RULE_ID )
            // InternalReqText.g:1022:3: RULE_ID
            {
             before(grammarAccess.getRListAccess().getEntriesIDTerminalRuleCall_2_1_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRListAccess().getEntriesIDTerminalRuleCall_2_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RList__EntriesAssignment_2_1_1_1"


    // $ANTLR start "rule__RMap__NameAssignment_1"
    // InternalReqText.g:1031:1: rule__RMap__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RMap__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1035:1: ( ( RULE_ID ) )
            // InternalReqText.g:1036:2: ( RULE_ID )
            {
            // InternalReqText.g:1036:2: ( RULE_ID )
            // InternalReqText.g:1037:3: RULE_ID
            {
             before(grammarAccess.getRMapAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRMapAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RMap__NameAssignment_1"


    // $ANTLR start "rule__RMap__EntriesAssignment_2"
    // InternalReqText.g:1046:1: rule__RMap__EntriesAssignment_2 : ( ruleRMapEntry ) ;
    public final void rule__RMap__EntriesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1050:1: ( ( ruleRMapEntry ) )
            // InternalReqText.g:1051:2: ( ruleRMapEntry )
            {
            // InternalReqText.g:1051:2: ( ruleRMapEntry )
            // InternalReqText.g:1052:3: ruleRMapEntry
            {
             before(grammarAccess.getRMapAccess().getEntriesRMapEntryParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRMapEntry();

            state._fsp--;

             after(grammarAccess.getRMapAccess().getEntriesRMapEntryParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RMap__EntriesAssignment_2"


    // $ANTLR start "rule__RMapEntry__NameAssignment_0"
    // InternalReqText.g:1061:1: rule__RMapEntry__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__RMapEntry__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1065:1: ( ( RULE_ID ) )
            // InternalReqText.g:1066:2: ( RULE_ID )
            {
            // InternalReqText.g:1066:2: ( RULE_ID )
            // InternalReqText.g:1067:3: RULE_ID
            {
             before(grammarAccess.getRMapEntryAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRMapEntryAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RMapEntry__NameAssignment_0"


    // $ANTLR start "rule__RMapEntry__ValueAssignment_2"
    // InternalReqText.g:1076:1: rule__RMapEntry__ValueAssignment_2 : ( RULE_CC_STRING ) ;
    public final void rule__RMapEntry__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1080:1: ( ( RULE_CC_STRING ) )
            // InternalReqText.g:1081:2: ( RULE_CC_STRING )
            {
            // InternalReqText.g:1081:2: ( RULE_CC_STRING )
            // InternalReqText.g:1082:3: RULE_CC_STRING
            {
             before(grammarAccess.getRMapEntryAccess().getValueCC_STRINGTerminalRuleCall_2_0()); 
            match(input,RULE_CC_STRING,FOLLOW_2); 
             after(grammarAccess.getRMapEntryAccess().getValueCC_STRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RMapEntry__ValueAssignment_2"


    // $ANTLR start "rule__RMapEntry__RefAssignment_3_1"
    // InternalReqText.g:1091:1: rule__RMapEntry__RefAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__RMapEntry__RefAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1095:1: ( ( ( RULE_ID ) ) )
            // InternalReqText.g:1096:2: ( ( RULE_ID ) )
            {
            // InternalReqText.g:1096:2: ( ( RULE_ID ) )
            // InternalReqText.g:1097:3: ( RULE_ID )
            {
             before(grammarAccess.getRMapEntryAccess().getRefRMapEntryCrossReference_3_1_0()); 
            // InternalReqText.g:1098:3: ( RULE_ID )
            // InternalReqText.g:1099:4: RULE_ID
            {
             before(grammarAccess.getRMapEntryAccess().getRefRMapEntryIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRMapEntryAccess().getRefRMapEntryIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getRMapEntryAccess().getRefRMapEntryCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RMapEntry__RefAssignment_3_1"


    // $ANTLR start "rule__CrossRef__RefAssignment_1"
    // InternalReqText.g:1110:1: rule__CrossRef__RefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__CrossRef__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1114:1: ( ( ( RULE_ID ) ) )
            // InternalReqText.g:1115:2: ( ( RULE_ID ) )
            {
            // InternalReqText.g:1115:2: ( ( RULE_ID ) )
            // InternalReqText.g:1116:3: ( RULE_ID )
            {
             before(grammarAccess.getCrossRefAccess().getRefContentCrossReference_1_0()); 
            // InternalReqText.g:1117:3: ( RULE_ID )
            // InternalReqText.g:1118:4: RULE_ID
            {
             before(grammarAccess.getCrossRefAccess().getRefContentIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCrossRefAccess().getRefContentIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getCrossRefAccess().getRefContentCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossRef__RefAssignment_1"


    // $ANTLR start "rule__RImport__ImportURIAssignment_1"
    // InternalReqText.g:1129:1: rule__RImport__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__RImport__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1133:1: ( ( RULE_STRING ) )
            // InternalReqText.g:1134:2: ( RULE_STRING )
            {
            // InternalReqText.g:1134:2: ( RULE_STRING )
            // InternalReqText.g:1135:3: RULE_STRING
            {
             before(grammarAccess.getRImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RImport__ImportURIAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000051000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000051002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});

}