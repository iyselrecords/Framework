Narrative:
If the user is logged in, present on the Home page and they are a member of a workspace
they must beable to navigate to the documents page of said workspace by double clicking the title,
within the index on the home page.

GivenStories: RegressionTests/MagnumUser/Login/LoginStepOneEnterUserEmailOrUserNameAndPassword.story
RegressionTests/MagnumUser/Login/LoginStepTwoEnterCharachtersOfMemorableWord.story

Scenario:  Navigate To Documents Page From Home Page Via Workspace Title

Meta: @NavigateToDocumentsPageFromHomePageViaWorkspaceTitle @MagnumUser @USER_GUI02

Given the <User> is present on the <Home_Page>
And the <Cases_Section> is visible
And the <Workspace_Title> is visible 
Then double click the <Workspace_Title> 
When navigation is complete 
And the page is reloaded  
Then verify the <User> is present on the <Documents_Page>






  
