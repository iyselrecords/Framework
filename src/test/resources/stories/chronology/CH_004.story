Meta:
@regression
@chronology
@ch_004

Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality.
					 
Scenario: Verify Adding Tag to Entry List
When user clicks on Chronology Tab
And select Entry from the list
And click on the tag button
Then the 'Select Document Tags' Dialog should be visible
When user select '<tag>' and apply
And saves changes
Then Tags should be added in the 'Tags' section of the entry window

Examples:
chronology.table