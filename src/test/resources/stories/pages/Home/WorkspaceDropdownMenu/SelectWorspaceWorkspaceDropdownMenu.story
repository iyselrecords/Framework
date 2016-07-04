Narrative:
If the user is logged in, present on any page, they are a member of several Workspaces and the Workspace Dropdown Menu is open
they must be able to select a Workspace from the Workspace Dropdown Menu

GivenStories: stories/Login/LoggingIn.story
              stories/MagnumUser/Home/OpenWorkspaceDropdownMenu.story

Meta: @SelectWorkspaceWorkspaceDropdownMenu @MagnumUser @USER_GUI03

Scenario: Select Workspace Workspace Dropdown Menu     
  
Given the <Workspace_Title> is visible
When the <User> clicks the <Workspace_Title>
Then the <Page_Title> must equal the <Workspace_Title>
