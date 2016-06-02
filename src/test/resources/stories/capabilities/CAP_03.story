Meta:
@regression
@capabilities
@cap_03

Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality.
					 
Scenario: Verify Editing New Role
When user navigates to Admin page
Then user should be in Admin page
When user clicks on 'Roles' tab
Then Roles tab should open default roles displaying list of capabilities
When user clicks on the Edit button
And edit user capabilities
And save changes
Then user should be able to toggle capabilities and save changes to the Role

Examples:
capability.table