Feature: Add one and more items to the basket for a singed in user

In order to one and more items to the basket
As a singned in user 
I want the system to keep the track of all added items before checkout 


  
 Scenario Outline: User successfully adds one and more items into the shopping basket

    Given logged in user navigates to Summer Dresses section of the website
    And user clicks on  the item "<item>"
    And user clicks on Add to cart button
    When user clicks on Proceed to checkout button
    Then user should see "<amount>" of items in the basket


    Examples:

      |   item                                                           |  amount |
      |   //*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img    |   1     |
      |   //*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div/a[1]/img    |   2     |
  
  
  
  
  