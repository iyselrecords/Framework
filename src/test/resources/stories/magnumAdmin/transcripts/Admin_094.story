Meta:
@magnumAdmin
@regression
@admin_094
@transcript

Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality.
					 
Scenario: Verify Uploading a Transcript That Works With Video
When user navigates to Transcript page
And select '<testTranscripts>' Transcript
And click on '<testTranscripts>' Transcript
Then '<testTranscripts>' should open in a new tab
When user click on Tools dropdown
And select Upload Video option
Then Attach Video Dailog should be visible
When user select 'Use MDB sync file' option
And select '<mdb>' and '<videoFile>' files
And click the Upload button
Then Video should be attach to Transcript

Examples:
transcript.table