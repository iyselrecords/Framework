Narrative: 
If the user is logged in and present on the Documents page where the Folder Colour Dialog is open   
they must beable to close the dialog by clicking the Cancel Button. 

Meta: @CloseFolderColourDialogViaCancelButtonDocumentsPage @MagnumUser @USER_GUI08 @Admin @PowerUser 

Scenario: Enter Correct User Details And Password 
Given that a user is present on the login page
When the user authenticates successfully
And the user fills the memorable word options correctly
Then the user must be navigated to the home page

Scenario: Select Workspace And Navigate To Documents Page
Given the workspace is visible in the cases section
When the user selects workspace title
Then they must be navigated to the documents page

Scenario: Open Right Click Menu Folder Level Documents Page
Given there is at least one Folder in the Document_Index
When the user right clicks the Folder
Then the Right_Click_Menu must open at folder level

Scenario: Open Folder Colour Dialog Documents Page
Given the Folder_Colour_Option is visible in the Right_Click_Menu
When the user clicks the Folder_Colour_Option
Then the Folder_Colour_Dialog must open

Scenario: Close Folder Colour Dialog Via Cancel Button Documents Page
Given the Cancel_Button is visible on the Folder_Colour_Dialog
When the user clicks the Cancel_Button on the Folder_Colour_Dialog
Then the Folder_Colour_Dialog must close via the Cancel_Button