@AddToWishList
Feature: search and add product 
as a user I want to search a product


@AddProduct
Scenario: add product to wish list

Given I navigate to url to add to wish list 
When I move the mouse to the dress button 
And I move the mouse to SUMMER DRESSES button 
And I click on SUMMER DRESSES button 
And I verify I m on T-SHIRTS page is visible
And I move the mouse to the second product 
And I click on more SUMMER DRESSES button
And I verify that the page product is visible
And I select the color blue
And I select size "M" 
And I select the color yellow
And I increase the product quantity
And I verify the price of product "$29"
And I click on the add to cart button
And I click on proceed to checkout button 
And I verify the total price of the product "$65"
And I verify that the page SHOPPING-CART SUMMARY is visible
Then I click on proceed to checkouts button

#@LoginToAccount
#Scenario: login to account 

Given I fill authentication details:
      | Field      | Value                           |
      | Email      | sabine.boudjellalaaaa@outlook.fr|
      | Password   | sabine123                       |
When I verify that the page authentications is visible 
And I click on sign in button 

#@shoppingproduct
#Scenario: shopping product

Given I verify that the page ADDRESSES is visible 
When I click on proceeds to checkouts buttons
And I verify the price oh delivery "$7"
And I select agree term service 
And I clicked on proceeds to checkouts buttons

#@payment
#Scenario: payment product 

Given I click on pay by bank wire
Then I verify that the page ORDER SUMMARY is visible
And I click on I confirm my order
And I verify that the page ORDER CONFIRMATION is visible
Then I verify "Your order on My Shop is complete." on order confirmation page
