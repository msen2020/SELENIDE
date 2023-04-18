@msen
@loginLogout
Feature: Hypnotes Login as a therapist

  Scenario: Hypnotes Login as a therapist
    Given the user navigates to test page
    And the user clicks the button Login
    And the user clicks option Therapist
    And the user inputs a therapist email
    And the user inputs a therapist password
    When the user clicks the button Login for submit
    Then the user verifies that the link Calendar is visible


