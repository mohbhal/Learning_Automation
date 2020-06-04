Feature: First Appium Project

@Android
Scenario: Open the app on android

Given I open the app 
When I Select the country "India" from dropdown
Then I enter the name "Testing" in input field
Then I select "Male" in the radio button
Then I click on "Lets shop" button

