Narrative: 
If the user is logged in, they are a member of a workspace and are present on any page 
they must beable to navigate to the Search Page by clicking the Search Tab on the Navigation Bar.

Meta: @NavigateToSearchPageViaSearchTab @MagnumUser @USER_GUI01 @Admin @PowerUser @User @Viewer

GivenStories: stories/pages/navigate/ChooseWorkspace.story

Scenario: Navigate to Search Page Via Search Tab
Given the user is not present on the Search_Page
And the Search_Tab is visible
When the user clicks the Search_Tab
Then they must be navigated to the Search_Page