Narrative: 
If the user is logged in, present on the Documents Page,
where there is a document present in the index the user must beable
to load said document to the Preview Window. 

GivenStories: RegressionTests/MagnumUser/Login/LoginStepOneEnterUserEmailOrUserNameAndPassword.story
RegressionTests/MagnumUser/Login/LoginStepTwoEnterCharachtersOfMemorableWord.story
RegressionTests/MagnumUser/Magnum-User/NavigateToDocumentsPageViaDocumentsTab.story


Scenario: Load Document To Preview Documents Page 

Meta: @LoadDocumentToPreviewDocumentsPage 

Given the <User> is present on the <Documents_Page>
And there is a <Document> visible in the index
Then press the <Document_Title> 
Then verify the <Document> has loaded to the <Preview_Window>



