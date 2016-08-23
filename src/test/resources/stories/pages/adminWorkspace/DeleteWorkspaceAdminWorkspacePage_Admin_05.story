Narrative: 
If the user is logged in, they have Administrator Capabilities and are present on the Home Page
they must beable to open the Start A New Workspace Dialog.

Meta: @CreateANewWorkspaceHomePage @MagnumAdmin @Admin @Admin_05

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

Scenario: Find Workspace From Workspace List
Given the Find_Input box is visible
And Workspace is listed in Workspace_List
When the user enters Workspace_Title
Then Workspace is visible

Scenario: Select Displayed Workspace 
Given Filtered_workspace is visible
When the user clicks the checkbox button
Then Workspace is selected

Scenario: Open Tools Dropdown
Given the Tools_Dropdown_Button is visible
When user clicks the Tools_Dropdown_Button
Then the Dropdown should display Dropdown_Options

Scenario: Select Tools Option From Dropdown
Given the Tools_Dropdown is open
When the user select Delete from dropdown options
Then Delete_Dialog should be visible

Scenario: Admin Delete Workspace
Given Delete Dialog is open
And Password_Input box is visible
And user has Admin_Capabilities
When user inputs password
And clicks Delete_Button
Then Selected_Workspace is deleted from Workspaces_List
