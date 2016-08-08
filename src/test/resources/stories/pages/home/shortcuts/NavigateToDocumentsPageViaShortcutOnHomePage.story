Narrative: 
If the user is logged in, they are a member of a workspace and are present on the Home Page
they must beable to navigate to the Documents Page by clicking the Documents Shortcut.

Meta: @NavigateToDocumentsViaShortcutFromHomePage @MagnumUser @USER_GUI02 @Admin @PowerUser @User @Viewer

GivenStories: stories/pages/navigate/ChooseWorkspace.story

Scenario: Navigate To Documents Page Via Shortcut From Home Page
GivenStories: stories/pages/navigate/NavigateToHomePageViaHomeIcon.story
Given the <Documents_Shortcut> is visible
When the user clicks the <Documents_Shortcut>
Then they must be navigated to the <Documents_Page> via the <Documents_Shortcut>

Examples:
testData.table