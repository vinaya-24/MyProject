Feature: Google Search Page

  Scenario: Launch Chrome browser
    Given User launches the browser
    When User opens Google homepage
    Then Page title should contain "Google"
    And Close the browser
