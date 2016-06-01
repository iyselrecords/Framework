Meta:
@regression
@magnumAdmin
@admin_010

Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality
					 
Scenario: Verify Uploading To A Folder
When user clicks on Upload button
And click the folder button next to Destination
And select a '<folder>'
And click Apply button
When user selects '<file>' into the Upload dialogue box
And click on upload button
Then Document should be uploaded to the selected destination folder


Examples:
testData.table