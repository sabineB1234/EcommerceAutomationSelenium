@AddProductsShopping
Feature: Shopping for products on Automation Exercise web site

@validAddProductsShopping
Scenario: Searching for products, adding them to cart, and proceeding to checkout
    
Given User navigates to the Automation Exercise web site to add product
When User clicks on the Products buttons
And User verifies being navigated to All Products page success
And User enters tops "tops" in the search input field
And User clicks on the searches buttonss
#And User verifies that the word search product "SEARCHED PRODUCTS" is visible
And User move to tops  product and click
And User verifies being on the products page
And User clicks on the Increase Quantity button to "2" 
And User verifies category product "Category: Women > Tops" 
And User verifies price product "Rs. 500"  
And User clicks on the Add to Carts buttons
And User clicks on the carts buttons to proceed to the next page
And User verifies being on the shopping product page
And User clicks on the buttons proceed to check out buttons
And User verifies being on the shopping product page
And User clicks on the sign up button to proceed with the shopping
Then User verifies being on the home page after complete shopping 
    