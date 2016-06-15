Narrative: 
If the user is logged in, present on any page and they are a member of several workspaces
they must be able to select a specific workspace from the Workspace Dropdown Menu on the task bar.

GivenStories: RegressionTests/MagnumUser/Login/LoginStepOneEnterUserEmailOrUserNameAndPassword.story
RegressionTests/MagnumUser/Login/LoginStepTwoEnterCharachtersOfMemorableWord.story

Scenario: Select Workspace Workspace Title Home Page  
  
Meta: @SelectWorkspaceViaWorkspaceTitle @MagnumUser @USER_GUI03   
  
Given the <User> is logged in
And they are a member of several Workspaces
And the <Workspace_Info_Button> is visible
Then click the <Workspace_Info_Button>
Then verify the <Workspace_Dropdown_Menu> is open 
And the <Target_Workspace_Title> is visible in the <Workspace_Dropdown_Menu>
Then click <Target_Workspace_Title> 
Then verify the <Workspace_Dropdown_Menu> is closed
When the page has loaded 
Then verify the <Page_Title> equals the <Target_Workspace_Title>
  




