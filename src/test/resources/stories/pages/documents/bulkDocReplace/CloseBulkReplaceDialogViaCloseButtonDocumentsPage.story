Narrative: 
If the user is logged in and present on the Documents Page where the Bulk Replacement Dialog is open 
they must beable to close the dialog by clicking the Close Button. 

Meta: @CloseBulkReplacementDialogViaCloseButtonDocumentsPage @MagnumAdmin @Admin  

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

Scenario: Open Bulk Doc Replace Dialog Documents Page
Given the Bulk_Doc_Replace_Option is visible in the Right_Click_Menu
When the user clicks the Bulk_Doc_Replace_Option
Then the Bulk_Doc_Replace_Dialog must open

Scenario: Close Bulk Replacement Dialog Via Close Button Documents Page
Given the Close_Button is visible on the Bulk_Replacement_Dialog
When the user clicks the Close_Button on the Bulk_Replacement_Dialog
Then the Bulk_Replacement_Dialog must close via the Close_Button