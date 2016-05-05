Meta:
@magnumAdmin
@regression
@admin_011

Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality.
					 
Scenario: Verify Creating A New Folder In Another Folder And Upload Documents
Given that a user initialize a browser
When user enters '<username>' and '<password>'
And click on the login button
Then user should access list of available workspaces/mirrors
When user search for '<workspace>' and navigate to it
Then they should be at user's workspace
When user clicks on New Folder button
Then the New Folder dialog is visible
When user clicks on Change button
And select '<Destination>' folder and click Apply button
Then selected folder should be set to Destination folder
When user enters '<folder_name>' and clicks Create Folder button
Then created folder should be visible Destination folder on workspace

Examples:
testData.table