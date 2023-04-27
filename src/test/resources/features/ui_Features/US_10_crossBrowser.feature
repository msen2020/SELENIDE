
@browsers
Feature: CrossBrowser

  @headless
  Scenario: CrossBrowser Test 1
    Given the user selects the browser type as "headless"
    And the user navigates to "https://test.hypnotes.net/"
    And the user takes the screenshot of the page
  @firefox
  Scenario: CrossBrowser Test 2
    Given the user selects the browser type as "firefox"
    And the user navigates to "https://test.hypnotes.net/"
    And the user takes the screenshot of the page

  @edge
  Scenario: CrossBrowser Test 3
    Given the user selects the browser type as "edge"
    And the user navigates to "https://test.hypnotes.net/"
    And the user takes the screenshot of the page

  @safari
  Scenario: CrossBrowser Test 4
    Given the user selects the browser type as "safari"
    And the user navigates to "https://test.hypnotes.net/"
    And the user takes the screenshot of the page

  @opera
  Scenario: CrossBrowser Test 5
    Given the user selects the browser type as "opera"
    And the user navigates to "https://test.hypnotes.net/"
    And the user takes the screenshot of the page

  @chrome
  Scenario: CrossBrowser Test 6
    Given the user selects the browser type as "chrome"
    And the user navigates to "https://test.hypnotes.net/"
    And the user takes the screenshot of the page
