Narrative: 
If the user is logged in, has Admin Capabilities, they are a member of a workspace and are present on any page 
they must beable to navigate to the Admin Page by clicking the Admin Tab on the Navigation Bar.

Meta: @NavigateToAdminPageViaAdminTab @MagnumAdmin @Admin

GivenStories: stories/pages/navigate/ChooseWorkspace.story

Scenario: Navigate To Admin Page Via Admin Tab
Given the user is not present on the Admin_Page
And the Admin_Tab is visible
When the user clicks the Admin_Tab
Then they must be navgated to the Admin_Page