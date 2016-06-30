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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_CC_STRING", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SpecObject'", "'{'", "'description'", "'state'", "'classification'", "'version'", "'}'", "'image'", "'reference'", "'State'", "'Classification'", "'.'", "'import'"
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


    // $ANTLR start "entryRuleSpecObject"
    // InternalReqText.g:78:1: entryRuleSpecObject : ruleSpecObject EOF ;
    public final void entryRuleSpecObject() throws RecognitionException {
        try {
            // InternalReqText.g:79:1: ( ruleSpecObject EOF )
            // InternalReqText.g:80:1: ruleSpecObject EOF
            {
             before(grammarAccess.getSpecObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleSpecObject();

            state._fsp--;

             after(grammarAccess.getSpecObjectRule()); 
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
    // $ANTLR end "entryRuleSpecObject"


    // $ANTLR start "ruleSpecObject"
    // InternalReqText.g:87:1: ruleSpecObject : ( ( rule__SpecObject__Group__0 ) ) ;
    public final void ruleSpecObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:91:2: ( ( ( rule__SpecObject__Group__0 ) ) )
            // InternalReqText.g:92:2: ( ( rule__SpecObject__Group__0 ) )
            {
            // InternalReqText.g:92:2: ( ( rule__SpecObject__Group__0 ) )
            // InternalReqText.g:93:3: ( rule__SpecObject__Group__0 )
            {
             before(grammarAccess.getSpecObjectAccess().getGroup()); 
            // InternalReqText.g:94:3: ( rule__SpecObject__Group__0 )
            // InternalReqText.g:94:4: rule__SpecObject__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SpecObject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSpecObjectAccess().getGroup()); 

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
    // $ANTLR end "ruleSpecObject"


    // $ANTLR start "entryRuleState"
    // InternalReqText.g:103:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // InternalReqText.g:104:1: ( ruleState EOF )
            // InternalReqText.g:105:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalReqText.g:112:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:116:2: ( ( ( rule__State__Group__0 ) ) )
            // InternalReqText.g:117:2: ( ( rule__State__Group__0 ) )
            {
            // InternalReqText.g:117:2: ( ( rule__State__Group__0 ) )
            // InternalReqText.g:118:3: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // InternalReqText.g:119:3: ( rule__State__Group__0 )
            // InternalReqText.g:119:4: rule__State__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getGroup()); 

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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleClass"
    // InternalReqText.g:128:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // InternalReqText.g:129:1: ( ruleClass EOF )
            // InternalReqText.g:130:1: ruleClass EOF
            {
             before(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_1);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getClassRule()); 
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
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalReqText.g:137:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:141:2: ( ( ( rule__Class__Group__0 ) ) )
            // InternalReqText.g:142:2: ( ( rule__Class__Group__0 ) )
            {
            // InternalReqText.g:142:2: ( ( rule__Class__Group__0 ) )
            // InternalReqText.g:143:3: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // InternalReqText.g:144:3: ( rule__Class__Group__0 )
            // InternalReqText.g:144:4: rule__Class__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getGroup()); 

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
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleVersion"
    // InternalReqText.g:153:1: entryRuleVersion : ruleVersion EOF ;
    public final void entryRuleVersion() throws RecognitionException {
        try {
            // InternalReqText.g:154:1: ( ruleVersion EOF )
            // InternalReqText.g:155:1: ruleVersion EOF
            {
             before(grammarAccess.getVersionRule()); 
            pushFollow(FOLLOW_1);
            ruleVersion();

            state._fsp--;

             after(grammarAccess.getVersionRule()); 
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
    // $ANTLR end "entryRuleVersion"


    // $ANTLR start "ruleVersion"
    // InternalReqText.g:162:1: ruleVersion : ( ( rule__Version__Group__0 ) ) ;
    public final void ruleVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:166:2: ( ( ( rule__Version__Group__0 ) ) )
            // InternalReqText.g:167:2: ( ( rule__Version__Group__0 ) )
            {
            // InternalReqText.g:167:2: ( ( rule__Version__Group__0 ) )
            // InternalReqText.g:168:3: ( rule__Version__Group__0 )
            {
             before(grammarAccess.getVersionAccess().getGroup()); 
            // InternalReqText.g:169:3: ( rule__Version__Group__0 )
            // InternalReqText.g:169:4: rule__Version__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Version__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVersionAccess().getGroup()); 

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
    // $ANTLR end "ruleVersion"


    // $ANTLR start "entryRuleRImport"
    // InternalReqText.g:178:1: entryRuleRImport : ruleRImport EOF ;
    public final void entryRuleRImport() throws RecognitionException {
        try {
            // InternalReqText.g:179:1: ( ruleRImport EOF )
            // InternalReqText.g:180:1: ruleRImport EOF
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
    // InternalReqText.g:187:1: ruleRImport : ( ( rule__RImport__Group__0 ) ) ;
    public final void ruleRImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:191:2: ( ( ( rule__RImport__Group__0 ) ) )
            // InternalReqText.g:192:2: ( ( rule__RImport__Group__0 ) )
            {
            // InternalReqText.g:192:2: ( ( rule__RImport__Group__0 ) )
            // InternalReqText.g:193:3: ( rule__RImport__Group__0 )
            {
             before(grammarAccess.getRImportAccess().getGroup()); 
            // InternalReqText.g:194:3: ( rule__RImport__Group__0 )
            // InternalReqText.g:194:4: rule__RImport__Group__0
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


    // $ANTLR start "rule__RModel__Alternatives_1"
    // InternalReqText.g:202:1: rule__RModel__Alternatives_1 : ( ( ( rule__RModel__StatesAssignment_1_0 ) ) | ( ( rule__RModel__ClassesAssignment_1_1 ) ) | ( ( rule__RModel__ObjsAssignment_1_2 ) ) );
    public final void rule__RModel__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:206:1: ( ( ( rule__RModel__StatesAssignment_1_0 ) ) | ( ( rule__RModel__ClassesAssignment_1_1 ) ) | ( ( rule__RModel__ObjsAssignment_1_2 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt1=1;
                }
                break;
            case 22:
                {
                alt1=2;
                }
                break;
            case 12:
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
                    // InternalReqText.g:207:2: ( ( rule__RModel__StatesAssignment_1_0 ) )
                    {
                    // InternalReqText.g:207:2: ( ( rule__RModel__StatesAssignment_1_0 ) )
                    // InternalReqText.g:208:3: ( rule__RModel__StatesAssignment_1_0 )
                    {
                     before(grammarAccess.getRModelAccess().getStatesAssignment_1_0()); 
                    // InternalReqText.g:209:3: ( rule__RModel__StatesAssignment_1_0 )
                    // InternalReqText.g:209:4: rule__RModel__StatesAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RModel__StatesAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRModelAccess().getStatesAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReqText.g:213:2: ( ( rule__RModel__ClassesAssignment_1_1 ) )
                    {
                    // InternalReqText.g:213:2: ( ( rule__RModel__ClassesAssignment_1_1 ) )
                    // InternalReqText.g:214:3: ( rule__RModel__ClassesAssignment_1_1 )
                    {
                     before(grammarAccess.getRModelAccess().getClassesAssignment_1_1()); 
                    // InternalReqText.g:215:3: ( rule__RModel__ClassesAssignment_1_1 )
                    // InternalReqText.g:215:4: rule__RModel__ClassesAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__RModel__ClassesAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRModelAccess().getClassesAssignment_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalReqText.g:219:2: ( ( rule__RModel__ObjsAssignment_1_2 ) )
                    {
                    // InternalReqText.g:219:2: ( ( rule__RModel__ObjsAssignment_1_2 ) )
                    // InternalReqText.g:220:3: ( rule__RModel__ObjsAssignment_1_2 )
                    {
                     before(grammarAccess.getRModelAccess().getObjsAssignment_1_2()); 
                    // InternalReqText.g:221:3: ( rule__RModel__ObjsAssignment_1_2 )
                    // InternalReqText.g:221:4: rule__RModel__ObjsAssignment_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__RModel__ObjsAssignment_1_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getRModelAccess().getObjsAssignment_1_2()); 

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
    // $ANTLR end "rule__RModel__Alternatives_1"


    // $ANTLR start "rule__RModel__Group__0"
    // InternalReqText.g:229:1: rule__RModel__Group__0 : rule__RModel__Group__0__Impl rule__RModel__Group__1 ;
    public final void rule__RModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:233:1: ( rule__RModel__Group__0__Impl rule__RModel__Group__1 )
            // InternalReqText.g:234:2: rule__RModel__Group__0__Impl rule__RModel__Group__1
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
    // InternalReqText.g:241:1: rule__RModel__Group__0__Impl : ( ( rule__RModel__ImportsAssignment_0 )* ) ;
    public final void rule__RModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:245:1: ( ( ( rule__RModel__ImportsAssignment_0 )* ) )
            // InternalReqText.g:246:1: ( ( rule__RModel__ImportsAssignment_0 )* )
            {
            // InternalReqText.g:246:1: ( ( rule__RModel__ImportsAssignment_0 )* )
            // InternalReqText.g:247:2: ( rule__RModel__ImportsAssignment_0 )*
            {
             before(grammarAccess.getRModelAccess().getImportsAssignment_0()); 
            // InternalReqText.g:248:2: ( rule__RModel__ImportsAssignment_0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==24) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalReqText.g:248:3: rule__RModel__ImportsAssignment_0
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
    // InternalReqText.g:256:1: rule__RModel__Group__1 : rule__RModel__Group__1__Impl ;
    public final void rule__RModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:260:1: ( rule__RModel__Group__1__Impl )
            // InternalReqText.g:261:2: rule__RModel__Group__1__Impl
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
    // InternalReqText.g:267:1: rule__RModel__Group__1__Impl : ( ( rule__RModel__Alternatives_1 )* ) ;
    public final void rule__RModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:271:1: ( ( ( rule__RModel__Alternatives_1 )* ) )
            // InternalReqText.g:272:1: ( ( rule__RModel__Alternatives_1 )* )
            {
            // InternalReqText.g:272:1: ( ( rule__RModel__Alternatives_1 )* )
            // InternalReqText.g:273:2: ( rule__RModel__Alternatives_1 )*
            {
             before(grammarAccess.getRModelAccess().getAlternatives_1()); 
            // InternalReqText.g:274:2: ( rule__RModel__Alternatives_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12||(LA3_0>=21 && LA3_0<=22)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalReqText.g:274:3: rule__RModel__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__RModel__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getRModelAccess().getAlternatives_1()); 

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


    // $ANTLR start "rule__SpecObject__Group__0"
    // InternalReqText.g:283:1: rule__SpecObject__Group__0 : rule__SpecObject__Group__0__Impl rule__SpecObject__Group__1 ;
    public final void rule__SpecObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:287:1: ( rule__SpecObject__Group__0__Impl rule__SpecObject__Group__1 )
            // InternalReqText.g:288:2: rule__SpecObject__Group__0__Impl rule__SpecObject__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__SpecObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpecObject__Group__1();

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
    // $ANTLR end "rule__SpecObject__Group__0"


    // $ANTLR start "rule__SpecObject__Group__0__Impl"
    // InternalReqText.g:295:1: rule__SpecObject__Group__0__Impl : ( 'SpecObject' ) ;
    public final void rule__SpecObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:299:1: ( ( 'SpecObject' ) )
            // InternalReqText.g:300:1: ( 'SpecObject' )
            {
            // InternalReqText.g:300:1: ( 'SpecObject' )
            // InternalReqText.g:301:2: 'SpecObject'
            {
             before(grammarAccess.getSpecObjectAccess().getSpecObjectKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSpecObjectAccess().getSpecObjectKeyword_0()); 

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
    // $ANTLR end "rule__SpecObject__Group__0__Impl"


    // $ANTLR start "rule__SpecObject__Group__1"
    // InternalReqText.g:310:1: rule__SpecObject__Group__1 : rule__SpecObject__Group__1__Impl rule__SpecObject__Group__2 ;
    public final void rule__SpecObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:314:1: ( rule__SpecObject__Group__1__Impl rule__SpecObject__Group__2 )
            // InternalReqText.g:315:2: rule__SpecObject__Group__1__Impl rule__SpecObject__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__SpecObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpecObject__Group__2();

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
    // $ANTLR end "rule__SpecObject__Group__1"


    // $ANTLR start "rule__SpecObject__Group__1__Impl"
    // InternalReqText.g:322:1: rule__SpecObject__Group__1__Impl : ( ( rule__SpecObject__NameAssignment_1 ) ) ;
    public final void rule__SpecObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:326:1: ( ( ( rule__SpecObject__NameAssignment_1 ) ) )
            // InternalReqText.g:327:1: ( ( rule__SpecObject__NameAssignment_1 ) )
            {
            // InternalReqText.g:327:1: ( ( rule__SpecObject__NameAssignment_1 ) )
            // InternalReqText.g:328:2: ( rule__SpecObject__NameAssignment_1 )
            {
             before(grammarAccess.getSpecObjectAccess().getNameAssignment_1()); 
            // InternalReqText.g:329:2: ( rule__SpecObject__NameAssignment_1 )
            // InternalReqText.g:329:3: rule__SpecObject__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SpecObject__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSpecObjectAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__SpecObject__Group__1__Impl"


    // $ANTLR start "rule__SpecObject__Group__2"
    // InternalReqText.g:337:1: rule__SpecObject__Group__2 : rule__SpecObject__Group__2__Impl rule__SpecObject__Group__3 ;
    public final void rule__SpecObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:341:1: ( rule__SpecObject__Group__2__Impl rule__SpecObject__Group__3 )
            // InternalReqText.g:342:2: rule__SpecObject__Group__2__Impl rule__SpecObject__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__SpecObject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpecObject__Group__3();

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
    // $ANTLR end "rule__SpecObject__Group__2"


    // $ANTLR start "rule__SpecObject__Group__2__Impl"
    // InternalReqText.g:349:1: rule__SpecObject__Group__2__Impl : ( '{' ) ;
    public final void rule__SpecObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:353:1: ( ( '{' ) )
            // InternalReqText.g:354:1: ( '{' )
            {
            // InternalReqText.g:354:1: ( '{' )
            // InternalReqText.g:355:2: '{'
            {
             before(grammarAccess.getSpecObjectAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSpecObjectAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__SpecObject__Group__2__Impl"


    // $ANTLR start "rule__SpecObject__Group__3"
    // InternalReqText.g:364:1: rule__SpecObject__Group__3 : rule__SpecObject__Group__3__Impl rule__SpecObject__Group__4 ;
    public final void rule__SpecObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:368:1: ( rule__SpecObject__Group__3__Impl rule__SpecObject__Group__4 )
            // InternalReqText.g:369:2: rule__SpecObject__Group__3__Impl rule__SpecObject__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__SpecObject__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpecObject__Group__4();

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
    // $ANTLR end "rule__SpecObject__Group__3"


    // $ANTLR start "rule__SpecObject__Group__3__Impl"
    // InternalReqText.g:376:1: rule__SpecObject__Group__3__Impl : ( 'description' ) ;
    public final void rule__SpecObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:380:1: ( ( 'description' ) )
            // InternalReqText.g:381:1: ( 'description' )
            {
            // InternalReqText.g:381:1: ( 'description' )
            // InternalReqText.g:382:2: 'description'
            {
             before(grammarAccess.getSpecObjectAccess().getDescriptionKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSpecObjectAccess().getDescriptionKeyword_3()); 

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
    // $ANTLR end "rule__SpecObject__Group__3__Impl"


    // $ANTLR start "rule__SpecObject__Group__4"
    // InternalReqText.g:391:1: rule__SpecObject__Group__4 : rule__SpecObject__Group__4__Impl rule__SpecObject__Group__5 ;
    public final void rule__SpecObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:395:1: ( rule__SpecObject__Group__4__Impl rule__SpecObject__Group__5 )
            // InternalReqText.g:396:2: rule__SpecObject__Group__4__Impl rule__SpecObject__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__SpecObject__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpecObject__Group__5();

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
    // $ANTLR end "rule__SpecObject__Group__4"


    // $ANTLR start "rule__SpecObject__Group__4__Impl"
    // InternalReqText.g:403:1: rule__SpecObject__Group__4__Impl : ( ( rule__SpecObject__DescriptionAssignment_4 ) ) ;
    public final void rule__SpecObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:407:1: ( ( ( rule__SpecObject__DescriptionAssignment_4 ) ) )
            // InternalReqText.g:408:1: ( ( rule__SpecObject__DescriptionAssignment_4 ) )
            {
            // InternalReqText.g:408:1: ( ( rule__SpecObject__DescriptionAssignment_4 ) )
            // InternalReqText.g:409:2: ( rule__SpecObject__DescriptionAssignment_4 )
            {
             before(grammarAccess.getSpecObjectAccess().getDescriptionAssignment_4()); 
            // InternalReqText.g:410:2: ( rule__SpecObject__DescriptionAssignment_4 )
            // InternalReqText.g:410:3: rule__SpecObject__DescriptionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SpecObject__DescriptionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSpecObjectAccess().getDescriptionAssignment_4()); 

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
    // $ANTLR end "rule__SpecObject__Group__4__Impl"


    // $ANTLR start "rule__SpecObject__Group__5"
    // InternalReqText.g:418:1: rule__SpecObject__Group__5 : rule__SpecObject__Group__5__Impl rule__SpecObject__Group__6 ;
    public final void rule__SpecObject__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:422:1: ( rule__SpecObject__Group__5__Impl rule__SpecObject__Group__6 )
            // InternalReqText.g:423:2: rule__SpecObject__Group__5__Impl rule__SpecObject__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__SpecObject__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpecObject__Group__6();

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
    // $ANTLR end "rule__SpecObject__Group__5"


    // $ANTLR start "rule__SpecObject__Group__5__Impl"
    // InternalReqText.g:430:1: rule__SpecObject__Group__5__Impl : ( 'state' ) ;
    public final void rule__SpecObject__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:434:1: ( ( 'state' ) )
            // InternalReqText.g:435:1: ( 'state' )
            {
            // InternalReqText.g:435:1: ( 'state' )
            // InternalReqText.g:436:2: 'state'
            {
             before(grammarAccess.getSpecObjectAccess().getStateKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSpecObjectAccess().getStateKeyword_5()); 

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
    // $ANTLR end "rule__SpecObject__Group__5__Impl"


    // $ANTLR start "rule__SpecObject__Group__6"
    // InternalReqText.g:445:1: rule__SpecObject__Group__6 : rule__SpecObject__Group__6__Impl rule__SpecObject__Group__7 ;
    public final void rule__SpecObject__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:449:1: ( rule__SpecObject__Group__6__Impl rule__SpecObject__Group__7 )
            // InternalReqText.g:450:2: rule__SpecObject__Group__6__Impl rule__SpecObject__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__SpecObject__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpecObject__Group__7();

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
    // $ANTLR end "rule__SpecObject__Group__6"


    // $ANTLR start "rule__SpecObject__Group__6__Impl"
    // InternalReqText.g:457:1: rule__SpecObject__Group__6__Impl : ( ( rule__SpecObject__StateAssignment_6 ) ) ;
    public final void rule__SpecObject__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:461:1: ( ( ( rule__SpecObject__StateAssignment_6 ) ) )
            // InternalReqText.g:462:1: ( ( rule__SpecObject__StateAssignment_6 ) )
            {
            // InternalReqText.g:462:1: ( ( rule__SpecObject__StateAssignment_6 ) )
            // InternalReqText.g:463:2: ( rule__SpecObject__StateAssignment_6 )
            {
             before(grammarAccess.getSpecObjectAccess().getStateAssignment_6()); 
            // InternalReqText.g:464:2: ( rule__SpecObject__StateAssignment_6 )
            // InternalReqText.g:464:3: rule__SpecObject__StateAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__SpecObject__StateAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getSpecObjectAccess().getStateAssignment_6()); 

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
    // $ANTLR end "rule__SpecObject__Group__6__Impl"


    // $ANTLR start "rule__SpecObject__Group__7"
    // InternalReqText.g:472:1: rule__SpecObject__Group__7 : rule__SpecObject__Group__7__Impl rule__SpecObject__Group__8 ;
    public final void rule__SpecObject__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:476:1: ( rule__SpecObject__Group__7__Impl rule__SpecObject__Group__8 )
            // InternalReqText.g:477:2: rule__SpecObject__Group__7__Impl rule__SpecObject__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__SpecObject__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpecObject__Group__8();

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
    // $ANTLR end "rule__SpecObject__Group__7"


    // $ANTLR start "rule__SpecObject__Group__7__Impl"
    // InternalReqText.g:484:1: rule__SpecObject__Group__7__Impl : ( 'classification' ) ;
    public final void rule__SpecObject__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:488:1: ( ( 'classification' ) )
            // InternalReqText.g:489:1: ( 'classification' )
            {
            // InternalReqText.g:489:1: ( 'classification' )
            // InternalReqText.g:490:2: 'classification'
            {
             before(grammarAccess.getSpecObjectAccess().getClassificationKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSpecObjectAccess().getClassificationKeyword_7()); 

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
    // $ANTLR end "rule__SpecObject__Group__7__Impl"


    // $ANTLR start "rule__SpecObject__Group__8"
    // InternalReqText.g:499:1: rule__SpecObject__Group__8 : rule__SpecObject__Group__8__Impl rule__SpecObject__Group__9 ;
    public final void rule__SpecObject__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:503:1: ( rule__SpecObject__Group__8__Impl rule__SpecObject__Group__9 )
            // InternalReqText.g:504:2: rule__SpecObject__Group__8__Impl rule__SpecObject__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__SpecObject__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpecObject__Group__9();

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
    // $ANTLR end "rule__SpecObject__Group__8"


    // $ANTLR start "rule__SpecObject__Group__8__Impl"
    // InternalReqText.g:511:1: rule__SpecObject__Group__8__Impl : ( ( rule__SpecObject__ClassAssignment_8 ) ) ;
    public final void rule__SpecObject__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:515:1: ( ( ( rule__SpecObject__ClassAssignment_8 ) ) )
            // InternalReqText.g:516:1: ( ( rule__SpecObject__ClassAssignment_8 ) )
            {
            // InternalReqText.g:516:1: ( ( rule__SpecObject__ClassAssignment_8 ) )
            // InternalReqText.g:517:2: ( rule__SpecObject__ClassAssignment_8 )
            {
             before(grammarAccess.getSpecObjectAccess().getClassAssignment_8()); 
            // InternalReqText.g:518:2: ( rule__SpecObject__ClassAssignment_8 )
            // InternalReqText.g:518:3: rule__SpecObject__ClassAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__SpecObject__ClassAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getSpecObjectAccess().getClassAssignment_8()); 

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
    // $ANTLR end "rule__SpecObject__Group__8__Impl"


    // $ANTLR start "rule__SpecObject__Group__9"
    // InternalReqText.g:526:1: rule__SpecObject__Group__9 : rule__SpecObject__Group__9__Impl rule__SpecObject__Group__10 ;
    public final void rule__SpecObject__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:530:1: ( rule__SpecObject__Group__9__Impl rule__SpecObject__Group__10 )
            // InternalReqText.g:531:2: rule__SpecObject__Group__9__Impl rule__SpecObject__Group__10
            {
            pushFollow(FOLLOW_13);
            rule__SpecObject__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpecObject__Group__10();

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
    // $ANTLR end "rule__SpecObject__Group__9"


    // $ANTLR start "rule__SpecObject__Group__9__Impl"
    // InternalReqText.g:538:1: rule__SpecObject__Group__9__Impl : ( 'version' ) ;
    public final void rule__SpecObject__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:542:1: ( ( 'version' ) )
            // InternalReqText.g:543:1: ( 'version' )
            {
            // InternalReqText.g:543:1: ( 'version' )
            // InternalReqText.g:544:2: 'version'
            {
             before(grammarAccess.getSpecObjectAccess().getVersionKeyword_9()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSpecObjectAccess().getVersionKeyword_9()); 

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
    // $ANTLR end "rule__SpecObject__Group__9__Impl"


    // $ANTLR start "rule__SpecObject__Group__10"
    // InternalReqText.g:553:1: rule__SpecObject__Group__10 : rule__SpecObject__Group__10__Impl rule__SpecObject__Group__11 ;
    public final void rule__SpecObject__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:557:1: ( rule__SpecObject__Group__10__Impl rule__SpecObject__Group__11 )
            // InternalReqText.g:558:2: rule__SpecObject__Group__10__Impl rule__SpecObject__Group__11
            {
            pushFollow(FOLLOW_14);
            rule__SpecObject__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpecObject__Group__11();

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
    // $ANTLR end "rule__SpecObject__Group__10"


    // $ANTLR start "rule__SpecObject__Group__10__Impl"
    // InternalReqText.g:565:1: rule__SpecObject__Group__10__Impl : ( ( rule__SpecObject__VersionAssignment_10 ) ) ;
    public final void rule__SpecObject__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:569:1: ( ( ( rule__SpecObject__VersionAssignment_10 ) ) )
            // InternalReqText.g:570:1: ( ( rule__SpecObject__VersionAssignment_10 ) )
            {
            // InternalReqText.g:570:1: ( ( rule__SpecObject__VersionAssignment_10 ) )
            // InternalReqText.g:571:2: ( rule__SpecObject__VersionAssignment_10 )
            {
             before(grammarAccess.getSpecObjectAccess().getVersionAssignment_10()); 
            // InternalReqText.g:572:2: ( rule__SpecObject__VersionAssignment_10 )
            // InternalReqText.g:572:3: rule__SpecObject__VersionAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__SpecObject__VersionAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getSpecObjectAccess().getVersionAssignment_10()); 

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
    // $ANTLR end "rule__SpecObject__Group__10__Impl"


    // $ANTLR start "rule__SpecObject__Group__11"
    // InternalReqText.g:580:1: rule__SpecObject__Group__11 : rule__SpecObject__Group__11__Impl rule__SpecObject__Group__12 ;
    public final void rule__SpecObject__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:584:1: ( rule__SpecObject__Group__11__Impl rule__SpecObject__Group__12 )
            // InternalReqText.g:585:2: rule__SpecObject__Group__11__Impl rule__SpecObject__Group__12
            {
            pushFollow(FOLLOW_14);
            rule__SpecObject__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpecObject__Group__12();

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
    // $ANTLR end "rule__SpecObject__Group__11"


    // $ANTLR start "rule__SpecObject__Group__11__Impl"
    // InternalReqText.g:592:1: rule__SpecObject__Group__11__Impl : ( ( rule__SpecObject__Group_11__0 )? ) ;
    public final void rule__SpecObject__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:596:1: ( ( ( rule__SpecObject__Group_11__0 )? ) )
            // InternalReqText.g:597:1: ( ( rule__SpecObject__Group_11__0 )? )
            {
            // InternalReqText.g:597:1: ( ( rule__SpecObject__Group_11__0 )? )
            // InternalReqText.g:598:2: ( rule__SpecObject__Group_11__0 )?
            {
             before(grammarAccess.getSpecObjectAccess().getGroup_11()); 
            // InternalReqText.g:599:2: ( rule__SpecObject__Group_11__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalReqText.g:599:3: rule__SpecObject__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SpecObject__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSpecObjectAccess().getGroup_11()); 

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
    // $ANTLR end "rule__SpecObject__Group__11__Impl"


    // $ANTLR start "rule__SpecObject__Group__12"
    // InternalReqText.g:607:1: rule__SpecObject__Group__12 : rule__SpecObject__Group__12__Impl rule__SpecObject__Group__13 ;
    public final void rule__SpecObject__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:611:1: ( rule__SpecObject__Group__12__Impl rule__SpecObject__Group__13 )
            // InternalReqText.g:612:2: rule__SpecObject__Group__12__Impl rule__SpecObject__Group__13
            {
            pushFollow(FOLLOW_14);
            rule__SpecObject__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpecObject__Group__13();

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
    // $ANTLR end "rule__SpecObject__Group__12"


    // $ANTLR start "rule__SpecObject__Group__12__Impl"
    // InternalReqText.g:619:1: rule__SpecObject__Group__12__Impl : ( ( rule__SpecObject__Group_12__0 )? ) ;
    public final void rule__SpecObject__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:623:1: ( ( ( rule__SpecObject__Group_12__0 )? ) )
            // InternalReqText.g:624:1: ( ( rule__SpecObject__Group_12__0 )? )
            {
            // InternalReqText.g:624:1: ( ( rule__SpecObject__Group_12__0 )? )
            // InternalReqText.g:625:2: ( rule__SpecObject__Group_12__0 )?
            {
             before(grammarAccess.getSpecObjectAccess().getGroup_12()); 
            // InternalReqText.g:626:2: ( rule__SpecObject__Group_12__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalReqText.g:626:3: rule__SpecObject__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SpecObject__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSpecObjectAccess().getGroup_12()); 

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
    // $ANTLR end "rule__SpecObject__Group__12__Impl"


    // $ANTLR start "rule__SpecObject__Group__13"
    // InternalReqText.g:634:1: rule__SpecObject__Group__13 : rule__SpecObject__Group__13__Impl rule__SpecObject__Group__14 ;
    public final void rule__SpecObject__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:638:1: ( rule__SpecObject__Group__13__Impl rule__SpecObject__Group__14 )
            // InternalReqText.g:639:2: rule__SpecObject__Group__13__Impl rule__SpecObject__Group__14
            {
            pushFollow(FOLLOW_14);
            rule__SpecObject__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpecObject__Group__14();

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
    // $ANTLR end "rule__SpecObject__Group__13"


    // $ANTLR start "rule__SpecObject__Group__13__Impl"
    // InternalReqText.g:646:1: rule__SpecObject__Group__13__Impl : ( ( rule__SpecObject__ChildrenAssignment_13 )* ) ;
    public final void rule__SpecObject__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:650:1: ( ( ( rule__SpecObject__ChildrenAssignment_13 )* ) )
            // InternalReqText.g:651:1: ( ( rule__SpecObject__ChildrenAssignment_13 )* )
            {
            // InternalReqText.g:651:1: ( ( rule__SpecObject__ChildrenAssignment_13 )* )
            // InternalReqText.g:652:2: ( rule__SpecObject__ChildrenAssignment_13 )*
            {
             before(grammarAccess.getSpecObjectAccess().getChildrenAssignment_13()); 
            // InternalReqText.g:653:2: ( rule__SpecObject__ChildrenAssignment_13 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==12) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalReqText.g:653:3: rule__SpecObject__ChildrenAssignment_13
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__SpecObject__ChildrenAssignment_13();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getSpecObjectAccess().getChildrenAssignment_13()); 

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
    // $ANTLR end "rule__SpecObject__Group__13__Impl"


    // $ANTLR start "rule__SpecObject__Group__14"
    // InternalReqText.g:661:1: rule__SpecObject__Group__14 : rule__SpecObject__Group__14__Impl ;
    public final void rule__SpecObject__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:665:1: ( rule__SpecObject__Group__14__Impl )
            // InternalReqText.g:666:2: rule__SpecObject__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SpecObject__Group__14__Impl();

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
    // $ANTLR end "rule__SpecObject__Group__14"


    // $ANTLR start "rule__SpecObject__Group__14__Impl"
    // InternalReqText.g:672:1: rule__SpecObject__Group__14__Impl : ( '}' ) ;
    public final void rule__SpecObject__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:676:1: ( ( '}' ) )
            // InternalReqText.g:677:1: ( '}' )
            {
            // InternalReqText.g:677:1: ( '}' )
            // InternalReqText.g:678:2: '}'
            {
             before(grammarAccess.getSpecObjectAccess().getRightCurlyBracketKeyword_14()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSpecObjectAccess().getRightCurlyBracketKeyword_14()); 

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
    // $ANTLR end "rule__SpecObject__Group__14__Impl"


    // $ANTLR start "rule__SpecObject__Group_11__0"
    // InternalReqText.g:688:1: rule__SpecObject__Group_11__0 : rule__SpecObject__Group_11__0__Impl rule__SpecObject__Group_11__1 ;
    public final void rule__SpecObject__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:692:1: ( rule__SpecObject__Group_11__0__Impl rule__SpecObject__Group_11__1 )
            // InternalReqText.g:693:2: rule__SpecObject__Group_11__0__Impl rule__SpecObject__Group_11__1
            {
            pushFollow(FOLLOW_9);
            rule__SpecObject__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpecObject__Group_11__1();

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
    // $ANTLR end "rule__SpecObject__Group_11__0"


    // $ANTLR start "rule__SpecObject__Group_11__0__Impl"
    // InternalReqText.g:700:1: rule__SpecObject__Group_11__0__Impl : ( 'image' ) ;
    public final void rule__SpecObject__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:704:1: ( ( 'image' ) )
            // InternalReqText.g:705:1: ( 'image' )
            {
            // InternalReqText.g:705:1: ( 'image' )
            // InternalReqText.g:706:2: 'image'
            {
             before(grammarAccess.getSpecObjectAccess().getImageKeyword_11_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSpecObjectAccess().getImageKeyword_11_0()); 

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
    // $ANTLR end "rule__SpecObject__Group_11__0__Impl"


    // $ANTLR start "rule__SpecObject__Group_11__1"
    // InternalReqText.g:715:1: rule__SpecObject__Group_11__1 : rule__SpecObject__Group_11__1__Impl ;
    public final void rule__SpecObject__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:719:1: ( rule__SpecObject__Group_11__1__Impl )
            // InternalReqText.g:720:2: rule__SpecObject__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SpecObject__Group_11__1__Impl();

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
    // $ANTLR end "rule__SpecObject__Group_11__1"


    // $ANTLR start "rule__SpecObject__Group_11__1__Impl"
    // InternalReqText.g:726:1: rule__SpecObject__Group_11__1__Impl : ( ( rule__SpecObject__ImageAssignment_11_1 ) ) ;
    public final void rule__SpecObject__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:730:1: ( ( ( rule__SpecObject__ImageAssignment_11_1 ) ) )
            // InternalReqText.g:731:1: ( ( rule__SpecObject__ImageAssignment_11_1 ) )
            {
            // InternalReqText.g:731:1: ( ( rule__SpecObject__ImageAssignment_11_1 ) )
            // InternalReqText.g:732:2: ( rule__SpecObject__ImageAssignment_11_1 )
            {
             before(grammarAccess.getSpecObjectAccess().getImageAssignment_11_1()); 
            // InternalReqText.g:733:2: ( rule__SpecObject__ImageAssignment_11_1 )
            // InternalReqText.g:733:3: rule__SpecObject__ImageAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__SpecObject__ImageAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getSpecObjectAccess().getImageAssignment_11_1()); 

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
    // $ANTLR end "rule__SpecObject__Group_11__1__Impl"


    // $ANTLR start "rule__SpecObject__Group_12__0"
    // InternalReqText.g:742:1: rule__SpecObject__Group_12__0 : rule__SpecObject__Group_12__0__Impl rule__SpecObject__Group_12__1 ;
    public final void rule__SpecObject__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:746:1: ( rule__SpecObject__Group_12__0__Impl rule__SpecObject__Group_12__1 )
            // InternalReqText.g:747:2: rule__SpecObject__Group_12__0__Impl rule__SpecObject__Group_12__1
            {
            pushFollow(FOLLOW_6);
            rule__SpecObject__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpecObject__Group_12__1();

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
    // $ANTLR end "rule__SpecObject__Group_12__0"


    // $ANTLR start "rule__SpecObject__Group_12__0__Impl"
    // InternalReqText.g:754:1: rule__SpecObject__Group_12__0__Impl : ( 'reference' ) ;
    public final void rule__SpecObject__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:758:1: ( ( 'reference' ) )
            // InternalReqText.g:759:1: ( 'reference' )
            {
            // InternalReqText.g:759:1: ( 'reference' )
            // InternalReqText.g:760:2: 'reference'
            {
             before(grammarAccess.getSpecObjectAccess().getReferenceKeyword_12_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSpecObjectAccess().getReferenceKeyword_12_0()); 

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
    // $ANTLR end "rule__SpecObject__Group_12__0__Impl"


    // $ANTLR start "rule__SpecObject__Group_12__1"
    // InternalReqText.g:769:1: rule__SpecObject__Group_12__1 : rule__SpecObject__Group_12__1__Impl ;
    public final void rule__SpecObject__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:773:1: ( rule__SpecObject__Group_12__1__Impl )
            // InternalReqText.g:774:2: rule__SpecObject__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SpecObject__Group_12__1__Impl();

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
    // $ANTLR end "rule__SpecObject__Group_12__1"


    // $ANTLR start "rule__SpecObject__Group_12__1__Impl"
    // InternalReqText.g:780:1: rule__SpecObject__Group_12__1__Impl : ( ( rule__SpecObject__ReferenceAssignment_12_1 ) ) ;
    public final void rule__SpecObject__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:784:1: ( ( ( rule__SpecObject__ReferenceAssignment_12_1 ) ) )
            // InternalReqText.g:785:1: ( ( rule__SpecObject__ReferenceAssignment_12_1 ) )
            {
            // InternalReqText.g:785:1: ( ( rule__SpecObject__ReferenceAssignment_12_1 ) )
            // InternalReqText.g:786:2: ( rule__SpecObject__ReferenceAssignment_12_1 )
            {
             before(grammarAccess.getSpecObjectAccess().getReferenceAssignment_12_1()); 
            // InternalReqText.g:787:2: ( rule__SpecObject__ReferenceAssignment_12_1 )
            // InternalReqText.g:787:3: rule__SpecObject__ReferenceAssignment_12_1
            {
            pushFollow(FOLLOW_2);
            rule__SpecObject__ReferenceAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getSpecObjectAccess().getReferenceAssignment_12_1()); 

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
    // $ANTLR end "rule__SpecObject__Group_12__1__Impl"


    // $ANTLR start "rule__State__Group__0"
    // InternalReqText.g:796:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:800:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalReqText.g:801:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__State__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__1();

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
    // $ANTLR end "rule__State__Group__0"


    // $ANTLR start "rule__State__Group__0__Impl"
    // InternalReqText.g:808:1: rule__State__Group__0__Impl : ( 'State' ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:812:1: ( ( 'State' ) )
            // InternalReqText.g:813:1: ( 'State' )
            {
            // InternalReqText.g:813:1: ( 'State' )
            // InternalReqText.g:814:2: 'State'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getStateKeyword_0()); 

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
    // $ANTLR end "rule__State__Group__0__Impl"


    // $ANTLR start "rule__State__Group__1"
    // InternalReqText.g:823:1: rule__State__Group__1 : rule__State__Group__1__Impl ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:827:1: ( rule__State__Group__1__Impl )
            // InternalReqText.g:828:2: rule__State__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__1__Impl();

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
    // $ANTLR end "rule__State__Group__1"


    // $ANTLR start "rule__State__Group__1__Impl"
    // InternalReqText.g:834:1: rule__State__Group__1__Impl : ( ( rule__State__NameAssignment_1 ) ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:838:1: ( ( ( rule__State__NameAssignment_1 ) ) )
            // InternalReqText.g:839:1: ( ( rule__State__NameAssignment_1 ) )
            {
            // InternalReqText.g:839:1: ( ( rule__State__NameAssignment_1 ) )
            // InternalReqText.g:840:2: ( rule__State__NameAssignment_1 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_1()); 
            // InternalReqText.g:841:2: ( rule__State__NameAssignment_1 )
            // InternalReqText.g:841:3: rule__State__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__State__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__State__Group__1__Impl"


    // $ANTLR start "rule__Class__Group__0"
    // InternalReqText.g:850:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:854:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalReqText.g:855:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Class__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__1();

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
    // $ANTLR end "rule__Class__Group__0"


    // $ANTLR start "rule__Class__Group__0__Impl"
    // InternalReqText.g:862:1: rule__Class__Group__0__Impl : ( 'Classification' ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:866:1: ( ( 'Classification' ) )
            // InternalReqText.g:867:1: ( 'Classification' )
            {
            // InternalReqText.g:867:1: ( 'Classification' )
            // InternalReqText.g:868:2: 'Classification'
            {
             before(grammarAccess.getClassAccess().getClassificationKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getClassificationKeyword_0()); 

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
    // $ANTLR end "rule__Class__Group__0__Impl"


    // $ANTLR start "rule__Class__Group__1"
    // InternalReqText.g:877:1: rule__Class__Group__1 : rule__Class__Group__1__Impl ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:881:1: ( rule__Class__Group__1__Impl )
            // InternalReqText.g:882:2: rule__Class__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__1__Impl();

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
    // $ANTLR end "rule__Class__Group__1"


    // $ANTLR start "rule__Class__Group__1__Impl"
    // InternalReqText.g:888:1: rule__Class__Group__1__Impl : ( ( rule__Class__NameAssignment_1 ) ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:892:1: ( ( ( rule__Class__NameAssignment_1 ) ) )
            // InternalReqText.g:893:1: ( ( rule__Class__NameAssignment_1 ) )
            {
            // InternalReqText.g:893:1: ( ( rule__Class__NameAssignment_1 ) )
            // InternalReqText.g:894:2: ( rule__Class__NameAssignment_1 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_1()); 
            // InternalReqText.g:895:2: ( rule__Class__NameAssignment_1 )
            // InternalReqText.g:895:3: rule__Class__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Class__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Class__Group__1__Impl"


    // $ANTLR start "rule__Version__Group__0"
    // InternalReqText.g:904:1: rule__Version__Group__0 : rule__Version__Group__0__Impl rule__Version__Group__1 ;
    public final void rule__Version__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:908:1: ( rule__Version__Group__0__Impl rule__Version__Group__1 )
            // InternalReqText.g:909:2: rule__Version__Group__0__Impl rule__Version__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Version__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Version__Group__1();

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
    // $ANTLR end "rule__Version__Group__0"


    // $ANTLR start "rule__Version__Group__0__Impl"
    // InternalReqText.g:916:1: rule__Version__Group__0__Impl : ( ( rule__Version__MajorAssignment_0 ) ) ;
    public final void rule__Version__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:920:1: ( ( ( rule__Version__MajorAssignment_0 ) ) )
            // InternalReqText.g:921:1: ( ( rule__Version__MajorAssignment_0 ) )
            {
            // InternalReqText.g:921:1: ( ( rule__Version__MajorAssignment_0 ) )
            // InternalReqText.g:922:2: ( rule__Version__MajorAssignment_0 )
            {
             before(grammarAccess.getVersionAccess().getMajorAssignment_0()); 
            // InternalReqText.g:923:2: ( rule__Version__MajorAssignment_0 )
            // InternalReqText.g:923:3: rule__Version__MajorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Version__MajorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVersionAccess().getMajorAssignment_0()); 

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
    // $ANTLR end "rule__Version__Group__0__Impl"


    // $ANTLR start "rule__Version__Group__1"
    // InternalReqText.g:931:1: rule__Version__Group__1 : rule__Version__Group__1__Impl rule__Version__Group__2 ;
    public final void rule__Version__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:935:1: ( rule__Version__Group__1__Impl rule__Version__Group__2 )
            // InternalReqText.g:936:2: rule__Version__Group__1__Impl rule__Version__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Version__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Version__Group__2();

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
    // $ANTLR end "rule__Version__Group__1"


    // $ANTLR start "rule__Version__Group__1__Impl"
    // InternalReqText.g:943:1: rule__Version__Group__1__Impl : ( '.' ) ;
    public final void rule__Version__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:947:1: ( ( '.' ) )
            // InternalReqText.g:948:1: ( '.' )
            {
            // InternalReqText.g:948:1: ( '.' )
            // InternalReqText.g:949:2: '.'
            {
             before(grammarAccess.getVersionAccess().getFullStopKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getVersionAccess().getFullStopKeyword_1()); 

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
    // $ANTLR end "rule__Version__Group__1__Impl"


    // $ANTLR start "rule__Version__Group__2"
    // InternalReqText.g:958:1: rule__Version__Group__2 : rule__Version__Group__2__Impl ;
    public final void rule__Version__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:962:1: ( rule__Version__Group__2__Impl )
            // InternalReqText.g:963:2: rule__Version__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Version__Group__2__Impl();

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
    // $ANTLR end "rule__Version__Group__2"


    // $ANTLR start "rule__Version__Group__2__Impl"
    // InternalReqText.g:969:1: rule__Version__Group__2__Impl : ( ( rule__Version__MinorAssignment_2 ) ) ;
    public final void rule__Version__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:973:1: ( ( ( rule__Version__MinorAssignment_2 ) ) )
            // InternalReqText.g:974:1: ( ( rule__Version__MinorAssignment_2 ) )
            {
            // InternalReqText.g:974:1: ( ( rule__Version__MinorAssignment_2 ) )
            // InternalReqText.g:975:2: ( rule__Version__MinorAssignment_2 )
            {
             before(grammarAccess.getVersionAccess().getMinorAssignment_2()); 
            // InternalReqText.g:976:2: ( rule__Version__MinorAssignment_2 )
            // InternalReqText.g:976:3: rule__Version__MinorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Version__MinorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVersionAccess().getMinorAssignment_2()); 

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
    // $ANTLR end "rule__Version__Group__2__Impl"


    // $ANTLR start "rule__RImport__Group__0"
    // InternalReqText.g:985:1: rule__RImport__Group__0 : rule__RImport__Group__0__Impl rule__RImport__Group__1 ;
    public final void rule__RImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:989:1: ( rule__RImport__Group__0__Impl rule__RImport__Group__1 )
            // InternalReqText.g:990:2: rule__RImport__Group__0__Impl rule__RImport__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalReqText.g:997:1: rule__RImport__Group__0__Impl : ( 'import' ) ;
    public final void rule__RImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1001:1: ( ( 'import' ) )
            // InternalReqText.g:1002:1: ( 'import' )
            {
            // InternalReqText.g:1002:1: ( 'import' )
            // InternalReqText.g:1003:2: 'import'
            {
             before(grammarAccess.getRImportAccess().getImportKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalReqText.g:1012:1: rule__RImport__Group__1 : rule__RImport__Group__1__Impl ;
    public final void rule__RImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1016:1: ( rule__RImport__Group__1__Impl )
            // InternalReqText.g:1017:2: rule__RImport__Group__1__Impl
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
    // InternalReqText.g:1023:1: rule__RImport__Group__1__Impl : ( ( rule__RImport__ImportURIAssignment_1 ) ) ;
    public final void rule__RImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1027:1: ( ( ( rule__RImport__ImportURIAssignment_1 ) ) )
            // InternalReqText.g:1028:1: ( ( rule__RImport__ImportURIAssignment_1 ) )
            {
            // InternalReqText.g:1028:1: ( ( rule__RImport__ImportURIAssignment_1 ) )
            // InternalReqText.g:1029:2: ( rule__RImport__ImportURIAssignment_1 )
            {
             before(grammarAccess.getRImportAccess().getImportURIAssignment_1()); 
            // InternalReqText.g:1030:2: ( rule__RImport__ImportURIAssignment_1 )
            // InternalReqText.g:1030:3: rule__RImport__ImportURIAssignment_1
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
    // InternalReqText.g:1039:1: rule__RModel__ImportsAssignment_0 : ( ruleRImport ) ;
    public final void rule__RModel__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1043:1: ( ( ruleRImport ) )
            // InternalReqText.g:1044:2: ( ruleRImport )
            {
            // InternalReqText.g:1044:2: ( ruleRImport )
            // InternalReqText.g:1045:3: ruleRImport
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


    // $ANTLR start "rule__RModel__StatesAssignment_1_0"
    // InternalReqText.g:1054:1: rule__RModel__StatesAssignment_1_0 : ( ruleState ) ;
    public final void rule__RModel__StatesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1058:1: ( ( ruleState ) )
            // InternalReqText.g:1059:2: ( ruleState )
            {
            // InternalReqText.g:1059:2: ( ruleState )
            // InternalReqText.g:1060:3: ruleState
            {
             before(grammarAccess.getRModelAccess().getStatesStateParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getRModelAccess().getStatesStateParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__RModel__StatesAssignment_1_0"


    // $ANTLR start "rule__RModel__ClassesAssignment_1_1"
    // InternalReqText.g:1069:1: rule__RModel__ClassesAssignment_1_1 : ( ruleClass ) ;
    public final void rule__RModel__ClassesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1073:1: ( ( ruleClass ) )
            // InternalReqText.g:1074:2: ( ruleClass )
            {
            // InternalReqText.g:1074:2: ( ruleClass )
            // InternalReqText.g:1075:3: ruleClass
            {
             before(grammarAccess.getRModelAccess().getClassesClassParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getRModelAccess().getClassesClassParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__RModel__ClassesAssignment_1_1"


    // $ANTLR start "rule__RModel__ObjsAssignment_1_2"
    // InternalReqText.g:1084:1: rule__RModel__ObjsAssignment_1_2 : ( ruleSpecObject ) ;
    public final void rule__RModel__ObjsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1088:1: ( ( ruleSpecObject ) )
            // InternalReqText.g:1089:2: ( ruleSpecObject )
            {
            // InternalReqText.g:1089:2: ( ruleSpecObject )
            // InternalReqText.g:1090:3: ruleSpecObject
            {
             before(grammarAccess.getRModelAccess().getObjsSpecObjectParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSpecObject();

            state._fsp--;

             after(grammarAccess.getRModelAccess().getObjsSpecObjectParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__RModel__ObjsAssignment_1_2"


    // $ANTLR start "rule__SpecObject__NameAssignment_1"
    // InternalReqText.g:1099:1: rule__SpecObject__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SpecObject__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1103:1: ( ( RULE_ID ) )
            // InternalReqText.g:1104:2: ( RULE_ID )
            {
            // InternalReqText.g:1104:2: ( RULE_ID )
            // InternalReqText.g:1105:3: RULE_ID
            {
             before(grammarAccess.getSpecObjectAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSpecObjectAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__SpecObject__NameAssignment_1"


    // $ANTLR start "rule__SpecObject__DescriptionAssignment_4"
    // InternalReqText.g:1114:1: rule__SpecObject__DescriptionAssignment_4 : ( RULE_CC_STRING ) ;
    public final void rule__SpecObject__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1118:1: ( ( RULE_CC_STRING ) )
            // InternalReqText.g:1119:2: ( RULE_CC_STRING )
            {
            // InternalReqText.g:1119:2: ( RULE_CC_STRING )
            // InternalReqText.g:1120:3: RULE_CC_STRING
            {
             before(grammarAccess.getSpecObjectAccess().getDescriptionCC_STRINGTerminalRuleCall_4_0()); 
            match(input,RULE_CC_STRING,FOLLOW_2); 
             after(grammarAccess.getSpecObjectAccess().getDescriptionCC_STRINGTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__SpecObject__DescriptionAssignment_4"


    // $ANTLR start "rule__SpecObject__StateAssignment_6"
    // InternalReqText.g:1129:1: rule__SpecObject__StateAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__SpecObject__StateAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1133:1: ( ( ( RULE_ID ) ) )
            // InternalReqText.g:1134:2: ( ( RULE_ID ) )
            {
            // InternalReqText.g:1134:2: ( ( RULE_ID ) )
            // InternalReqText.g:1135:3: ( RULE_ID )
            {
             before(grammarAccess.getSpecObjectAccess().getStateStateCrossReference_6_0()); 
            // InternalReqText.g:1136:3: ( RULE_ID )
            // InternalReqText.g:1137:4: RULE_ID
            {
             before(grammarAccess.getSpecObjectAccess().getStateStateIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSpecObjectAccess().getStateStateIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getSpecObjectAccess().getStateStateCrossReference_6_0()); 

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
    // $ANTLR end "rule__SpecObject__StateAssignment_6"


    // $ANTLR start "rule__SpecObject__ClassAssignment_8"
    // InternalReqText.g:1148:1: rule__SpecObject__ClassAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__SpecObject__ClassAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1152:1: ( ( ( RULE_ID ) ) )
            // InternalReqText.g:1153:2: ( ( RULE_ID ) )
            {
            // InternalReqText.g:1153:2: ( ( RULE_ID ) )
            // InternalReqText.g:1154:3: ( RULE_ID )
            {
             before(grammarAccess.getSpecObjectAccess().getClassClassCrossReference_8_0()); 
            // InternalReqText.g:1155:3: ( RULE_ID )
            // InternalReqText.g:1156:4: RULE_ID
            {
             before(grammarAccess.getSpecObjectAccess().getClassClassIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSpecObjectAccess().getClassClassIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getSpecObjectAccess().getClassClassCrossReference_8_0()); 

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
    // $ANTLR end "rule__SpecObject__ClassAssignment_8"


    // $ANTLR start "rule__SpecObject__VersionAssignment_10"
    // InternalReqText.g:1167:1: rule__SpecObject__VersionAssignment_10 : ( ruleVersion ) ;
    public final void rule__SpecObject__VersionAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1171:1: ( ( ruleVersion ) )
            // InternalReqText.g:1172:2: ( ruleVersion )
            {
            // InternalReqText.g:1172:2: ( ruleVersion )
            // InternalReqText.g:1173:3: ruleVersion
            {
             before(grammarAccess.getSpecObjectAccess().getVersionVersionParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleVersion();

            state._fsp--;

             after(grammarAccess.getSpecObjectAccess().getVersionVersionParserRuleCall_10_0()); 

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
    // $ANTLR end "rule__SpecObject__VersionAssignment_10"


    // $ANTLR start "rule__SpecObject__ImageAssignment_11_1"
    // InternalReqText.g:1182:1: rule__SpecObject__ImageAssignment_11_1 : ( RULE_CC_STRING ) ;
    public final void rule__SpecObject__ImageAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1186:1: ( ( RULE_CC_STRING ) )
            // InternalReqText.g:1187:2: ( RULE_CC_STRING )
            {
            // InternalReqText.g:1187:2: ( RULE_CC_STRING )
            // InternalReqText.g:1188:3: RULE_CC_STRING
            {
             before(grammarAccess.getSpecObjectAccess().getImageCC_STRINGTerminalRuleCall_11_1_0()); 
            match(input,RULE_CC_STRING,FOLLOW_2); 
             after(grammarAccess.getSpecObjectAccess().getImageCC_STRINGTerminalRuleCall_11_1_0()); 

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
    // $ANTLR end "rule__SpecObject__ImageAssignment_11_1"


    // $ANTLR start "rule__SpecObject__ReferenceAssignment_12_1"
    // InternalReqText.g:1197:1: rule__SpecObject__ReferenceAssignment_12_1 : ( ( RULE_ID ) ) ;
    public final void rule__SpecObject__ReferenceAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1201:1: ( ( ( RULE_ID ) ) )
            // InternalReqText.g:1202:2: ( ( RULE_ID ) )
            {
            // InternalReqText.g:1202:2: ( ( RULE_ID ) )
            // InternalReqText.g:1203:3: ( RULE_ID )
            {
             before(grammarAccess.getSpecObjectAccess().getReferenceSpecObjectCrossReference_12_1_0()); 
            // InternalReqText.g:1204:3: ( RULE_ID )
            // InternalReqText.g:1205:4: RULE_ID
            {
             before(grammarAccess.getSpecObjectAccess().getReferenceSpecObjectIDTerminalRuleCall_12_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSpecObjectAccess().getReferenceSpecObjectIDTerminalRuleCall_12_1_0_1()); 

            }

             after(grammarAccess.getSpecObjectAccess().getReferenceSpecObjectCrossReference_12_1_0()); 

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
    // $ANTLR end "rule__SpecObject__ReferenceAssignment_12_1"


    // $ANTLR start "rule__SpecObject__ChildrenAssignment_13"
    // InternalReqText.g:1216:1: rule__SpecObject__ChildrenAssignment_13 : ( ruleSpecObject ) ;
    public final void rule__SpecObject__ChildrenAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1220:1: ( ( ruleSpecObject ) )
            // InternalReqText.g:1221:2: ( ruleSpecObject )
            {
            // InternalReqText.g:1221:2: ( ruleSpecObject )
            // InternalReqText.g:1222:3: ruleSpecObject
            {
             before(grammarAccess.getSpecObjectAccess().getChildrenSpecObjectParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleSpecObject();

            state._fsp--;

             after(grammarAccess.getSpecObjectAccess().getChildrenSpecObjectParserRuleCall_13_0()); 

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
    // $ANTLR end "rule__SpecObject__ChildrenAssignment_13"


    // $ANTLR start "rule__State__NameAssignment_1"
    // InternalReqText.g:1231:1: rule__State__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1235:1: ( ( RULE_ID ) )
            // InternalReqText.g:1236:2: ( RULE_ID )
            {
            // InternalReqText.g:1236:2: ( RULE_ID )
            // InternalReqText.g:1237:3: RULE_ID
            {
             before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__State__NameAssignment_1"


    // $ANTLR start "rule__Class__NameAssignment_1"
    // InternalReqText.g:1246:1: rule__Class__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Class__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1250:1: ( ( RULE_ID ) )
            // InternalReqText.g:1251:2: ( RULE_ID )
            {
            // InternalReqText.g:1251:2: ( RULE_ID )
            // InternalReqText.g:1252:3: RULE_ID
            {
             before(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Class__NameAssignment_1"


    // $ANTLR start "rule__Version__MajorAssignment_0"
    // InternalReqText.g:1261:1: rule__Version__MajorAssignment_0 : ( RULE_INT ) ;
    public final void rule__Version__MajorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1265:1: ( ( RULE_INT ) )
            // InternalReqText.g:1266:2: ( RULE_INT )
            {
            // InternalReqText.g:1266:2: ( RULE_INT )
            // InternalReqText.g:1267:3: RULE_INT
            {
             before(grammarAccess.getVersionAccess().getMajorINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getVersionAccess().getMajorINTTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Version__MajorAssignment_0"


    // $ANTLR start "rule__Version__MinorAssignment_2"
    // InternalReqText.g:1276:1: rule__Version__MinorAssignment_2 : ( RULE_INT ) ;
    public final void rule__Version__MinorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1280:1: ( ( RULE_INT ) )
            // InternalReqText.g:1281:2: ( RULE_INT )
            {
            // InternalReqText.g:1281:2: ( RULE_INT )
            // InternalReqText.g:1282:3: RULE_INT
            {
             before(grammarAccess.getVersionAccess().getMinorINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getVersionAccess().getMinorINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Version__MinorAssignment_2"


    // $ANTLR start "rule__RImport__ImportURIAssignment_1"
    // InternalReqText.g:1291:1: rule__RImport__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__RImport__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1295:1: ( ( RULE_STRING ) )
            // InternalReqText.g:1296:2: ( RULE_STRING )
            {
            // InternalReqText.g:1296:2: ( RULE_STRING )
            // InternalReqText.g:1297:3: RULE_STRING
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000601000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000601002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000007C1000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000080L});

}