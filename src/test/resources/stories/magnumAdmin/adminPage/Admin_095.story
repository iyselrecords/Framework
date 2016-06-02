Meta:
@regression
@magnumAdmin
@adminPage
@admin_095

Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality
					 
Scenario: Verify Creating New Role
When user navigate to Admin page
And clicks on Role SideMenu
And clicks New Role button
Then New Role column input box is activated
When user enter a role name
And set General capabilities
And set Documents capabilities
And set Transcripts capabilities
And set Chronology capabilities
And set Exporting capabilities
And save changes
Then new Role is created with ability to choose its capabilities

Examples:
testData.table


Scenario: Verify Editing New Role
When user clicks on the Edit button
And edit user capabilities
And save changes
Then capabilities are updated to current changes

Examples:
testData.table