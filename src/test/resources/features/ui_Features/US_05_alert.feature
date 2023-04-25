Feature: Alert

  @alert
  Scenario: Alert Test
    Given the user navigates to "https://testcenter.techproeducation.com/index.php?page=javascript-alerts"
    And the user clicks the button Click for JS Prompt
    And the user inputs a text "Hello" into JS Prompt
    And the user clicks the button OK
    Then the user verifies that the Result text includes "Hello"