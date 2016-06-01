Meta:
@magnumAdmin
@regression
@transcripts
@admin_093

Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality.
					 
Scenario: Verify Export With Timestamps
When user navigates to Transcript page
And select '<testTranscripts>' Transcript
And click on '<testTranscripts>' Transcript
Then '<testTranscripts>' should open in a new tab
When user click on Tools dropdown
And select Export With Timestamps option
Then Ready Dailog should be visible
When user clicks on Close button
Then Ready Dialog should exit

Examples:
transcript.table