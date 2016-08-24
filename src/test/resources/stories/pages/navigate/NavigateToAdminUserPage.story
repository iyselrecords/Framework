Narrative: 
If the user is logged in, they have Administrator Capabilities and are present on the Home Page
they must beable to open the Start A New Workspace Dialog.

Meta: @CreateANewWorkspaceHomePage @MagnumAdmin @Admin @Admin_03

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