Narrative:  
If the user is logged in, present on the Documents page where there are multiple folders in the index, 
they must beable to filter Folders using the Find on the Upload Destination dialog. 

GivenStories: RegressionTests/MagnumUser/Login/LoginStepOneEnterUserEmailOrUserNameAndPassword.story
RegressionTests/MagnumUser/Login/LoginStepTwoEnterCharachtersOfMemorableWord.story
RegressionTests/MagnumUser/Magnum-User/NavigateToDocumentsPageViaDocumentsTab.story
RegressionTests/MagnumUser/Documents/OpenUploadDialogDocumentsPage.story
RegressionTests/MagnumUser/Documents/OpenUploadDestinationDialogDocumentsPage.story

Scenario: Find Folder Upload Destination Dialog

Meta: @FindFolderUploadDestinationDialog @MagnumUser @USER_GUI03
 
GivenStories: RegressionTests/MagnumUser/Magnum-User/Find.story