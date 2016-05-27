Meta:
@magnumAdmin
@regression
@admin_004c42
@now

Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality.
					 
Scenario:  Verify Authenticating User With LDAP
When user navigates to home page
Then user should be in home page
When user clicks on Manage Users and Workspaces button
Then a new tab navigates user to adminUsers page where users can be added and removed from workspaces
When admin selects a '<user>'
And clicks on '<user>' view menu dropdown
And select '<authenticate with LDAP>' option

Examples:
testData.table