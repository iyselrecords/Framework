Narrative: 
If the user is logged in and present on the Documents page where the Right Click Menu is open at Folder Level  
they must beable to open the Folder Colour Dialog by selecting the Folder Colour Option from the menu. 

Meta: @OpenFolderColourDialogDocumentsPage @MagnumUser @USER_GUI08 @Admin @PowerUser 

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