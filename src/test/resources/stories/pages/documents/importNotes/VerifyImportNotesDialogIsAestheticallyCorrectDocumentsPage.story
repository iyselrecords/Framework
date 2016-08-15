Narrative: 
The Import Notes Dialog is a tool which is used to import notes form one Document or Transcript to another
it is essential that the dialogs layout is both correct and consistent in appearance with the rest of the dialogs across the platform.   

@Meta: @VerifyImportNotesDialogIsAestheticallyCorrectDocumentsPage @MagnumUser @Admin @PowerUser @User

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

Scenario: Open Import Notes Dialog Documents Page
Given there is a Folder visible on the Select_A_Document_Dialog
When the user clicks the Folder
And then clicks the Apply_Button
Then the Import_Notes_Dialog must open

Scenario: Verify Import Notes Dialog Is Aesthetically Correct Documents Page
Given the Import_Notes_Dialog is open on the Documents_Page
When the user is viewing the Import_Notes_Dialog
Then the Import_Notes_Dialog must be Aesthetically consistent with other dialogs across the platform
And each of the Buttons, Fields, Icons and Element_Names must be correct on the Import_Notes_Dialog