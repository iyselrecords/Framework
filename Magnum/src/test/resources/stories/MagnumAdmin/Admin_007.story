Meta:
@magnumAdmin
@regression
@admin_007

Narrative:
As a test team, we want to use the Behavioral Driven Development in running our regression suite
					 
Scenario: Verify Initial Upload of the documents from the Documents tab
Given that a user initialize a browser
When user enters '<username>' and '<password>'
And click on the login button
Then user should access list of available workspaces/mirrors
When user search for '<workspace>' and navigate to it
Then they should be at user's workspace
When user clicks on upload button and clicks on Select Files
Then the windows open dialog box should open
When user selects '<file>' into the Upload dialogue box
And click on upload button
Then Documents uploaded should be available on the Documents page

Examples:
testData.table