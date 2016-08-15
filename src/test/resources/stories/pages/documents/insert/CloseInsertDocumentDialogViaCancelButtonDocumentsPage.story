Narrative: 
If the user is logged in and present on the Documents Page where the Insert Document Dialog is open 
they must beable to close the dialog by clicking the X Button. 

Meta: @CloseInsertDocumentDialogViaCancelButtonDocumentsPage @MagnumUser @USER_GUI08 @Admin @Power @User

Scenario: Enter Correct User Details And Password 
Given that a user is present on the login page
When the user authenticates successfully
And the user fills the memorable word options correctly
Then the user must be navigated to the home page

Scenario: Select Workspace And Navigate To Documents Page
Given the workspace is visible in the cases section
When the user selects workspace title
Then they must be navigated to the documents page

Scenario: Open Right Click Menu Document Level Documents Page
Given there is at least one Document in the Document_Index
When the user right clicks the Document
Then the Right_Click_Menu must open at document level

Scenario: Open Insert Document Dialog Documents Page
Given the Insert_Option is visible in the Right_Click_Menu
When the user clicks the Insert_Option
Then the Insert_Document_Dialog must open

Scenario: Close Insert Document Dialog Via Cancel Button Documents Page
Given the Cancel_Button is visible on the Insert_Document_Dialog
When the user clicks the Cancel_Button on the Insert_Document_Dialog
Then the Insert_Document_Dialog must close via the Cancel_Button