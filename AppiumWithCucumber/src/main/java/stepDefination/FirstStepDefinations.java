package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import appium.BaseAppium;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;


public class FirstStepDefinations extends BaseAppium  {

	
	public AndroidDriver<AndroidElement> Adriver;
	public IOSDriver<IOSElement> iosdriver;
	
	
     public FirstStepDefinations() throws Exception {
    	 this.Adriver=capabilities();
    	 this.iosdriver=iosCapibilities();
    	 
	}
     @Given("^I open the app$")
     public void i_open_the_app() throws Throwable {
		AndroidDriver<AndroidElement> Adriver=capabilities();
		Adriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   
		

	}

     @When("^I click on preferences field$")
     public void i_click_on_preferences_field() throws Throwable {
		
		//System.out.println("Before Click");
		Thread.sleep(2000);
		Adriver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();

	}
     @Then("^I click on preferences dependency field$")
     public void i_click_on_preferences_dependency_field() throws Throwable {
		Thread.sleep(2000);
		Adriver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();

	}


     @Then("^I select the checkbox$")
     public void i_select_the_checkbox() throws Throwable {
    	 Thread.sleep(2000);
		Adriver.findElementById("android:id/checkbox").click();
		Adriver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		Thread.sleep(2000);
		
		
	}

     @Then("^I pass the value \"([^\"]*)\" in the input field$")
     public void i_pass_the_value_something_in_the_input_field(String str) throws Throwable {
    	 Adriver.findElementByClassName("android.widget.EditText").sendKeys(str);
     }
     @Given("^I open tha app on ios$")
     public void i_open_tha_app_on_ios() throws Throwable {
		 IOSDriver<IOSElement> iosdriver=iosCapibilities();
		 
	    }

     @When("^I Click on text box$")
     public void i_click_on_text_box() throws Throwable {
	    	IOSElement textButton = (IOSElement) new WebDriverWait(iosdriver, 30)
					.until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Text Button")));
			textButton.click(); 
	    }


     @Then("^ I pass the input value \"([^\"]*)\"$")
     public void i_pass_the_input_value_something(String strValue) throws Throwable {
	    	IOSElement textInput = (IOSElement) new WebDriverWait(iosdriver, 30)
					.until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Text Input")));
			textInput.sendKeys(strValue);
			iosdriver.quit();
	       
	    }
    
//     @After
//     public void tearDown() {
//    	 //Adriver.closeApp();
//    	 Adriver.quit();
//     }

}

