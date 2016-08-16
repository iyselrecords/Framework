Narrative:
If the user is logged in, present on any page, they are a member of several Workspaces and the Workspace Dropdown Menu is open
they must be able to select a Workspace from the Workspace Dropdown Menu

Meta: @SelectWorkspaceWorkspaceDropdownMenu @MagnumUser @USER_GUI03 @Admin @PowerUser @User @Viewer

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