Meta:
@regression
@filter

Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality.
					 
Scenario: Verify Filtering Entries Without Description
When user clicks 'Item without description' checkbox
Then only entries without description are visible

Examples:
chronology.table