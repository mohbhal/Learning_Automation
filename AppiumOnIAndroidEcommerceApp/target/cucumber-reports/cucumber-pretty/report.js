$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/mohbhal/eclipse-workspace/AppiumOnIAndroidEcommerceApp/src/main/java/features/openApp.feature");
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
  "name": "I Select the country \"India\" from dropdown",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I enter the name \"Testing\" in input field",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I select \"Male\" in the radio button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I click on \"Lets shop\" button",
  "keyword": "Then "
});
formatter.match({
  "location": "MyFirstStepDefination.i_open_the_app()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "India",
      "offset": 22
    }
  ],
  "location": "MyFirstStepDefination.i_Select_the_country_from_dropdown(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Testing",
      "offset": 18
    }
  ],
  "location": "MyFirstStepDefination.i_enter_the_name_in_input_field(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Male",
      "offset": 10
    }
  ],
  "location": "MyFirstStepDefination.i_select_in_the_radio_button(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Lets shop",
      "offset": 12
    }
  ],
  "location": "MyFirstStepDefination.i_click_on_button(String)"
});
formatter.result({
  "status": "skipped"
});
});