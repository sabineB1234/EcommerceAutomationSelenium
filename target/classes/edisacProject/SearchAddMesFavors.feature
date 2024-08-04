@AddToWishListEdisac
Feature: search and add product to mes favoris  
as a user I want to search a product and add to mes favoris

@ValidAddProduct
Scenario: add product to mes favoris 

Given I navigate to url to add to mes favoris 
When I move the mouse to femmes button 
And I move the mouse to sacs en bandoulieres button 
And I click on sacs en bandoulieres  button 
And I verify I m on sacs en bandoulieres page is visible
And I select the the brand lancaster
And I select the matiere cuir 
And I move the mouse to sacs en bandoulieres zoé cuir product
And I click on mes favories icon of sacs en bandoulieres zoé cuir product
And I move the mouse to sacs en bandoulieres soft product
And I click on mes favories icon of sacs en bandoulieres soft product
And I click on mes favoris button 
Then I verify that the page of mes favoris is visible 





