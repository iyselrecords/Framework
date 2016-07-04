Narrative: 
If the user is logged in, they are a member of a workspace which has recently uploaded Documents
they must beable to view said Documents on the Recent Documents section of the Home page. 

GivenStories: stories/Login/LoggingIn.story

Meta: @VerifyRecentDocumentsLoadedHomePage @MagnumUser @USER_GUI04
 
Scenario: Verify Recent Documents Section Loaded  Home Page

Given the <User> is on the <Home_Page>
When the <Recent_Documents> section has loaded
Then the <Target_Document> must be visible
And the <Target_Transcript> must be visible  


    