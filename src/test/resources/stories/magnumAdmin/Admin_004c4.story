Meta:
@regression
@magnumAdmin
@admin_004c4


Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality
					 
Scenario: Verify Authenticating User With Magnum
When user navigates to home page
And clicks on Manage Users and Workspaces button
Then a new tab navigates user to adminUsers page where users can be added and removed from workspaces
When admin selects a '<user>'
And clicks on view menu dropdown
And select 'authenticate with Magnum' option

Examples:
testData.table