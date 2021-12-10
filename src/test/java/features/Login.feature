#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Application Login

  Scenario: Home page default login
    Given User is on Landing page
    When User signup with following details
    	| jenny | abcd | Paa| abc@ef.org|
    	| jenny | obc | Paa| abc@ef.org|
    Then Home page is populated
  
  Scenario Outline: Home page default login
    Given User is on Landing page
    When User login into application with <Username> and <Password>
    Then Home page is populated
    And cards displayed are <cardsValue>
    
  
    
 Examples:
|Username|Password|cardsValue|
|John    |1234    |true      |
|Jin     |123     |false     |
|Pin     |12      |abc       |    

