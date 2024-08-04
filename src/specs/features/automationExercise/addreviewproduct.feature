@addproduct

Feature: Add review on product 
as a user I want to Add review on product my account automation

@addsearchproduct
Scenario: Add review on product
Given I navigate to URL to add product
When I click on the products button
And I verify user is navigate to all product page successfully
And I click on view product button " "
And I verify that "WRITE YOUR REVIEW" is visible
And I enter name review "sabine"
And I enter the correct email review " sabine.boudjellal@outlook.fr"
And I enter the text review "the product is good"
And I click on submits button
Then I verify success message "Thank you for your review."