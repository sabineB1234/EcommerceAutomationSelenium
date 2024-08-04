@loginEdisac
Feature: login to my account Edisac website
as a user I want to login to my Edisac website

Background: 
Given I navigate to automation URL to connect Edisac website
And I click on sign up/login button on the EDISAC page 

@validloginEdisac
Scenario: login user with correct email and password
When I enter a correct email "sabine.boudjellal1@gmail.com" on the EDISAC page 
And I enter a correct password "erahuhuq" on the EDISAC page 
And I click on login Button on the EDISAC page 
And I verify that I m "Nad Sab" on the EDISAC page 
Then I click on the login out button of Edisac page 


@multiplecnxEdisac
Scenario Outline: Login with multiple users 
When I enter a correct email "<Email>" on the EDISAC page
And I enter a correct password "<Password>" on the EDISAC page 
And I click on login Button on the EDISAC page 
And I verify that I m "<Statut>" on the EDISAC page 
Then I click on the login out button of Edisac page 
Examples:
| Email                       |Password    |Statut   |
| sabine.boudjellal1@gmail.com|erahuhuq    |Nad Sab  |


@InvalidloginEdisac
Scenario Outline: login user with incorrect email and password 
When I enter incorrect email "<Email>" on the EDISAC page 
And I enter incorrect password "<Password>" on the EDISAC page 
And I click on login Button on the EDISAC page to authentication incorrect 
Then I verify messages errors "<MessageError>" on the EDISAC page 
Examples:
| Email                       |Password     |MessageError                 |
| sabine.boudjellal@gmail.com |Bnadine002-  |L'email est incorrect        |
| sabine.boudjellal1@gmail.com|sabine123    |Le mot de passe est incorrect|
