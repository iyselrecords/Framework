Meta:
@magnumAdmin
@regression
@admin_006

Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality.
					 
Scenario: Verify User Can Access All Tabs
Given that a user initialize a browser
When user enters '<username>' and '<password>'
And click on the login button
Then user should access list of available workspaces/mirrors
When user clicks on Documents Tab
Then they should be on Documents page
When user clicks on Transcripts Tab
Then they should be on Transcripts page
When user clicks on Chronology Tab
Then they should be on Chronology page
When user clicks on Notes Tab
Then they should be on Notes page
When user clicks on Old Search Tab
Then they should be on Old Search page
When user clicks on Search Tab
Then they should be on Search page
When user clicks on Admin Tab
Then they should be on Admin page

Examples:
testData.table