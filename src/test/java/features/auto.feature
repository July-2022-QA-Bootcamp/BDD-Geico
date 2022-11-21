@auto
Feature: Auto Quote Validation

  Scenario: Auto quote test
    Given user navigate to homepage
    And user input zipcode
    And user select auto
    When click start quote
    And continue overlay handled
    And speed up page handled
    Then user will be in about you page
    And title of the page will be <About You>
   
  @steps 
	Scenario: Auto quote page steps
	When homepage steps done with <"11425">
	Then about you page steps done
	
	@data-driven
	Scenario Outline: Data Driven approach for BDD
	When homepage steps done with <zip>
	Then about you page steps done
	Examples: 
	|zip|
	|'11418'|
	|'11425'|
	|'11373'|
	
	
	 