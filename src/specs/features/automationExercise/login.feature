@login
Feature: login to my account automation exercise
as a user I want to login to my account automation

Background: 
Given I navigate to automation URL to connect
And I click on sign up/login button

@validlogin
Scenario: login user with correct email and password
When I enter a correct email "sabine.boudjellal@outlook.fr"
And I enter a correct password "sabine123"
And I click on login Button 
Then I verify that I m "Logged in as sabine"

@multiplecnx
Scenario Outline: Login with multiple users 
When I enter a correct email "<Email>"
And I enter a correct password "<Password>"
And I click on login Button 
Then I verify that I m "<Statut>" 
Examples:
| Email                       |Password     |Statut             |
| sabine.boudjellal@outlook.fr|sabine123    |Logged in as sabine|
| zaineb.sammoud@gmail.com    |formation2023|Logged in as zeineb|
| bellaweidabir@gmail.com     |azerty123    |Logged in as Abir  |


