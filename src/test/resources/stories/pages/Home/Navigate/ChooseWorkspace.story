Narrative:
If the user is logged in, present on the Home page and they are a member of a Workspace
they must beable to navigate to the Documents Page of said workspace by double clicking the Title,
within the index on the Home Page.
Meta:  @MagnumUser @USER_GUI02
GivenStories: stories/pages/Login/LoginPrecondition.story

Scenario:  Navigate To Documents Page From Home Page Via Workspace Title

Given <User> can see the cases section in home page
And the <Workspace_Title> is visible in the cases section
When the <User> selects <Workspace_Title>
Then they must be navigated to the <Documents_Page>

Examples:
|Workspace_Title|Documents_Page|
|DEMO|192140|




  
