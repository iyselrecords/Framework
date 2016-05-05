Meta:
@magnumAdmin
@regression
@admin_004c1

Narrative:
As a test team, we want to use the Behavioral Driven Development in running our regression suite
					 
Scenario:  Verify user account enable/disable
Given that a user initialize a browser
When user enters '<username>' and '<password>'
And click on the login button
Then user should access list of available workspaces/mirrors
When user clicks on Manage Users and Workspaces button
Then a new tab navigates user to adminUsers page where users can be added and removed from workspaces
When admin selects a '<user>'
And clicks on '<user>' view menu dropdown
And select '<disable account>' option

Examples:
testData.table