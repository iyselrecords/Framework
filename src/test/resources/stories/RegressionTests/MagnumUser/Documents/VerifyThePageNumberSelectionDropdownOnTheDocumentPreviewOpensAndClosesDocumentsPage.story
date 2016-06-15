Narrative: 
If the user is logged in, present on the Home page and there is a document loaded to Document Preview 
they must beable to open and close the page number dropdown menu. 

GivenStories: RegressionTests/MagnumUser/Login/LoginStepOneEnterUserEmailOrUserNameAndPassword.story
RegressionTests/MagnumUser/Login/LoginStepTwoEnterCharachtersOfMemorableWord.story
RegressionTests/MagnumUser/Magnum-User/NavigateToDocumentsPageViaDocumentsTab.story
RegressionTests/MagnumUser/Documents/LoadDocumentToPreviewDocumentsPage.story

Scenario: Verify The Page Number Selection Dropdown On The Document Preview Opens And Closes Documents Page

Meta: @VerifyViewOptionsDropdownMenuOpensAndClosesDocumentsPage

Given the <User> is logged in 
And present on the <Documents_Page> 
When there is a <Document> loaded to the preview
Then click the <Page_Number_Dropdown_Arrow>
Then verify the <Page_Number_Dropdown_Menu> is open
Then click the <Page_Number_Dropdown_Arrow>
Then verfiy the <Page_Number_Dropdown_Menu> is closed

    

