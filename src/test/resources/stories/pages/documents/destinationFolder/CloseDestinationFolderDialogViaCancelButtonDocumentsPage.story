Narrative: 
If the user is logged in and present on the Documents page where the Destination Folder Dialog is open
they must beable to close the dialog by seclicking the Cancel button. 

Meta: @CloseDestinationFolderDialogViaCancelButtonDocumentsPage @MagnumAdmin @Admin 

GivenStories: stories/pages/documents/copy/OpenDestinationFolderDialogViaCopyDocumentDocumentsPage.story

Scenario: Close Destination Folder Dialog Via Cancel Button Documents Page
Given the Cancel_Button is visible on the Destination_Folder_Dialog
When the user clicks the Cancel_Button on the Destination_Folder_Dialog
Then the Destination_Folder_Dialog must close via the Cancel_Button