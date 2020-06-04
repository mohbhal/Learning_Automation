$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Free Demo Project",
  "description": "",
  "id": "free-demo-project",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Mercuruy Login Page",
  "description": "",
  "id": "free-demo-project;mercuruy-login-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefination.user_already_login_page()"
});
formatter.result({
  "duration": 7143632489,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.title_of_login_page()"
});
formatter.result({
  "duration": 17733297,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_enters_username_and_password()"
});
formatter.result({
  "duration": 255570556,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_click_on_login_button()"
});
formatter.result({
  "duration": 42231667727,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_is_on_home_page()"
});
formatter.result({
  "duration": 11403676,
  "status": "passed"
});
});