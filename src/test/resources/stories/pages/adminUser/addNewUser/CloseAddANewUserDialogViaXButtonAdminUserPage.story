Narrative: 
If the user is logged in, they have Administrator Capabilities and are present on the Home Page
they must beable to open the Start A New Workspace Dialog.

Meta: @CreateANewWorkspaceHomePage @MagnumAdmin @Admin @Admin_04 @AdminUser

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

Scenario: Open Add A New User Dialog Admin User Page
Given that a user is present on the Admin_User page
And Add_A_New_User button is visible
When the user clicks Add_A_New_User button
Then Add_A_New_User dialog must be visible

Scenario: Close Add A New User Dialog Via X Button Admin User Page
Given the X_Button is visible on the Add_A_New_User_Dialog
When the user clicks the X_Button on the Add_A_New_User_Dialog
Then the Add_A_New_User_Dialog must close via the X_Button