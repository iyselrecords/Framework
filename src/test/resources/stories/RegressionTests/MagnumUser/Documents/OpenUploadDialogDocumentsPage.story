Narrative:  
If the user is logged in, present on the Documents page 
they must beable to open the Upload dialog. 

GivenStories: RegressionTests/MagnumUser/Login/LoginStepOneEnterUserEmailOrUserNameAndPassword.story
RegressionTests/MagnumUser/Login/LoginStepTwoEnterCharachtersOfMemorableWord.story
RegressionTests/MagnumUser/Magnum-User/NavigateToDocumentsPageViaDocumentsTab.story

Scenario: Open Upload Dialog Documents Page

Meta: @OpenUploadDialogDocumentsPage @MagnumUser @USER_GUI05

Given the <User> is logged in
And present on the <Documents_Page>
And the <Upload_Button> is visible
Then click the <Upload_Button> 
Then verify the <Upload_Dialog> is open