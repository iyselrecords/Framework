Meta:
@regression
@magnumAdmin
@admin_033

Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality
					 
Scenario: Verify Page Rotation On Multiple Documents
When user find a <'docs'> selects and rightclick on it
And select <'Rotate'> option
Then Page Rotation Dialog should be visible
When user select from <'start_page'> to <'end_page'>
And set Rotation to <'rotate_degree'>
And click on apply button
Then pages within <'start_page'> to <'end_page'> should rotate to <'rotate_degree'>
When user reload the page
And finds <'docs'> and click on <'docs'>
And clicks to preiview <'start_page'>
And preview <next_six> pages

Examples:
testData.table