Narrative: 
If the user is logged in, they are a member of a workspace and are present on any page 
they must beable to navigate to the Notes Page  by clicking the Notes tab on the Navigation Bar.

Meta: @NavigateToNotesViaNotesTab @MagnumUser @USER_GUI01 @Admin @Admin @PowerUser @User @Viewer

Scenario: Enter Correct User Details And Password 
Given that a user is present on the login page
When the user authenticates successfully
And the user fills the memorable word options correctly
Then the user must be navigated to the home page

Scenario: Open Select Workspace Dropdown
Given the user is a member of several Workspaces
And the Workspace_Info_Button is visible
When the user clicks the Workspace_Info_Button
Then the Workspace_Dropdown_Menu must open

Scenario: Select Workspace Workspace Dropdown Menu
Given the Workspace_Title is visible in the Cases section
When the user clicks the Workspace_Title
Then the Page_Title must equal the Workspace_Title

Scenario: Navigate to Notes Page Via Notes Tab
Given the user is not present on the Notes_Page
And the Notes_Tab is visible
When the user clicks the Notes_Tab
Then they must be navigated to the Notes_Page