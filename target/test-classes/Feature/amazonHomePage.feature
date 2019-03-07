Feature: Deals

Scenario: Deals of the day section 
Given User is in homepage
When user scrols to deals  of the day  section 
Then user should be see products with seconds to end the sale time
And Can tap on arrow button to scrol all the products dispayed in that section

Scenario: Watch section 
Given User is in homepage
When user tap on watches icon in deals of the day section 
Then user should be naviagte to all watches including in deal and without deal

Scenario: All deals section
Given User is in homepage
When user tap on see all deals link 
Then user should be naviagte to page where all the deals are present



