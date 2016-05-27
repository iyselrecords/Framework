Meta:
@magnumAdmin
@regression
@admin_007

Narrative:
As a test team, we want to use the Behavioral Driven Development in running our regression suite
					 
Scenario: Verify Initial Upload of the documents from the Documents tab
When user clicks on upload button and clicks on Select Files
Then the windows open dialog box should open
When user selects '<file>' into the Upload dialogue box
And click on upload button
Then Documents uploaded should be available on the Documents page

Examples:
testData.table