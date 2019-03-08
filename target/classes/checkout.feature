Feature: Order checkout

In order to make a purchase of an item 
As a user 
I want the system to complete a checkout of a selected item 

Scenario: User successfully completes oder checkout
  
  Given user has a selected item in the shopping basket 
  And user is on a checkout page
  When user clicked on Proceed to checkout button on Summmary tab 
  And user successfully logged in on Sign in tab
  And user clicked on Proceed to checkout button on Address tab 
  And user agreed to T&Cs on Shipping tab
  And user clicked on Proceed to checkout button on Shippping tab 
  And user selected Pay by bank wire method
  And user clicked on I confirm my order button
  Then user sees successfull purchase conformation message
