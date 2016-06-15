Narrative: 
If the user is logged in, they are a member of a workspace and are present on the Home page
they must beable to navigate to the Transcripts page by clicking the Transcripts shortcut.

GivenStories: RegressionTests/MagnumUser/Login/LoginStepOneEnterUserEmailOrUserNameAndPassword.story
RegressionTests/MagnumUser/Login/LoginStepTwoEnterCharachtersOfMemorableWord.story

Scenario: Navigate To Transcripts Via Shortcut On Home Page

Meta: @NavigateToTranscriptsShortcutViaShortcutOnHomePage @MagnumUser @USER_GUI02
 
Given the <User> is logged in
And present on the <Home_Page>
And the <Transcripts_Shortcut> is visible  
Then click the <Transcripts_Shortcut>
When navigation is complete 
And the page is loaded  
Then verify the <User> is present on the <Transcripts_Page>

