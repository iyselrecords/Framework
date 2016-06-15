Narrative: 
If the user is logged in, they are a member of a Workspace and are present on the Home page
they must beable to navigate to the Chronology page by clicking the Chronology shortcut.

GivenStories: RegressionTests/MagnumUser/Login/LoginStepOneEnterUserEmailOrUserNameAndPassword.story
RegressionTests/MagnumUser/Login/LoginStepTwoEnterCharachtersOfMemorableWord.story

Scenario: Navigate To Chronology Page Via Shortcut On Home Page 

Meta: @NavigateToChronologyPageViaShortcutOnHomePage @MagnumUser @USER_GUI02

Given the <User> is logged in
And present on the <Home_Page>
And the <Chronology_Shortcut> is visible  
Then click the <Chronology_Shortcut>
When navigation is complete
And the page is loaded
Then verify the <User> is present on the <Chronology_Page>