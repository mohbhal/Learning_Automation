package stepDefination;

import java.util.concurrent.TimeUnit;

import appium.BaseAppium;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class FirstStepDefinations extends BaseAppium {
	public AndroidDriver<AndroidElement> Adriver;
	
	@Given("^open the app$")
	public void open_the_app() throws Throwable {
		AndroidDriver<AndroidElement> Adriver=capabilities();
		Adriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		
	}

	@When("^click on preferences$")
	public void click_on_preferences() throws Throwable {
		System.out.println("Before Click");
		Adriver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
	}

	@Then("^click on preferences dependency$")
	public void click_on_preferences_dependency() throws Throwable {
		Adriver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		
		Adriver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		
       Adriver.findElementByClassName("android.widget.EditText").sendKeys("Hello");
	}

	@Then("^select the checkbox$")
	public void select_the_checkbox() throws Throwable {
		Adriver.findElementById("android:id/checkbox").click();
	}
	

    @When("^click on Accessbility $")
    public void click_on_accessbility() throws Throwable {
        throw new PendingException();
    }

    @Then("^click on Accessbility type$")
    public void click_on_accessbility_type() throws Throwable {
        throw new PendingException();
    }


	

}
