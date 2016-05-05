Meta:
@magnumAdmin
@regression
@admin_021a

Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality.
					 
Scenario: Verify To Allow And Disabled Notes
Given that a user initialize a browser
When user enters '<username>' and '<password>'
And click on the login button
Then user should access list of available workspaces/mirrors
When user search for '<workspace>' and navigate to it
Then they should be at user's workspace
When user finds a '<Document>' and clicks on it
Then Preview should display first page of the document selected
When user right click on '<Document>'
And select option '<properties>'
Then Properties Dialog should be visible
When user clicks New notes dropdown and select '<Closed to new notes>' option
And click '<properties>' Apply button
And user clicks on Preview '<Document>'
Then a new tab opens with the preview '<Document>'
And user should see a 'Stop' icon in the top corner of every page
When create an annotation by highlighting multiple text
Then annotation dialog wouldn't be activated
When user navigates back to previous window
When user right click on '<Document>'
And select option '<properties>'
Then Properties Dialog should be visible
When clicks New notes dropdown and select '<Allowed>' option
And click '<properties>' Apply button
And user clicks on Preview '<Document>' again
Then a new tab opens with the preview '<Document>'
And user should be able to highlight notes and annotation will be activated.


Examples:
testData.table