Narrative: 
If the user is logged in, they have Administrator Capabilities 
and are present on the Home Page where the Start A New Workspace Dialog is open
they must beable to close the dialog by clicking the Cancel Button.

Meta: @CloseStartANewWorkspaceDialogViaCancelButtonHomePage @MagnumAdmin @Admin

GivenStories: stories/pages/home/newWorkspace/OpenStartANewWorkspaceDialogHomePage.story

Scenario: Close Start A New Workspace Dialog Via Cancel Button Home Page
Given the <Cancel_Button> is visible on the Start_A_New_Workspace_Dialog
When the user clicks the <Cancel_Button> on the <Start_A_New_Workspace_Dialog>
Then the Start_A_New_Workspace_Dialog must close via the Cancel_Button

Examples:
home.table