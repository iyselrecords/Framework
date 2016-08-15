Narrative: 
The Destination Folder Dialog is a tool which is used to select the destination of Documents, Transcripts and Folders for activities such as Uploading, Moving and Copying 
it is essential that the dialogs layout is both correct and consistent in appearance with the rest of the dialogs across the platform.   

@Meta: @VerifyDestinationFolderDialogIsAestheticallyCorrectDocumentsPage @MagnumUser @Admin @PowerUser @User

GivenStories: stories/pages/documents/copy/OpenDestinationFolderDialogViaCopyDocumentDocumentsPage.story

Scenario: Verify Destination Folder Dialog Is Aesthetically Correct Documents Page
Given the Destination_Folder_Dialog is open on the Documents_Page
When the user is viewing the Destination_Folder_Dialog
Then the Destination_Folder_Dialog must be Aesthetically consistent with other dialogs across the platform
And each of the Buttons, Fields, Icons and Element_Names must be correct on the Destination_Folder_Dialog