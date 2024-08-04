 
@registeruser
Feature: create a new register user 
as a new user i want to create my new account user  

@validregisteruser
Scenario Outline: create user with correct email and password

Given I Navigate to automation URL to sign up 
Then I Verify that home page automation is visible successfully
When I Click on Sign up button
And I fill the name and email address: 
      | Field              | Value                        |
      | Name               |sabine                        |            
      | Email              |sabine.boudjellal0@outlook.f  |  
And i Click Sign up button
Then I Verify that enter account information  "ENTER ACCOUNT INFORMATION" is visible
When I Select details Title 
And I fill details name and email and passwords:
      | Field           | Value          |
      | FirstName       | Nadine         |
      | LastName        | boudj          |
      | Password        | sabine123      |
And I Select details Date Day of birth "23"
And I Select details Date Month of birth "January"
And I Select checkbox Sign up for our newsletter
Then I Verify that sign up for newsletters "Sign up for our newsletter" is visible
When I Select checkbox Receive special offers from our partners
Then I Verify that receive special offers "Receive special offers from our partners" is visible
When I fill the registration informations with the following details:
      | Field           | Value          |
      | Firstname       | sabine         |
      | Lastname        | boudj          |
      | Company         | akka           |
      | Address         | gennevilliers  |
      | Address2        | paris          |
And I Select drop down list Country "Canada"
And I fill the following informations state city zipCode mobile number:
      | Field           | Value          |
      | State           | france         |
      | City            | paris          |
      | Zipcode         | 92210          |
      | MobileNumber    |0753472532      |
And I Click on Create Account button 
Then I Verify that account created "ACCOUNT CREATED!" is visible
When I Click on Continue button
Then I Verify that the logged in "Logged in as sabineNadineboudj" is visible
When I Click on Delete Account button
Then I Verify that account deleted "ACCOUNT DELETED!" is visible 
When I click on continue button user
#Then I