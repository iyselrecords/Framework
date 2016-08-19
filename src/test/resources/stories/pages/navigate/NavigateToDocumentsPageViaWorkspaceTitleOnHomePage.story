Narrative:
If the user is logged in, present on the Home page and they are a member of a Workspace
they must beable to navigate to the Documents Page of said workspace by double clicking the Title,
within the index on the Home Page.

Meta: @NavigateToDocumentsPageFromHomePageViaWorkspaceTitle @MagnumUser @USER_GUI02 @Admin @PowerUser @User @Viewer

Scenario: Enter Correct User Details And Password 
Given that a user is present on the login page
When the user authenticates successfully
And the user fills the memorable word options correctly
Then the user must be navigated to the home page

Scenario: Open Select Workspace Dropdown
Given the user is a member of several Workspaces
And the Workspace_Info_Button is visible
When the user clicks the Workspace_Info_Button
Then the Workspace_Dropdown_Menu must open

Scenario: Select Workspace Workspace Dropdown Menu
Given the Workspace_Title is visible in the Cases section
When the user clicks the Workspace_Title
Then the Page_Title must equal the Workspace_Title

Scenario:  Navigate To Documents Page From Home Page Via Workspace Title
Given the Cases_Section is visible
And the Workspace_Title is visible
When the user double clicks the Workspace_Title
Then they must be navigated to the Documents_Page