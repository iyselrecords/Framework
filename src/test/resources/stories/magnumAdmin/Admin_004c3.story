Meta:
@magnumAdmin
@regression
@admin_004c3
@now

Narrative:
As a test team, we want to use the Behavioral Driven Development in running our regression suite
					 
Scenario:  Verify Enabling Memorable Word
When user navigates to home page
Then user should be in home page
When user clicks on Manage Users and Workspaces button
Then a new tab navigates user to adminUsers page where users can be added and removed from workspaces
When admin selects a '<user>'
And clicks on '<user>' view menu dropdown
And select '<enable memorable word>' option

Examples:
testData.table