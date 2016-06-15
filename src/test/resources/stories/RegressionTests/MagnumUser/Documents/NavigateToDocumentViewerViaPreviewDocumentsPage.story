Narrative:
If the user is logged in, present on the Documents Page and there is a document loaded to the Preview
they must beable to navigate to the Document Viewer by clicking said document in the Preview. 

GivenStories: RegressionTests/MagnumUser/Login/LoginStepOneEnterUserEmailOrUserNameAndPassword.story
RegressionTests/MagnumUser/Login/LoginStepTwoEnterCharachtersOfMemorableWord.story
RegressionTests/MagnumUser/Magnum-User/NavigateToDocumentsPageViaDocumentsTab.story
RegressionTests/MagnumUser/Documents/LoadDocumentToPreviewDocumentsPage.story

Scenario: Navigate To Document Viewer Via Preview Documents Page

Meta: @NavigateToDocumentViewerViaPreviewDocumentsPage @MagnumUser @USER_GUI03

Given the <User> is logged in 
And present on the <Documents_Page>
And there is a <Document> loaded in the <Preview_Window>
Then click the  <Preview_Window>
When navgation is complete
And the page is loaded
Then verify the <Document_Viewer_Page_Title> equals the <Document_Title>





