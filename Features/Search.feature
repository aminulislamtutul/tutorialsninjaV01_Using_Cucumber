Feature: Search Feature
Description: This feature will test a search functionality.

Scenario: User searches for a valid product
Given User opens the application
When User enters valid product "HP" into Search box fields
And User clicks on Search button
Then User should get valid product displayed in search results

Scenario: User searches for an invalid product
Given User opens the application
When User enters invalid product "Honda" into Search box fields
And User clicks on Search button
Then User should get a message about no product matching
