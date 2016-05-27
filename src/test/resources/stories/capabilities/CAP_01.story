Meta:
@regression
@capabilities
@CAP_01

Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality.
					 
Scenario: Verify Roles In Workspace 
When user navigates to Admin page
Then user should be in Admin page
When user clicks on 'Roles' tab
Then Roles tab should open default roles displaying list of capabilities

Examples:
capability.table