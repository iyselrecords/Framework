Narrative:
In order to test Magnum application
As a tester
I want to test features and functionality

Scenario: Navigate To Manage User and Workspace
GivenStories: stories/Login/UserLogin.story
When user navigates to home page
And clicks on Manage Users and Workspaces button
Then a new tab navigates user to adminUsers page where users can be added and removed from workspaces