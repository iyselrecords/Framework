Narrative: 
If the user is logged in, they have Administrator Capabilities and are present on the Home Page
they must beable to create a New Workspace.

Meta: @CreateANewWorkspaceHomePage @MagnumAdmin @Admin

Scenario: Enter Correct User Details And Password 
Given that a user is present on the login page
When the user authenticates successfully
And the user fills the memorable word options correctly
Then the user must be navigated to the home page

Scenario: Open Start A NewWorkspace Dialog HomePage
Given the user has Admin_Capabilities
And the New_Workspace_Button is visible on the Home_Page
When the user clicks the New_Workspace_Button
Then the Start_A_New_Workspace_Dialog must open

Scenario: Create A New Workspace Home Page
Given the Start_A_New_Workspace_Dialog is open
And the Title_Field is visible
And the Description_Field is visible
And the Create_Workspace_Button is visible
When the user inputs Workspace_Title into the Title_Field
And the Description in the Description_Field
And clicks the Create_Workspace_Button
Then the New_Workspace must be created
And the user must be navigated to the Admin_Page