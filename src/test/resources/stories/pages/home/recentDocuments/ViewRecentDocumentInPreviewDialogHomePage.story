Narrative:
If the user is logged in, present on the Home page, and they are a member of a workspace which has recently uploaded Documents
they must beable to view the Documents individually in the Preview by clicking on the title of a Specific Document.  

Meta: @ViewRecentDocumentInPreviewHomePage  @MagnumUser @USER_GUI04 @Admin @PowerUser @User @Viewer

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

Scenario: View Recent Document In Preview Home Page
Given there is a Document visible in the Recent_Documents section
When the user clicks the Document_Title
Then the Preview_Dialog must open via the Document_Title
And the correct Document must be loaded in the Preview_Dialog
And the Preview_Dialog_Title must equal the Document_Title