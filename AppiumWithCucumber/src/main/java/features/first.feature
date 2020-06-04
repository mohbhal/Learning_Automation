Feature: First Appium Project

@Android
Scenario: Open the app on android

Given I open the app 
When I click on preferences field 
Then I click on preferences dependency field
Then I select the checkbox
Then I pass the value "Hello" in the input field



@ios
Scenario: Open the app on IOS
Given I open tha app on ios
When I Click on text box
Then I pass the input value "Testing the field"

