Narrative: 
The Replace Document Dialog is a tool which is used to replace Documents with a previous version or more upto date copy of the same Document 
it is essential that the dialogs layout is both correct, and consistent in appearance with the rest of the dialogs across the platform.   

@Meta: @VerifyReplaceDocumentDialogIsAestheticallyCorrectDocumentsPage @MagnumUser @Admin @PowerUser @User

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

Scenario: Open Replace Document Dialog Documents Page
Given the Replace_Option is visible in the Right_Click_Menu
When the user clicks the Replace_Option
Then the Replace_Document_Dialog must open

Scenario: Verify Replace Document Dialog Is Aesthetically Correct Documents Page
Given the Replace_Document_Dialog is open on the Documents_Page
When the user is viewing the Replace_Document_Dialog
Then the Replace_Document_Dialog must be Aesthetically consistent with other dialogs across the platform
And each of the Buttons, Fields, Icons and Element_Names must be correct on the Replace_Document_Dialog