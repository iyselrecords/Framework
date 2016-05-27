Meta:
@regression
@magnumAdmin
@transcript
@user_GUI11

Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality.
					 
Scenario: Verify Transcript dropdown works
When user navigates to Transcript page
When user select '<testTranscripts>' Transcript
Then '<testTranscripts>' Transcript is displayed on preview pane
When user clicks on '<testTranscripts>' Transcript
Then '<testTranscripts>' Transcript should open in a new tab
When user clicks on dropdown
Then list of Transcript on the workspace is displayed

Examples:
transcript.table