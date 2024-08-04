@purchaseorder
Feature: Download Invoice after purchase order
as a user I want to purchase order 

Background: 
Given I navigate to url to purchase order
And I Verify that the home page is visible successfully

@addproducstocart
Scenario: add products to cart 
Given I Click on Sign up login button
When I enter correct email "sabine.boudjellal@outlook.fr"
And I enter correct password "sabine123"
And I click on the login Button 
And I verify that I m login as "Logged in as sabine"
And I Click on the Cart button
And I Verify that cart page is displayed
And I Click on Proceed To Checkout
And I Verify Address Details "YOUR DELIVERY ADDRESS Mrs. sabine bou gennevillier gennevilliers genneviliers 92310 Canada 0753472532"
And I verify Review Your Order "Review Your Order"
And I Enter description in comment text area " If you would like to add a comment about your order, please write it in the field below.  "
And I click on the place order button
And I verify that I m on the checkout page
And I enter payment details:
        | Field           | Value            |
        | Nameoncard      | John Doe         |
        | Cardnumber      | 1234567890123456 |
        | CVC             |       123        |
        | ExpirationMonth |       12         |
        | ExpirationYear  |       25         |

And I click on pay and confirm order button
And I Verify success message "Congratulations! Your order has been confirmed!"
And I Click on the Download Invoice button
Then I verify invoice is downloaded successfully
And I Click on Continues buttons

@createaccount
Scenario: User creates a new account
Given I Click on Sign up login button
When I fill name  "sabine" 
And I fill email address "sabine.boudjellal01@outlook.fr"
And i Click on the Sign up button
And I Verify that enter information  "ENTER ACCOUNT INFORMATION" is visible
And I verify  User is on the registration page
And I select User title Mrs
And I fill User fills in the following details:
      | Field           | Value                         |
      | Name            | boudj                         |
      | Password        | sabine123                     |
And I select day of birth "23" 
And I select month of birth "January"
And I select year of birth "2000"
And I select the sign up for our newsletter checkbox
And I select the receive special offers from our partners checkbox
And I verify that the "Sign up for our newsletter" checkbox checked
And I verify that the "Receive special offers from our partners" checkbox 
And I verify that I m on the registration page 
And I fill the registration form with the following details:
      | Field           | Value          |
      | FirstName       | sabine         |
      | LastName        | boudj          |
      | Company         | akka           |
      | Address         | gennevilliers  |
      | Address2        | paris          |
      | State           | ile de france  |
      | City            | paris          |  
      | Zipcode         | 92210          |
      | MobileNumber    |0753472532      |
And I select the country "Canada"
And I click on the Create Account button
And I Verify account created "ACCOUNT CREATED!" is visible
And I Click on the Continue buttons
And I Verify "Logged in as sabineboudj" at top
And I Click on the Delete Account button
And I Verify the message "ACCOUNT DELETED!" is visible
Then I click on Continues button
