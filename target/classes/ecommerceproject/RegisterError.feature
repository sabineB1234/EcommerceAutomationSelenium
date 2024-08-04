@registerusers
Feature: create a new account user 
as a new user i want to create my new account user  

@Invalidregisterusers
Scenario: search product

Given I navigate to automation practice pages URL to sign up
When I verify that home pages automation practice is visible 
And I Click on the signs in button    
And I verifys thats the pages authentications is visible 
And I verifys thats "CREATE AN ACCOUNT" is visible on the pages authentications 
And I fill the emails address "sabine.boudjellal1012763q45dfsf259@outlook.fr" on the create account section
And I click creates account button
And I verify thats I m on thes create an account page 
And I verify thats enter account information "AUTHENTICATION" is visible
And I select Users titles Mrs or Mr
And I fill User informations in the followings details:
      | Field           |Value |
      | FirstName       | "  " |
      | LastName        | "  " |
      | Password        | "  " |
And I select days of birth of the user "3" 
And I select months of birth of the user "January"
And I select years of birth of the user "2000"
And I Select checkboxs Sign up for our newsletter!
And I verify "Sign up for our newsletter!" informations
And I click on registers button 
Then I verify errors message "There are 3 errors"
