Narrative: 
If the user is logged in, they are a member of a workspace and are present on any page 
they must beable to navigate to the Admin page by clicking the Admin tab on the task bar.

GivenStories: RegressionTests/MagnumUser/Login/LoginStepOneEnterUserEmailOrUserNameAndPassword.story
RegressionTests/MagnumUser/Login/LoginStepTwoEnterCharachtersOfMemorableWord.story

Scenario: Navigate to Admin Page Via Admin Tab
  
Meta: @NavigateToAdminPageViaAdminTab @MagnumUser @USER_GUI01  
  
Given the <User> is logged in
And they have <Admin_Capabilities>
And is not present on the <Admin_Page>
And the <Admin_Tab> is visible  
Then click the <Admin_Tab> 
When navigation is complete 
And the page is loaded  
Then verify the <User> is present on the <Admin_Page>

Examples:
VariableExamples.story