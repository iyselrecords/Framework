Narrative: 
If the user is logged in, they are a member of a workspace and are present on any page 
they must beable to navigate to the Search page  by clicking the Search tab on the task bar.

GivenStories: RegressionTests/MagnumUser/Login/LoginStepOneEnterUserEmailOrUserNameAndPassword.story
RegressionTests/MagnumUser/Login/LoginStepTwoEnterCharachtersOfMemorableWord.story

Scenario: Navigate to Search Page Via Search Tab  

Meta: @NavigateToSearchPageViaSearchTab @MagnumUser @USER_GUI01  
  
Given the <User> is logged in
And is not present on the <Search_Page>
And the <Search_Tab> is visible  
Then click the <Search_Tab>  
When navigation is complete
And the page has loaded
Then verify the <User> is present on the <Search_Page>