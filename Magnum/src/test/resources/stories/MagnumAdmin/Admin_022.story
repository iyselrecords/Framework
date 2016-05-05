Meta:
@magnumAdmin
@regression
@admin_022

Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality.
					 
Scenario: Verify Renaming A Document
Given that a user initialize a browser
When user enters '<username>' and '<password>'
And click on the login button
Then user should access list of available workspaces/mirrors
When user search for '<workspace>' and navigate to it
Then they should be at user's workspace
When user finds a '<Document>' and clicks on it
Then Preview should display first page of the document selected
When user right click on '<Document>'
And select option '<Rename>'
Then New Name For TestDoc Dialog should be visible
When user enters a '<new_name>' and click Ok
Then Document should be rename to '<new_name>'
When user right click on '<new_name>'
And select option '<Rename>'
Then New Name For TestDoc Dialog should be visible
When user enters '<previous_name>' and click Ok
Then Document should be rename to '<previous_name>'

Examples:
testData.table