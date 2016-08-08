Narrative:  
If the user is logged in, they are a member of a workspace and are present on any page 
they must beable to navigate to the Chronology Page  by clicking the Chronology Tab on the Navigation Bar.

Meta: @NavigateToChronologyPageViaTheChronologyTab  @MagnumUser @USER_GUI01 @Admin @PowerUser @User @Viewer

GivenStories: stories/pages/navigate/ChooseWorkspace.story

Scenario: Navigate To Chronology Page Via The Chronology Tab
Given the user is not present on the Chronology_Page
And the Chronology_Tab is visible
When the user clicks the Chronology_Tab
Then they must be navigated to the Chronology_Page