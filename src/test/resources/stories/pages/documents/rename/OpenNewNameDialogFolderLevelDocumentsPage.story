Narrative: 
If the user is logged in and present on the Documents Page where the Right Click Menu is open at Folder Level
they must beable to open the New Name Dialog by selecting the Rename Option from the menu. 

Meta: @OpenNewNameDialogFolderLevelDocumentsPage @MagnumUser @USER_GUI08 @Admin @PowerUser 

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

Scenario: Open New Name Dialog Folder Level Documents Page
Given the Rename_Option is visible in the Right_Click_Menu
When the user clicks the Rename_Option
Then the New_Name_Dialog must open