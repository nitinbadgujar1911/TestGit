$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login1.feature");
formatter.feature({
  "line": 1,
  "name": "Login Functionality",
  "description": "",
  "id": "login-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Valid Login",
  "description": "",
  "id": "login-functionality;valid-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user navigate to url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "login page will appear",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "user enters valid login and passward",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User should landed on Home Page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "click on logout button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.user_navigate_to_url()"
});
formatter.result({
  "duration": 9113924300,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.login_page_will_appear()"
});
formatter.result({
  "duration": 257097000,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.user_enters_valid_login_and_passward()"
});
formatter.result({
  "duration": 247513900,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.click_on_login_button()"
});
formatter.result({
  "duration": 1732902400,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.user_should_landed_on_Home_Page()"
});
formatter.result({
  "duration": 60807600,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.click_on_logout_button()"
});
formatter.result({
  "duration": 534541000,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.close_the_browser()"
});
formatter.result({
  "duration": 125168200,
  "status": "passed"
});
});