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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_CC_STRING", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SpecObject'", "'{'", "'description'", "'}'", "'state'", "'classification'", "'version'", "'image'", "'reference'", "'State'", "'Classification'", "'.'", "'import'"
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
    // InternalReqText.g:267:1: rule__RModel__Group__1__Impl : ( ( rule__RModel__Alternatives_1 ) ) ;
    public final void rule__RModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:271:1: ( ( ( rule__RModel__Alternatives_1 ) ) )
            // InternalReqText.g:272:1: ( ( rule__RModel__Alternatives_1 ) )
            {
            // InternalReqText.g:272:1: ( ( rule__RModel__Alternatives_1 ) )
            // InternalReqText.g:273:2: ( rule__RModel__Alternatives_1 )
            {
             before(grammarAccess.getRModelAccess().getAlternatives_1()); 
            // InternalReqText.g:274:2: ( rule__RModel__Alternatives_1 )
            // InternalReqText.g:274:3: rule__RModel__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__RModel__Alternatives_1();

            state._fsp--;


            }

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
            pushFollow(FOLLOW_5);
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
            pushFollow(FOLLOW_6);
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
            pushFollow(FOLLOW_7);
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
            pushFollow(FOLLOW_8);
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
            pushFollow(FOLLOW_9);
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
            pushFollow(FOLLOW_10);
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
    // InternalReqText.g:430:1: rule__SpecObject__Group__5__Impl : ( ( rule__SpecObject__UnorderedGroup_5 ) ) ;
    public final void rule__SpecObject__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:434:1: ( ( ( rule__SpecObject__UnorderedGroup_5 ) ) )
            // InternalReqText.g:435:1: ( ( rule__SpecObject__UnorderedGroup_5 ) )
            {
            // InternalReqText.g:435:1: ( ( rule__SpecObject__UnorderedGroup_5 ) )
            // InternalReqText.g:436:2: ( rule__SpecObject__UnorderedGroup_5 )
            {
             before(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5()); 
            // InternalReqText.g:437:2: ( rule__SpecObject__UnorderedGroup_5 )
            // InternalReqText.g:437:3: rule__SpecObject__UnorderedGroup_5
            {
            pushFollow(FOLLOW_2);
            rule__SpecObject__UnorderedGroup_5();

            state._fsp--;


            }

             after(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5()); 

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
            pushFollow(FOLLOW_10);
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
    // InternalReqText.g:457:1: rule__SpecObject__Group__6__Impl : ( ( rule__SpecObject__ChildrenAssignment_6 )* ) ;
    public final void rule__SpecObject__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:461:1: ( ( ( rule__SpecObject__ChildrenAssignment_6 )* ) )
            // InternalReqText.g:462:1: ( ( rule__SpecObject__ChildrenAssignment_6 )* )
            {
            // InternalReqText.g:462:1: ( ( rule__SpecObject__ChildrenAssignment_6 )* )
            // InternalReqText.g:463:2: ( rule__SpecObject__ChildrenAssignment_6 )*
            {
             before(grammarAccess.getSpecObjectAccess().getChildrenAssignment_6()); 
            // InternalReqText.g:464:2: ( rule__SpecObject__ChildrenAssignment_6 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalReqText.g:464:3: rule__SpecObject__ChildrenAssignment_6
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__SpecObject__ChildrenAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getSpecObjectAccess().getChildrenAssignment_6()); 

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
    // InternalReqText.g:472:1: rule__SpecObject__Group__7 : rule__SpecObject__Group__7__Impl ;
    public final void rule__SpecObject__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:476:1: ( rule__SpecObject__Group__7__Impl )
            // InternalReqText.g:477:2: rule__SpecObject__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SpecObject__Group__7__Impl();

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
    // InternalReqText.g:483:1: rule__SpecObject__Group__7__Impl : ( '}' ) ;
    public final void rule__SpecObject__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:487:1: ( ( '}' ) )
            // InternalReqText.g:488:1: ( '}' )
            {
            // InternalReqText.g:488:1: ( '}' )
            // InternalReqText.g:489:2: '}'
            {
             before(grammarAccess.getSpecObjectAccess().getRightCurlyBracketKeyword_7()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSpecObjectAccess().getRightCurlyBracketKeyword_7()); 

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


    // $ANTLR start "rule__SpecObject__Group_5_0__0"
    // InternalReqText.g:499:1: rule__SpecObject__Group_5_0__0 : rule__SpecObject__Group_5_0__0__Impl rule__SpecObject__Group_5_0__1 ;
    public final void rule__SpecObject__Group_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:503:1: ( rule__SpecObject__Group_5_0__0__Impl rule__SpecObject__Group_5_0__1 )
            // InternalReqText.g:504:2: rule__SpecObject__Group_5_0__0__Impl rule__SpecObject__Group_5_0__1
            {
            pushFollow(FOLLOW_5);
            rule__SpecObject__Group_5_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpecObject__Group_5_0__1();

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
    // $ANTLR end "rule__SpecObject__Group_5_0__0"


    // $ANTLR start "rule__SpecObject__Group_5_0__0__Impl"
    // InternalReqText.g:511:1: rule__SpecObject__Group_5_0__0__Impl : ( 'state' ) ;
    public final void rule__SpecObject__Group_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:515:1: ( ( 'state' ) )
            // InternalReqText.g:516:1: ( 'state' )
            {
            // InternalReqText.g:516:1: ( 'state' )
            // InternalReqText.g:517:2: 'state'
            {
             before(grammarAccess.getSpecObjectAccess().getStateKeyword_5_0_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSpecObjectAccess().getStateKeyword_5_0_0()); 

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
    // $ANTLR end "rule__SpecObject__Group_5_0__0__Impl"


    // $ANTLR start "rule__SpecObject__Group_5_0__1"
    // InternalReqText.g:526:1: rule__SpecObject__Group_5_0__1 : rule__SpecObject__Group_5_0__1__Impl ;
    public final void rule__SpecObject__Group_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:530:1: ( rule__SpecObject__Group_5_0__1__Impl )
            // InternalReqText.g:531:2: rule__SpecObject__Group_5_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SpecObject__Group_5_0__1__Impl();

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
    // $ANTLR end "rule__SpecObject__Group_5_0__1"


    // $ANTLR start "rule__SpecObject__Group_5_0__1__Impl"
    // InternalReqText.g:537:1: rule__SpecObject__Group_5_0__1__Impl : ( ( rule__SpecObject__StateAssignment_5_0_1 ) ) ;
    public final void rule__SpecObject__Group_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:541:1: ( ( ( rule__SpecObject__StateAssignment_5_0_1 ) ) )
            // InternalReqText.g:542:1: ( ( rule__SpecObject__StateAssignment_5_0_1 ) )
            {
            // InternalReqText.g:542:1: ( ( rule__SpecObject__StateAssignment_5_0_1 ) )
            // InternalReqText.g:543:2: ( rule__SpecObject__StateAssignment_5_0_1 )
            {
             before(grammarAccess.getSpecObjectAccess().getStateAssignment_5_0_1()); 
            // InternalReqText.g:544:2: ( rule__SpecObject__StateAssignment_5_0_1 )
            // InternalReqText.g:544:3: rule__SpecObject__StateAssignment_5_0_1
            {
            pushFollow(FOLLOW_2);
            rule__SpecObject__StateAssignment_5_0_1();

            state._fsp--;


            }

             after(grammarAccess.getSpecObjectAccess().getStateAssignment_5_0_1()); 

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
    // $ANTLR end "rule__SpecObject__Group_5_0__1__Impl"


    // $ANTLR start "rule__SpecObject__Group_5_1__0"
    // InternalReqText.g:553:1: rule__SpecObject__Group_5_1__0 : rule__SpecObject__Group_5_1__0__Impl rule__SpecObject__Group_5_1__1 ;
    public final void rule__SpecObject__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:557:1: ( rule__SpecObject__Group_5_1__0__Impl rule__SpecObject__Group_5_1__1 )
            // InternalReqText.g:558:2: rule__SpecObject__Group_5_1__0__Impl rule__SpecObject__Group_5_1__1
            {
            pushFollow(FOLLOW_5);
            rule__SpecObject__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpecObject__Group_5_1__1();

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
    // $ANTLR end "rule__SpecObject__Group_5_1__0"


    // $ANTLR start "rule__SpecObject__Group_5_1__0__Impl"
    // InternalReqText.g:565:1: rule__SpecObject__Group_5_1__0__Impl : ( 'classification' ) ;
    public final void rule__SpecObject__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:569:1: ( ( 'classification' ) )
            // InternalReqText.g:570:1: ( 'classification' )
            {
            // InternalReqText.g:570:1: ( 'classification' )
            // InternalReqText.g:571:2: 'classification'
            {
             before(grammarAccess.getSpecObjectAccess().getClassificationKeyword_5_1_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSpecObjectAccess().getClassificationKeyword_5_1_0()); 

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
    // $ANTLR end "rule__SpecObject__Group_5_1__0__Impl"


    // $ANTLR start "rule__SpecObject__Group_5_1__1"
    // InternalReqText.g:580:1: rule__SpecObject__Group_5_1__1 : rule__SpecObject__Group_5_1__1__Impl ;
    public final void rule__SpecObject__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:584:1: ( rule__SpecObject__Group_5_1__1__Impl )
            // InternalReqText.g:585:2: rule__SpecObject__Group_5_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SpecObject__Group_5_1__1__Impl();

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
    // $ANTLR end "rule__SpecObject__Group_5_1__1"


    // $ANTLR start "rule__SpecObject__Group_5_1__1__Impl"
    // InternalReqText.g:591:1: rule__SpecObject__Group_5_1__1__Impl : ( ( rule__SpecObject__ClassAssignment_5_1_1 ) ) ;
    public final void rule__SpecObject__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:595:1: ( ( ( rule__SpecObject__ClassAssignment_5_1_1 ) ) )
            // InternalReqText.g:596:1: ( ( rule__SpecObject__ClassAssignment_5_1_1 ) )
            {
            // InternalReqText.g:596:1: ( ( rule__SpecObject__ClassAssignment_5_1_1 ) )
            // InternalReqText.g:597:2: ( rule__SpecObject__ClassAssignment_5_1_1 )
            {
             before(grammarAccess.getSpecObjectAccess().getClassAssignment_5_1_1()); 
            // InternalReqText.g:598:2: ( rule__SpecObject__ClassAssignment_5_1_1 )
            // InternalReqText.g:598:3: rule__SpecObject__ClassAssignment_5_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SpecObject__ClassAssignment_5_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSpecObjectAccess().getClassAssignment_5_1_1()); 

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
    // $ANTLR end "rule__SpecObject__Group_5_1__1__Impl"


    // $ANTLR start "rule__SpecObject__Group_5_2__0"
    // InternalReqText.g:607:1: rule__SpecObject__Group_5_2__0 : rule__SpecObject__Group_5_2__0__Impl rule__SpecObject__Group_5_2__1 ;
    public final void rule__SpecObject__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:611:1: ( rule__SpecObject__Group_5_2__0__Impl rule__SpecObject__Group_5_2__1 )
            // InternalReqText.g:612:2: rule__SpecObject__Group_5_2__0__Impl rule__SpecObject__Group_5_2__1
            {
            pushFollow(FOLLOW_12);
            rule__SpecObject__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpecObject__Group_5_2__1();

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
    // $ANTLR end "rule__SpecObject__Group_5_2__0"


    // $ANTLR start "rule__SpecObject__Group_5_2__0__Impl"
    // InternalReqText.g:619:1: rule__SpecObject__Group_5_2__0__Impl : ( 'version' ) ;
    public final void rule__SpecObject__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:623:1: ( ( 'version' ) )
            // InternalReqText.g:624:1: ( 'version' )
            {
            // InternalReqText.g:624:1: ( 'version' )
            // InternalReqText.g:625:2: 'version'
            {
             before(grammarAccess.getSpecObjectAccess().getVersionKeyword_5_2_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSpecObjectAccess().getVersionKeyword_5_2_0()); 

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
    // $ANTLR end "rule__SpecObject__Group_5_2__0__Impl"


    // $ANTLR start "rule__SpecObject__Group_5_2__1"
    // InternalReqText.g:634:1: rule__SpecObject__Group_5_2__1 : rule__SpecObject__Group_5_2__1__Impl ;
    public final void rule__SpecObject__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:638:1: ( rule__SpecObject__Group_5_2__1__Impl )
            // InternalReqText.g:639:2: rule__SpecObject__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SpecObject__Group_5_2__1__Impl();

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
    // $ANTLR end "rule__SpecObject__Group_5_2__1"


    // $ANTLR start "rule__SpecObject__Group_5_2__1__Impl"
    // InternalReqText.g:645:1: rule__SpecObject__Group_5_2__1__Impl : ( ( rule__SpecObject__VersionAssignment_5_2_1 ) ) ;
    public final void rule__SpecObject__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:649:1: ( ( ( rule__SpecObject__VersionAssignment_5_2_1 ) ) )
            // InternalReqText.g:650:1: ( ( rule__SpecObject__VersionAssignment_5_2_1 ) )
            {
            // InternalReqText.g:650:1: ( ( rule__SpecObject__VersionAssignment_5_2_1 ) )
            // InternalReqText.g:651:2: ( rule__SpecObject__VersionAssignment_5_2_1 )
            {
             before(grammarAccess.getSpecObjectAccess().getVersionAssignment_5_2_1()); 
            // InternalReqText.g:652:2: ( rule__SpecObject__VersionAssignment_5_2_1 )
            // InternalReqText.g:652:3: rule__SpecObject__VersionAssignment_5_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SpecObject__VersionAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSpecObjectAccess().getVersionAssignment_5_2_1()); 

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
    // $ANTLR end "rule__SpecObject__Group_5_2__1__Impl"


    // $ANTLR start "rule__SpecObject__Group_5_3__0"
    // InternalReqText.g:661:1: rule__SpecObject__Group_5_3__0 : rule__SpecObject__Group_5_3__0__Impl rule__SpecObject__Group_5_3__1 ;
    public final void rule__SpecObject__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:665:1: ( rule__SpecObject__Group_5_3__0__Impl rule__SpecObject__Group_5_3__1 )
            // InternalReqText.g:666:2: rule__SpecObject__Group_5_3__0__Impl rule__SpecObject__Group_5_3__1
            {
            pushFollow(FOLLOW_8);
            rule__SpecObject__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpecObject__Group_5_3__1();

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
    // $ANTLR end "rule__SpecObject__Group_5_3__0"


    // $ANTLR start "rule__SpecObject__Group_5_3__0__Impl"
    // InternalReqText.g:673:1: rule__SpecObject__Group_5_3__0__Impl : ( 'image' ) ;
    public final void rule__SpecObject__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:677:1: ( ( 'image' ) )
            // InternalReqText.g:678:1: ( 'image' )
            {
            // InternalReqText.g:678:1: ( 'image' )
            // InternalReqText.g:679:2: 'image'
            {
             before(grammarAccess.getSpecObjectAccess().getImageKeyword_5_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSpecObjectAccess().getImageKeyword_5_3_0()); 

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
    // $ANTLR end "rule__SpecObject__Group_5_3__0__Impl"


    // $ANTLR start "rule__SpecObject__Group_5_3__1"
    // InternalReqText.g:688:1: rule__SpecObject__Group_5_3__1 : rule__SpecObject__Group_5_3__1__Impl ;
    public final void rule__SpecObject__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:692:1: ( rule__SpecObject__Group_5_3__1__Impl )
            // InternalReqText.g:693:2: rule__SpecObject__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SpecObject__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__SpecObject__Group_5_3__1"


    // $ANTLR start "rule__SpecObject__Group_5_3__1__Impl"
    // InternalReqText.g:699:1: rule__SpecObject__Group_5_3__1__Impl : ( ( rule__SpecObject__ImageAssignment_5_3_1 ) ) ;
    public final void rule__SpecObject__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:703:1: ( ( ( rule__SpecObject__ImageAssignment_5_3_1 ) ) )
            // InternalReqText.g:704:1: ( ( rule__SpecObject__ImageAssignment_5_3_1 ) )
            {
            // InternalReqText.g:704:1: ( ( rule__SpecObject__ImageAssignment_5_3_1 ) )
            // InternalReqText.g:705:2: ( rule__SpecObject__ImageAssignment_5_3_1 )
            {
             before(grammarAccess.getSpecObjectAccess().getImageAssignment_5_3_1()); 
            // InternalReqText.g:706:2: ( rule__SpecObject__ImageAssignment_5_3_1 )
            // InternalReqText.g:706:3: rule__SpecObject__ImageAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SpecObject__ImageAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSpecObjectAccess().getImageAssignment_5_3_1()); 

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
    // $ANTLR end "rule__SpecObject__Group_5_3__1__Impl"


    // $ANTLR start "rule__SpecObject__Group_5_4__0"
    // InternalReqText.g:715:1: rule__SpecObject__Group_5_4__0 : rule__SpecObject__Group_5_4__0__Impl rule__SpecObject__Group_5_4__1 ;
    public final void rule__SpecObject__Group_5_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:719:1: ( rule__SpecObject__Group_5_4__0__Impl rule__SpecObject__Group_5_4__1 )
            // InternalReqText.g:720:2: rule__SpecObject__Group_5_4__0__Impl rule__SpecObject__Group_5_4__1
            {
            pushFollow(FOLLOW_5);
            rule__SpecObject__Group_5_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpecObject__Group_5_4__1();

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
    // $ANTLR end "rule__SpecObject__Group_5_4__0"


    // $ANTLR start "rule__SpecObject__Group_5_4__0__Impl"
    // InternalReqText.g:727:1: rule__SpecObject__Group_5_4__0__Impl : ( 'reference' ) ;
    public final void rule__SpecObject__Group_5_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:731:1: ( ( 'reference' ) )
            // InternalReqText.g:732:1: ( 'reference' )
            {
            // InternalReqText.g:732:1: ( 'reference' )
            // InternalReqText.g:733:2: 'reference'
            {
             before(grammarAccess.getSpecObjectAccess().getReferenceKeyword_5_4_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSpecObjectAccess().getReferenceKeyword_5_4_0()); 

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
    // $ANTLR end "rule__SpecObject__Group_5_4__0__Impl"


    // $ANTLR start "rule__SpecObject__Group_5_4__1"
    // InternalReqText.g:742:1: rule__SpecObject__Group_5_4__1 : rule__SpecObject__Group_5_4__1__Impl ;
    public final void rule__SpecObject__Group_5_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:746:1: ( rule__SpecObject__Group_5_4__1__Impl )
            // InternalReqText.g:747:2: rule__SpecObject__Group_5_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SpecObject__Group_5_4__1__Impl();

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
    // $ANTLR end "rule__SpecObject__Group_5_4__1"


    // $ANTLR start "rule__SpecObject__Group_5_4__1__Impl"
    // InternalReqText.g:753:1: rule__SpecObject__Group_5_4__1__Impl : ( ( rule__SpecObject__ReferenceAssignment_5_4_1 ) ) ;
    public final void rule__SpecObject__Group_5_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:757:1: ( ( ( rule__SpecObject__ReferenceAssignment_5_4_1 ) ) )
            // InternalReqText.g:758:1: ( ( rule__SpecObject__ReferenceAssignment_5_4_1 ) )
            {
            // InternalReqText.g:758:1: ( ( rule__SpecObject__ReferenceAssignment_5_4_1 ) )
            // InternalReqText.g:759:2: ( rule__SpecObject__ReferenceAssignment_5_4_1 )
            {
             before(grammarAccess.getSpecObjectAccess().getReferenceAssignment_5_4_1()); 
            // InternalReqText.g:760:2: ( rule__SpecObject__ReferenceAssignment_5_4_1 )
            // InternalReqText.g:760:3: rule__SpecObject__ReferenceAssignment_5_4_1
            {
            pushFollow(FOLLOW_2);
            rule__SpecObject__ReferenceAssignment_5_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSpecObjectAccess().getReferenceAssignment_5_4_1()); 

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
    // $ANTLR end "rule__SpecObject__Group_5_4__1__Impl"


    // $ANTLR start "rule__State__Group__0"
    // InternalReqText.g:769:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:773:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalReqText.g:774:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalReqText.g:781:1: rule__State__Group__0__Impl : ( 'State' ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:785:1: ( ( 'State' ) )
            // InternalReqText.g:786:1: ( 'State' )
            {
            // InternalReqText.g:786:1: ( 'State' )
            // InternalReqText.g:787:2: 'State'
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
    // InternalReqText.g:796:1: rule__State__Group__1 : rule__State__Group__1__Impl ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:800:1: ( rule__State__Group__1__Impl )
            // InternalReqText.g:801:2: rule__State__Group__1__Impl
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
    // InternalReqText.g:807:1: rule__State__Group__1__Impl : ( ( rule__State__NameAssignment_1 ) ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:811:1: ( ( ( rule__State__NameAssignment_1 ) ) )
            // InternalReqText.g:812:1: ( ( rule__State__NameAssignment_1 ) )
            {
            // InternalReqText.g:812:1: ( ( rule__State__NameAssignment_1 ) )
            // InternalReqText.g:813:2: ( rule__State__NameAssignment_1 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_1()); 
            // InternalReqText.g:814:2: ( rule__State__NameAssignment_1 )
            // InternalReqText.g:814:3: rule__State__NameAssignment_1
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
    // InternalReqText.g:823:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:827:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalReqText.g:828:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalReqText.g:835:1: rule__Class__Group__0__Impl : ( 'Classification' ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:839:1: ( ( 'Classification' ) )
            // InternalReqText.g:840:1: ( 'Classification' )
            {
            // InternalReqText.g:840:1: ( 'Classification' )
            // InternalReqText.g:841:2: 'Classification'
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
    // InternalReqText.g:850:1: rule__Class__Group__1 : rule__Class__Group__1__Impl ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:854:1: ( rule__Class__Group__1__Impl )
            // InternalReqText.g:855:2: rule__Class__Group__1__Impl
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
    // InternalReqText.g:861:1: rule__Class__Group__1__Impl : ( ( rule__Class__NameAssignment_1 ) ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:865:1: ( ( ( rule__Class__NameAssignment_1 ) ) )
            // InternalReqText.g:866:1: ( ( rule__Class__NameAssignment_1 ) )
            {
            // InternalReqText.g:866:1: ( ( rule__Class__NameAssignment_1 ) )
            // InternalReqText.g:867:2: ( rule__Class__NameAssignment_1 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_1()); 
            // InternalReqText.g:868:2: ( rule__Class__NameAssignment_1 )
            // InternalReqText.g:868:3: rule__Class__NameAssignment_1
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
    // InternalReqText.g:877:1: rule__Version__Group__0 : rule__Version__Group__0__Impl rule__Version__Group__1 ;
    public final void rule__Version__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:881:1: ( rule__Version__Group__0__Impl rule__Version__Group__1 )
            // InternalReqText.g:882:2: rule__Version__Group__0__Impl rule__Version__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalReqText.g:889:1: rule__Version__Group__0__Impl : ( ( rule__Version__MajorAssignment_0 ) ) ;
    public final void rule__Version__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:893:1: ( ( ( rule__Version__MajorAssignment_0 ) ) )
            // InternalReqText.g:894:1: ( ( rule__Version__MajorAssignment_0 ) )
            {
            // InternalReqText.g:894:1: ( ( rule__Version__MajorAssignment_0 ) )
            // InternalReqText.g:895:2: ( rule__Version__MajorAssignment_0 )
            {
             before(grammarAccess.getVersionAccess().getMajorAssignment_0()); 
            // InternalReqText.g:896:2: ( rule__Version__MajorAssignment_0 )
            // InternalReqText.g:896:3: rule__Version__MajorAssignment_0
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
    // InternalReqText.g:904:1: rule__Version__Group__1 : rule__Version__Group__1__Impl rule__Version__Group__2 ;
    public final void rule__Version__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:908:1: ( rule__Version__Group__1__Impl rule__Version__Group__2 )
            // InternalReqText.g:909:2: rule__Version__Group__1__Impl rule__Version__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalReqText.g:916:1: rule__Version__Group__1__Impl : ( '.' ) ;
    public final void rule__Version__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:920:1: ( ( '.' ) )
            // InternalReqText.g:921:1: ( '.' )
            {
            // InternalReqText.g:921:1: ( '.' )
            // InternalReqText.g:922:2: '.'
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
    // InternalReqText.g:931:1: rule__Version__Group__2 : rule__Version__Group__2__Impl ;
    public final void rule__Version__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:935:1: ( rule__Version__Group__2__Impl )
            // InternalReqText.g:936:2: rule__Version__Group__2__Impl
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
    // InternalReqText.g:942:1: rule__Version__Group__2__Impl : ( ( rule__Version__MinorAssignment_2 ) ) ;
    public final void rule__Version__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:946:1: ( ( ( rule__Version__MinorAssignment_2 ) ) )
            // InternalReqText.g:947:1: ( ( rule__Version__MinorAssignment_2 ) )
            {
            // InternalReqText.g:947:1: ( ( rule__Version__MinorAssignment_2 ) )
            // InternalReqText.g:948:2: ( rule__Version__MinorAssignment_2 )
            {
             before(grammarAccess.getVersionAccess().getMinorAssignment_2()); 
            // InternalReqText.g:949:2: ( rule__Version__MinorAssignment_2 )
            // InternalReqText.g:949:3: rule__Version__MinorAssignment_2
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
    // InternalReqText.g:958:1: rule__RImport__Group__0 : rule__RImport__Group__0__Impl rule__RImport__Group__1 ;
    public final void rule__RImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:962:1: ( rule__RImport__Group__0__Impl rule__RImport__Group__1 )
            // InternalReqText.g:963:2: rule__RImport__Group__0__Impl rule__RImport__Group__1
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
    // InternalReqText.g:970:1: rule__RImport__Group__0__Impl : ( 'import' ) ;
    public final void rule__RImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:974:1: ( ( 'import' ) )
            // InternalReqText.g:975:1: ( 'import' )
            {
            // InternalReqText.g:975:1: ( 'import' )
            // InternalReqText.g:976:2: 'import'
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
    // InternalReqText.g:985:1: rule__RImport__Group__1 : rule__RImport__Group__1__Impl ;
    public final void rule__RImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:989:1: ( rule__RImport__Group__1__Impl )
            // InternalReqText.g:990:2: rule__RImport__Group__1__Impl
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
    // InternalReqText.g:996:1: rule__RImport__Group__1__Impl : ( ( rule__RImport__ImportURIAssignment_1 ) ) ;
    public final void rule__RImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1000:1: ( ( ( rule__RImport__ImportURIAssignment_1 ) ) )
            // InternalReqText.g:1001:1: ( ( rule__RImport__ImportURIAssignment_1 ) )
            {
            // InternalReqText.g:1001:1: ( ( rule__RImport__ImportURIAssignment_1 ) )
            // InternalReqText.g:1002:2: ( rule__RImport__ImportURIAssignment_1 )
            {
             before(grammarAccess.getRImportAccess().getImportURIAssignment_1()); 
            // InternalReqText.g:1003:2: ( rule__RImport__ImportURIAssignment_1 )
            // InternalReqText.g:1003:3: rule__RImport__ImportURIAssignment_1
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


    // $ANTLR start "rule__SpecObject__UnorderedGroup_5"
    // InternalReqText.g:1012:1: rule__SpecObject__UnorderedGroup_5 : rule__SpecObject__UnorderedGroup_5__0 {...}?;
    public final void rule__SpecObject__UnorderedGroup_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5());
        	
        try {
            // InternalReqText.g:1017:1: ( rule__SpecObject__UnorderedGroup_5__0 {...}?)
            // InternalReqText.g:1018:2: rule__SpecObject__UnorderedGroup_5__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__SpecObject__UnorderedGroup_5__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5()) ) {
                throw new FailedPredicateException(input, "rule__SpecObject__UnorderedGroup_5", "getUnorderedGroupHelper().canLeave(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecObject__UnorderedGroup_5"


    // $ANTLR start "rule__SpecObject__UnorderedGroup_5__Impl"
    // InternalReqText.g:1026:1: rule__SpecObject__UnorderedGroup_5__Impl : ( ({...}? => ( ( ( rule__SpecObject__Group_5_0__0 ) ) ) ) | ({...}? => ( ( ( rule__SpecObject__Group_5_1__0 ) ) ) ) | ({...}? => ( ( ( rule__SpecObject__Group_5_2__0 ) ) ) ) | ({...}? => ( ( ( rule__SpecObject__Group_5_3__0 ) ) ) ) | ({...}? => ( ( ( rule__SpecObject__Group_5_4__0 ) ) ) ) ) ;
    public final void rule__SpecObject__UnorderedGroup_5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalReqText.g:1031:1: ( ( ({...}? => ( ( ( rule__SpecObject__Group_5_0__0 ) ) ) ) | ({...}? => ( ( ( rule__SpecObject__Group_5_1__0 ) ) ) ) | ({...}? => ( ( ( rule__SpecObject__Group_5_2__0 ) ) ) ) | ({...}? => ( ( ( rule__SpecObject__Group_5_3__0 ) ) ) ) | ({...}? => ( ( ( rule__SpecObject__Group_5_4__0 ) ) ) ) ) )
            // InternalReqText.g:1032:3: ( ({...}? => ( ( ( rule__SpecObject__Group_5_0__0 ) ) ) ) | ({...}? => ( ( ( rule__SpecObject__Group_5_1__0 ) ) ) ) | ({...}? => ( ( ( rule__SpecObject__Group_5_2__0 ) ) ) ) | ({...}? => ( ( ( rule__SpecObject__Group_5_3__0 ) ) ) ) | ({...}? => ( ( ( rule__SpecObject__Group_5_4__0 ) ) ) ) )
            {
            // InternalReqText.g:1032:3: ( ({...}? => ( ( ( rule__SpecObject__Group_5_0__0 ) ) ) ) | ({...}? => ( ( ( rule__SpecObject__Group_5_1__0 ) ) ) ) | ({...}? => ( ( ( rule__SpecObject__Group_5_2__0 ) ) ) ) | ({...}? => ( ( ( rule__SpecObject__Group_5_3__0 ) ) ) ) | ({...}? => ( ( ( rule__SpecObject__Group_5_4__0 ) ) ) ) )
            int alt4=5;
            int LA4_0 = input.LA(1);

            if ( LA4_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5(), 0) ) {
                alt4=1;
            }
            else if ( LA4_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5(), 1) ) {
                alt4=2;
            }
            else if ( LA4_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5(), 2) ) {
                alt4=3;
            }
            else if ( LA4_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5(), 3) ) {
                alt4=4;
            }
            else if ( LA4_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5(), 4) ) {
                alt4=5;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalReqText.g:1033:3: ({...}? => ( ( ( rule__SpecObject__Group_5_0__0 ) ) ) )
                    {
                    // InternalReqText.g:1033:3: ({...}? => ( ( ( rule__SpecObject__Group_5_0__0 ) ) ) )
                    // InternalReqText.g:1034:4: {...}? => ( ( ( rule__SpecObject__Group_5_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5(), 0) ) {
                        throw new FailedPredicateException(input, "rule__SpecObject__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5(), 0)");
                    }
                    // InternalReqText.g:1034:106: ( ( ( rule__SpecObject__Group_5_0__0 ) ) )
                    // InternalReqText.g:1035:5: ( ( rule__SpecObject__Group_5_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5(), 0);
                    				

                    					selected = true;
                    				
                    // InternalReqText.g:1041:5: ( ( rule__SpecObject__Group_5_0__0 ) )
                    // InternalReqText.g:1042:6: ( rule__SpecObject__Group_5_0__0 )
                    {
                     before(grammarAccess.getSpecObjectAccess().getGroup_5_0()); 
                    // InternalReqText.g:1043:6: ( rule__SpecObject__Group_5_0__0 )
                    // InternalReqText.g:1043:7: rule__SpecObject__Group_5_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SpecObject__Group_5_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSpecObjectAccess().getGroup_5_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalReqText.g:1048:3: ({...}? => ( ( ( rule__SpecObject__Group_5_1__0 ) ) ) )
                    {
                    // InternalReqText.g:1048:3: ({...}? => ( ( ( rule__SpecObject__Group_5_1__0 ) ) ) )
                    // InternalReqText.g:1049:4: {...}? => ( ( ( rule__SpecObject__Group_5_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5(), 1) ) {
                        throw new FailedPredicateException(input, "rule__SpecObject__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5(), 1)");
                    }
                    // InternalReqText.g:1049:106: ( ( ( rule__SpecObject__Group_5_1__0 ) ) )
                    // InternalReqText.g:1050:5: ( ( rule__SpecObject__Group_5_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5(), 1);
                    				

                    					selected = true;
                    				
                    // InternalReqText.g:1056:5: ( ( rule__SpecObject__Group_5_1__0 ) )
                    // InternalReqText.g:1057:6: ( rule__SpecObject__Group_5_1__0 )
                    {
                     before(grammarAccess.getSpecObjectAccess().getGroup_5_1()); 
                    // InternalReqText.g:1058:6: ( rule__SpecObject__Group_5_1__0 )
                    // InternalReqText.g:1058:7: rule__SpecObject__Group_5_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SpecObject__Group_5_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSpecObjectAccess().getGroup_5_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalReqText.g:1063:3: ({...}? => ( ( ( rule__SpecObject__Group_5_2__0 ) ) ) )
                    {
                    // InternalReqText.g:1063:3: ({...}? => ( ( ( rule__SpecObject__Group_5_2__0 ) ) ) )
                    // InternalReqText.g:1064:4: {...}? => ( ( ( rule__SpecObject__Group_5_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5(), 2) ) {
                        throw new FailedPredicateException(input, "rule__SpecObject__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5(), 2)");
                    }
                    // InternalReqText.g:1064:106: ( ( ( rule__SpecObject__Group_5_2__0 ) ) )
                    // InternalReqText.g:1065:5: ( ( rule__SpecObject__Group_5_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5(), 2);
                    				

                    					selected = true;
                    				
                    // InternalReqText.g:1071:5: ( ( rule__SpecObject__Group_5_2__0 ) )
                    // InternalReqText.g:1072:6: ( rule__SpecObject__Group_5_2__0 )
                    {
                     before(grammarAccess.getSpecObjectAccess().getGroup_5_2()); 
                    // InternalReqText.g:1073:6: ( rule__SpecObject__Group_5_2__0 )
                    // InternalReqText.g:1073:7: rule__SpecObject__Group_5_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SpecObject__Group_5_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSpecObjectAccess().getGroup_5_2()); 

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalReqText.g:1078:3: ({...}? => ( ( ( rule__SpecObject__Group_5_3__0 ) ) ) )
                    {
                    // InternalReqText.g:1078:3: ({...}? => ( ( ( rule__SpecObject__Group_5_3__0 ) ) ) )
                    // InternalReqText.g:1079:4: {...}? => ( ( ( rule__SpecObject__Group_5_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5(), 3) ) {
                        throw new FailedPredicateException(input, "rule__SpecObject__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5(), 3)");
                    }
                    // InternalReqText.g:1079:106: ( ( ( rule__SpecObject__Group_5_3__0 ) ) )
                    // InternalReqText.g:1080:5: ( ( rule__SpecObject__Group_5_3__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5(), 3);
                    				

                    					selected = true;
                    				
                    // InternalReqText.g:1086:5: ( ( rule__SpecObject__Group_5_3__0 ) )
                    // InternalReqText.g:1087:6: ( rule__SpecObject__Group_5_3__0 )
                    {
                     before(grammarAccess.getSpecObjectAccess().getGroup_5_3()); 
                    // InternalReqText.g:1088:6: ( rule__SpecObject__Group_5_3__0 )
                    // InternalReqText.g:1088:7: rule__SpecObject__Group_5_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SpecObject__Group_5_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSpecObjectAccess().getGroup_5_3()); 

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalReqText.g:1093:3: ({...}? => ( ( ( rule__SpecObject__Group_5_4__0 ) ) ) )
                    {
                    // InternalReqText.g:1093:3: ({...}? => ( ( ( rule__SpecObject__Group_5_4__0 ) ) ) )
                    // InternalReqText.g:1094:4: {...}? => ( ( ( rule__SpecObject__Group_5_4__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5(), 4) ) {
                        throw new FailedPredicateException(input, "rule__SpecObject__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5(), 4)");
                    }
                    // InternalReqText.g:1094:106: ( ( ( rule__SpecObject__Group_5_4__0 ) ) )
                    // InternalReqText.g:1095:5: ( ( rule__SpecObject__Group_5_4__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5(), 4);
                    				

                    					selected = true;
                    				
                    // InternalReqText.g:1101:5: ( ( rule__SpecObject__Group_5_4__0 ) )
                    // InternalReqText.g:1102:6: ( rule__SpecObject__Group_5_4__0 )
                    {
                     before(grammarAccess.getSpecObjectAccess().getGroup_5_4()); 
                    // InternalReqText.g:1103:6: ( rule__SpecObject__Group_5_4__0 )
                    // InternalReqText.g:1103:7: rule__SpecObject__Group_5_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SpecObject__Group_5_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSpecObjectAccess().getGroup_5_4()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecObject__UnorderedGroup_5__Impl"


    // $ANTLR start "rule__SpecObject__UnorderedGroup_5__0"
    // InternalReqText.g:1116:1: rule__SpecObject__UnorderedGroup_5__0 : rule__SpecObject__UnorderedGroup_5__Impl ( rule__SpecObject__UnorderedGroup_5__1 )? ;
    public final void rule__SpecObject__UnorderedGroup_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1120:1: ( rule__SpecObject__UnorderedGroup_5__Impl ( rule__SpecObject__UnorderedGroup_5__1 )? )
            // InternalReqText.g:1121:2: rule__SpecObject__UnorderedGroup_5__Impl ( rule__SpecObject__UnorderedGroup_5__1 )?
            {
            pushFollow(FOLLOW_15);
            rule__SpecObject__UnorderedGroup_5__Impl();

            state._fsp--;

            // InternalReqText.g:1122:2: ( rule__SpecObject__UnorderedGroup_5__1 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( LA5_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5(), 0) ) {
                alt5=1;
            }
            else if ( LA5_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5(), 1) ) {
                alt5=1;
            }
            else if ( LA5_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5(), 2) ) {
                alt5=1;
            }
            else if ( LA5_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5(), 3) ) {
                alt5=1;
            }
            else if ( LA5_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5(), 4) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalReqText.g:1122:2: rule__SpecObject__UnorderedGroup_5__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SpecObject__UnorderedGroup_5__1();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__SpecObject__UnorderedGroup_5__0"


    // $ANTLR start "rule__SpecObject__UnorderedGroup_5__1"
    // InternalReqText.g:1128:1: rule__SpecObject__UnorderedGroup_5__1 : rule__SpecObject__UnorderedGroup_5__Impl ( rule__SpecObject__UnorderedGroup_5__2 )? ;
    public final void rule__SpecObject__UnorderedGroup_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1132:1: ( rule__SpecObject__UnorderedGroup_5__Impl ( rule__SpecObject__UnorderedGroup_5__2 )? )
            // InternalReqText.g:1133:2: rule__SpecObject__UnorderedGroup_5__Impl ( rule__SpecObject__UnorderedGroup_5__2 )?
            {
            pushFollow(FOLLOW_15);
            rule__SpecObject__UnorderedGroup_5__Impl();

            state._fsp--;

            // InternalReqText.g:1134:2: ( rule__SpecObject__UnorderedGroup_5__2 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( LA6_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5(), 0) ) {
                alt6=1;
            }
            else if ( LA6_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5(), 1) ) {
                alt6=1;
            }
            else if ( LA6_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5(), 2) ) {
                alt6=1;
            }
            else if ( LA6_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5(), 3) ) {
                alt6=1;
            }
            else if ( LA6_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5(), 4) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalReqText.g:1134:2: rule__SpecObject__UnorderedGroup_5__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__SpecObject__UnorderedGroup_5__2();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__SpecObject__UnorderedGroup_5__1"


    // $ANTLR start "rule__SpecObject__UnorderedGroup_5__2"
    // InternalReqText.g:1140:1: rule__SpecObject__UnorderedGroup_5__2 : rule__SpecObject__UnorderedGroup_5__Impl ( rule__SpecObject__UnorderedGroup_5__3 )? ;
    public final void rule__SpecObject__UnorderedGroup_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1144:1: ( rule__SpecObject__UnorderedGroup_5__Impl ( rule__SpecObject__UnorderedGroup_5__3 )? )
            // InternalReqText.g:1145:2: rule__SpecObject__UnorderedGroup_5__Impl ( rule__SpecObject__UnorderedGroup_5__3 )?
            {
            pushFollow(FOLLOW_15);
            rule__SpecObject__UnorderedGroup_5__Impl();

            state._fsp--;

            // InternalReqText.g:1146:2: ( rule__SpecObject__UnorderedGroup_5__3 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( LA7_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5(), 0) ) {
                alt7=1;
            }
            else if ( LA7_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5(), 1) ) {
                alt7=1;
            }
            else if ( LA7_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5(), 2) ) {
                alt7=1;
            }
            else if ( LA7_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5(), 3) ) {
                alt7=1;
            }
            else if ( LA7_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5(), 4) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalReqText.g:1146:2: rule__SpecObject__UnorderedGroup_5__3
                    {
                    pushFollow(FOLLOW_2);
                    rule__SpecObject__UnorderedGroup_5__3();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__SpecObject__UnorderedGroup_5__2"


    // $ANTLR start "rule__SpecObject__UnorderedGroup_5__3"
    // InternalReqText.g:1152:1: rule__SpecObject__UnorderedGroup_5__3 : rule__SpecObject__UnorderedGroup_5__Impl ( rule__SpecObject__UnorderedGroup_5__4 )? ;
    public final void rule__SpecObject__UnorderedGroup_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1156:1: ( rule__SpecObject__UnorderedGroup_5__Impl ( rule__SpecObject__UnorderedGroup_5__4 )? )
            // InternalReqText.g:1157:2: rule__SpecObject__UnorderedGroup_5__Impl ( rule__SpecObject__UnorderedGroup_5__4 )?
            {
            pushFollow(FOLLOW_15);
            rule__SpecObject__UnorderedGroup_5__Impl();

            state._fsp--;

            // InternalReqText.g:1158:2: ( rule__SpecObject__UnorderedGroup_5__4 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( LA8_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5(), 0) ) {
                alt8=1;
            }
            else if ( LA8_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5(), 1) ) {
                alt8=1;
            }
            else if ( LA8_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5(), 2) ) {
                alt8=1;
            }
            else if ( LA8_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5(), 3) ) {
                alt8=1;
            }
            else if ( LA8_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getSpecObjectAccess().getUnorderedGroup_5(), 4) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalReqText.g:1158:2: rule__SpecObject__UnorderedGroup_5__4
                    {
                    pushFollow(FOLLOW_2);
                    rule__SpecObject__UnorderedGroup_5__4();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__SpecObject__UnorderedGroup_5__3"


    // $ANTLR start "rule__SpecObject__UnorderedGroup_5__4"
    // InternalReqText.g:1164:1: rule__SpecObject__UnorderedGroup_5__4 : rule__SpecObject__UnorderedGroup_5__Impl ;
    public final void rule__SpecObject__UnorderedGroup_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1168:1: ( rule__SpecObject__UnorderedGroup_5__Impl )
            // InternalReqText.g:1169:2: rule__SpecObject__UnorderedGroup_5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SpecObject__UnorderedGroup_5__Impl();

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
    // $ANTLR end "rule__SpecObject__UnorderedGroup_5__4"


    // $ANTLR start "rule__RModel__ImportsAssignment_0"
    // InternalReqText.g:1176:1: rule__RModel__ImportsAssignment_0 : ( ruleRImport ) ;
    public final void rule__RModel__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1180:1: ( ( ruleRImport ) )
            // InternalReqText.g:1181:2: ( ruleRImport )
            {
            // InternalReqText.g:1181:2: ( ruleRImport )
            // InternalReqText.g:1182:3: ruleRImport
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
    // InternalReqText.g:1191:1: rule__RModel__StatesAssignment_1_0 : ( ruleState ) ;
    public final void rule__RModel__StatesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1195:1: ( ( ruleState ) )
            // InternalReqText.g:1196:2: ( ruleState )
            {
            // InternalReqText.g:1196:2: ( ruleState )
            // InternalReqText.g:1197:3: ruleState
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
    // InternalReqText.g:1206:1: rule__RModel__ClassesAssignment_1_1 : ( ruleClass ) ;
    public final void rule__RModel__ClassesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1210:1: ( ( ruleClass ) )
            // InternalReqText.g:1211:2: ( ruleClass )
            {
            // InternalReqText.g:1211:2: ( ruleClass )
            // InternalReqText.g:1212:3: ruleClass
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
    // InternalReqText.g:1221:1: rule__RModel__ObjsAssignment_1_2 : ( ruleSpecObject ) ;
    public final void rule__RModel__ObjsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1225:1: ( ( ruleSpecObject ) )
            // InternalReqText.g:1226:2: ( ruleSpecObject )
            {
            // InternalReqText.g:1226:2: ( ruleSpecObject )
            // InternalReqText.g:1227:3: ruleSpecObject
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
    // InternalReqText.g:1236:1: rule__SpecObject__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SpecObject__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1240:1: ( ( RULE_ID ) )
            // InternalReqText.g:1241:2: ( RULE_ID )
            {
            // InternalReqText.g:1241:2: ( RULE_ID )
            // InternalReqText.g:1242:3: RULE_ID
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
    // InternalReqText.g:1251:1: rule__SpecObject__DescriptionAssignment_4 : ( RULE_CC_STRING ) ;
    public final void rule__SpecObject__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1255:1: ( ( RULE_CC_STRING ) )
            // InternalReqText.g:1256:2: ( RULE_CC_STRING )
            {
            // InternalReqText.g:1256:2: ( RULE_CC_STRING )
            // InternalReqText.g:1257:3: RULE_CC_STRING
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


    // $ANTLR start "rule__SpecObject__StateAssignment_5_0_1"
    // InternalReqText.g:1266:1: rule__SpecObject__StateAssignment_5_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__SpecObject__StateAssignment_5_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1270:1: ( ( ( RULE_ID ) ) )
            // InternalReqText.g:1271:2: ( ( RULE_ID ) )
            {
            // InternalReqText.g:1271:2: ( ( RULE_ID ) )
            // InternalReqText.g:1272:3: ( RULE_ID )
            {
             before(grammarAccess.getSpecObjectAccess().getStateStateCrossReference_5_0_1_0()); 
            // InternalReqText.g:1273:3: ( RULE_ID )
            // InternalReqText.g:1274:4: RULE_ID
            {
             before(grammarAccess.getSpecObjectAccess().getStateStateIDTerminalRuleCall_5_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSpecObjectAccess().getStateStateIDTerminalRuleCall_5_0_1_0_1()); 

            }

             after(grammarAccess.getSpecObjectAccess().getStateStateCrossReference_5_0_1_0()); 

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
    // $ANTLR end "rule__SpecObject__StateAssignment_5_0_1"


    // $ANTLR start "rule__SpecObject__ClassAssignment_5_1_1"
    // InternalReqText.g:1285:1: rule__SpecObject__ClassAssignment_5_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__SpecObject__ClassAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1289:1: ( ( ( RULE_ID ) ) )
            // InternalReqText.g:1290:2: ( ( RULE_ID ) )
            {
            // InternalReqText.g:1290:2: ( ( RULE_ID ) )
            // InternalReqText.g:1291:3: ( RULE_ID )
            {
             before(grammarAccess.getSpecObjectAccess().getClassClassCrossReference_5_1_1_0()); 
            // InternalReqText.g:1292:3: ( RULE_ID )
            // InternalReqText.g:1293:4: RULE_ID
            {
             before(grammarAccess.getSpecObjectAccess().getClassClassIDTerminalRuleCall_5_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSpecObjectAccess().getClassClassIDTerminalRuleCall_5_1_1_0_1()); 

            }

             after(grammarAccess.getSpecObjectAccess().getClassClassCrossReference_5_1_1_0()); 

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
    // $ANTLR end "rule__SpecObject__ClassAssignment_5_1_1"


    // $ANTLR start "rule__SpecObject__VersionAssignment_5_2_1"
    // InternalReqText.g:1304:1: rule__SpecObject__VersionAssignment_5_2_1 : ( ruleVersion ) ;
    public final void rule__SpecObject__VersionAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1308:1: ( ( ruleVersion ) )
            // InternalReqText.g:1309:2: ( ruleVersion )
            {
            // InternalReqText.g:1309:2: ( ruleVersion )
            // InternalReqText.g:1310:3: ruleVersion
            {
             before(grammarAccess.getSpecObjectAccess().getVersionVersionParserRuleCall_5_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVersion();

            state._fsp--;

             after(grammarAccess.getSpecObjectAccess().getVersionVersionParserRuleCall_5_2_1_0()); 

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
    // $ANTLR end "rule__SpecObject__VersionAssignment_5_2_1"


    // $ANTLR start "rule__SpecObject__ImageAssignment_5_3_1"
    // InternalReqText.g:1319:1: rule__SpecObject__ImageAssignment_5_3_1 : ( RULE_CC_STRING ) ;
    public final void rule__SpecObject__ImageAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1323:1: ( ( RULE_CC_STRING ) )
            // InternalReqText.g:1324:2: ( RULE_CC_STRING )
            {
            // InternalReqText.g:1324:2: ( RULE_CC_STRING )
            // InternalReqText.g:1325:3: RULE_CC_STRING
            {
             before(grammarAccess.getSpecObjectAccess().getImageCC_STRINGTerminalRuleCall_5_3_1_0()); 
            match(input,RULE_CC_STRING,FOLLOW_2); 
             after(grammarAccess.getSpecObjectAccess().getImageCC_STRINGTerminalRuleCall_5_3_1_0()); 

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
    // $ANTLR end "rule__SpecObject__ImageAssignment_5_3_1"


    // $ANTLR start "rule__SpecObject__ReferenceAssignment_5_4_1"
    // InternalReqText.g:1334:1: rule__SpecObject__ReferenceAssignment_5_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__SpecObject__ReferenceAssignment_5_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1338:1: ( ( ( RULE_ID ) ) )
            // InternalReqText.g:1339:2: ( ( RULE_ID ) )
            {
            // InternalReqText.g:1339:2: ( ( RULE_ID ) )
            // InternalReqText.g:1340:3: ( RULE_ID )
            {
             before(grammarAccess.getSpecObjectAccess().getReferenceSpecObjectCrossReference_5_4_1_0()); 
            // InternalReqText.g:1341:3: ( RULE_ID )
            // InternalReqText.g:1342:4: RULE_ID
            {
             before(grammarAccess.getSpecObjectAccess().getReferenceSpecObjectIDTerminalRuleCall_5_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSpecObjectAccess().getReferenceSpecObjectIDTerminalRuleCall_5_4_1_0_1()); 

            }

             after(grammarAccess.getSpecObjectAccess().getReferenceSpecObjectCrossReference_5_4_1_0()); 

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
    // $ANTLR end "rule__SpecObject__ReferenceAssignment_5_4_1"


    // $ANTLR start "rule__SpecObject__ChildrenAssignment_6"
    // InternalReqText.g:1353:1: rule__SpecObject__ChildrenAssignment_6 : ( ruleSpecObject ) ;
    public final void rule__SpecObject__ChildrenAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1357:1: ( ( ruleSpecObject ) )
            // InternalReqText.g:1358:2: ( ruleSpecObject )
            {
            // InternalReqText.g:1358:2: ( ruleSpecObject )
            // InternalReqText.g:1359:3: ruleSpecObject
            {
             before(grammarAccess.getSpecObjectAccess().getChildrenSpecObjectParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleSpecObject();

            state._fsp--;

             after(grammarAccess.getSpecObjectAccess().getChildrenSpecObjectParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__SpecObject__ChildrenAssignment_6"


    // $ANTLR start "rule__State__NameAssignment_1"
    // InternalReqText.g:1368:1: rule__State__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1372:1: ( ( RULE_ID ) )
            // InternalReqText.g:1373:2: ( RULE_ID )
            {
            // InternalReqText.g:1373:2: ( RULE_ID )
            // InternalReqText.g:1374:3: RULE_ID
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
    // InternalReqText.g:1383:1: rule__Class__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Class__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1387:1: ( ( RULE_ID ) )
            // InternalReqText.g:1388:2: ( RULE_ID )
            {
            // InternalReqText.g:1388:2: ( RULE_ID )
            // InternalReqText.g:1389:3: RULE_ID
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
    // InternalReqText.g:1398:1: rule__Version__MajorAssignment_0 : ( RULE_INT ) ;
    public final void rule__Version__MajorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1402:1: ( ( RULE_INT ) )
            // InternalReqText.g:1403:2: ( RULE_INT )
            {
            // InternalReqText.g:1403:2: ( RULE_INT )
            // InternalReqText.g:1404:3: RULE_INT
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
    // InternalReqText.g:1413:1: rule__Version__MinorAssignment_2 : ( RULE_INT ) ;
    public final void rule__Version__MinorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1417:1: ( ( RULE_INT ) )
            // InternalReqText.g:1418:2: ( RULE_INT )
            {
            // InternalReqText.g:1418:2: ( RULE_INT )
            // InternalReqText.g:1419:3: RULE_INT
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
    // InternalReqText.g:1428:1: rule__RImport__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__RImport__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1432:1: ( ( RULE_STRING ) )
            // InternalReqText.g:1433:2: ( RULE_STRING )
            {
            // InternalReqText.g:1433:2: ( RULE_STRING )
            // InternalReqText.g:1434:3: RULE_STRING
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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000001F0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000609000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000601002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000001F0002L});

}
