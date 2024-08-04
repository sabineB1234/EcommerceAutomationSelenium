@registeruser
Feature: create a new account user 
as a new user i want to create my new account user  

Background: 
Given I navigate to automation practice URL to sign up
When I verify that home page automation practice is visible 
And I click on the sign in button to sign up

@validregisteruser
Scenario: create user account with correct email and password
  
When I verify that these page authentications is visible 
And I verify that "CREATE AN ACCOUNT" is visible on the page authentication 
Then I fill the email address "sabine.boudjellal1012763q45dfs259@outlook.fr" on the create account section
And I click create account button
When I verify that I m on the create an account page 
And I verify that enter account information "AUTHENTICATION" is visible
Then I select User title Mrs or Mr
And I fill User informations in the following details:
      | Field           | Value          |
      | FirstName       | Nadine         |
      | LastName        | boudj          |
      | Password        | sabine123      |
And I select day of birth of the user "3" 
And I select month of birth of the user "January"
And I select year of birth of the user "2000"
And I Select checkbox Sign up for our newsletter!
And I verify "Sign up for our newsletter!" information
And I click on register button 
When I verify that I m on my account page
And I verify that account created success "Your account has been created."is visible
Then I click on the add my first adress 
When I verify that I m on the Your addresses page
Then I fill the registration informations form with the following details:
      | Field           | Value          |
      | Company         | akka           |
      | Address         | gennevilliers  |
      | Address2        | paris          |
      | City            | paris          | 
And I select the state "Alabama" on checkbox     
And I select the country "United States" on checkbox 
And I fill the supply registration informations form with the following details: 
      | Field           | Value          |
      | Zipcode         | 92210          |
      | HomePhone       |0753472532      |
      | MobilePhone     |0753472532      |
      | Additionals     |sabine          |
      | MyAddress       |My address      |
And I verify the information assign "Please assign an address title for future reference. *"
And I click on save button 
When I verify that I m on my addresses page
Then I verify the adress information "Nadine"
And I click on back to your account button 
And I Click on sign out buttons 

#@invalidregisteruser
#Scenario: create user account with incorrect email and password

When I fill all authentication details:
      | Field      | Value                           |
      | Email      | sabine.boudjellalaaa@outlook.fr |
      | Password   | sabine123                       |
And I click on sign in up button
Then I verify the messages error "Authentication failed." on automation practice page

 