Narrative: 
If the user is logged in, they are a member of a workspace and are present on any page 
they must beable to navigate to the transcripts page  by clicking the transcripts tab on the task bar.

GivenStories: RegressionTests/MagnumUser/Login/LoginStepOneEnterUserEmailOrUserNameAndPassword.story
RegressionTests/MagnumUser/Login/LoginStepTwoEnterCharachtersOfMemorableWord.story

Scenario: Navigate To Transcripts Via The Transcripts Tab

Meta: @NavigateToTranscripts  @MagnumUser @USER_GUI01

Given the <User> is logged in
And is not present on the <Transcrips_Page>  
And the <Transcripts_Tab> is visible  
Then click the <Transcripts_Tab>
When navigation is complete 
And the page is loaded  
Then verify the <User> is present on the <Transcripts_Page>