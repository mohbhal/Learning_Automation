$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("first.feature");
formatter.feature({
  "line": 1,
  "name": "First Appium Project",
  "description": "",
  "id": "first-appium-project",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Open the app on android",
  "description": "",
  "id": "first-appium-project;open-the-app-on-android",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Android"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I open the app",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on preferences field",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on preferences dependency field",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I select the checkbox",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I pass the value \"Hello\" in the input field",
  "keyword": "Then "
});
formatter.match({
  "location": "FirstStepDefinations.i_open_the_app()"
});
formatter.result({
  "duration": 97497843688,
  "status": "passed"
});
formatter.match({
  "location": "FirstStepDefinations.i_click_on_preferences_field()"
});
formatter.result({
  "duration": 2190878286,
  "error_message": "org.openqa.selenium.NoSuchSessionException: A session is either terminated or not started\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027WKWIN5950833\u0027, ip: \u002710.102.123.65\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002710.0.1\u0027\nDriver info: io.appium.java_client.android.AndroidDriver\nCapabilities {app: C:\\Users\\mohbhal\\eclipse-wo..., appPackage: io.appium.android.apis, databaseEnabled: false, desired: {app: C:\\Users\\mohbhal\\eclipse-wo..., deviceName: TestingEmu, platformName: android}, deviceApiLevel: 29, deviceManufacturer: Google, deviceModel: Android SDK built for x86, deviceName: emulator-5554, deviceScreenDensity: 420, deviceScreenSize: 1080x1920, deviceUDID: emulator-5554, javascriptEnabled: true, locationContextEnabled: false, networkConnectionEnabled: true, pixelRatio: 2.625, platform: LINUX, platformName: Android, platformVersion: 10, statBarHeight: 63, takesScreenshot: true, viewportRect: {height: 1731, left: 0, top: 63, width: 1080}, warnings: {}, webStorageEnabled: false}\nSession ID: 019a3cd9-41b0-4b38-adee-c4c7e5db9be7\n*** Element info: {Using\u003dxpath, value\u003d//android.widget.TextView[@text\u003d\u0027Preference\u0027]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:488)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat io.appium.java_client.remote.AppiumCommandExecutor.execute(AppiumCommandExecutor.java:239)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.execute(DefaultGenericMobileDriver.java:41)\r\n\tat io.appium.java_client.AppiumDriver.execute(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.execute(AndroidDriver.java:1)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:61)\r\n\tat io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.findElement(AndroidDriver.java:1)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElementByXPath(DefaultGenericMobileDriver.java:151)\r\n\tat io.appium.java_client.AppiumDriver.findElementByXPath(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.findElementByXPath(AndroidDriver.java:1)\r\n\tat stepDefination.FirstStepDefinations.i_click_on_preferences_field(FirstStepDefinations.java:46)\r\n\tat ✽.When I click on preferences field(first.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "FirstStepDefinations.i_click_on_preferences_dependency_field()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FirstStepDefinations.i_select_the_checkbox()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Hello",
      "offset": 18
    }
  ],
  "location": "FirstStepDefinations.i_pass_the_value_something_in_the_input_field(String)"
});
formatter.result({
  "status": "skipped"
});
});