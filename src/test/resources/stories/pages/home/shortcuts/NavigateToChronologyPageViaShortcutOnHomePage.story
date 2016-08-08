Narrative: 
If the user is logged in, they are a member of a Workspace and are present on the Home Page
they must beable to navigate to the Chronology Page by clicking the Chronology Shortcut.

Meta: @NavigateToChronologyPageViaShortcutOnHomePage @MagnumUser @USER_GUI02 @Admin @Admin @PowerUser @User @Viewer

GivenStories: stories/pages/navigate/ChooseWorkspace.story

Scenario: Navigate To Chronology Page Via Shortcut On Home Page
GivenStories: stories/pages/navigate/NavigateToHomePageViaHomeIcon.story
Given the <Chronology_Shortcut> is visible
When the user clicks the <Chronology_Shortcut>
Then they must be navigated to the <Chronology_Page> via the <Chronology_Shortcut>

Examples:
testData.table