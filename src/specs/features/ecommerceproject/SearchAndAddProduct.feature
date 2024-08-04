@searchandadd
Feature: search and add product 
as a user I want to search a product


@Searchproduct
Scenario: search product 

Given I navigate to url to search and add product
When I move the mouse to women button 
And I move the mouse to EVENING DRESSES  button 
And I click on EVENING DRESSES  button
And I get text of the first product "Printed Dress"
And I enter the text product printed dress
And I click on submits buttons

