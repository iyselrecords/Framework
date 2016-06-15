Narrative: 
If the user is logged in, they are a member of a workspace and are present on the Home page
they must beable to navigate to the Documents page by clicking the Documents Shortcut.

GivenStories: RegressionTests/MagnumUser/Login/LoginStepOneEnterUserEmailOrUserNameAndPassword.story
RegressionTests/MagnumUser/Login/LoginStepTwoEnterCharachtersOfMemorableWord.story

Scenario: Navigate To Documents Page Via Shortcut From Home Page 
  
Meta: @NavigateToDocumentsViaShortcutFromHomePage @MagnumUser @USER_GUI02  
  
Given the <User> is logged in
And present on the <Home_Page>
And the <Documents_Shortcut> is visible  
Then click the <Documents_Shortcut>
When navigation is complete 
And the page is loaded  
Then verify the <User> is present on the <Documents_Page>


