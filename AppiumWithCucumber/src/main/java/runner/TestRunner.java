package runner;


import cucumber.api.CucumberOptions;



	
	@CucumberOptions(
			features = "C:\\Users\\mohbhal\\eclipse-workspace\\AppiumWithCucumber\\src\\main\\java\\features"
			,glue = {"stepDefination"},
			plugin= {"pretty","html:test-output"}
			
			)
	
	public class TestRunner 
	{
		


	}



