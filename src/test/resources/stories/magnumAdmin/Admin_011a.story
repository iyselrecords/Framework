Meta:
@magnumAdmin
@regression
@admin_011a

Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality.
				 
Scenario:  Verify Creating A New Folder
When user clicks on New Folder button
Then the New Folder dialog is visible
When user enters '<folder_name>' and clicks Create Folder button
Then created folder should be visible Destination folder on workspace

Examples:
testData.table

Scenario:  Verify Creating A New SubFolders In A Folder
When user clicks on New Folder button
Then the New Folder dialog is visible
When user clicks on Change button
And select '<Destination_Folder>' folder and click Apply button
Then selected folder should be set to Destination folder
When user enters '<sub_folder_name>' and clicks Create Folder button
Then created folder should be visible Destination folder on workspace

Examples:
testData.table