Meta:
@regression
@chronology
@ch_005

Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality.
					 
Scenario: Verify Types Can Be Assign To Entry
When user clicks on Chronology Tab
And select Entry from the list
And select option from the Type dropdown
And saves changes
Then Type option should be assigned to Entry List

Examples:
chronology.table