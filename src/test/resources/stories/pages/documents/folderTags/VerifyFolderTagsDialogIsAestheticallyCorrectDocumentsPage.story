Narrative: 
The Folder Tags Dialog is a tool which is used to Tag Folders on the Documents and Transcripts Pages 
it is essential that the dialogs layout is both correct and consistent in appearance with the rest of the dialogs across the platform.   

@Meta: @VerifyTagFolderDialogIsAestheticallyCorrectDocumentsPage @MagnumUser @Admin @PowerUser @User

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

Scenario: Open Tag Folder Dialog Documents Page
Given the Tag_Folder_Option is visible in the Right_Click_Menu
When the user clicks the Tag_Folder_Option
Then the Tag_Folder_Dialog must open

Scenario: Verify Folder Tags Dialog Is Aesthetically Correct Documents Page
Given the Tag_Folder_Dialog is open on the Documents_Page
When the user is viewing the Tag_Folder_Dialog
Then the Tag_Folder_Dialog must be Aesthetically consistent with other dialogs across the platform
And each of the Buttons, Fields, Icons and Element_Names must be correct on the Tag_Folder_Dialog