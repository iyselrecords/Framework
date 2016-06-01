Meta:
@regression
@magnumUser
@transcript
@user_FUNCTr01

Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality.
					 
Scenario: Verify Displaying List Of Search words
When user navigates to Transcript page
When user select '<testTranscripts>' Transcript
Then '<testTranscripts>' Transcript is displayed on preview pane
When user clicks on '<testTranscripts>' Transcript
Then '<testTranscripts>' Transcript should open in a new tab
When user clicks on the index dropdown
Then dropdown should display list of search words

Examples:
transcript.table

Scenario: Verify Inputing Text To Filter
When user input <'search term>' on the input box
And user clicks on each page number
Then user should be taken to displayed result

Examples:
transcript.table