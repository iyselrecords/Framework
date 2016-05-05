Meta:
@magnumAdmin
@regression
@admin_009

Narrative:
As a test team, we want to use the Behavioral Driven Development in running our regression suite
					 
Scenario: Verify Creating New Folder
Given that a user initialize a browser
When user enters '<username>' and '<password>'
And click on the login button
Then user should access list of available workspaces/mirrors
When user search for '<workspace>' and navigate to it
Then they should be at user's workspace
When user clicks on New Folder button
Then the New Folder dialog is visible
When user enters '<folder_name>' and clicks Create Folder button
Then created folder should be visible on workspace

Examples:
testData.table