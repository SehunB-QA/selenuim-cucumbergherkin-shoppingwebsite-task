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
Feature: Access a page of "<item>" on the shopping website
 

  @tag1
  Scenario Outline: Display a page of a dress on the shopping website
    Given I can access "www.automationpractice.com/index.php"
    And I click on the search bar and I enter "<item>" into the search bar
    And  I click on the "<item>" search result
    Then I should be on a page of "<item>"
    
 Examples:
    |item|
    |Printed Summer Dress|
    
    

