Meta:
@magnumAdmin
@regression
@admin_004c1

Narrative:
In order to test Magnum application
As a tester
I want to test features and functionality

GivenStories: stories/Login/UserLogin.story
GivenStories: stories/PreCondition/GoToManageUserWorkspace.story

Scenario:  Verify user account Enable/Disable
When admin selects a user
And clicks on view menu dropdown
And select disable account option