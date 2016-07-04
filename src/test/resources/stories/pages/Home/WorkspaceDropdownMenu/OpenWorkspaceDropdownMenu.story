Narrative:
If the user is logged in, present on any page and they are a member of several workspaces
they must be able to open the menu by clicking the Workspace Info Button on the Navigation Bar.

GivenStories: stories/Login/LoggingIn.story

Meta: @OpenSelectWorkspaceDropdown @MagnumUser @USER_GUI03 

Scenario: Open Select Workspace Dropdown    
  
Given the <User> is logged in
And they are a member of several <Workspaces>
And the <Workspace_Info_Button> is visible
When the <User> clicks the <Workspace_Info_Button>
Then the <Workspace_Dropdown_Menu> must open 

  




