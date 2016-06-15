Narrative: 
If the user is logged in, they have Administrator Capabilities and are present on the Home Page
they must beable to create a New Workspace.

GivenStories: RegressionTests/MagnumUser/Login/LoginStepOneEnterUserEmailOrUserNameAndPassword.story
RegressionTests/MagnumUser/Login/LoginStepTwoEnterCharachtersOfMemorableWord.story

Scenario: Create A New Workspace Home Page

Meta: @CreateANewWorkspaceHomePage 

Given the <User> is present on the <Home_Page>
And they have <Admin_Capabilities > 
And the <New_Workspace_Button> is visible
Then press the <New_Workspace_Button> 
Then verify the <Start_A_New_Workspace> dialog is open
And the <Title_Field> is visible
And the <Description_Field> is visible
And the <Create_Workspace_Button> is visible
Then input <Workspace_Title> into the <Title_Field> 
Then input <Description> in the <Description_Field> 
Then press the <Create_Workspace_Button> 
Then verify the <User> is present on the <Admin_Page>
 
      






