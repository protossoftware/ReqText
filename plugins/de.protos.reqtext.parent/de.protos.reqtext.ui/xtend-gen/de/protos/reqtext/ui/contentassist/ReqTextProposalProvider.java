/**
 * generated by Xtext 2.9.1
 */
package de.protos.reqtext.ui.contentassist;

import com.google.common.base.Objects;
import de.protos.reqtext.converter.CC_StringConveter;
import de.protos.reqtext.ui.contentassist.AbstractReqTextProposalProvider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.eclipse.xtext.util.Strings;

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
@SuppressWarnings("all")
public class ReqTextProposalProvider extends AbstractReqTextProposalProvider {
  @Override
  public void complete_CC_STRING(final EObject model, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    String feature = this.getAssignedFeature(ruleCall);
    boolean _equals = Objects.equal(feature, null);
    if (_equals) {
      feature = "Text";
    }
    this.createCCStringProposal(context, acceptor, feature, ruleCall);
  }
  
  private String getAssignedFeature(final RuleCall call) {
    Assignment ass = GrammarUtil.containingAssignment(call);
    boolean _notEquals = (!Objects.equal(ass, null));
    if (_notEquals) {
      String result = ass.getFeature();
      String _lowerCase = result.toLowerCase();
      boolean _equals = result.equals(_lowerCase);
      if (_equals) {
        String _firstUpper = Strings.toFirstUpper(result);
        result = _firstUpper;
      }
      return result;
    }
    return null;
  }
  
  protected void createCCStringProposal(final ContentAssistContext context, final ICompletionProposalAcceptor acceptor, final String feature, final RuleCall ruleCall) {
    String _xifexpression = null;
    boolean _notEquals = (!Objects.equal(feature, null));
    if (_notEquals) {
      _xifexpression = feature;
    } else {
      AbstractRule _rule = ruleCall.getRule();
      String _name = _rule.getName();
      String _lowerCase = _name.toLowerCase();
      _xifexpression = Strings.toFirstUpper(_lowerCase);
    }
    String proposalText = _xifexpression;
    IValueConverterService _valueConverter = this.getValueConverter();
    AbstractRule _rule_1 = ruleCall.getRule();
    String _name_1 = _rule_1.getName();
    String _string = _valueConverter.toString(proposalText, _name_1);
    String _replaceAll = _string.replaceAll(
      CC_StringConveter.NEW_LINE, "");
    proposalText = _replaceAll;
    String displayText = proposalText;
    boolean _notEquals_1 = (!Objects.equal(feature, null));
    if (_notEquals_1) {
      displayText = (displayText + " - String");
    }
    final ICompletionProposal proposal = this.createCompletionProposal(proposalText, displayText, null, context);
    if ((proposal instanceof ConfigurableCompletionProposal)) {
      int _replacementOffset = ((ConfigurableCompletionProposal)proposal).getReplacementOffset();
      int _plus = (_replacementOffset + 3);
      ((ConfigurableCompletionProposal)proposal).setSelectionStart(_plus);
      int _length = proposalText.length();
      int _minus = (_length - 6);
      ((ConfigurableCompletionProposal)proposal).setSelectionLength(_minus);
      ((ConfigurableCompletionProposal)proposal).setAutoInsertable(false);
      ITextViewer _viewer = context.getViewer();
      char _charAt = proposalText.charAt(0);
      ((ConfigurableCompletionProposal)proposal).setSimpleLinkedMode(_viewer, _charAt, '\t');
    }
    acceptor.accept(proposal);
  }
}
