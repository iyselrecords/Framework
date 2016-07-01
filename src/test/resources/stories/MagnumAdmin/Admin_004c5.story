Meta:
@regression
@magnumAdmin
@admin_004c5

Narrative:
In order to test Magnum application
As a tester
I want to test features and functionality

GivenStories: stories/Login/UserLogin.story
GivenStories: stories/PreCondition/GoToManageUserWorkspace.story
GivenStories: stories/PreCondition/AddUser.story

Scenario: Verify Deleting User Account
When admin selects a user
And clicks on view menu dropdown
And select Delete Account option