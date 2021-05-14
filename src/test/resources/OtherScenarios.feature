
@Smoke
Feature: Browse Orange Application Options

  @NavigateToAdmin
  Scenario: Navigate to Admin page of OrangeHRP Application
    Given I am in orangeHRP
    When Click on Admin tab
    Then I see System Users page heading
    
  @NavigateToPIM
  Scenario: Navigate to PIM page of OrangeHRP Application
    Given I am in orangeHRP
    When Click on PIM tab
    Then I see Employee Information page heading
    
  @NavigateToLeave
  Scenario: Navigate to Leave page of OrangeHRP Application
    Given I am in orangeHRP
    When Click on Leave tab
    Then I see Leave List page heading
    
  @NavigateToTime
  Scenario: Navigate to Time page of OrangeHRP Application
    Given I am in orangeHRP
    When Click on Time tab
    Then I see Select Employee page heading