Narrative:
If the user is logged in, present on the Home page and they are a member of a Workspace
they must beable to navigate to the Documents Page of said workspace by double clicking the Title,
within the index on the Home Page.

GivenStories: stories/pages/Login/LoggingIn.story

Meta:  @MagnumUser @USER_GUI02

Scenario:  Navigate To Documents Page From Home Page Via Workspace Title

Given the <Cases_Section> is visible
And the <Workspace_Title> is visible 
When the <User> double clicks the <Workspace_Title>  
Then they must be navigated to the <Documents_Page>






  
