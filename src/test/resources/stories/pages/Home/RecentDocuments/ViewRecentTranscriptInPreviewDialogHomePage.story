Narrative:
If the user is logged in, present on the Home page, and they are a member of a workspace which has recently uploaded Transcripts
they must beable to view Transcripts individually in the Preview by clicking on the title of a specific Transcript.  

GivenStories: stories/pages/Login/LoggingIn.story
             stories/pages/Home/VerifyRecentDocumentsLoadedHomePage.story

Meta:   @MagnumUser @USER_GUI04

Scenario: View Recent Transcript In Preview Home Page 

Given there is a <Transcript> visible in the <Recent_Documents> section
When the <User> clicks the <Transcript_Title> 
Then the <Preview_Dialog> must open
And the correct <Transcript> must be loaded in the <Preview_Dialog>
And the <Preview_Dialog_Title> must equal the <Transcript_Title>


 

      
          