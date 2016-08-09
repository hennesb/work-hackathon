package ie.components.rules.engine;

public class RulesOutput {
	
	private String ruleOutputMessage;
	private boolean match;
	
	public boolean isMatch() {
		return match;
	}

	public void setMatch(boolean match) {
		this.match = match;
	}

	public String getRuleOutputMessage() {
		return ruleOutputMessage;
	}

	public void setRuleOutputMessage(String ruleOutputMessage) {
		this.ruleOutputMessage = ruleOutputMessage;
	}

	public boolean defaultDecision(){
		return true;
	}



}
