Narrative:
In order to test Magnum application
As a tester
I want to test features and functionality

Scenario: Navigate To Manage User and Workspace
GivenStories: stories/Login/Login.story
Given the User is on <Home_Page>
When the User clicks on <Manage_Users_And_Workspaces> button
Then the User is on <Admin_Users_Page>