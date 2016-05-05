Meta:
@magnumAdmin
@regression
@admin_002a

Narrative:
As a test team, we want to use the Behavioral Driven Development in running our regression suite
					 
Scenario: Verify New Workspace Dialog
Given that a user initialize a browser
When user enters '<username>' and '<password>'
And click on the login button
Then user should access list of available workspaces/mirrors
When use clicks on the new workspace button
Then it should open the New Workspace Dialog box
When user clicks the x icon
Then user exit dialog box

Examples:
testData.table