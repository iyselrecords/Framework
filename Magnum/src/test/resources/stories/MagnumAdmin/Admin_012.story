Meta:
@magnumAdmin
@regression
@admin_012

Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality.
					 
Scenario: Verify Folder Tree Structure Is Expanded 
Given that a user initialize a browser
When user enters '<username>' and '<password>'
And click on the login button
Then user should access list of available workspaces/mirrors
When user search for '<workspace>' and navigate to it
Then they should be at user's workspace
When user clicks on '<folder_name>'
Then the '<folder_name>' should expand
When click on '<folder_name>' again
Then '<folder_name>' should collapse

Examples:
testData.table