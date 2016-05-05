Meta:
@magnumAdmin
@regression
@admin_028

Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality.
					 
Scenario: Verify ReOrdering Document Within A Folder
Given that a user initialize a browser
When user enters '<username>' and '<password>'
And click on the login button
Then user should access list of available workspaces/mirrors
When user search for '<workspace>' and navigate to it
Then they should be at user's workspace
When user highlights a '<folder>' and right click to select '<Sort by>' option
Then Sort Order Dialog should be visible
When user selects '<Manual order>' radio button
And clicks Save Ordering button and OK's action
Then document list should be reorder on folder
When user right click on '<Document>'
And select option '<Reorder>'
Then Reorder Dialog should be visible
When user clicks 'Up' button
Then document is moved up a space
When user clicks 'Down' button
Then document is moved down a space
When user clicks 'Top' button
Then document is moved to the top of the folder
When user clicks 'Bottom' button
Then document is moved to the bottom of the folder
When user clicks 'Move 10 Up' button
Then document is moved up 10 spaces
When user clicks 'Move 10 Down' button
Then document is moved down 10 spaces
When user enters '<-x>' and clicks 'X Distance' button
Then document is moved up 'x' spaces
When user enters '<+x>' and clicks 'X Distance' button
Then document is moved down 'x' spaces
When user clicks on Apply Ordering button
And OK's alert
Then new order settings is save

Examples:
testData.table