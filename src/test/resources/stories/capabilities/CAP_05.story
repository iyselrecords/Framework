Meta:
@regression
@capabilities
@cap_05

Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality.
					 
Scenario: Verify Deleting Role From Workspace
When user navigates to Admin page
And clicks on 'Roles' tab
Then Roles tab should open default roles displaying list of capabilities
When user select Role to Delete
Then role should be deleted from Workspace

Examples:
capability.table