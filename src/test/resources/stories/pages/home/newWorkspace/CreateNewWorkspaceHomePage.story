Narrative: 
If the user is logged in, they have Administrator Capabilities and are present on the Home Page
they must beable to create a New Workspace.

Meta: @CreateANewWorkspaceHomePage @MagnumAdmin @Admin

GivenStories: stories/pages/home/newWorkspace/OpenStartANewWorkspaceDialogHomePage.story

Scenario: Create A New Workspace Home Page
Given the Start_A_New_Workspace_Dialog is open
And the Title_Field is visible
And the Description_Field is visible
And the <Create_Workspace_Button> is visible
When the user inputs <Workspace_Title> into the Title_Field
And the <Description> in the Description_Field
And clicks the <Create_Workspace_Button>
Then the New_Workspace must be created
And the user must be navigated to the Admin_Page

Examples:
home.table