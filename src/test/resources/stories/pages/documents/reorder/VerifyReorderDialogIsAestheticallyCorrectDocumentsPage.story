Narrative: 
The Reorder Dialog is a tool which is used to change the position of;
Documents, Transcripts and Folders within individual Folders and also within the indexs of the Documents and Transcripts Pages,   
it is essential that the dialogs layout is both correct, and consistent in appearance with the rest of the dialogs across the platform.   

@Meta: @VerifyReorderDialogIsAestheticallyCorrectDocumentsPage @MagnumUser @Admin @PowerUser @User

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

Scenario: Verify Reorder Dialog Is Aesthetically Correct Documents Page
Given the Reorder_Dialog is open on the Documents_Page
When the user is viewing the Reorder_Dialog
Then the Reorder_Dialog must be Aesthetically consistent with other dialogs across the platform
And each of the Buttons, Fields, Icons and Element_Names must be correct on the Reorder_Dialog