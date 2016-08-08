Narrative: 
If the user is logged in, they are a member of a workspace and are present on any page 
they must be able to navigate to the Home page  by clicking the Home Icon on the Navigation Bar.

Meta: @NavigateToHomePageViaHomeIcon @MagnumUser @USER_GUI01 @Admin @PowerUser @User @Viewer

Scenario: Navigate To Home Page Via Home Icon
Given the user is not present on the Home Page
And the Home Tab is visible
When the user clicks the Home Tab
Then they must be navigated to the Home Page