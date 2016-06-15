Narrative: 
If the user is logged in, they are a member of a workspace and are present on any page 
they must beable to navigate to the Notes page  by clicking the Notes tab on the task bar.

GivenStories: RegressionTests/MagnumUser/Login/LoginStepOneEnterUserEmailOrUserNameAndPassword.story
RegressionTests/MagnumUser/Login/LoginStepTwoEnterCharachtersOfMemorableWord.story

Scenario: Navigate to Notes Page Via Notes Tab
  
Meta: @NavigateToNotesViaNotesTab @MagnumUser @USER_GUI01 
  
Given the <User> is logged in
And is not present on the <Notes_Page>
And the <Notes_Tab> is visible  
Then click the <Notes_Tab>
When navigation is complete 
And the page is loaded  
Then verify the <User> is present on the <Notes_Page>
      