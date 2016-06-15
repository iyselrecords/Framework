Narrative:
If the user is logged in, and present on the Documents page
they must beable to open the Manage Tags dialog.

GivenStories: RegressionTests/MagnumUser/Login/LoginStepOneEnterUserEmailOrUserNameAndPassword.story
RegressionTests/MagnumUser/Login/LoginStepTwoEnterCharachtersOfMemorableWord.story
RegressionTests/MagnumUser/Magnum-User/NavigateToDocumentsPageViaDocumentsTab.story 

Scenario: Open Manage Tags Dialog Documents Page

Meta: @OpenManageTagsDialogDocumentsPage @MagnumUser @USER_GUI05

Given the <User> is logged in
And present on the <Documents_Page>
And the <Manage_Tags_Button> is visible
Then click the <Manage_Tags_Button> 
Then verify the <Manage_Tags_Dialog> is visible
