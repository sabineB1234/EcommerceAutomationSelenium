@RemoveProducts
Feature: as a user I can add and remove products on Automation Exercise web site

@RemoveAddProducts
Scenario: Searching for products, adding them to cart, and remove 
    
Given User navigate to the Automation Exercise web site to add and move product
When User clicks on the Product buttons to access to all product
And User verifies being navigated to All Products page with success
And User enters saree "saree" in the search input field to get to the products page
And User clicks on the searches buttonss to get to the products page
And User move to saree product and click
And User verifies being on the saree products page
And User clicks on the Increase Quantity button "2" of saree product   
And User clicks on the Add to Cart button of saree product 
And User clicks on the cart button to proceed of saree product 
And User verifies being on the recap product page
And User verifies that message saree silk is "Cotton Silk Hand Block Print Saree"
And User clicks on the X to remove product
Then user clicks on the homes button 