Feature: Navigate to all sub-categories in DRESSES category

In order to navigate to a chosen sub-category
As a user 
I want the system to redirect me to the corresponding to chosen sub-category page


  
 Scenario Outline: User successfully re-directed to their chosen sub-category page

    Given user navigates to Dresses section of the website
    When user clicks on  subcategory "<subCategory>"
    Then user should be re-directed to corresponding "<pageName>" page

    Examples:

      |   subCategory                                      |     pageName     |
      |   /html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]    |   CASUAL DRESSES  |
      |   /html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]    |   EVENING DRESSES |
      |   /html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]    |   SUMMER DRESSES  |
      
  
