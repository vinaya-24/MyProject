Feature: Login

  Scenario: Login with valid credentials
    Given User launches the browser
    When User navigates to login page
    And User enters credentials
      | username | testuser |
      | password | pass123  |
    Then User should see the homepage
