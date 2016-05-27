Meta:
@magnumAdmin
@regression
@admin_012

Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality.
					 
Scenario: Verify Folder Tree Structure Is Expanded
When user clicks on '<folder_name>'
Then the '<folder_name>' should expand
When click on '<folder_name>' again
Then '<folder_name>' should collapse

Examples:
testData.table