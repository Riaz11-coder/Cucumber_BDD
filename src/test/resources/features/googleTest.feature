Feature: Test Google page title
  As a User I should be able to see Google page title
  @Google
  Scenario:
    Given User is on Google home page
    When User requests page title
    Then User should receive "Google"