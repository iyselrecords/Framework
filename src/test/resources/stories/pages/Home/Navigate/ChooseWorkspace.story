Narrative:
If the user is logged in, present on the Home page and they are a member of a Workspace
they must beable to navigate to the Documents Page of said workspace by double clicking the Title,
within the index on the Home Page.
GivenStories: stories/pages/Login/LoginPrecondition.story

Scenario:  Navigate To Documents Page From Home Page Via Workspace Title

Given the user can see the cases section in home page
And the workspace is visible in the cases section
When the user selects workspace title
Then they must be navigated to the documents page