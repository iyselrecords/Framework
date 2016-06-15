Narrative:  
If the user is logged in, present on the Documents page where there are multiple documents in the index
they must beable to filter documents using Find documents. 

GivenStories: RegressionTests/MagnumUser/Login/LoginStepOneEnterUserEmailOrUserNameAndPassword.story
RegressionTests/MagnumUser/Login/LoginStepTwoEnterCharachtersOfMemorableWord.story
RegressionTests/MagnumUser/Magnum-User/NavigateToDocumentsPageViaDocumentsTab.story

Scenario: Find Document Documents Page

Meta: @FindDocumentDocumentsPage @MagnumUser @USER_GUI03

GivenStories: RegressionTests/MagnumUser/Magnum-User/Find.story