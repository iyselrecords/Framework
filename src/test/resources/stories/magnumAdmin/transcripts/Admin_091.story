Meta:
@magnumAdmin
@regression
@admin_091
@transcript

Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality.
					 
Scenario: Verify Replace Transcript
When user navigates to Transcript page
And select '<testTranscripts2>' Transcript
And click on '<testTranscripts2>' Transcript
Then '<testTranscripts2>' should open in a new tab
When user click on Tools dropdown
And select Replace Transcript option
Then Replace Transcript Dailog should be visible
When user select '<ptfFile2>' Transcript
And click the Replace button
Then annotations, designations or video appear should be visible on new transcript

Examples:
transcript.table