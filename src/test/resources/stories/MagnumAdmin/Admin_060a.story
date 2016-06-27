Meta:
@magnumAdmi
@regressio
@admin_060a

Narrative:
In order to test Magnum application
As a tester
I want to test features and functionality


GivenStories: stories/PreCondition/GoToManageUserWorkspace.story

Scenario:  Verify User Can Delete Workspace
When user clicks on the New Workspace button
And type in a title and description
And click Create Workspace button
Then workspace should appear in the Workspace dropdown
When user select new workspace
And clicks on the view dropdown
And select delete option
Then new workspace is removed from the list and no longer accessible