@AdminMenu
Feature: Login and go to admin menu

  @Login
  Scenario: Login to OrangeHRP Application
    When I am in orangeHRP Application
    Then Login to Application
    When Dashboard page is available
    And Click on Admin menu