Meta:
@magnumAdmin
@regression
@admin_005

Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality.
					 
Scenario: Verify Created Workspaces Are Seen In The Dropdown Workspace Menu And The Homepage
Given that a user initialize a browser
When user enters '<username>' and '<password>'
And click on the login button
Then user should access list of available workspaces/mirrors


Examples:
testData.table