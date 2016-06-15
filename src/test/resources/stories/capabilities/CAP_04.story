Meta:
@regression
@capabilities
@cap_04

Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality.
					 
Scenario: Verify New Roles is Added to List of Users
When user navigates to Admin page
And clicks on 'Roles' tab
Then Roles tab should open default roles displaying list of capabilities
Given user is present in Admin Role page
When user clicks on 'Users' tab
And click on the Role dropdown
Then new Role should be listed

Examples:
capability.table


Scenario: Verify Users Can Be Assisgned To New Role
Given user is present in Admin User page
When '<user>' is selected
And Edit option selected
And new Role is assigned
And new changes saved
Then new Role should be assigned to '<user>'

Examples:
capability.table