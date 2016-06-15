Narrative:
If the user is logged in, present on the Home page, and they are a member of a workspace which has recently uploaded transcripts
they must beable to view the transcripts individually in the preview by clicking on the title of a specific transcript.  

GivenStories: RegressionTests/MagnumUser/Login/LoginStepOneEnterUserEmailOrUserNameAndPassword.story
RegressionTests/MagnumUser/Login/LoginStepTwoEnterCharachtersOfMemorableWord.story

Scenario: View Recent Transcript In Preview Home Page 

Meta: @LoadRecentTranscriptToPreviewHomePage  @MAgnumUser @USER_GUI04

Given the <User> is logged in
And present on the <Home_Page> 
And the <Recent_Documents> section has loaded
Then click <Target_Transcript> 
Then verify the <Preview_Dialog> is open
And the <Preview_Dialog_Title> is equal to  <Target_Transcript> 
Then click the <Close_Icon_X>  
Then verify the <Preview_Dialog> is closed


 

      
          