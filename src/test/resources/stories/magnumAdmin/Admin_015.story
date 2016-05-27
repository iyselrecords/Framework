Meta:
@magnumAdmin
@regression
@admin_015

Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality.
					 
Scenario: Verify Created Workspaces Are Seen In The Dropdown Workspace Menu And The Homepage
When user finds a '<doc>' and clicks on it
Then Preview should display first page of the document selected
When user clicks on Preview '<doc>'
Then a new tab opens with the preview '<doc>'

Examples:
testData.table