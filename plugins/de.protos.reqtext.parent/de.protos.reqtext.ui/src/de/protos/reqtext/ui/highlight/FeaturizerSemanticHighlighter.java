package de.protos.reqtext.ui.highlight;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

import de.protos.reqtext.util.CCStringIndentation;

public class FeaturizerSemanticHighlighter implements
		ISemanticHighlightingCalculator {

	@Override
	public void provideHighlightingFor(XtextResource resource,
			IHighlightedPositionAcceptor acceptor) {
		if (resource == null || resource.getParseResult() == null)
			return;

		INode root = resource.getParseResult().getRootNode();
		for (INode node : root.getAsTreeIterable()) {

			EObject obj = node.getGrammarElement();
			if (obj instanceof RuleCall) {
				RuleCall ruleCall = (RuleCall) obj;
				String name = ruleCall.getRule().getName();
				if(name.equals("CC_STRING"))
					detailCodeStringHighlight(node, acceptor);
			}
		}
	}
	
	protected void detailCodeStringHighlight(INode node, IHighlightedPositionAcceptor acceptor) {
		if (node.getText() == null || node.getText().length() < 6)
			return;
		
		acceptor.addPosition(node.getTotalOffset(), 3, DefaultHighlightingConfiguration.STRING_ID);
		acceptor.addPosition(node.getTotalEndOffset() - 3, 3, DefaultHighlightingConfiguration.STRING_ID);

		String detailCodeString = node.getText().substring(3, node.getText().length() - 3);
		CCStringIndentation ccStringIndent = new CCStringIndentation(detailCodeString);
		List<int[]> lineStartLength = ccStringIndent.highlight();

		int offest = node.getOffset() + 3;
		for (int[] startLength : lineStartLength) {
			acceptor.addPosition(offest + startLength[0], startLength[1],
					FeaturizerHighlightingConfig.HL_DETAIL_CODE_STRING);
		}
	}

}
