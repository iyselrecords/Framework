Narrative: 
If the user is logged in, they are a member of a workspace and are present on any page 
they must be able to navigate to the Documents page  by clicking the Documents Tab on the Navigation Bar.

Meta: @NavigateToDocumentsPageViaDocumentsTab @MagnumUser @USER_GUI01 @Admin @PowerUser @User @Viewer

GivenStories: stories/pages/navigate/ChooseWorkspace.story

Scenario: Navigate To Documents Page Via Documents Tab
Given the user is not present on the Documents_Page
And the Documents_Tab is visible
When the user clicks the Documents_Tab
Then they must be navigated to the Documents_Page