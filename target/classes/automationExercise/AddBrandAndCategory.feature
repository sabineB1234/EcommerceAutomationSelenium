Feature: Add Brand And Category

as a user I want to search a product

@AddBrandAndCategory

Scenario: Add Brand And Category 

Given I navigate to url to view categories and brands 
When I click on the Products button
And I verify user is navigate to all brands product page successfully
And I verify that "CATEGORY" are visible on left side bar
And I click on women brand name
And I click on any brand name
And I verify that user is navigated to brand page and brand products are displayed
And on left side bar, click on any other brand link
Then I verify that user is navigated to that brand page and can see products


