Narrative: 
If the user is logged in and present on the Documents page where the Right Click Menu is open at Folder level
they must beable to open the Enable/Disable Export Dialog by selecting the Enable/Disable Export Option from the menu. 

Meta: @OpenEnableDisableExportDialogFolderLevelDocumentsPage @MagnumAdmin @Admin

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

Scenario: Open Enable Disable Export Dialog Folder Level Documents Page
Given the EnableDisable_Export_Option is visible in the Right_Click_Menu
When the user clicks the EnableDisable_Export_Option
Then the EnableDisable_Export_Dialog must open