Meta:
@regression
@magnumAdmin
@admin_011

Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality
					 

Scenario: Verify Creating A New Folder In Another Folder And Upload Documents
When user clicks on New Folder button
Then the New Folder dialog is visible
When user clicks on Change button
And select '<Destination>' folder and click Apply button
Then selected folder should be set to Destination folder
When user enters '<folder_name>' and clicks Create Folder button
Then created folder should be visible Destination folder on workspace

Examples:
testData.table