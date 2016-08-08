Narrative: 
If the user is logged in, they are a member of a Workspace and are present on the Home Page
they must beable to navigate to the Transcripts Page by clicking the Transcripts shortcut.

Meta: @NavigateToTranscriptsViaShortcutOnHomePage @MagnumUser @USER_GUI02 @Admin @PowerUser @User @Viewer

GivenStories: stories/pages/navigate/ChooseWorkspace.story

Scenario: Navigate To Transcripts Via Shortcut On Home Page
GivenStories: stories/pages/navigate/NavigateToHomePageViaHomeIcon.story
Given the <Transcripts_Shortcut> is visible
When the user clicks the <Transcripts_Shortcut>
Then they must be navigated to the <Transcripts_Page> via the <Transcripts_Shortcut>

Examples:
testData.table