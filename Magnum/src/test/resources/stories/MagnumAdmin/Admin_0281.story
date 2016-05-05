Meta:
@magnumAdmin
@regression
@admin_0281

Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality.
					 
Scenario: Verify Moving A Document To Another Location
Given that a user initialize a browser
When user enters '<username>' and '<password>'
And click on the login button
Then user should access list of available workspaces/mirrors
When user search for '<workspace>' and navigate to it
Then they should be at user's workspace
When user finds a '<Document>' and clicks on it
Then Preview should display first page of the document selected
When user right click on '<Document>'
And select option '<Move>'
And select '<Destination>' folder and click Apply button
Then '<Document>' should be move to '<Destination>' folder

Examples:
testData.table