Narrative: 
If the user is logged in, they are a member of a workspace which has recently uploaded documents
they must beable to view said documents on the Recent Documents section of the Home page. 

GivenStories: RegressionTests/MagnumUser/Login/LoginStepOneEnterUserEmailOrUserNameAndPassword.story
RegressionTests/MagnumUser/Login/LoginStepTwoEnterCharachtersOfMemorableWord.story 

Scenario: Verify Recent Documents Section Loaded  Home Page

Meta: @VerifyRecentDocumentsLoadedHomePage @MagnumUser @USER_GUI04
  
Given the <User> is logged in
And present on the <Home_Page>
When the <Recent_Documents> section has loaded
Then verify <Target_Document> is visible
And <Target_Transcript> is visible  


    