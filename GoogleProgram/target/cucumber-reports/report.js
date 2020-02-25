$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/com/google/programming/googleProgramming.feature");
formatter.feature({
  "line": 2,
  "name": "Google Home Page",
  "description": "As a Google User\r\nI Should able to search word Programming in Google Search Home Page\r\nI should able to skip Google Ads and Maps\r\nParse result Page and Print Title and Sections for each page",
  "id": "google-home-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@featureid\u003dGoogleProgramming"
    },
    {
      "line": 1,
      "name": "@jiraid\u003dGOOGLE-12345"
    },
    {
      "line": 1,
      "name": "@ui"
    }
  ]
});
formatter.before({
  "duration": 6411907500,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "xyz",
  "description": "",
  "id": "google-home-page;xyz",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@acceptance"
    },
    {
      "line": 8,
      "name": "@auto"
    },
    {
      "line": 8,
      "name": "@jiraid\u003d\u003dGOOGLE-23456"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User open\u0027s Google Chrome browser and enters \"Google.com\"",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User clicks on \"Search\" box field",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User enters \"Programming\" Text in Search box text field",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User clicks on \"Search\" button",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User will get list of Links for the entered search criteria and User will remove \"Ads\" from the list and User will print the \"Title\" and \"Sections\" of the result one after the other opening in new tab",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Google.com",
      "offset": 46
    }
  ],
  "location": "GooglePageSteps.User_opens_Google_Chrome(String)"
});
formatter.result({
  "duration": 2417201100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Search",
      "offset": 16
    }
  ],
  "location": "GooglePageSteps.userClicksOnBoxField(String)"
});
formatter.result({
  "duration": 67073900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Programming",
      "offset": 13
    }
  ],
  "location": "GooglePageSteps.userEntersTextInSearchBoxTextField(String)"
});
formatter.result({
  "duration": 145925900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Search",
      "offset": 16
    }
  ],
  "location": "GooglePageSteps.userClicksOnButton(String)"
});
formatter.result({
  "duration": 2926379200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ads",
      "offset": 82
    },
    {
      "val": "Title",
      "offset": 126
    },
    {
      "val": "Sections",
      "offset": 138
    }
  ],
  "location": "GooglePageSteps.userWillGetListOfLinksForTheEnteredSearchCriteriaAndUserWillRemoveFromTheListAndUserWillPrintTheAndOfTheResultOneAfterTheOtherOpeningInNewTab(String,String,String)"
});
formatter.result({
  "duration": 499445438400,
  "status": "passed"
});
formatter.after({
  "duration": 143000,
  "status": "passed"
});
});