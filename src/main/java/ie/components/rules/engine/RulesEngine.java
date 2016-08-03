package ie.components.rules.engine;

public interface RulesEngine<I extends RulesInput,R extends RulesOutput>{
	
	public R decision(I input);	

}
