@msen
@checkbox
Feature: CheckBox test

  Scenario: CheckBox test
    Given the user navigates to "https://testcenter.techproeducation.com/index.php?page=checkboxes"
    Then the user verifies that the text Checkboxes is visible
    And the user selects the "checkBox 1"
    And the user selects the "checkBox 2"
    And the user holds the browser open


