Meta:
@regression
@magnumAdmin
@adminPage
@admin_0951

Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality
					 
Scenario: Verify User Deleting New Role
When user navigate to Admin page
And clicks on Role SideMenu
When user role is selected
And user click on the 'x' icon
And confirm alert
Then user role should be deleted from role section

Examples:
testData.table