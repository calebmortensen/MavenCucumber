@all
Feature: Search functionality

Background:
Given Navigate to application
#But
@search @validproduct @smoke @regression
Scenario: Search for a valid product
When a valid product is entered in Search field
And Search button selected
Then Valid product is displayed in search results

@search @nonexistentproduct @regression
Scenario: Search for a non-existent product
When a non-existent product is entered in Search field
And Search button selected
Then message prompts user there is No Product Matching

@search @noproduct @regression
Scenario: Search without providing any product
When a non-existent product is entered in Search field
And Search button selected
Then message prompts user there is No Product Matching