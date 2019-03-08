Feature: Add one and more items to the basket for a singed in user

In order to one and more items to the basket
As a singned in user 
I want the system to keep the track of all added items before checkout 


  
 Scenario Outline: User successfully adds one and more items into the shopping basket

    Given logged in user navigates to Summer Dresses section of the website
    And user clicks on  the item "<Add to cart>" button
    When user clicks on "<Continue shopping>" button
    Then user should see "<amount>" of items in the basket


    Examples:

      |   Add to cart     |  Continue shopping   |  amount |
      |   item 1 locator  |   Button locator     |   1     |
      |   item 2 locator  |   Button locator     |   2     |
  
  
  
  
  