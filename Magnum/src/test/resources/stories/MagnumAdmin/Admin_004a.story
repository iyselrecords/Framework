Meta:
@magnumAdmin
@regression
@admin_004a

Narrative:
As a test team, we want to use the Behavioral Driven Development in running our regression suite
					 
Scenario: Managing Users and Workspaces
Given that a user initialize a browser
When user enters '<username>' and '<password>'
And click on the login button
Then user should access list of available workspaces/mirrors
When user clicks on Manage Users and Workspaces button
Then a new tab navigates user to adminUsers page where users can be added and removed from workspaces

Examples:
testData.table
