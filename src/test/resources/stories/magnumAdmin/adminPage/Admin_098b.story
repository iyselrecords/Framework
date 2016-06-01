Meta:
@regression
@magnumAdmin
@adminPage
@admin_098b

Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality
					 
Scenario: Verify Editing Document Type
When user navigate to Admin page
And clicks Metadata on the SideMenu
Then Documents Types and Metadata tables should be visible
When user clicks on the New Document Type button
Then the New Document Type Dialog should be visible
When user enters '<newDocType>' details and clicks the Apply button
Then new Document Type should be added to the Document Type table
When user selects a '<docType>' and clicks on the Edit button
Then Document Types Dialog should be visible
When user enters '<newDocType>' details and clicks the Apply button
Then new Document Type should be added to the Document Type table
When user selects a '<docType>' and clicks on the X button
Then a prompt should be visible with message Really delete '<docType>'
When user clicks OK to confirm
Then Document TYpe is removed from both Document Type table and Magnum

Examples:
testData.table