Meta:
@regression
@capabilities
@CAP_04

Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality.
					 
Scenario: Verify Inviting Users With New Role
When user navigates to Admin page
Then user should be in Admin page
When user clicks on 'Users' tab
Then user page should display 'Add Users' and 'Import User' Dialog
!-- When user enters '<email>' on Email input on the Add User Dialog
!-- And select '<newRole>' from Role dropdown
!-- And click the Invite button
!-- Then new user should have the 'newRole' role capability

Examples:
capability.table

Scenario: Verify Editing Existing User To New Role
When user selects '<email>' to edit
And Add FirstName and LastName
And Username and Signature
And select role to 'newRole'
And save
Then existing user should have the 'newRole' role capability

Examples:
capability.table