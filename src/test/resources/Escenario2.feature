@JobMenu
Feature: Validate page heading of Job dashboard

  Background: I am logged into Orange Application

		Given On home page of application
		When I enter credentials
		Then I should be successfully logged in

  @JobTitle
  Scenario: Title of your scenario
    When I click on Admin link
    Then Click on Job
    And Validate text in Job title
