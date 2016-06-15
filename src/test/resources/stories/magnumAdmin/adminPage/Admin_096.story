Meta:
@regression
@magnumAdmin
@adminPage
@admin_096

Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality
					 
Scenario: Verify Importing Roles From Other Workspace
When user navigate to Admin page
And clicks on Role SideMenu
And select a workspace from the dropdown
And click Import
Then roles from the selected workspace should appear on this workspace

Examples:
testData.table