Meta:
@magnumAdmin
@regression
@admin_021

Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality.
					 
Scenario: Verify To Manually Enter Or Amend The Properties Of A Single Document
When user finds a '<doc>' and clicks on it
Then Preview should display first page of the document selected
When user right click on '<Document>'
And select option '<properties>'


Examples:
testData.table