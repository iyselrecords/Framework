Meta:
@magnumAdmin
@regression
@admin_004b

Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality
					 
Scenario: Verify adding new User
When user navigates to home page
And clicks on Manage Users and Workspaces button
Then a new tab navigates user to adminUsers page where users can be added and removed from workspaces
When user clicks on New User button
And enters '<email>'
And clicks Invite button
Then user should appear on the user list

Examples:
testData.table


Scenario: Verify adding new Workspaces
When user clicks on the New Workspace button
And type in a '<title>' and '<description>'
And click Create Workspace button
Then workspace should appear in the Workspace dropdown

Examples:
testData.table


Scenario:  Verify User Can Delete Workspace
When user select a '<workspace>'
And clicks on the view dropdown
And select 'delete' option
Then '<workspace>' is removed from the list and no longer accessible

Examples:
testData.table
