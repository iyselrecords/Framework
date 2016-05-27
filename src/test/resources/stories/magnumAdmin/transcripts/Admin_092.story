Meta:
@magnumAdmin
@regression
@admin_092
@transcript

Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality.
					 
Scenario: Verify Video Timecodes
When user navigates to Transcript page
And select '<testTranscripts>' Transcript
And click on '<testTranscripts>' Transcript
Then '<testTranscripts>' should open in a new tab
When user click on Tools dropdown
And select Timecodes option
Then Video Timecode Correction Dailog should be visible
When user click on the Play button
Then video should play
When user clicks on Cancel button
Then Video Timecode Correction Dialog should exit

Examples:
transcript.table