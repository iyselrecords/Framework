Meta:
@magnumAdmin
@regression
@admin_014

Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality.
					 
Scenario: Verify Documents Pages On Preview Using Next And Previous Button
When user finds a '<doc>' and clicks on it
Then Preview should display first page of the document selected
When user clicks the forward button
Then Preview should be in the Next page
When user clicks the backward button
Then Preview should be in the Previous page
When user clicks on list dropdown and select a '<listOption>'
Then Preview should be on '<listOption> page

Examples:
testData.table