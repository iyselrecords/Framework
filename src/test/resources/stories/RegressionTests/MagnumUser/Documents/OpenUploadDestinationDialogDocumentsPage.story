Narrative:  
If the user is logged in, present on the Documents page 
they must beable to open the Upload Destination dialog. 

GivenStories: RegressionTests/MagnumUser/Login/LoginStepOneEnterUserEmailOrUserNameAndPassword.story
RegressionTests/MagnumUser/Login/LoginStepTwoEnterCharachtersOfMemorableWord.story
RegressionTests/MagnumUser/Magnum-User/NavigateToDocumentsPageViaDocumentsTab.story
RegressionTests/MagnumUser/Documents/OpenUploadDialogDocumentsPage.story

Scenario: Open Upload Dialog

Meta: @OpenUploadDialog @MagnumUser @USER_GUI05

Given the <User> is logged in
And present on the <Documents_Page>
And the <Upload_Button> is visible
Then click the <Upload_Button> 
Then verify the <Upload_Dialog> is open