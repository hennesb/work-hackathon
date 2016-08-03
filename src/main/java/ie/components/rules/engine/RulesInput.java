package ie.components.rules.engine;

public class RulesInput {
	
	private String ruleId;
	private String userName;
	
    public RulesInput(){
    	
    }
    
    public RulesInput(String rule, String user){
    	this.setUserName(user);
    	this.setRuleId(rule);
    }
	public String getRuleId() {
		return ruleId;
	}

	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	

}
