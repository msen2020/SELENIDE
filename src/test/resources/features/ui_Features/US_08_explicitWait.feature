Feature: Explicit Wait

  @waits
  Scenario: Explicit Wait Test
    Given the user navigates to "https:the-internet.herokuapp.com/dynamic_loading/1"
    And the user clicks the button Start
    Then the user verifies that the text Hello World is visible
    And the user holds the browser open
