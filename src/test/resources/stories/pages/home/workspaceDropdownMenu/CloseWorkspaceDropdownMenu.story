Narrative: 
If the user is logged in, present on any page and they are a member of several workspaces where the Workspace Dropdown Menu is open
they must be able to close the menu by clicking the Workspace Info Button on the Navigation Bar.

Meta: @CloseWorkspaceDropdown @MagnumUser @USER_GUI03 @Admin @PowerUser @User @Viewer

GivenStories: stories/pages/home/workspaceDropdownMenu/OpenWorkspaceDropdownMenu.story

Scenario: Close Workspace Dropdown
Given the <Workspace_Dropdown_Menu> is open
When the user clicks the <Workspace_Info_Button>
Then the <Workspace_Dropdown_Menu> must close

Examples:
home.table