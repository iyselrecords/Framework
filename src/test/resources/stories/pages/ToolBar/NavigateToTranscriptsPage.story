Narrative: 
If the user is logged in, they are a member of a Workspace and are present on the Home Page
they must beable to navigate to the Transcripts Page by clicking the Transcripts shortcut.

GivenStories: stories/pages/Login/LoggingIn.story

Meta: @NavigateToTranscriptsShortcutViaShortcutOnHomePage @MagnumUser @USER_GUI02

Scenario: Navigate To Transcripts Via Shortcut On Home Page

Given the <Transcripts_Shortcut> is visible  
When the <User> clicks the <Transcripts_Shortcut> 
Then they must be navigated to the <Transcripts_Page>

