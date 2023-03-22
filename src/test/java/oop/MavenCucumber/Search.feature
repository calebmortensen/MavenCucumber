Feature: Search functionality

Background:
Given Navigate to application

Scenario: Search for a valid product

When a valid product is entered in Search field
And Search button selected
Then Valid product is displayed in search results

Scenario: Search for a non-existent product

When a non-existent product is entered in Search field
And Search button selected
Then message prompts user there is No Product Matching

Scenario: Search without providing any product

When a non-existent product is entered in Search field
And Search button selected
Then message prompts user there is No Product Matching