Narrative: 
If the user is logged in and present on the Documents page where the Right Click Menu is open 
they must beable to open the Select A Document Dialog by selecting the Import Notes option on the menu. 

Meta: @OpenSelectADocumentDialogDocumentsPage @MagnumAdmin @Admin 

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

Scenario: Open Select A Document Dialog Documents Page
Given the Import_Notes_Option is visible in the Right_Click_Menu
When the user clicks the Import_Notes_Option
Then the Select_A_Document_Dialog must open