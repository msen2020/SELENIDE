@navigation
@msen
Feature: Locators

  Scenario: Locators Test
    Given the user navigates to "https://testcenter.techproeducation.com/index.php?page=form-authentication"
    And the user waits for 5 seconds
    And the user inputs a username
    And the user waits for 5 seconds
    And the user inputs a password
    And the user waits for 5 seconds
    When the user clicks the button Submit
    And the user waits for 5 seconds
    Then the user verifies that the text "You logged into a secure area!" is visible


