Feature: Iframe, switch to iframe. switch to window Test

  @iframe
  Scenario: Iframe, switch to iframe. switch to window Test
    Given the user navigates to "https://testcenter.techproeducation.com/index.php?page=iframe"
    Then the user verifies that the page of the url is "https://testcenter.techproeducation.com/index.php?page=iframe"
    Then the user verifies that the text iframe is visible
    And the user switches to the iframe 1
    And the user clicks the link Back to TechProEducation.com
    And the user switches to the window 2
    Then the user verifies that the page of the url is "https://techproeducation.com"
    And the user holds the browser open