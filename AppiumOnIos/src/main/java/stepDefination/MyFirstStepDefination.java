package stepDefination;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import AndroidPagedata.AndroidPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hooks.GeneralHooks;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import pojo.AddPlace;
import pojo.Location;

public class MyFirstStepDefination {

	private AndroidDriver<AndroidElement> driver;
	private IOSDriver<IOSElement> iosdriver;
	public Response response;
	public RequestSpecification req;
	public ResponseSpecification respspec;
	public RequestSpecification res;
	public AndroidPage androidPage;

	public MyFirstStepDefination() {

		this.driver = GeneralHooks.getDriverAnd();
		this.iosdriver = GeneralHooks.getDriverIos();
		androidPage = new AndroidPage(driver);
	}

	@Given("^I open the app$")
	public void i_open_the_app() throws Throwable {

	}

	@When("^I click on preferences field$")
	public void i_click_on_preferences_field() throws Throwable {
		Thread.sleep(2000);
		// driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		androidPage.clickOnPreference();
	}

	@Then("^I click on preferences dependency field$")
	public void i_click_on_preferences_dependency_field() throws Throwable {
		Thread.sleep(2000);
		// driver.findElementByXPath("//android.widget.TextView[@text='3. Preference
		// dependencies']").click();
		androidPage.clickOnPreferenceDependecy();
	}

	@Then("^I select the checkbox$")
	public void i_select_the_checkbox() throws Throwable {
		Thread.sleep(2000);
//			driver.findElementById("android:id/checkbox").click();
//			driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click(); 
		androidPage.clickOnCheckBox();
		Thread.sleep(3000);

		System.out.println(androidPage.getWifiText());
		androidPage.clickOnWifiSettings();
	}

	@Then("^I pass the value \"([^\"]*)\" in the input field$")
	public void i_pass_the_value_in_the_input_field(String arg1) throws Throwable {
		// driver.findElementByClassName("android.widget.EditText").sendKeys(arg1);
//		AndroidElement ele=driver.findElementByClassName("android.widget.EditText");
//		ele.sendKeys(arg1);
		androidPage.passInput(arg1);
		String input = androidPage.getInputText();
		System.out.println(input);
		Assert.assertEquals(input,arg1);
	}

	@Given("^I open tha app on ios$")
	public void i_open_tha_app_on_ios() throws Throwable {

	}

	@When("^I Click on text box$")
	public void i_Click_on_text_box() throws Throwable {
		IOSElement textButton = (IOSElement) new WebDriverWait(iosdriver, 30)
				.until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Text Button")));
		textButton.click();
	}

	@Then("^I pass the input value \"([^\"]*)\"$")
	public void i_pass_the_input_value(String arg2) throws Throwable {
		IOSElement textInput = (IOSElement) new WebDriverWait(iosdriver, 30)
				.until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Text Input")));
		textInput.sendKeys(arg2);

	}

	@Then("^I get the text from input field$")
	public void i_get_the_text_from_input_field() throws Throwable {
		IOSElement textInput = (IOSElement) new WebDriverWait(iosdriver, 30)
				.until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Text Input")));
		String actualText = textInput.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText, "Testing the field");
		iosdriver.quit();
	}

	@Given("^Add Place to Payload$")
	public void add_place_to_payload() throws Throwable {
		AddPlace p = new AddPlace();
		p.setAccuracy(50);
		p.setAddress("29, side layout, cohen 09");
		p.setLanguage("French-IN");
		p.setPhone_number("(+91) 983 893 3937");
		p.setWebsite("https://rahulshettyacademy.com");
		p.setName("Frontline house");
		List<String> myList = new ArrayList<String>();
		myList.add("shoe park");
		myList.add("shop");

		p.setTypes(myList);
		Location l = new Location();
		l.setLat(-38.383494);
		l.setLng(33.427362);
		p.setLocation(l);
		req = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").addQueryParam("key", "qaclick123")
				.setContentType(ContentType.JSON).build();

		respspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		res = given().spec(req).body(p);
	}

	@When("^user calls \"([^\"]*)\" with \"([^\"]*)\" http request$")
	public void user_calls_something_with_something_http_request(String strArg1, String strArg2) throws Throwable {
		response = res.when().post("/maps/api/place/add/json").then().spec(respspec).extract().response();
	}

	@Then("^the API call got success with status code 200$")
	public void the_api_call_got_success_with_status_code_200() throws Throwable {
		int status = response.getStatusCode();
		System.out.println("Status code is " + status);
	}

	@And("^\"([^\"]*)\" in response body is \"([^\"]*)\"$")
	public void something_in_response_body_is_something(String key, String value) throws Throwable {
          String bodyResponse=response.asString();
          JsonPath path=new JsonPath(bodyResponse);
          Assert.assertEquals(path.get(key).toString(), value);
          System.out.println(bodyResponse);
          
	}

}
