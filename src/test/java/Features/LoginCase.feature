Feature: Login functionality

  Scenario Outline: Check login is successful with valid credentials
    Given Browser has open
    And user in login page
    When user enters <username> and <password>
    And user click on login button
    Then user navigated to the home page

    Examples:
    | username | password |
    | Putra | 12345 |