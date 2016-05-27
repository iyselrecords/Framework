Meta:
@magnumAdmin
@regression
@ch_01_06


Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality.
					 
Scenario: Navigate To Chronology Page
When user clicks on Chronology Tab
Then Chronology page opens correctly

Examples:
testData.table

Scenario: Verify Creating New Entry List In Chronology
When user clicks on New Entry button
Then a new blank entry will appear in the list

Examples:
chronology.table

Scenario: Verify Adding Tag to Entry List
When user select Entry from the list
And click on the tag button
Then the 'Select Document Tags' Dialog should be visible
When user select '<tag>' and apply
And saves changes
Then Tags should be added in the 'Tags' section of the entry window

Examples:
chronology.table

Scenario: Verify Types Can Be Assign To Entry
When user select Entry from the list
And select option from the Type dropdown
And saves changes
Then Type option should be assigned to Entry List

Examples:
chronology.table

Scenario: Verify Adding Custom Type On Chronology
When user clicks Custom Type button
Then the Custom Types Dialog should be visible
When user clicks on the Add button
Then the Save A Custom Type Dialog should be visible
When user enters new Custom Type
And clicks Ok
Then Custom Type should be added on Custom Types Dialog
When user select Entry from the list
And select Custom Type option
And saves changes
Then Custom Type option should be assigned to Entry List

Examples:
chronology.table