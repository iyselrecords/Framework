Narrative:
If the user is logged in, present on the Document Viewer and the Select Document Tags Button is visible on the Tools Bar
they must beable to open the Select Document Tags Dialog, by pressing the Select Document Tags Button.

GivenStories: RegressionTests/MagnumUser/Login/LoginStepOneEnterUserEmailOrUserNameAndPassword.story
RegressionTests/MagnumUser/Login/LoginStepTwoEnterCharachtersOfMemorableWord.story
RegressionTests/MagnumUser/Magnum-User/NavigateToDocumentsPageViaDocumentsTab.story 
RegressionTests/MagnumUser/Documents/LoadDocumentToPreviewDocumentsPage.story
RegressionTests/MagnumUser/Documents/NavigateToDocumentViewerViaPreviewDocumentsPage.story

Scenario: Open Select Document Tags Dialog Document Viewer 

Meta: @OpenSelectDocumentTagsDialogDocumentViewer @MagnumUser @USER_GUI05

Given the <User> is logged in
And present on <Document_Viewer>
And the <Select_Document_Tags_Button> is visible on the <Tools_Bar>
Then click the <Select_Document_Tags_Button> 
Then verify the <Select_Document_Tags_Dialog> is open 
