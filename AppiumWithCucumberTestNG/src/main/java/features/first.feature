Feature: First Appium Project


Scenario: Opening demo app in android virtual device with preference 

Given i open the app on android
When click on preferences 
Then click on preferences dependency
Then select the checkbox
And Pass the value "Hello"
