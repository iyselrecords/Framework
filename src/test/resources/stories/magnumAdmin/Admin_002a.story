Meta:
@magnumAdmin
@regression
@admin_002a


Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality.
					 
Scenario: Verify New Workspace Dialog
When user navigates to home page
Then user should be in home page
When use clicks on the new workspace button
Then it should open the New Workspace Dialog box
When user clicks the x icon
Then user exit dialog box

Examples:
testData.table