Narrative: 
If the user is logged in, present on the Documents Page,
where there is a Native Document present in the index
they must beable to load the Native Document to the Preview Window. 

Meta: @LoadNativeDocumentToPreviewDocumentsPage @MagnumUser @USER_GUI03 @Admin @PowerUser @User @Viewer

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

Scenario: Navigate To Documents Page Via Documents Tab
Given the user is not present on the Documents_Page
And the Documents_Tab is visible
When the user clicks the Documents_Tab
Then they must be navigated to the Documents_Page

Scenario: Load Native Document To Preview Documents Page 
Given there is a Native_Document visible in the Document_index
When the user clicks the Native_Document_Title
Then the Native_Document must load to the Document_Preview