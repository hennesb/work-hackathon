package ie.components.rules.engine;

import org.springframework.stereotype.Component;

@Component
public class BlazeRulesEngine implements RulesEngine<BlazeRulesInput, BlazeRulesOutput> {

	@Override
	public BlazeRulesOutput decision(BlazeRulesInput input) {
		BlazeRulesOutput out = new BlazeRulesOutput();
		return out;
	}

}
