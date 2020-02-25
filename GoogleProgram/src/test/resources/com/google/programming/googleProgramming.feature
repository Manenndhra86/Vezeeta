@featureId=GoogleProgramming @jiraid=GOOGLE-12345  @WebUI
Feature: Google Home Page
  As a Google User
  I Should able to search word Programming in Google Search Home Page
  I should able to skip Google Ads and Maps
  Parse result Page and Print Title and Sections for each page

  @acceptance @auto @jiraid=GOOGLE-23456
  Scenario: Google Search Programming
    Given User open's Google Chrome browser and enters "Google.com"
    And User clicks on "Search" box field
    And User enters "Programming" Text in Search box text field
    When User clicks on "Search" button
    Then User will get list of Links for the entered search criteria and User will remove "Ads" from the list and User will print the "Title" and "Sections" of the result one after the other opening in new tab
