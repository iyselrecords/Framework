Narrative:
If the user is logged in, present on any page and they are a member of several workspaces
they must be able to open the menu by clicking the Workspace Info Button on the Navigation Bar.

Meta: @OpenSelectWorkspaceDropdown @MagnumUser @USER_GUI03 @Admin @PowerUser @User @Viewer

Scenario: Open Select Workspace Dropdown
GivenStories: stories/pages/login/LoginPrecondition.story
Given the user is a member of several Workspaces
And the <Workspace_Info_Button> is visible
When the user clicks the <Workspace_Info_Button>
Then the <Workspace_Dropdown_Menu> must open

Examples: 
home.table