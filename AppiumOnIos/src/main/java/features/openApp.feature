@AllTest
Feature: First Appium Project on Android

@Android
Scenario: Open the app on android
Given I open the app 
When I click on preferences field 
Then I click on preferences dependency field
Then I select the checkbox
Then I pass the value "Hello" in the input field

@Ios
Scenario: Open the app on IOS
Given I open tha app on ios
When I Click on text box
Then I pass the input value "Testing the field"
Then I get the text from input field

@Api
Scenario: Create a request of an API
    Given Add Place to Payload
	When user calls "AddPlaceAPI" with "POST" http request
	Then the API call got success with status code 200
	And "status" in response body is "OK"
	And "scope" in response body is "APP"