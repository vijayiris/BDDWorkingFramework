Feature: Launching Google Home Page 


Background: Common Steps for all testcases
Given User Hit Google Url 
Then Google HomePage is Open
Then User Verify Google  Home Page Header


@smoke
Scenario: Verify Google Home Page
Then User Close the browser

@smoke
Scenario: Verify Google search Feature
Then User Enter Text in Search fields
Then User hit submit button
Then User Close the browser

