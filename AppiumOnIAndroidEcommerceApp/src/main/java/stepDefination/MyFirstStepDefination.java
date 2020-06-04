package stepDefination;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hooks.GeneralHooks;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;


public class MyFirstStepDefination {
	
	private AndroidDriver<AndroidElement> driver;
	
	
	public MyFirstStepDefination() {
		
		this.driver=GeneralHooks.getDriverAnd();
		
	}
	
	@Given("^I open the app$")
	public void i_open_the_app() throws Throwable {
	    
	}

	@When("^I Select the country \"([^\"]*)\" from dropdown$")
	public void i_Select_the_country_from_dropdown(String arg1) throws Throwable {
	    
	}

	@Then("^I enter the name \"([^\"]*)\" in input field$")
	public void i_enter_the_name_in_input_field(String arg1) throws Throwable {
	    
	}

	@Then("^I select \"([^\"]*)\" in the radio button$")
	public void i_select_in_the_radio_button(String arg1) throws Throwable {
	    
	}

	@Then("^I click on \"([^\"]*)\" button$")
	public void i_click_on_button(String arg1) throws Throwable {
	    
	}

}
