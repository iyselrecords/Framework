Narrative:
If the user is logged in, present on the Document Viewer and the Select Document Tags Dialog is open
they must beable to Find and Filter Document Tags, using the find.

GivenStories: RegressionTests/MagnumUser/Login/LoginStepOneEnterUserEmailOrUserNameAndPassword.story
RegressionTests/MagnumUser/Login/LoginStepTwoEnterCharachtersOfMemorableWord.story
RegressionTests/MagnumUser/Magnum-User/NavigateToDocumentsPageViaDocumentsTab.story 
RegressionTests/MagnumUser/Documents/LoadDocumentToPreviewDocumentsPage.story
RegressionTests/MagnumUser/Documents/NavigateToDocumentViewerViaPreviewDocumentsPage.story
RegressionTests/MagnumUser/DocumentViewer/OpenSelectTagsDialogDocumentViewer.story

Scenario: Find Tag Select Document Tag Dialog Document Viewer  

Meta: @FindTagSelectDocumentTagDialogDocumentViewer @MagnumUser @USER_GUI03

GivenStories: RegressionTests/MagnumUser/Magnum-User/Find.story
