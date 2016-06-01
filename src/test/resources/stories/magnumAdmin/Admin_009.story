Meta:
@regression
@magnumAdmin
@admin_009

Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality
					 
Scenario: Verify Creating New Folder
When user clicks on New Folder button
Then the New Folder dialog is visible
When user enters '<folder_name>' and clicks Create Folder button
Then created folder should be visible on workspace

Examples:
testData.table