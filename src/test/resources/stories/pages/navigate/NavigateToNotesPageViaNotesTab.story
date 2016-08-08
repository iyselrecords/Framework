Narrative: 
If the user is logged in, they are a member of a workspace and are present on any page 
they must beable to navigate to the Notes Page  by clicking the Notes tab on the Navigation Bar.

Meta: @NavigateToNotesViaNotesTab @MagnumUser @USER_GUI01 @Admin @Admin @PowerUser @User @Viewer

GivenStories: stories/pages/navigate/ChooseWorkspace.story

Scenario: Navigate to Notes Page Via Notes Tab
Given the user is not present on the Notes_Page
And the Notes_Tab is visible
When the user clicks the Notes_Tab
Then they must be navigated to the Notes_Page