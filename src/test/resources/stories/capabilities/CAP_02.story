Meta:
@regression
@capabilities
@cap_02

Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality.
					 
Scenario: Verify Creating New Role
When user navigates to Admin page
Then user should be in Admin page
When user clicks on 'Roles' tab
Then Roles tab should open default roles displaying list of capabilities
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