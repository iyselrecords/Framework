Meta:
@regression
@capabilities
@cap_01_15

Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality.
					 
Scenario: Verify Roles In Workspace
When user navigates to Admin page
And clicks on 'Roles' tab
Then Roles tab should open default roles displaying list of capabilities

Examples:
capability.table

Scenario: Verify Creating New Role
Given user is present in Admin Role page
When user clicks on the New Role button
And enter Role's name
And set General capabilities
And set Documents capabilities
And set Transcripts capabilities
And set Chronology capabilities
And set Exporting capabilities
And save changes
Then new Role is created with ability to choose its capabilities

Examples:
capability.table

Scenario: Verify Editing New Role
Given user is present in Admin Role page
When user select Role to Edit
And edit user capabilities
And save changes
Then user should be able to toggle capabilities and save changes to the Role

Examples:
capability.table


Scenario: Verify New Roles is Added to List of Users
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

Scenario: Verify Deleting New Role
Given user is present in Admin User page
When user clicks on 'Roles' tab
And select Role to Delete
Then role should be deleted from Workspace

Examples:
capability.table
