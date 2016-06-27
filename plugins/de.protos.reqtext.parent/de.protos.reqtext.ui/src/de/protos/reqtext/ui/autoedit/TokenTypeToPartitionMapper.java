package de.protos.reqtext.ui.autoedit;

import org.eclipse.xtext.ui.editor.model.TerminalsTokenTypeToPartitionMapper;

public class TokenTypeToPartitionMapper extends TerminalsTokenTypeToPartitionMapper {

	@Override
	protected String calculateId(String tokenName, int tokenType) {
		if("RULE_CC_STRING".equals(tokenName))
			return STRING_LITERAL_PARTITION;
		
		return super.calculateId(tokenName, tokenType);
	}
}
