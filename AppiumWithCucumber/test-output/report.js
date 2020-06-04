$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("first.feature");
formatter.feature({
  "line": 1,
  "name": "First Appium Project",
  "description": "",
  "id": "first-appium-project",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Mercuruy Login Page",
  "description": "",
  "id": "first-appium-project;mercuruy-login-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "open the app",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "click on preferences",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "click on preferences dependency",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "select the checkbox",
  "keyword": "Then "
});
formatter.match({
  "location": "FirstStepDefinations.open_the_app()"
});
formatter.result({
  "duration": 37705652287,
  "status": "passed"
});
formatter.match({
  "location": "FirstStepDefinations.click_on_preferences()"
});
formatter.result({
  "duration": 188171,
  "status": "passed"
});
formatter.match({
  "location": "FirstStepDefinations.click_on_preferences_dependency()"
});
formatter.result({
  "duration": 49231,
  "status": "passed"
});
formatter.match({
  "location": "FirstStepDefinations.select_the_checkbox()"
});
formatter.result({
  "duration": 43396,
  "status": "passed"
});
});