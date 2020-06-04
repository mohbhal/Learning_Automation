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
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "AndroidStepDefination.click_on_preferences_dependency()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AndroidStepDefination.select_the_checkbox()"
});
formatter.result({
  "status": "skipped"
});
});