@msen
@checkbox
Feature: CheckBox test

  Scenario: TC_01 CheckBox test
    Given the user navigates to "https://testcenter.techproeducation.com/index.php?page=checkboxes"
    And the user waits for 5 seconds
    Then the user verifies that the text Checkboxes is visible
    And the user waits for 5 seconds
    And the user selects the "Checkbox 1"
    And the user waits for 5 seconds
    And the user selects the "Checkbox 2"
    And the user waits for 5 seconds
    And the user holds the browser open

  Scenario: TC_02 Radio Button test
    Given the user navigates to "https://testcenter.techproeducation.com/index.php?page=radio-buttons"
    And the user waits for 5 seconds
    And the user selects the "Red"
    And the user holds the browser open



