package com.cucumber.api.hooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
	
	//1. create the public method
	//2. Use Before and After annotation
	//3. Specify the package in runner
	//4. Inject scenario details
	
	@Before
	public void setUp(Scenario name) {
		System.out.println("Before hook");
		System.out.println("name is "+ name.getName());
		System.out.println("name is "+ name.getStatus());
	}
	@After
	public void tearDown(Scenario name) {
		System.out.println("After hook");
		System.out.println("name is "+ name.getName());
		System.out.println("name is "+ name.getStatus());
		
	}


}
