Narrative: 
If the user is logged in, they have Administrator Capabilities
and are present on the Home Page where the Start A New Workspace Dialog is open
they must beable to close the dialog by clicking the X Button.

Meta: @CloseStartANewWorkspaceDialogViaXButtonHomePage @MagnumAdmin @Admin

GivenStories: stories/pages/home/newWorkspace/OpenStartANewWorkspaceDialogHomePage.story

Scenario: Close Start A New Workspace Dialog Via X Button Home Page
Given the X_Button is visible on the Start_A_New_Workspace_Dialog
When the user clicks the X_Button on the Start_A_New_Workspace_Dialog
Then the <Start_A_New_Workspace_Dialog> must close via the <X_Button>

Examples:
home.table