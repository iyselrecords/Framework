Meta:
@magnumAdmin
@regression
@admin_004b

Narrative:
In order to test Magnum application
As a tester
I want to test features and functionality

GivenStories: stories/Login/UserLogin.story
GivenStories: stories/PreCondition/GoToManageUserWorkspace.story

Scenario: Verify adding new User
When user clicks on New User button
And enters email
And clicks Invite button
Then user should appear on the user list

!-- GivenStories: stories/PreCondition/DeleteUser.story

Scenario: Verify adding new Workspaces
When user clicks on the New Workspace button
And type in a title and description
And click Create Workspace button
Then workspace should appear in the Workspace dropdown

!-- GivenStories: stories/PreCondition/DeleteWorkspace.story