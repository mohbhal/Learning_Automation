package com.cucumber.api.common;

public class Base {
	private String featureName;
    public String getFeatureName() {
		return featureName;
	}
	public String getScenarioName() {
		return scenarioName;
	}
	private String scenarioName;
	public Base() {
		featureName="BDD";
		scenarioName="DI";
	}
}
