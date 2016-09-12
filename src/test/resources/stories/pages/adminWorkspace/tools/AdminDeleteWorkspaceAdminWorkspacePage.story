Narrative: 
If the user is logged in, they have Administrator Capabilities and are present on the Home Page
they must beable to open the Start A New Workspace Dialog.

Meta: @CreateANewWorkspaceHomePage @MagnumAdmin @Admin @Admin_06 @AdminWorkspace

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

Scenario: Find Workspace From Workspace List Admin Workspaces Page
Given the Find_Input box is visible
And Workspace is listed in Workspace_List
When the user enters Workspace_Title
Then Workspace is visible

Scenario: Select Displayed Workspace Admin Workspace Page
Given Filtered_Workspace is visible
When the user clicks the checkbox button
Then Workspace is selected

Scenario: Open Tools Dropdown Admin Workspace Page
Given the Tools_Dropdown_Button is visible
When user clicks the Tools_Dropdown_Button
Then the Dropdown should display Dropdown_Options

Scenario: Select Tools Archive Option
Given the Tools_Dropdown is open
When the user select Delete from dropdown options
Then Delete_Workspace_Dialog should be visible

Scenario: Admin Delete Workspace Admin Workspace Page
Given Delete Dialog is open
And Password_Input box is visible
And user has Admin_Capabilities
When user inputs password
And clicks Delete_Button
Then Selected_Workspace is deleted from Workspaces_List
