Narrative: 
If the user is logged in, they have Administrator Capabilities and are present on the Home Page
they must beable to open the Start A New Workspace Dialog.

Meta: @CreateANewWorkspaceHomePage @MagnumAdmin @Admin @ADMIN_01_10 @ADMIN_05b

Scenario: Enter Correct User Details And Password 
Given that a user is present on the login page
When the user authenticates successfully
And the user fills the memorable word options correctly
Then the user must be navigated to the home page

Scenario: Navigate To Manage Users and Workspaces
Given that a user is present on the home page
And System_Admin button is visible
When the user clicks System_Admin button
Then the user must be navigated to Admin_User page on a new tab

Scenario: Navigate To Admin Workspaces Page
Given the Workspaces_Tab is visible
When the user clicks Workspaces_Tab
Then the user must be navigated to Admin_Workspaces

Scenario: Open Start A New Workspace Dialog Admin Workspace Page
Given that a user is present on the Admin_Workspaces page
And Create_A_New_Workspace button is visible
When the user clicks Create_A_New_Workspace button
Then Start_A_New_Workspace dialog must be visible

Scenario: Start A New Workspace Admin Workspace Page
Given the Start_A_New_Workspace dialog is open
And the Title_Textbox is visible
And the Description_Textbox is visible
When the user input Title
And Description
And clicks the Create_workspace button
Then the new Workspace must be visible on list