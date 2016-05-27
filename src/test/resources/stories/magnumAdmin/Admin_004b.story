Meta:
@magnumAdmin
@regression
@admin_004b

Narrative:
As a test team, we want to use the Behavioral Driven Development in running our regression suite
					 
Scenario: Verify adding new User and Workspaces
When user navigates to home page
Then user should be in home page
When user clicks on Manage Users and Workspaces button
Then a new tab navigates user to adminUsers page where users can be added and removed from workspaces
When user clicks on New User button
Then add a new user dialog open
When user enters '<email>'
And clicks Invite button
Then user should appear on the user list
When user clicks on the New Workspace button
And type in a '<title>' and '<description>'
And click Create Workspace button
Then workspace should appear in the Workspace dropdown

Examples:
testData.table
