Feature: Actions

  @drag&drop
  Scenario: Actions Drag and Drop Test 1
    Given the user navigates to "https://jqueryui.com/droppable/"
    And the user switches to the iframe 1
    And the user drags the target element and drop it
    And the user holds the browser open

  @dragNDropBy
  Scenario: Actions Drag and Drop with by method Test 2
    Given the user navigates to "https://jqueryui.com/droppable/"
    And the user switches to the iframe 1
    And the user drags the target element to 159 by 170 and drops it
    And the user verifies the target element moved to 159 by 170 coordinates
    And the user holds the browser open
