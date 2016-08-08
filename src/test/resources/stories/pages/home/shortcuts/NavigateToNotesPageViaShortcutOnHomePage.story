Narrative: 
If the user is logged in, they are a member of a Workspace and are present on the Home Page
they must beable to navigate to the Notes Page by clicking the Notes Shortcut.

Meta: @NavigateToNotesViaShortcut @MagnumUser @USER_GUI02 @Admin @PowerUser @User @Viewer

GivenStories: stories/pages/navigate/ChooseWorkspace.story

Scenario: Navigate To Notes Page Via Shortcut On Home Page
GivenStories: stories/pages/navigate/NavigateToHomePageViaHomeIcon.story
Given the <Notes_Shortcut> is visible
When the user clicks the <Notes_Shortcut>
Then they must be navigated to the <Notes_Page> via the <Notes_Shortcut>

Examples:
testData.table