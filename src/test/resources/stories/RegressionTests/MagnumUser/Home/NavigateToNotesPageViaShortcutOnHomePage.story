Narrative: 
If the user is logged in, they are a member of a workspace and are present on the Home page
they must beable to navigate to the Notes page by clicking the Notes shortcut.

GivenStories: RegressionTests/MagnumUser/Login/LoginStepOneEnterUserEmailOrUserNameAndPassword.story
RegressionTests/MagnumUser/Login/LoginStepTwoEnterCharachtersOfMemorableWord.story

Scenario: Navigate To Notes Page Via Shortcut On Home Page 

Meta: @NavigateToNotesViaShortcut  @MagnumUser @USER_GUI02

Given the <User> is logged in
And is present on the <Home_Page>
And the <Notes_Shortcut> is visible  
Then click the <Notes_Shortcut>
When navigation is complete 
And the page is loaded      
Then verify the <User> is present on the <Notes_Page>