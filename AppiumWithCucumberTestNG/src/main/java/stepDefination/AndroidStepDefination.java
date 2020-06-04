package stepDefination;

import java.util.concurrent.TimeUnit;

import appium.BaseAppium;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;

public class AndroidStepDefination extends BaseAppium {

	public AndroidDriver<AndroidElement> Adriver;

	@Given("^i open the app on android$")
	public void i_open_the_app_on_android() throws Throwable {
		AndroidDriver<AndroidElement> Adriver = capabilities();
		Adriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("^click on preferences $")
	public void click_on_preferences() throws Throwable {
		Adriver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
	}

	@Then("^click on preferences dependency$")
	public void click_on_preferences_dependency() throws Throwable {
		Adriver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
	}

	@Then("^select the checkbox$")
	public void select_the_checkbox() throws Throwable {
		Adriver.findElementById("android:id/checkbox").click();
	}

	@And("^Pass the value \"([^\"]*)\"$")
	public void pass_the_value_something(String value) throws Throwable {
		Adriver.findElementByClassName("android.widget.EditText").sendKeys(value);
	}

}
