Feature: feature to test google search funcionality
  Scenario: Validate google search is working
    Given Browser is open
    And user in on google search page
    When user enter a text in search box
    And hits enter
    Then user navigated to the search results