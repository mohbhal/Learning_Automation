Feature: Free Demo Project

  Background: Common steps
    Given I should be logged in
    And I should be own wall

  Scenario: Post a text on user wall
    When I type the text as "This is sample post" on text wall
    And I click on post button
    Then I should be see the Message on my wall

  Scenario: Post a video on user wall
    When I supply youtube link as "http://www.google.com"
    And I click on post button
    Then I should be see video on the my wall
    And I should have see proper thumbil
