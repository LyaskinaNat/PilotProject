Feature: Sign in into account

In order to Sign in into the account 
As a user 
I want the system to validate the input of user credentials 

  Background:
    Given User navigates to http://automationpractice.com website
    And User clicks on the Sign in option

  
  Scenario: Sing in into account with valid credentials 

    Given User enters a valid email address
    And User enters a valid password
    When User clicks on the Sign in button
    Then User should be signed in to the website

  
  Scenario: Sign in into account with invalid credentials

    Given User enters an invalid email address
    And User enters an invalid password
    When User clicks on the Sign in button
    Then Authentication failed message should be displayed to the user 


  Scenario: Sign in into account with incorrect format email address
    Given User enters an incorrect format email address
    And User enters an valid password
    When User clicks on the Sign in button
    Then Error message Invalid email address is displayed to the user 
    
  
  