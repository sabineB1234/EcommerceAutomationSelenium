Feature: search product 
as a user I want to search a product

@Searchproduct
Scenario: search product 

Given I navigate to url to search product
And I click on products button 
And I verify user is navigated to all products page successfully
And I enter product name in search input "Dress "
And I click on search button  
And I Verify that search product "SEARCHED PRODUCTS" is visible
Then I Verify all the products related to search are visible 

