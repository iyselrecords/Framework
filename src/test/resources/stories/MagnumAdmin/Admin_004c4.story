Meta:
@regression
@magnumAdmin
@admin_004c4

Narrative:
In order to test Magnum application
As a tester
I want to test features and functionality

GivenStories: stories/Login/UserLogin.story
GivenStories: stories/PreCondition/GoToManageUserWorkspace.story

Scenario: Verify Authenticating User With Magnum
When admin selects a user
And clicks on view menu dropdown
And select authenticate with Magnum option