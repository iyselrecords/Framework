Narrative: 
The Upload Dialog is a tool which is used to upload Documents and/or Folders full of Documents  
it is essential that the dialogs layout is both correct, and consistent in appearance with the rest of the dialogs across the platform.   

@Meta: @VerifyNewWorkspaceDialogIsAestheticallyCorrectDocumentsPage @MagnumUser @Admin @PowerUser @User

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

Scenario: Verify New Workspace Dialog Is Aesthetically Correct Documents Page
Given the New_Workspace_Dialog is open on the Documents_Page
When the user is viewing the New_Workspace_Dialog
Then the New_Workspace_Dialog must be aesthetically consistent with other dialogs across the platform
And each of the Buttons, Fields, Icons and Element_Names must be correct on the New_Workspace_Dialog