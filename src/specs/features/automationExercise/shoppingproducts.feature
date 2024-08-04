@shoping
Feature: Shopping for products on Automation Exercise web site

@validshoping
  Scenario: Searching for products, adding them to cart, and proceeding to checkout
    Given User navigates to the Automation Exercise web site
    When User clicks on the Products button
    And User verifies being navigated to the All Products page successfully
    And User enters "Dress" in the search input field
    And User clicks on the search button
    And User verifies that the search product "SEARCHED PRODUCTS" is visible
    And User verifies all the products related to the search are visible
    And User move to sleeveless dress product
    And User click on sleeveless dress add button as the first article
    And User click on continue button 
    And User move to stylish product
    And User click on stylish add button as the first article
    And User clicks on the Cart Review button
    And User verifies being on the Shopping Cart page
    And User clicks on the first article button
    And User verifies being on the product page
    And User clicks on the Increase Quantity button "2"    
    And User clicks on the Add to Cart button
    And User clicks on the cart button to proceed 
    And User clicks on the Proceed to Checkout button
    And User verifies being on the shopping page
    And User clicks on the Login/Sign Up button to proceed with the purchase
    Then User verifies being on the home page after completing the purchase
    
    