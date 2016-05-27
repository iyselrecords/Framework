Meta:
@magnumAdmin
@regression
@admin_090
@transcript

Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality.
					 
Scenario: Verify Importing PTF Annotations To Transcript
When user navigates to Transcript page
And select '<testTranscripts>' Transcript
And click on '<testTranscripts>' Transcript
Then '<testTranscripts>' should open in a new tab
When user click on Tools dropdown
And select Import Annotations option
Then user should be directed to Import PTF Annotation page
When user click on Choose File input and select '<ptfFile>' file
Then file should be attached to page
When user select clicks 'sign annotations as' dropdown and select '<signAs>' option
And clicks 'share annotations' dropdown and select '<shareAnnotation>' option
And click on Import button
Then Annotation should be imported to '<testTranscripts>'

Examples:
transcript.table