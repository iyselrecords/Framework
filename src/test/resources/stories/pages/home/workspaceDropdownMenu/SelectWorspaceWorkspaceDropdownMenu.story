Narrative:
If the user is logged in, present on any page, they are a member of several Workspaces and the Workspace Dropdown Menu is open
they must be able to select a Workspace from the Workspace Dropdown Menu

Meta: @SelectWorkspaceWorkspaceDropdownMenu @MagnumUser @USER_GUI03 @Admin @PowerUser @User @Viewer

GivenStories: stories/pages/home/workspaceDropdownMenu/OpenWorkspaceDropdownMenu.story

Scenario: Select Workspace Workspace Dropdown Menu
Given the Workspace_Title is visible in the Cases section
When the user clicks the Workspace_Title
Then the Page_Title must equal the Workspace_Title