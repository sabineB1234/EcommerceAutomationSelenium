@logout 
Feature: Logout User 
as a user I want to delete my account automation  

@validlogout
Scenario: logout user account 
Given I navigate to URL to log in 
When I click on the button sign up login
And I enter the correct email address "sabine.boudjellal@outlook.fr"
And I enter the correct password "sabine123"
And I click on the login button 
And I verify that the logged in as "Logged in as sabine" is visible
And I click on the log out button
Then I verify that the user is navigated to login page