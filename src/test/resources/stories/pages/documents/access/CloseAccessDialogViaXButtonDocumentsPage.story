Narrative: 
If the user is logged in and present on the Documents page where the Access Dialog is open 
they must beable to close the dialog by clicking the X Button. 

Meta: @CloseAccessDialogViaXButtonDocumentsPage @MagnumAdmin @USER_GUI08 @Admin 

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

Scenario: Open Access Dialog Document Level Documents Page
Given the Access_Option is visible in the Right_Click_Menu
When the user clicks the Access_Option
Then the Access_Dialog must open

Scenario: Close Access Dialog Via X Button Documents Page
Given the X_Button is visible on the Access_Dialog
When the user clicks the X_Button on the Access_Dialog
Then the Access_Dialog must close via the X_Button