Meta:
@magnumAdmin
@regression
@admin_001

Narrative:
As a test team, we want to use the Behavioral Driven Development in running our regression suite
					 
Scenario:  Verify User Login to the Magnum Server
Given that a user initialize a browser
When user enters '<username>' and '<password>'
And click on the login button
Then user should access list of available workspaces/mirrors

Examples:
testData.table