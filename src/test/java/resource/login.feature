@aaa
Feature: Login Functionality

  Scenario: Valid Login

    Given User is in homepage
    When User click the login link
    And enter username and password
    And click the login button
    Then User enter home screen