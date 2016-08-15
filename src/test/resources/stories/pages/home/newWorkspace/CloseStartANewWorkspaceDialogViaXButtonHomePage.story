Narrative: 
If the user is logged in, they have Administrator Capabilities
and are present on the Home Page where the Start A New Workspace Dialog is open
they must beable to close the dialog by clicking the X Button.

Meta: @CloseStartANewWorkspaceDialogViaXButtonHomePage @MagnumAdmin @Admin

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

Scenario: Close Start A New Workspace Dialog Via X Button Home Page
Given the X_Button is visible on the Start_A_New_Workspace_Dialog
When the user clicks the X_Button on the Start_A_New_Workspace_Dialog
Then the Start_A_New_Workspace_Dialog must close via the X_Button