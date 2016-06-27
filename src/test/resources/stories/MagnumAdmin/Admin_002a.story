Meta:
@magnumAdmin
@regression
@admin_002a

Narrative:
In order to test Magnum application
As a tester
I want to test features and functionality

GivenStories: stories/Login/UserLogin.story
			 
Scenario: Verify New Workspace Dialog
When user navigates to home page
And clicks on the new workspace button
Then it should open the New Workspace Dialog box
When user clicks the x icon
Then user exit dialog box