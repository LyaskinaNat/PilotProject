Feature: Add an items to the basket 

In order to accomodate a purchase
As a user 
I want the system to add the selected item to the shopping basket


  
 Scenario: User successfully adds oa selected item into the shopping basket

    Given user navigates to Summer Dresses section of the website
    And user selects the item to purchase
    And user clicks on Add to cart button
    When user clicks on Proceed to checkout button
    Then the item should be adde to the basket


    
  
  
  