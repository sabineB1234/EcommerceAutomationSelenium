@ContactUS

Feature: Add review on product 
as a user I want to contact costumer service 

@ValidContactUs

Scenario: contact costumer service
Given I navigate to URL to contact consumer service
When I click on contact us button
And I verify user is navigate to CUSTOMER SERVICE - CONTACT US page successfully
And I verify that "CUSTOMER SERVICE - CONTACT US" is visible CONTACT US
And I verify that subject Heading "SEND A MESSAGE" is visible on contact us page 
And I select Subject Heading "Customer service"
And I verify that email address "Email address" is visible on CONTACT US page
And I enter the correct email address " sabine.boudjellal@outlook.fr" on contact us  page
And I enter the text order reference "M12345"
And I select attach file "/Users/nadine/Desktop/téléchargement.png "
And I enter the text message "Your message has been successfully sent to our team."
And I click on send button on contact us page 
And I verify success message "Your message has been successfully sent to our team." thank you
And I click on the home button 
Then I verify that home page is visible successfully 
