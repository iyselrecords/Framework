Meta:
@magnumAdmin
@regression
@admin_010

Narrative:
As a test team, we want to use the Behavioral Driven Development in running our regression suite
					 
Scenario: Verify Uploading To A Folder
Given that a user initialize a browser
When user enters '<username>' and '<password>'
And click on the login button
Then user should access list of available workspaces/mirrors
When user search for '<workspace>' and navigate to it
Then they should be at user's workspace
When user clicks on Upload button
And click the folder button next to Destination
And select an '<upload_folder>'
And click Apply button
When user selects '<file>' into the Upload dialogue box
And click on upload button
Then Document should be uploaded to the selected destination folder


Examples:
testData.table