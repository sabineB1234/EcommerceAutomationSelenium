@AddProductEdisac
Feature: Shopping for products on the EDISAC web site

@validAddProductsEdisac
Scenario: Searching for products, adding them to cart, and proceeding to checkout
 
Given User navigates to EDISAC web site to add products to mon panier 
When User move to search input on the EDISAC page 
And User clicks on lancel button and sends "lancel" on the EDISAC page
And User move to "filtrer par prix" on the EDISAC page
And User drags and drops to "502 €" on the EDISAC page
And User move to Sac bandoulière zoé LANCEL product
And User click on Sac bandoulière zoé LANCEL add button as the first article
And User move to Sac bandoulière Billie cuir LANCEL
And User click on Sac bandoulière Billie cuir LANCEL as the second article
And User clicks on delete button on the EDISAC page
And User clicks on mon panier button to verify all products
And User verifies being on the Shopping Lancel products page
And User clicks on the Increase Quantity button "2" of Sac bandoulière roxane
And User verifies total price "865 00 €" on the Shopping products page 
And User clicks on the commander button
Then User verifies being on authenfication page to log up
