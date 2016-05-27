Meta:
@magnumAdmi
@regressio
@admin_004b1

Narrative:
As a test team, we want to use the Behavioral Driven Development in running our regression suite
					 
Scenario:  Verify User Can Delete Workspace
When user navigates to home page
Then user should be in home page
When user clicks on Manage Users and Workspaces button
Then a new tab navigates user to adminUsers page where users can be added and removed from workspaces
When user select a '<workspace>'
And clicks on the view dropdown
And select '<delete>' option
Then '<workspace>' is removed from the list and no longer accessible

Examples:
testData.table
