Feature: Check home page functionality

  Background: User is loggerd in
    Given user in a login page
    When user enter usn and pwd
    And clicking at login button
    Then user is navigated to the homepage

  Scenario: Check logout link
    When user click on welcome link
    Then logout link is displayed

  Scenario: Verify quick launch toolbar is presen
    When user click on dashboard link
    Then quick launch toolbar is displayed
