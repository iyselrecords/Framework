Narrative:
If the user is logged in, present on the Home page, and they are a member of a workspace which has recently uploaded Documents
they must beable to view the Documents individually in the Preview by clicking on the title of a Specific Document.  

GivenStories: stories/Login/LoggingIn.story
              stories/MagnumUser/Home/VerifyRecentDocumentsLoadedHomePage.story
    
Meta: @ViewRecentTranscriptInPreviewHomePage  @MagnumUser @USER_GUI04

Scenario: View Recent Transcript In Preview Home Page 

Given there is a <Document> visible in the <Recent_Documents> section
When the <User> clicks the <Document_Title> 
Then the <Preview_Dialog> must open
And the correct <Document> must be loaded in the <Preview_Dialog>
And the <Preview_Dialog_Title> must equal the <Document_Title>