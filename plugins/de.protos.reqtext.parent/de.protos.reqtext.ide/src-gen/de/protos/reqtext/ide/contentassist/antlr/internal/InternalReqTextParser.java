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


    // $ANTLR start "entryRuleImage"
    // InternalReqText.g:103:1: entryRuleImage : ruleImage EOF ;
    public final void entryRuleImage() throws RecognitionException {
        try {
            // InternalReqText.g:104:1: ( ruleImage EOF )
            // InternalReqText.g:105:1: ruleImage EOF
            {
             before(grammarAccess.getImageRule()); 
            pushFollow(FOLLOW_1);
            ruleImage();

            state._fsp--;

             after(grammarAccess.getImageRule()); 
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
    // $ANTLR end "entryRuleImage"


    // $ANTLR start "ruleImage"
    // InternalReqText.g:112:1: ruleImage : ( ( rule__Image__Group__0 ) ) ;
    public final void ruleImage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:116:2: ( ( ( rule__Image__Group__0 ) ) )
            // InternalReqText.g:117:2: ( ( rule__Image__Group__0 ) )
            {
            // InternalReqText.g:117:2: ( ( rule__Image__Group__0 ) )
            // InternalReqText.g:118:3: ( rule__Image__Group__0 )
            {
             before(grammarAccess.getImageAccess().getGroup()); 
            // InternalReqText.g:119:3: ( rule__Image__Group__0 )
            // InternalReqText.g:119:4: rule__Image__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Image__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImageAccess().getGroup()); 

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
    // $ANTLR end "ruleImage"


    // $ANTLR start "entryRuleState"
    // InternalReqText.g:128:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // InternalReqText.g:129:1: ( ruleState EOF )
            // InternalReqText.g:130:1: ruleState EOF
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
    // InternalReqText.g:137:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:141:2: ( ( ( rule__State__Group__0 ) ) )
            // InternalReqText.g:142:2: ( ( rule__State__Group__0 ) )
            {
            // InternalReqText.g:142:2: ( ( rule__State__Group__0 ) )
            // InternalReqText.g:143:3: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // InternalReqText.g:144:3: ( rule__State__Group__0 )
            // InternalReqText.g:144:4: rule__State__Group__0
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
    // InternalReqText.g:153:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // InternalReqText.g:154:1: ( ruleClass EOF )
            // InternalReqText.g:155:1: ruleClass EOF
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
    // InternalReqText.g:162:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:166:2: ( ( ( rule__Class__Group__0 ) ) )
            // InternalReqText.g:167:2: ( ( rule__Class__Group__0 ) )
            {
            // InternalReqText.g:167:2: ( ( rule__Class__Group__0 ) )
            // InternalReqText.g:168:3: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // InternalReqText.g:169:3: ( rule__Class__Group__0 )
            // InternalReqText.g:169:4: rule__Class__Group__0
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
    // InternalReqText.g:178:1: entryRuleVersion : ruleVersion EOF ;
    public final void entryRuleVersion() throws RecognitionException {
        try {
            // InternalReqText.g:179:1: ( ruleVersion EOF )
            // InternalReqText.g:180:1: ruleVersion EOF
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
    // InternalReqText.g:187:1: ruleVersion : ( ( rule__Version__Group__0 ) ) ;
    public final void ruleVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:191:2: ( ( ( rule__Version__Group__0 ) ) )
            // InternalReqText.g:192:2: ( ( rule__Version__Group__0 ) )
            {
            // InternalReqText.g:192:2: ( ( rule__Version__Group__0 ) )
            // InternalReqText.g:193:3: ( rule__Version__Group__0 )
            {
             before(grammarAccess.getVersionAccess().getGroup()); 
            // InternalReqText.g:194:3: ( rule__Version__Group__0 )
            // InternalReqText.g:194:4: rule__Version__Group__0
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


    // $ANTLR start "rule__RModel__Alternatives_1"
    // InternalReqText.g:227:1: rule__RModel__Alternatives_1 : ( ( ( rule__RModel__StatesAssignment_1_0 ) ) | ( ( rule__RModel__ClassesAssignment_1_1 ) ) | ( ( rule__RModel__ObjsAssignment_1_2 ) ) );
    public final void rule__RModel__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:231:1: ( ( ( rule__RModel__StatesAssignment_1_0 ) ) | ( ( rule__RModel__ClassesAssignment_1_1 ) ) | ( ( rule__RModel__ObjsAssignment_1_2 ) ) )
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
                    // InternalReqText.g:232:2: ( ( rule__RModel__StatesAssignment_1_0 ) )
                    {
                    // InternalReqText.g:232:2: ( ( rule__RModel__StatesAssignment_1_0 ) )
                    // InternalReqText.g:233:3: ( rule__RModel__StatesAssignment_1_0 )
                    {
                     before(grammarAccess.getRModelAccess().getStatesAssignment_1_0()); 
                    // InternalReqText.g:234:3: ( rule__RModel__StatesAssignment_1_0 )
                    // InternalReqText.g:234:4: rule__RModel__StatesAssignment_1_0
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
                    // InternalReqText.g:238:2: ( ( rule__RModel__ClassesAssignment_1_1 ) )
                    {
                    // InternalReqText.g:238:2: ( ( rule__RModel__ClassesAssignment_1_1 ) )
                    // InternalReqText.g:239:3: ( rule__RModel__ClassesAssignment_1_1 )
                    {
                     before(grammarAccess.getRModelAccess().getClassesAssignment_1_1()); 
                    // InternalReqText.g:240:3: ( rule__RModel__ClassesAssignment_1_1 )
                    // InternalReqText.g:240:4: rule__RModel__ClassesAssignment_1_1
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
                    // InternalReqText.g:244:2: ( ( rule__RModel__ObjsAssignment_1_2 ) )
                    {
                    // InternalReqText.g:244:2: ( ( rule__RModel__ObjsAssignment_1_2 ) )
                    // InternalReqText.g:245:3: ( rule__RModel__ObjsAssignment_1_2 )
                    {
                     before(grammarAccess.getRModelAccess().getObjsAssignment_1_2()); 
                    // InternalReqText.g:246:3: ( rule__RModel__ObjsAssignment_1_2 )
                    // InternalReqText.g:246:4: rule__RModel__ObjsAssignment_1_2
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

                if ( (LA2_0==24) ) {
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
    // InternalReqText.g:292:1: rule__RModel__Group__1__Impl : ( ( rule__RModel__Alternatives_1 )* ) ;
    public final void rule__RModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:296:1: ( ( ( rule__RModel__Alternatives_1 )* ) )
            // InternalReqText.g:297:1: ( ( rule__RModel__Alternatives_1 )* )
            {
            // InternalReqText.g:297:1: ( ( rule__RModel__Alternatives_1 )* )
            // InternalReqText.g:298:2: ( rule__RModel__Alternatives_1 )*
            {
             before(grammarAccess.getRModelAccess().getAlternatives_1()); 
            // InternalReqText.g:299:2: ( rule__RModel__Alternatives_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12||(LA3_0>=21 && LA3_0<=22)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalReqText.g:299:3: rule__RModel__Alternatives_1
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
    // InternalReqText.g:308:1: rule__SpecObject__Group__0 : rule__SpecObject__Group__0__Impl rule__SpecObject__Group__1 ;
    public final void rule__SpecObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:312:1: ( rule__SpecObject__Group__0__Impl rule__SpecObject__Group__1 )
            // InternalReqText.g:313:2: rule__SpecObject__Group__0__Impl rule__SpecObject__Group__1
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
    // InternalReqText.g:320:1: rule__SpecObject__Group__0__Impl : ( 'SpecObject' ) ;
    public final void rule__SpecObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:324:1: ( ( 'SpecObject' ) )
            // InternalReqText.g:325:1: ( 'SpecObject' )
            {
            // InternalReqText.g:325:1: ( 'SpecObject' )
            // InternalReqText.g:326:2: 'SpecObject'
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
    // InternalReqText.g:335:1: rule__SpecObject__Group__1 : rule__SpecObject__Group__1__Impl rule__SpecObject__Group__2 ;
    public final void rule__SpecObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:339:1: ( rule__SpecObject__Group__1__Impl rule__SpecObject__Group__2 )
            // InternalReqText.g:340:2: rule__SpecObject__Group__1__Impl rule__SpecObject__Group__2
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
    // InternalReqText.g:347:1: rule__SpecObject__Group__1__Impl : ( ( rule__SpecObject__NameAssignment_1 ) ) ;
    public final void rule__SpecObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:351:1: ( ( ( rule__SpecObject__NameAssignment_1 ) ) )
            // InternalReqText.g:352:1: ( ( rule__SpecObject__NameAssignment_1 ) )
            {
            // InternalReqText.g:352:1: ( ( rule__SpecObject__NameAssignment_1 ) )
            // InternalReqText.g:353:2: ( rule__SpecObject__NameAssignment_1 )
            {
             before(grammarAccess.getSpecObjectAccess().getNameAssignment_1()); 
            // InternalReqText.g:354:2: ( rule__SpecObject__NameAssignment_1 )
            // InternalReqText.g:354:3: rule__SpecObject__NameAssignment_1
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
    // InternalReqText.g:362:1: rule__SpecObject__Group__2 : rule__SpecObject__Group__2__Impl rule__SpecObject__Group__3 ;
    public final void rule__SpecObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:366:1: ( rule__SpecObject__Group__2__Impl rule__SpecObject__Group__3 )
            // InternalReqText.g:367:2: rule__SpecObject__Group__2__Impl rule__SpecObject__Group__3
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
    // InternalReqText.g:374:1: rule__SpecObject__Group__2__Impl : ( '{' ) ;
    public final void rule__SpecObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:378:1: ( ( '{' ) )
            // InternalReqText.g:379:1: ( '{' )
            {
            // InternalReqText.g:379:1: ( '{' )
            // InternalReqText.g:380:2: '{'
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
    // InternalReqText.g:389:1: rule__SpecObject__Group__3 : rule__SpecObject__Group__3__Impl rule__SpecObject__Group__4 ;
    public final void rule__SpecObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:393:1: ( rule__SpecObject__Group__3__Impl rule__SpecObject__Group__4 )
            // InternalReqText.g:394:2: rule__SpecObject__Group__3__Impl rule__SpecObject__Group__4
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
    // InternalReqText.g:401:1: rule__SpecObject__Group__3__Impl : ( 'description' ) ;
    public final void rule__SpecObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:405:1: ( ( 'description' ) )
            // InternalReqText.g:406:1: ( 'description' )
            {
            // InternalReqText.g:406:1: ( 'description' )
            // InternalReqText.g:407:2: 'description'
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
    // InternalReqText.g:416:1: rule__SpecObject__Group__4 : rule__SpecObject__Group__4__Impl rule__SpecObject__Group__5 ;
    public final void rule__SpecObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:420:1: ( rule__SpecObject__Group__4__Impl rule__SpecObject__Group__5 )
            // InternalReqText.g:421:2: rule__SpecObject__Group__4__Impl rule__SpecObject__Group__5
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
    // InternalReqText.g:428:1: rule__SpecObject__Group__4__Impl : ( ( rule__SpecObject__DescriptionAssignment_4 ) ) ;
    public final void rule__SpecObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:432:1: ( ( ( rule__SpecObject__DescriptionAssignment_4 ) ) )
            // InternalReqText.g:433:1: ( ( rule__SpecObject__DescriptionAssignment_4 ) )
            {
            // InternalReqText.g:433:1: ( ( rule__SpecObject__DescriptionAssignment_4 ) )
            // InternalReqText.g:434:2: ( rule__SpecObject__DescriptionAssignment_4 )
            {
             before(grammarAccess.getSpecObjectAccess().getDescriptionAssignment_4()); 
            // InternalReqText.g:435:2: ( rule__SpecObject__DescriptionAssignment_4 )
            // InternalReqText.g:435:3: rule__SpecObject__DescriptionAssignment_4
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
    // InternalReqText.g:443:1: rule__SpecObject__Group__5 : rule__SpecObject__Group__5__Impl rule__SpecObject__Group__6 ;
    public final void rule__SpecObject__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:447:1: ( rule__SpecObject__Group__5__Impl rule__SpecObject__Group__6 )
            // InternalReqText.g:448:2: rule__SpecObject__Group__5__Impl rule__SpecObject__Group__6
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
    // InternalReqText.g:455:1: rule__SpecObject__Group__5__Impl : ( 'state' ) ;
    public final void rule__SpecObject__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:459:1: ( ( 'state' ) )
            // InternalReqText.g:460:1: ( 'state' )
            {
            // InternalReqText.g:460:1: ( 'state' )
            // InternalReqText.g:461:2: 'state'
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
    // InternalReqText.g:470:1: rule__SpecObject__Group__6 : rule__SpecObject__Group__6__Impl rule__SpecObject__Group__7 ;
    public final void rule__SpecObject__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:474:1: ( rule__SpecObject__Group__6__Impl rule__SpecObject__Group__7 )
            // InternalReqText.g:475:2: rule__SpecObject__Group__6__Impl rule__SpecObject__Group__7
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
    // InternalReqText.g:482:1: rule__SpecObject__Group__6__Impl : ( ( rule__SpecObject__StateAssignment_6 ) ) ;
    public final void rule__SpecObject__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:486:1: ( ( ( rule__SpecObject__StateAssignment_6 ) ) )
            // InternalReqText.g:487:1: ( ( rule__SpecObject__StateAssignment_6 ) )
            {
            // InternalReqText.g:487:1: ( ( rule__SpecObject__StateAssignment_6 ) )
            // InternalReqText.g:488:2: ( rule__SpecObject__StateAssignment_6 )
            {
             before(grammarAccess.getSpecObjectAccess().getStateAssignment_6()); 
            // InternalReqText.g:489:2: ( rule__SpecObject__StateAssignment_6 )
            // InternalReqText.g:489:3: rule__SpecObject__StateAssignment_6
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
    // InternalReqText.g:497:1: rule__SpecObject__Group__7 : rule__SpecObject__Group__7__Impl rule__SpecObject__Group__8 ;
    public final void rule__SpecObject__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:501:1: ( rule__SpecObject__Group__7__Impl rule__SpecObject__Group__8 )
            // InternalReqText.g:502:2: rule__SpecObject__Group__7__Impl rule__SpecObject__Group__8
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
    // InternalReqText.g:509:1: rule__SpecObject__Group__7__Impl : ( 'classification' ) ;
    public final void rule__SpecObject__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:513:1: ( ( 'classification' ) )
            // InternalReqText.g:514:1: ( 'classification' )
            {
            // InternalReqText.g:514:1: ( 'classification' )
            // InternalReqText.g:515:2: 'classification'
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
    // InternalReqText.g:524:1: rule__SpecObject__Group__8 : rule__SpecObject__Group__8__Impl rule__SpecObject__Group__9 ;
    public final void rule__SpecObject__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:528:1: ( rule__SpecObject__Group__8__Impl rule__SpecObject__Group__9 )
            // InternalReqText.g:529:2: rule__SpecObject__Group__8__Impl rule__SpecObject__Group__9
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
    // InternalReqText.g:536:1: rule__SpecObject__Group__8__Impl : ( ( rule__SpecObject__ClassAssignment_8 ) ) ;
    public final void rule__SpecObject__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:540:1: ( ( ( rule__SpecObject__ClassAssignment_8 ) ) )
            // InternalReqText.g:541:1: ( ( rule__SpecObject__ClassAssignment_8 ) )
            {
            // InternalReqText.g:541:1: ( ( rule__SpecObject__ClassAssignment_8 ) )
            // InternalReqText.g:542:2: ( rule__SpecObject__ClassAssignment_8 )
            {
             before(grammarAccess.getSpecObjectAccess().getClassAssignment_8()); 
            // InternalReqText.g:543:2: ( rule__SpecObject__ClassAssignment_8 )
            // InternalReqText.g:543:3: rule__SpecObject__ClassAssignment_8
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
    // InternalReqText.g:551:1: rule__SpecObject__Group__9 : rule__SpecObject__Group__9__Impl rule__SpecObject__Group__10 ;
    public final void rule__SpecObject__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:555:1: ( rule__SpecObject__Group__9__Impl rule__SpecObject__Group__10 )
            // InternalReqText.g:556:2: rule__SpecObject__Group__9__Impl rule__SpecObject__Group__10
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
    // InternalReqText.g:563:1: rule__SpecObject__Group__9__Impl : ( 'version' ) ;
    public final void rule__SpecObject__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:567:1: ( ( 'version' ) )
            // InternalReqText.g:568:1: ( 'version' )
            {
            // InternalReqText.g:568:1: ( 'version' )
            // InternalReqText.g:569:2: 'version'
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
    // InternalReqText.g:578:1: rule__SpecObject__Group__10 : rule__SpecObject__Group__10__Impl rule__SpecObject__Group__11 ;
    public final void rule__SpecObject__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:582:1: ( rule__SpecObject__Group__10__Impl rule__SpecObject__Group__11 )
            // InternalReqText.g:583:2: rule__SpecObject__Group__10__Impl rule__SpecObject__Group__11
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
    // InternalReqText.g:590:1: rule__SpecObject__Group__10__Impl : ( ( rule__SpecObject__VersionAssignment_10 ) ) ;
    public final void rule__SpecObject__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:594:1: ( ( ( rule__SpecObject__VersionAssignment_10 ) ) )
            // InternalReqText.g:595:1: ( ( rule__SpecObject__VersionAssignment_10 ) )
            {
            // InternalReqText.g:595:1: ( ( rule__SpecObject__VersionAssignment_10 ) )
            // InternalReqText.g:596:2: ( rule__SpecObject__VersionAssignment_10 )
            {
             before(grammarAccess.getSpecObjectAccess().getVersionAssignment_10()); 
            // InternalReqText.g:597:2: ( rule__SpecObject__VersionAssignment_10 )
            // InternalReqText.g:597:3: rule__SpecObject__VersionAssignment_10
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
    // InternalReqText.g:605:1: rule__SpecObject__Group__11 : rule__SpecObject__Group__11__Impl rule__SpecObject__Group__12 ;
    public final void rule__SpecObject__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:609:1: ( rule__SpecObject__Group__11__Impl rule__SpecObject__Group__12 )
            // InternalReqText.g:610:2: rule__SpecObject__Group__11__Impl rule__SpecObject__Group__12
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
    // InternalReqText.g:617:1: rule__SpecObject__Group__11__Impl : ( ( rule__SpecObject__Group_11__0 )? ) ;
    public final void rule__SpecObject__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:621:1: ( ( ( rule__SpecObject__Group_11__0 )? ) )
            // InternalReqText.g:622:1: ( ( rule__SpecObject__Group_11__0 )? )
            {
            // InternalReqText.g:622:1: ( ( rule__SpecObject__Group_11__0 )? )
            // InternalReqText.g:623:2: ( rule__SpecObject__Group_11__0 )?
            {
             before(grammarAccess.getSpecObjectAccess().getGroup_11()); 
            // InternalReqText.g:624:2: ( rule__SpecObject__Group_11__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalReqText.g:624:3: rule__SpecObject__Group_11__0
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
    // InternalReqText.g:632:1: rule__SpecObject__Group__12 : rule__SpecObject__Group__12__Impl rule__SpecObject__Group__13 ;
    public final void rule__SpecObject__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:636:1: ( rule__SpecObject__Group__12__Impl rule__SpecObject__Group__13 )
            // InternalReqText.g:637:2: rule__SpecObject__Group__12__Impl rule__SpecObject__Group__13
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
    // InternalReqText.g:644:1: rule__SpecObject__Group__12__Impl : ( ( rule__SpecObject__Group_12__0 )? ) ;
    public final void rule__SpecObject__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:648:1: ( ( ( rule__SpecObject__Group_12__0 )? ) )
            // InternalReqText.g:649:1: ( ( rule__SpecObject__Group_12__0 )? )
            {
            // InternalReqText.g:649:1: ( ( rule__SpecObject__Group_12__0 )? )
            // InternalReqText.g:650:2: ( rule__SpecObject__Group_12__0 )?
            {
             before(grammarAccess.getSpecObjectAccess().getGroup_12()); 
            // InternalReqText.g:651:2: ( rule__SpecObject__Group_12__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalReqText.g:651:3: rule__SpecObject__Group_12__0
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
    // InternalReqText.g:659:1: rule__SpecObject__Group__13 : rule__SpecObject__Group__13__Impl rule__SpecObject__Group__14 ;
    public final void rule__SpecObject__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:663:1: ( rule__SpecObject__Group__13__Impl rule__SpecObject__Group__14 )
            // InternalReqText.g:664:2: rule__SpecObject__Group__13__Impl rule__SpecObject__Group__14
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
    // InternalReqText.g:671:1: rule__SpecObject__Group__13__Impl : ( ( rule__SpecObject__ChildrenAssignment_13 )* ) ;
    public final void rule__SpecObject__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:675:1: ( ( ( rule__SpecObject__ChildrenAssignment_13 )* ) )
            // InternalReqText.g:676:1: ( ( rule__SpecObject__ChildrenAssignment_13 )* )
            {
            // InternalReqText.g:676:1: ( ( rule__SpecObject__ChildrenAssignment_13 )* )
            // InternalReqText.g:677:2: ( rule__SpecObject__ChildrenAssignment_13 )*
            {
             before(grammarAccess.getSpecObjectAccess().getChildrenAssignment_13()); 
            // InternalReqText.g:678:2: ( rule__SpecObject__ChildrenAssignment_13 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==12) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalReqText.g:678:3: rule__SpecObject__ChildrenAssignment_13
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
    // InternalReqText.g:686:1: rule__SpecObject__Group__14 : rule__SpecObject__Group__14__Impl ;
    public final void rule__SpecObject__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:690:1: ( rule__SpecObject__Group__14__Impl )
            // InternalReqText.g:691:2: rule__SpecObject__Group__14__Impl
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
    // InternalReqText.g:697:1: rule__SpecObject__Group__14__Impl : ( '}' ) ;
    public final void rule__SpecObject__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:701:1: ( ( '}' ) )
            // InternalReqText.g:702:1: ( '}' )
            {
            // InternalReqText.g:702:1: ( '}' )
            // InternalReqText.g:703:2: '}'
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
    // InternalReqText.g:713:1: rule__SpecObject__Group_11__0 : rule__SpecObject__Group_11__0__Impl rule__SpecObject__Group_11__1 ;
    public final void rule__SpecObject__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:717:1: ( rule__SpecObject__Group_11__0__Impl rule__SpecObject__Group_11__1 )
            // InternalReqText.g:718:2: rule__SpecObject__Group_11__0__Impl rule__SpecObject__Group_11__1
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
    // InternalReqText.g:725:1: rule__SpecObject__Group_11__0__Impl : ( 'image' ) ;
    public final void rule__SpecObject__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:729:1: ( ( 'image' ) )
            // InternalReqText.g:730:1: ( 'image' )
            {
            // InternalReqText.g:730:1: ( 'image' )
            // InternalReqText.g:731:2: 'image'
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
    // InternalReqText.g:740:1: rule__SpecObject__Group_11__1 : rule__SpecObject__Group_11__1__Impl ;
    public final void rule__SpecObject__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:744:1: ( rule__SpecObject__Group_11__1__Impl )
            // InternalReqText.g:745:2: rule__SpecObject__Group_11__1__Impl
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
    // InternalReqText.g:751:1: rule__SpecObject__Group_11__1__Impl : ( ( rule__SpecObject__ImageAssignment_11_1 ) ) ;
    public final void rule__SpecObject__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:755:1: ( ( ( rule__SpecObject__ImageAssignment_11_1 ) ) )
            // InternalReqText.g:756:1: ( ( rule__SpecObject__ImageAssignment_11_1 ) )
            {
            // InternalReqText.g:756:1: ( ( rule__SpecObject__ImageAssignment_11_1 ) )
            // InternalReqText.g:757:2: ( rule__SpecObject__ImageAssignment_11_1 )
            {
             before(grammarAccess.getSpecObjectAccess().getImageAssignment_11_1()); 
            // InternalReqText.g:758:2: ( rule__SpecObject__ImageAssignment_11_1 )
            // InternalReqText.g:758:3: rule__SpecObject__ImageAssignment_11_1
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
    // InternalReqText.g:767:1: rule__SpecObject__Group_12__0 : rule__SpecObject__Group_12__0__Impl rule__SpecObject__Group_12__1 ;
    public final void rule__SpecObject__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:771:1: ( rule__SpecObject__Group_12__0__Impl rule__SpecObject__Group_12__1 )
            // InternalReqText.g:772:2: rule__SpecObject__Group_12__0__Impl rule__SpecObject__Group_12__1
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
    // InternalReqText.g:779:1: rule__SpecObject__Group_12__0__Impl : ( 'reference' ) ;
    public final void rule__SpecObject__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:783:1: ( ( 'reference' ) )
            // InternalReqText.g:784:1: ( 'reference' )
            {
            // InternalReqText.g:784:1: ( 'reference' )
            // InternalReqText.g:785:2: 'reference'
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
    // InternalReqText.g:794:1: rule__SpecObject__Group_12__1 : rule__SpecObject__Group_12__1__Impl ;
    public final void rule__SpecObject__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:798:1: ( rule__SpecObject__Group_12__1__Impl )
            // InternalReqText.g:799:2: rule__SpecObject__Group_12__1__Impl
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
    // InternalReqText.g:805:1: rule__SpecObject__Group_12__1__Impl : ( ( rule__SpecObject__ReferenceAssignment_12_1 ) ) ;
    public final void rule__SpecObject__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:809:1: ( ( ( rule__SpecObject__ReferenceAssignment_12_1 ) ) )
            // InternalReqText.g:810:1: ( ( rule__SpecObject__ReferenceAssignment_12_1 ) )
            {
            // InternalReqText.g:810:1: ( ( rule__SpecObject__ReferenceAssignment_12_1 ) )
            // InternalReqText.g:811:2: ( rule__SpecObject__ReferenceAssignment_12_1 )
            {
             before(grammarAccess.getSpecObjectAccess().getReferenceAssignment_12_1()); 
            // InternalReqText.g:812:2: ( rule__SpecObject__ReferenceAssignment_12_1 )
            // InternalReqText.g:812:3: rule__SpecObject__ReferenceAssignment_12_1
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


    // $ANTLR start "rule__Image__Group__0"
    // InternalReqText.g:821:1: rule__Image__Group__0 : rule__Image__Group__0__Impl rule__Image__Group__1 ;
    public final void rule__Image__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:825:1: ( rule__Image__Group__0__Impl rule__Image__Group__1 )
            // InternalReqText.g:826:2: rule__Image__Group__0__Impl rule__Image__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Image__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Image__Group__1();

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
    // $ANTLR end "rule__Image__Group__0"


    // $ANTLR start "rule__Image__Group__0__Impl"
    // InternalReqText.g:833:1: rule__Image__Group__0__Impl : ( ( rule__Image__NameAssignment_0 ) ) ;
    public final void rule__Image__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:837:1: ( ( ( rule__Image__NameAssignment_0 ) ) )
            // InternalReqText.g:838:1: ( ( rule__Image__NameAssignment_0 ) )
            {
            // InternalReqText.g:838:1: ( ( rule__Image__NameAssignment_0 ) )
            // InternalReqText.g:839:2: ( rule__Image__NameAssignment_0 )
            {
             before(grammarAccess.getImageAccess().getNameAssignment_0()); 
            // InternalReqText.g:840:2: ( rule__Image__NameAssignment_0 )
            // InternalReqText.g:840:3: rule__Image__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Image__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getImageAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Image__Group__0__Impl"


    // $ANTLR start "rule__Image__Group__1"
    // InternalReqText.g:848:1: rule__Image__Group__1 : rule__Image__Group__1__Impl ;
    public final void rule__Image__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:852:1: ( rule__Image__Group__1__Impl )
            // InternalReqText.g:853:2: rule__Image__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Image__Group__1__Impl();

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
    // $ANTLR end "rule__Image__Group__1"


    // $ANTLR start "rule__Image__Group__1__Impl"
    // InternalReqText.g:859:1: rule__Image__Group__1__Impl : ( ( rule__Image__UrlAssignment_1 ) ) ;
    public final void rule__Image__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:863:1: ( ( ( rule__Image__UrlAssignment_1 ) ) )
            // InternalReqText.g:864:1: ( ( rule__Image__UrlAssignment_1 ) )
            {
            // InternalReqText.g:864:1: ( ( rule__Image__UrlAssignment_1 ) )
            // InternalReqText.g:865:2: ( rule__Image__UrlAssignment_1 )
            {
             before(grammarAccess.getImageAccess().getUrlAssignment_1()); 
            // InternalReqText.g:866:2: ( rule__Image__UrlAssignment_1 )
            // InternalReqText.g:866:3: rule__Image__UrlAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Image__UrlAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImageAccess().getUrlAssignment_1()); 

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
    // $ANTLR end "rule__Image__Group__1__Impl"


    // $ANTLR start "rule__State__Group__0"
    // InternalReqText.g:875:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:879:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalReqText.g:880:2: rule__State__Group__0__Impl rule__State__Group__1
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
    // InternalReqText.g:887:1: rule__State__Group__0__Impl : ( 'State' ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:891:1: ( ( 'State' ) )
            // InternalReqText.g:892:1: ( 'State' )
            {
            // InternalReqText.g:892:1: ( 'State' )
            // InternalReqText.g:893:2: 'State'
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
    // InternalReqText.g:902:1: rule__State__Group__1 : rule__State__Group__1__Impl ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:906:1: ( rule__State__Group__1__Impl )
            // InternalReqText.g:907:2: rule__State__Group__1__Impl
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
    // InternalReqText.g:913:1: rule__State__Group__1__Impl : ( ( rule__State__NameAssignment_1 ) ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:917:1: ( ( ( rule__State__NameAssignment_1 ) ) )
            // InternalReqText.g:918:1: ( ( rule__State__NameAssignment_1 ) )
            {
            // InternalReqText.g:918:1: ( ( rule__State__NameAssignment_1 ) )
            // InternalReqText.g:919:2: ( rule__State__NameAssignment_1 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_1()); 
            // InternalReqText.g:920:2: ( rule__State__NameAssignment_1 )
            // InternalReqText.g:920:3: rule__State__NameAssignment_1
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
    // InternalReqText.g:929:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:933:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalReqText.g:934:2: rule__Class__Group__0__Impl rule__Class__Group__1
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
    // InternalReqText.g:941:1: rule__Class__Group__0__Impl : ( 'Classification' ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:945:1: ( ( 'Classification' ) )
            // InternalReqText.g:946:1: ( 'Classification' )
            {
            // InternalReqText.g:946:1: ( 'Classification' )
            // InternalReqText.g:947:2: 'Classification'
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
    // InternalReqText.g:956:1: rule__Class__Group__1 : rule__Class__Group__1__Impl ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:960:1: ( rule__Class__Group__1__Impl )
            // InternalReqText.g:961:2: rule__Class__Group__1__Impl
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
    // InternalReqText.g:967:1: rule__Class__Group__1__Impl : ( ( rule__Class__NameAssignment_1 ) ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:971:1: ( ( ( rule__Class__NameAssignment_1 ) ) )
            // InternalReqText.g:972:1: ( ( rule__Class__NameAssignment_1 ) )
            {
            // InternalReqText.g:972:1: ( ( rule__Class__NameAssignment_1 ) )
            // InternalReqText.g:973:2: ( rule__Class__NameAssignment_1 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_1()); 
            // InternalReqText.g:974:2: ( rule__Class__NameAssignment_1 )
            // InternalReqText.g:974:3: rule__Class__NameAssignment_1
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
    // InternalReqText.g:983:1: rule__Version__Group__0 : rule__Version__Group__0__Impl rule__Version__Group__1 ;
    public final void rule__Version__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:987:1: ( rule__Version__Group__0__Impl rule__Version__Group__1 )
            // InternalReqText.g:988:2: rule__Version__Group__0__Impl rule__Version__Group__1
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
    // InternalReqText.g:995:1: rule__Version__Group__0__Impl : ( ( rule__Version__MajorAssignment_0 ) ) ;
    public final void rule__Version__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:999:1: ( ( ( rule__Version__MajorAssignment_0 ) ) )
            // InternalReqText.g:1000:1: ( ( rule__Version__MajorAssignment_0 ) )
            {
            // InternalReqText.g:1000:1: ( ( rule__Version__MajorAssignment_0 ) )
            // InternalReqText.g:1001:2: ( rule__Version__MajorAssignment_0 )
            {
             before(grammarAccess.getVersionAccess().getMajorAssignment_0()); 
            // InternalReqText.g:1002:2: ( rule__Version__MajorAssignment_0 )
            // InternalReqText.g:1002:3: rule__Version__MajorAssignment_0
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
    // InternalReqText.g:1010:1: rule__Version__Group__1 : rule__Version__Group__1__Impl rule__Version__Group__2 ;
    public final void rule__Version__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1014:1: ( rule__Version__Group__1__Impl rule__Version__Group__2 )
            // InternalReqText.g:1015:2: rule__Version__Group__1__Impl rule__Version__Group__2
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
    // InternalReqText.g:1022:1: rule__Version__Group__1__Impl : ( '.' ) ;
    public final void rule__Version__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1026:1: ( ( '.' ) )
            // InternalReqText.g:1027:1: ( '.' )
            {
            // InternalReqText.g:1027:1: ( '.' )
            // InternalReqText.g:1028:2: '.'
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
    // InternalReqText.g:1037:1: rule__Version__Group__2 : rule__Version__Group__2__Impl ;
    public final void rule__Version__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1041:1: ( rule__Version__Group__2__Impl )
            // InternalReqText.g:1042:2: rule__Version__Group__2__Impl
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
    // InternalReqText.g:1048:1: rule__Version__Group__2__Impl : ( ( rule__Version__MinorAssignment_2 ) ) ;
    public final void rule__Version__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1052:1: ( ( ( rule__Version__MinorAssignment_2 ) ) )
            // InternalReqText.g:1053:1: ( ( rule__Version__MinorAssignment_2 ) )
            {
            // InternalReqText.g:1053:1: ( ( rule__Version__MinorAssignment_2 ) )
            // InternalReqText.g:1054:2: ( rule__Version__MinorAssignment_2 )
            {
             before(grammarAccess.getVersionAccess().getMinorAssignment_2()); 
            // InternalReqText.g:1055:2: ( rule__Version__MinorAssignment_2 )
            // InternalReqText.g:1055:3: rule__Version__MinorAssignment_2
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
    // InternalReqText.g:1064:1: rule__RImport__Group__0 : rule__RImport__Group__0__Impl rule__RImport__Group__1 ;
    public final void rule__RImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1068:1: ( rule__RImport__Group__0__Impl rule__RImport__Group__1 )
            // InternalReqText.g:1069:2: rule__RImport__Group__0__Impl rule__RImport__Group__1
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
    // InternalReqText.g:1076:1: rule__RImport__Group__0__Impl : ( 'import' ) ;
    public final void rule__RImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1080:1: ( ( 'import' ) )
            // InternalReqText.g:1081:1: ( 'import' )
            {
            // InternalReqText.g:1081:1: ( 'import' )
            // InternalReqText.g:1082:2: 'import'
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
    // InternalReqText.g:1091:1: rule__RImport__Group__1 : rule__RImport__Group__1__Impl ;
    public final void rule__RImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1095:1: ( rule__RImport__Group__1__Impl )
            // InternalReqText.g:1096:2: rule__RImport__Group__1__Impl
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
    // InternalReqText.g:1102:1: rule__RImport__Group__1__Impl : ( ( rule__RImport__ImportURIAssignment_1 ) ) ;
    public final void rule__RImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1106:1: ( ( ( rule__RImport__ImportURIAssignment_1 ) ) )
            // InternalReqText.g:1107:1: ( ( rule__RImport__ImportURIAssignment_1 ) )
            {
            // InternalReqText.g:1107:1: ( ( rule__RImport__ImportURIAssignment_1 ) )
            // InternalReqText.g:1108:2: ( rule__RImport__ImportURIAssignment_1 )
            {
             before(grammarAccess.getRImportAccess().getImportURIAssignment_1()); 
            // InternalReqText.g:1109:2: ( rule__RImport__ImportURIAssignment_1 )
            // InternalReqText.g:1109:3: rule__RImport__ImportURIAssignment_1
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
    // InternalReqText.g:1118:1: rule__RModel__ImportsAssignment_0 : ( ruleRImport ) ;
    public final void rule__RModel__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1122:1: ( ( ruleRImport ) )
            // InternalReqText.g:1123:2: ( ruleRImport )
            {
            // InternalReqText.g:1123:2: ( ruleRImport )
            // InternalReqText.g:1124:3: ruleRImport
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
    // InternalReqText.g:1133:1: rule__RModel__StatesAssignment_1_0 : ( ruleState ) ;
    public final void rule__RModel__StatesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1137:1: ( ( ruleState ) )
            // InternalReqText.g:1138:2: ( ruleState )
            {
            // InternalReqText.g:1138:2: ( ruleState )
            // InternalReqText.g:1139:3: ruleState
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
    // InternalReqText.g:1148:1: rule__RModel__ClassesAssignment_1_1 : ( ruleClass ) ;
    public final void rule__RModel__ClassesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1152:1: ( ( ruleClass ) )
            // InternalReqText.g:1153:2: ( ruleClass )
            {
            // InternalReqText.g:1153:2: ( ruleClass )
            // InternalReqText.g:1154:3: ruleClass
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
    // InternalReqText.g:1163:1: rule__RModel__ObjsAssignment_1_2 : ( ruleSpecObject ) ;
    public final void rule__RModel__ObjsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1167:1: ( ( ruleSpecObject ) )
            // InternalReqText.g:1168:2: ( ruleSpecObject )
            {
            // InternalReqText.g:1168:2: ( ruleSpecObject )
            // InternalReqText.g:1169:3: ruleSpecObject
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
    // InternalReqText.g:1178:1: rule__SpecObject__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SpecObject__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1182:1: ( ( RULE_ID ) )
            // InternalReqText.g:1183:2: ( RULE_ID )
            {
            // InternalReqText.g:1183:2: ( RULE_ID )
            // InternalReqText.g:1184:3: RULE_ID
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
    // InternalReqText.g:1193:1: rule__SpecObject__DescriptionAssignment_4 : ( RULE_CC_STRING ) ;
    public final void rule__SpecObject__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1197:1: ( ( RULE_CC_STRING ) )
            // InternalReqText.g:1198:2: ( RULE_CC_STRING )
            {
            // InternalReqText.g:1198:2: ( RULE_CC_STRING )
            // InternalReqText.g:1199:3: RULE_CC_STRING
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
    // InternalReqText.g:1208:1: rule__SpecObject__StateAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__SpecObject__StateAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1212:1: ( ( ( RULE_ID ) ) )
            // InternalReqText.g:1213:2: ( ( RULE_ID ) )
            {
            // InternalReqText.g:1213:2: ( ( RULE_ID ) )
            // InternalReqText.g:1214:3: ( RULE_ID )
            {
             before(grammarAccess.getSpecObjectAccess().getStateStateCrossReference_6_0()); 
            // InternalReqText.g:1215:3: ( RULE_ID )
            // InternalReqText.g:1216:4: RULE_ID
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
    // InternalReqText.g:1227:1: rule__SpecObject__ClassAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__SpecObject__ClassAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1231:1: ( ( ( RULE_ID ) ) )
            // InternalReqText.g:1232:2: ( ( RULE_ID ) )
            {
            // InternalReqText.g:1232:2: ( ( RULE_ID ) )
            // InternalReqText.g:1233:3: ( RULE_ID )
            {
             before(grammarAccess.getSpecObjectAccess().getClassClassCrossReference_8_0()); 
            // InternalReqText.g:1234:3: ( RULE_ID )
            // InternalReqText.g:1235:4: RULE_ID
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
    // InternalReqText.g:1246:1: rule__SpecObject__VersionAssignment_10 : ( ruleVersion ) ;
    public final void rule__SpecObject__VersionAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1250:1: ( ( ruleVersion ) )
            // InternalReqText.g:1251:2: ( ruleVersion )
            {
            // InternalReqText.g:1251:2: ( ruleVersion )
            // InternalReqText.g:1252:3: ruleVersion
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
    // InternalReqText.g:1261:1: rule__SpecObject__ImageAssignment_11_1 : ( ruleImage ) ;
    public final void rule__SpecObject__ImageAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1265:1: ( ( ruleImage ) )
            // InternalReqText.g:1266:2: ( ruleImage )
            {
            // InternalReqText.g:1266:2: ( ruleImage )
            // InternalReqText.g:1267:3: ruleImage
            {
             before(grammarAccess.getSpecObjectAccess().getImageImageParserRuleCall_11_1_0()); 
            pushFollow(FOLLOW_2);
            ruleImage();

            state._fsp--;

             after(grammarAccess.getSpecObjectAccess().getImageImageParserRuleCall_11_1_0()); 

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
    // InternalReqText.g:1276:1: rule__SpecObject__ReferenceAssignment_12_1 : ( ( RULE_ID ) ) ;
    public final void rule__SpecObject__ReferenceAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1280:1: ( ( ( RULE_ID ) ) )
            // InternalReqText.g:1281:2: ( ( RULE_ID ) )
            {
            // InternalReqText.g:1281:2: ( ( RULE_ID ) )
            // InternalReqText.g:1282:3: ( RULE_ID )
            {
             before(grammarAccess.getSpecObjectAccess().getReferenceSpecObjectCrossReference_12_1_0()); 
            // InternalReqText.g:1283:3: ( RULE_ID )
            // InternalReqText.g:1284:4: RULE_ID
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
    // InternalReqText.g:1295:1: rule__SpecObject__ChildrenAssignment_13 : ( ruleSpecObject ) ;
    public final void rule__SpecObject__ChildrenAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1299:1: ( ( ruleSpecObject ) )
            // InternalReqText.g:1300:2: ( ruleSpecObject )
            {
            // InternalReqText.g:1300:2: ( ruleSpecObject )
            // InternalReqText.g:1301:3: ruleSpecObject
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


    // $ANTLR start "rule__Image__NameAssignment_0"
    // InternalReqText.g:1310:1: rule__Image__NameAssignment_0 : ( RULE_CC_STRING ) ;
    public final void rule__Image__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1314:1: ( ( RULE_CC_STRING ) )
            // InternalReqText.g:1315:2: ( RULE_CC_STRING )
            {
            // InternalReqText.g:1315:2: ( RULE_CC_STRING )
            // InternalReqText.g:1316:3: RULE_CC_STRING
            {
             before(grammarAccess.getImageAccess().getNameCC_STRINGTerminalRuleCall_0_0()); 
            match(input,RULE_CC_STRING,FOLLOW_2); 
             after(grammarAccess.getImageAccess().getNameCC_STRINGTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Image__NameAssignment_0"


    // $ANTLR start "rule__Image__UrlAssignment_1"
    // InternalReqText.g:1325:1: rule__Image__UrlAssignment_1 : ( RULE_CC_STRING ) ;
    public final void rule__Image__UrlAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1329:1: ( ( RULE_CC_STRING ) )
            // InternalReqText.g:1330:2: ( RULE_CC_STRING )
            {
            // InternalReqText.g:1330:2: ( RULE_CC_STRING )
            // InternalReqText.g:1331:3: RULE_CC_STRING
            {
             before(grammarAccess.getImageAccess().getUrlCC_STRINGTerminalRuleCall_1_0()); 
            match(input,RULE_CC_STRING,FOLLOW_2); 
             after(grammarAccess.getImageAccess().getUrlCC_STRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Image__UrlAssignment_1"


    // $ANTLR start "rule__State__NameAssignment_1"
    // InternalReqText.g:1340:1: rule__State__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1344:1: ( ( RULE_ID ) )
            // InternalReqText.g:1345:2: ( RULE_ID )
            {
            // InternalReqText.g:1345:2: ( RULE_ID )
            // InternalReqText.g:1346:3: RULE_ID
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
    // InternalReqText.g:1355:1: rule__Class__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Class__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1359:1: ( ( RULE_ID ) )
            // InternalReqText.g:1360:2: ( RULE_ID )
            {
            // InternalReqText.g:1360:2: ( RULE_ID )
            // InternalReqText.g:1361:3: RULE_ID
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
    // InternalReqText.g:1370:1: rule__Version__MajorAssignment_0 : ( RULE_INT ) ;
    public final void rule__Version__MajorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1374:1: ( ( RULE_INT ) )
            // InternalReqText.g:1375:2: ( RULE_INT )
            {
            // InternalReqText.g:1375:2: ( RULE_INT )
            // InternalReqText.g:1376:3: RULE_INT
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
    // InternalReqText.g:1385:1: rule__Version__MinorAssignment_2 : ( RULE_INT ) ;
    public final void rule__Version__MinorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1389:1: ( ( RULE_INT ) )
            // InternalReqText.g:1390:2: ( RULE_INT )
            {
            // InternalReqText.g:1390:2: ( RULE_INT )
            // InternalReqText.g:1391:3: RULE_INT
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
    // InternalReqText.g:1400:1: rule__RImport__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__RImport__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqText.g:1404:1: ( ( RULE_STRING ) )
            // InternalReqText.g:1405:2: ( RULE_STRING )
            {
            // InternalReqText.g:1405:2: ( RULE_STRING )
            // InternalReqText.g:1406:3: RULE_STRING
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