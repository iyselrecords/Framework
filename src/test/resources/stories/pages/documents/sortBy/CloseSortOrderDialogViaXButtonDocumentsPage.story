Narrative: 
If the user is logged in and present on the Documents Page where the Sort Order Dialog is open 
they must beable to close the dialog by clicking the X Button. 

Meta: @CloseSortOrderDialogViaXButtonDocumentsPage @MagnumUser @USER_GUI08 @Admin @PowerUser @User

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

Scenario: Open Sort Order Dialog Documents Page
Given the Sort_By_Option is visible in the Right_Click_Menu
When the user clicks the Sort_By_Option
Then the Sort_Order_Dialog must open

Scenario: Close Sort Order Dialog Via X Button Documents Page
Given the X_Button is visible on the Sort_Order_Dialog
When the user clicks the X_Button on the Sort_Order_Dialog
Then the Sort_Order_Dialog must close via the X_Button