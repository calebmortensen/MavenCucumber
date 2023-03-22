Feature: Search functionality

Scenario: Search for a valid product
Given Navigate to application
When a valid product is entered in Search field
And Search button selected
Then Valid product is displayed in search results

Scenario: Search for a non-existent product
Given Navigate to application
When a non-existent product is entered in Search field
And Search button selected
Then message prompts user there is No Product Matching

Scenario: Search without providing any product
Given Navigate to application
When a non-existent product is entered in Search field
And Search button selected
Then message prompts user there is No Product Matching