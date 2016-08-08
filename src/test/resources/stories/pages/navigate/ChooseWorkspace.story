Narrative:
If the user is logged in, present on the Home page and they are a member of a Workspace
they must be able to navigate to the Documents Page of said workspace by double clicking the Title,
within the index on the Home Page.

Meta: @caselist

Scenario:  Navigate To Documents Page From Home Page Via Workspace Title
GivenStories: stories/pages/login/LoginPrecondition.story
Given the workspace is visible in the cases section
When the user selects workspace title
Then they must be navigated to the documents page