Meta:
@regression
@magnumAdmin
@adminPage
@admin_097

Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality
					 
Scenario: Verify Creating New Document Stamps
When user navigate to Admin page
And clicks on Document Stamps SideMenu
Then Stamps in workspace should display
When user click on Create a new stamp button
And enter Name
And Field Name
And select colour
And enter font size
And select page to display
And select corner to display stamp
And set x% and y% value to offset
And set stamp backgroud
And set rotation value
And reset to default value
And increase rotation value
And decrease rotation value
And select border
And display page number
And page number visible on export
Then preview should display current settings
And save changes

Examples:
testData.table