Meta:
@magnumAdmin
@regression
@admin_004c2

Narrative:
In order to test Magnum application
As a tester
I want to test features and functionality

GivenStories: stories/Login/UserLogin.story
GivenStories: stories/PreCondition/GoToManageUserWorkspace.story

Scenario:  Verify enable/disable Two Factor Authentication
When admin selects a user
And clicks on view menu dropdown
And select enable 2fa option