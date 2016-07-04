Narrative: 
If the user is logged in, they have Administrator Capabilities 
and are present on the Home Page where the Start A New Workspace Dialog is open
they must beable to close the dialog by clicking the Cancel Button.

GivenStories: stories/Login/LoggingIn.story
              stories/MagnumUser/Home/OpenStartANewWorkspaceDialogHomePage.story

Meta: @CloseStartANewWorkspaceDialogViaCancelButtonHomePage 

Scenario: Close Start A New Workspace Dialog Via Cancel Button Home Page

Given <Cancel_Button> is visible
When the <User> clicks the <Cancel_Button>  
Then  the <Start_A_New_Workspace_Dialog> must close