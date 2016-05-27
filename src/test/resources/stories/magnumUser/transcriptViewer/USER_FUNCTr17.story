Meta:
@magnumAdmin
@regression
@transcript
@user_FUNCTr17

Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality.
					 
Scenario: Verify Importing PTF Annotations To Transcript
When user navigates to Transcript page
When user select '<testTranscripts>' Transcript
Then '<testTranscripts>' Transcript is displayed on preview pane
When user clicks on '<testTranscripts>' Transcript
Then '<testTranscripts>' Transcript should open in a new tab


Examples:
transcript.table