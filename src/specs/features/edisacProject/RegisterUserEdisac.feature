@registeruserEdisac
Feature: create a new account user on Edisac website
as a new user I want to create my new account user on Edisac website 

Background: 
Given I Navigate to EDISAC URL to sign up
When I verify that EDISAC home page is visible 
And I Click on the sign in button on the EDISAC page   

@validregisteruserEdisac
Scenario: create user account with correct personal informations on Edisac website
    
When I verify that EDISAC page authentications is visible 
And I verify that "déjà client ?" is visible on EDISAC page
Then I fill the email address "sabine.boudjcellal22345@outlook.fr" on the create account section EDISAC page
And I click create account button in EDISAC page
When I verify that I m on the create an account EDISAC page 
And I verify that enter account information "AUTHENTICATION" Edisac website is visible
And I fill password in the following details:
      | Field           | Value          |
      | Password        | Nadine123#     |
      | PassWordBis     | Nadine123#     |      
And I select User category personne or entrerpise 
And I select User title Mrs or Mr on EDISAC create page
And I fill Personnel informations on EDISAC create page in the following details:
      | Field           | Value      |
      | FirstName       | Nadine     |
      | LastName        | BOUZAR     | 
And I select day of birth of the user "03" on EDISAC create page
And I select month of birth of the user "03" on EDISAC create page
And I select year of birth of the user "2000" on EDISAC create page
And I select the country of the user "France Metropolitaine" on EDISAC create page
And I fill the supply registration informations form on EDISAC create page with the following details: 
      | Field           | Value          |
      | Zipcode         | 92210          |
      | City            | paris          |
      | Address         | gennevilliers  |
      | Address2        | paris          |
      | HomePhone       |0753472532      |
      | MobilePhone     |0753472532      |
And I Select checkbox Sign up for our newsletter! on EDISAC create page
And I verify "Sign up for our newsletter!" information on EDISAC create page
And I click on register button on EDISAC create page
And I verify that I m on my account page on EDISAC create page
And I Click on mon compte button on EDISAC create page
And I verify the statue "Nadine Bouzar" on EDISAC create page
Then I Click on sign out button 

@invalidregisteruserEdisac
Scenario: create user account with incorrect email 

When I fill all authentication details with incorrect Email on the EDISAC page:
      | Field      | Value                           |
      | Email      | sabine.boudjellalgmail.com |
And I click on sign in up buttons with incorrect email on the EDISAC page
Then I verify the message errors "L'adresse email n'est pas correcte." on the EDISAC page

@EmailUsedregisteruserEdisac
Scenario: create user account with used email

When I fill all authentication details with used Email on the EDISAC page:
      | Field      | Value                        |
      | Email      | sabine.boudjellal1@gmail.com |
And I click on sign in up button with user email on the EDISAC page
Then I verify the message error "Un compte associé à cette adresse existe déjà."

