Meta:
@regression
@magnumAdmin
@adminPage
@admin_099a

Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality
					 
Scenario: Verify Adding New Metadata Column to Metadata Table
When user navigate to Admin page
And clicks Metadata on the SideMenu
Then Documents Types and Metadata tables should be visible
When user clicks on Add New Column button
And add Custom Field Label
And Custom Field Name
And clicks the Apply button
Then the new Metadata should added to Metadata table

Examples:
testData.table