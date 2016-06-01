Meta:
@regression
@magnumAdmin
@admin_007

Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality
					 
Scenario: Verify Initial Upload of the documents from the Documents tab
When user clicks on upload button and clicks on Select Files
Then the windows open dialog box should open
When user selects '<file>' into the Upload dialogue box
And click on upload button
Then Documents uploaded should be available on the Documents page

Examples:
testData.table