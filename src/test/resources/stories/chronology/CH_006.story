Meta:
@magnumAdmin
@regression
@ch_006


Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality


Scenario: Verify Adding Custom Type On Chronology
When user clicks on Chronology Tab
Then Chronology page opens correctly
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