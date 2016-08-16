Narrative: 
If the user is logged in, they are a member of a workspace which has recently uploaded Documents
they must beable to view said Documents on the Recent Documents section of the Home page. 

Meta: @VerifyRecentDocumentsLoadedHomePage @MagnumUser @USER_GUI04 @Admin @PowerUSer @User @Viewer

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

Scenario: Verify Recent Documents Section Loaded  Home Page
Given the Recent_Documents section is visible on the Home Page
When the Recent_Documents section has loaded
Then the Target Document must be visible
And the Target Transcript must be visible