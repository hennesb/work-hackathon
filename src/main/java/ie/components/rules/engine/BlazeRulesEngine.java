package ie.components.rules.engine;

import org.springframework.stereotype.Component;
import java.util.*;

@Component
public class BlazeRulesEngine implements RulesEngine<RulesInput, RulesOutput> {
	
	private Map<String, Boolean> map = new HashMap<String, Boolean>();
	
	public BlazeRulesEngine(){
		map.put("personalizationRule", new Boolean(true));
		map.put("otherBusinessRule", new Boolean(false));
	}

	@Override
	public RulesOutput decision(RulesInput input) {
		BlazeRulesOutput out = new BlazeRulesOutput();
		out.setRuleOutputMessage("FF4j rules engine output");
		out.setMatch(makeDecision(input.getRuleId()));
		return out;
	}
	
	
	private boolean makeDecision(String ruleName){
		return map.get(ruleName).booleanValue();
	}

}
