Narrative: 
If the user is logged in and present on the Documents page where the Destination Folder Dialog is open
they must beable to close the dialog by clicking the X button. 

Meta: @CloseDestinationFolderDialogViaXButtonDocumentsPage @MagnumAdmin @Admin 

Scenario: Close Destination Folder Dialog Via X Button Documents Page
GivenStories: stories/pages/documents/copy/OpenDestinationFolderDialogViaCopyDocumentDocumentsPage.story
Given the X_Button is visible on the Destination_Folder_Dialog
When the user clicks the X_Button on the Destination_Folder_Dialog
Then the Destination_Folder_Dialog must close via the X_Button
