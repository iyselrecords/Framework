Meta:
@magnumAdmin
@regression
@admin_004b1

Narrative:
As a test team, we want to use the Behavioral Driven Development in running our regression suite
					 
Scenario:  Verify User Can Delete Workspace
Given that a user initialize a browser
When user enters '<username>' and '<password>'
And click on the login button
Then user should access list of available workspaces/mirrors
When user clicks on Manage Users and Workspaces button
Then a new tab navigates user to adminUsers page where users can be added and removed from workspaces
When user select a '<workspace>'
And clicks on the view dropdown
And select '<delete>' option
Then '<workspace>' is removed from the list and no longer accessible

Examples:
testData.table
