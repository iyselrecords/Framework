Narrative: 
If the user is logged in, they are a member of a workspace and are present on any page 
they must beable to navigate to the documents page  by clicking the documents tab on the task bar.

GivenStories: RegressionTests/MagnumUser/Login/LoginStepOneEnterUserEmailOrUserNameAndPassword.story
RegressionTests/MagnumUser/Login/LoginStepTwoEnterCharachtersOfMemorableWord.story

Scenario: Navigate To Documents Page Via Documents Tab
  
Meta: @NavigateToDocumentsPageViaDocumentsTab @MagnumUser @USER_GUI01 
  
Given the <User> is logged in
And is not present on the <Documents_Page>
And the <Documents_Tab> is visible  
Then click the <Documents_Tab>
When navigation is complete 
And the page is loaded   
Then verify the <User> is present on the <Documents_Page>
