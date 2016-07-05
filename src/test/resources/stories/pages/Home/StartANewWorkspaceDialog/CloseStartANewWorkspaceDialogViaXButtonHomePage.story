Narrative: 
If the user is logged in, they have Administrator Capabilities
and are present on the Home Page where the Start A New Workspace Dialog is open
they must beable to close the dialog by clicking the X Button.

GivenStories: stories/pages/Login/LoggingIn.story
             stories/pages/Home/OpenStartANewWorkspaceDialogHomePage.story

Meta: 

Scenario: Close Start A New Workspace Dialog Via X Button Home Page

Given the <X_Button> is visible
When the <User> clicks the <X_Button>  
Then the <Start_A_New_Workspace_Dialog> must close