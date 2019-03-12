Feature: Order checkout                                         //Simple senarion End-to-end testing

In order to make a purchase of an item 
As a signed in user 
I want the system to complete a checkout of a selected item 

Scenario: User successfully completes oder checkout
  
  Given singed in user has a selected item in the shopping basket 
  When user clicked on Proceed to checkout button on Summmary tab 
  And user clicked on Proceed to checkout button on Address tab 
  And user agreed to T&Cs on Shipping tab
  And user clicked on Proceed to checkout button on Shippping tab 
  And user selected Pay by bank wire method
  And user clicked on I confirm my order button
  Then user sees successfull purchase conformation message
