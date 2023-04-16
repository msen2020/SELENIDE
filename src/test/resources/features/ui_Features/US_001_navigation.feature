@navigation
Feature: Navigation

  Scenario: Navigation Test
    Given the user navigates to "https://www.google.com"
    And the user navigates to "https://www.amazon.com/"
    And the user waits fo 5 seconds
    And the user navigates back
    And the user navigates forward
    And the user refreshes the page
    And the user holds the browser open
