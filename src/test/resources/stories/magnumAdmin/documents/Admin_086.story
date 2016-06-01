Meta:
@regression
@magnumAdmin
@documents
@admin_086

Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality
					 
Scenario: Verify Video Exports Displaying Files And Status To Export 
When user select Video Exports from Tools dropdown
Then Video Exports should be open in a new tab displaying files to export

Examples:
testData.table