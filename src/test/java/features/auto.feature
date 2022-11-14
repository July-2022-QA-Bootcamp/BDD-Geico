@regression
Feature: Auto Quote Validation

  Scenario: Auto quote test
    Given user navigate to homepage
    And user input zipcode
    And user select auto
    When click start quote
    Then user will be in about you page
    And title of the page will be <About You>

@smoke
  Scenario: Auto quote test 2
    Given user navigate to homepage
    And user input zipcode
    And user select auto
    When click start quote
    Then user will be in about you page
    And title of the page will be <About You>
