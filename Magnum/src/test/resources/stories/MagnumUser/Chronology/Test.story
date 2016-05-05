Meta:
@magnumAdmin
@regression
@design

Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality.
					 
Scenario: Verify Created Workspaces Are Seen In The Dropdown Workspace Menu And The Homepage
Given that a user initialize a browser
When user enters '<username>' and '<password>'
And click on the login button
Then user should access list of available workspaces/mirrors
When user search for '<workspace>' and navigate to it
Then they should be at user's workspace
When user highlights a '<folder>' and right click to select '<Sort by>' option
Then Sort Order Dialog should be visible
When user selects '<Manual order>' radio button
And clicks Save Ordering button and OK's action
Then document list should be reorder on folder



Examples:
testData.table