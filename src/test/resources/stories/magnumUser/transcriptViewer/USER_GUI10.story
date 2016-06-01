Meta:
@regression
@magnumUser
@transcript
@user_GUI10

Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality.
					 
Scenario: Verify Zoom Button Are Working
When user navigates to Transcript page
When user select '<testTranscripts>' Transcript
Then '<testTranscripts>' Transcript is displayed on preview pane
When user clicks on '<testTranscripts>' Transcript
Then '<testTranscripts>' Transcript should open in a new tab
When user clicks on (+) button
Then Transcript text should be larger
When user clicks on (-) button
Then Transcript text should be smaller

Examples:
transcript.table