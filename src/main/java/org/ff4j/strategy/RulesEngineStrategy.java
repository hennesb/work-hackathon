package org.ff4j.strategy;

/*
 * #%L
 * ff4j-web-vhi
 * %%
 * Copyright (C) 2013 - 2016 Ff4J
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import java.util.Map;
import org.ff4j.core.FeatureStore;
import org.ff4j.core.FlippingExecutionContext;
import org.springframework.beans.factory.annotation.Autowired;

import ie.components.rules.engine.RulesEngine;
import ie.components.rules.engine.RulesInput;
import ie.components.rules.engine.RulesOutput;

public class RulesEngineStrategy extends AbstractFlipStrategy {
	
	private static final String RULENAME = "rule";
	private String theRule;
	
	@Autowired
	private RulesEngine<RulesInput, RulesOutput> engine;
	
	
	public RulesEngineStrategy(){
		
	}
	
	public RulesEngineStrategy(String rule){
		this.setTheRule(rule);
		getInitParams().put(RULENAME, this.getTheRule());
	}	

	@Override
	public void init(String featureName, Map<String, String> initParam) {
		super.init(featureName, initParam);
		this.setTheRule(initParam.get(RULENAME));
	}

	public String getTheRule() {
		return theRule;
	}

	public void setTheRule(String theRule) {
		this.theRule = theRule;
	}

	@Override
	public boolean evaluate(String featureName, FeatureStore store, FlippingExecutionContext executionContext) {
		return engine.decision(new RulesInput("abc", "def")).defaultDecision();
	}

}
