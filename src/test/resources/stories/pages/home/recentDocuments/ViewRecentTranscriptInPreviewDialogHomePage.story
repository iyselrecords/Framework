Narrative:
If the user is logged in, present on the Home page, and they are a member of a workspace which has recently uploaded Transcripts
they must beable to view Transcripts individually in the Preview by clicking on the title of a specific Transcript.  

Meta: @ViewRecentTranscriptInPreviewHomePage  @MagnumUser @USER_GUI04 @Admin @PowerUSer @User @Viewer

GivenStories: stories/pages/navigate/ChooseWorkspace.story

Scenario: Verify Recent Documents Section Loaded Home Page
GivenStories: stories/pages/navigate/NavigateToHomePageViaHomeIcon.story
Given the Recent_Documents section is visible on the Home Page
When the Recent_Documents section has loaded
Then the Target Document must be visible
And the Target Transcript must be visible

Scenario: View Recent Transcript In Preview Home Page
Given there is a <Transcript> visible in the Recent_Documents section
When the user clicks the <Transcript_Title>
Then the <Preview_Dialog> must open via the <Transcript_Title>
And the correct <Transcript> must be loaded in the <Preview_Dialog>
And the <Preview_Dialog_Title> must equal the <Transcript_Title>

Examples:
testData.table