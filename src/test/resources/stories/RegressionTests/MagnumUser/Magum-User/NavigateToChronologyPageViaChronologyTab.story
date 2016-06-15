Narrative:  
If the user is logged in, they are a member of a workspace and are present on any page 
they must beable to navigate to the Chronology page  by clicking the Chronology Tab on the task bar.

GivenStories: RegressionTests/MagnumUser/Login/LoginStepOneEnterUserEmailOrUserNameAndPassword.story
RegressionTests/MagnumUser/Login/LoginStepTwoEnterCharachtersOfMemorableWord.story

Scenario: Navigate To Chronology Page Via The Chronology Tab 
  
Meta: @NavigateToChronologyPageViaTheChronologyTab  @MagnumUser @USER_GUI01  
  
Given the <User> is logged in
And is not present on the <Chronology_Page>
And the <Chronology_Tab> is visible  
Then click the <Chronology_Tab> 
When navigation is complete 
And the page is loaded  
Then verify the <User> is present on the <Chronology_Page>
    