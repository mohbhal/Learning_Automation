package AndroidPagedata;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.qameta.allure.Step;

public class AndroidPage {
	public AndroidDriver<AndroidElement> driver;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Preference']")
	AndroidElement preference;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='3. Preference dependencies']")
	AndroidElement preferDependency;

	@AndroidFindBy(id = "android:id/checkbox")
	AndroidElement checkBox;

	@AndroidFindBy(xpath = "(//android.widget.RelativeLayout)[2]")
	AndroidElement wifiSettings;

	@AndroidFindBy(className = "android.widget.EditText")
	AndroidElement wifiInput;

	public AndroidPage(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
  @Step("Clicking on preference link")
	public void clickOnPreference() {
		preference.click();

	}

	public void clickOnPreferenceDependecy() {
		preferDependency.click();

	}

	public void clickOnCheckBox() {
		checkBox.click();

	}

	public void clickOnWifiSettings() {
		wifiSettings.click();

	}

	public void passInput(String text) {
		wifiInput.sendKeys(text);

	}

	public String getWifiText() {
		return wifiSettings.getText();
	}

	public String getInputText() {
		return wifiInput.getText();
	}

}
