Meta:
@regression
@magnumAdmin
@documents
@admin_084

Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality
					 
Scenario: Verify Upload Manager Displaying Recent Uploads 
When user select Upload Manager from Tools dropdown
Then Upload Manager should be open in a new tab displaying all recent uploads

Examples:
testData.table