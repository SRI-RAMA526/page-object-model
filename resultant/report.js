$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/Cucumber Practice/loginpages/src/main/java/com/cucumber/flipkartfeature/flipkartfeature.feature");
formatter.feature({
  "line": 1,
  "name": "To Login to the Flipkart Homepage",
  "description": "",
  "id": "to-login-to-the-flipkart-homepage",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Flipkart Login \u0026 Search Item",
  "description": "",
  "id": "to-login-to-the-flipkart-homepage;flipkart-login-\u0026-search-item",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "flipkart is already opened",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of the page is flipkart",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "enter the user login details",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "search the required item",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "click on search button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "close on Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "FlipkartStepDefinition.flipkart_homepage()"
});
formatter.result({
  "duration": 8486519100,
  "status": "passed"
});
formatter.match({
  "location": "FlipkartStepDefinition.get_homepage_title()"
});
formatter.result({
  "duration": 39884400,
  "status": "passed"
});
formatter.match({
  "location": "FlipkartStepDefinition.click_login_button()"
});
formatter.result({
  "duration": 82889400,
  "status": "passed"
});
formatter.match({
  "location": "FlipkartStepDefinition.enter_user_login_details()"
});
formatter.result({
  "duration": 316254900,
  "status": "passed"
});
formatter.match({
  "location": "FlipkartStepDefinition.search_required_item()"
});
formatter.result({
  "duration": 1364853500,
  "status": "passed"
});
formatter.match({
  "location": "FlipkartStepDefinition.search_button_click()"
});
formatter.result({
  "duration": 10233631199,
  "status": "passed"
});
formatter.match({
  "location": "FlipkartStepDefinition.close_browser()"
});
formatter.result({
  "duration": 392116600,
  "status": "passed"
});
});