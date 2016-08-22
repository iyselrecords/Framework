Narrative:
If the user is logged in, present on the Documents Page and there is a Document loaded to the Preview Window
they must beable to navigate to the Document Viewer by clicking said document in the Preview Window. 

Meta: @NavigateToDocumentViewerViaPreviewDocumentsPage @MagnumUser @USER_GUI03 @Admin @PowerUser @User @Viewer

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

Scenario: Load Document To Preview Documents Page 
Given there is a Document visible in the Document_index
When a user clicks the Document_Title
Then the Document must load to the Document_Preview

Scenario: Navigate To Document Viewer Via Preview Documents Page
Given there is a Document loaded in the Document_Preview
When the user clicks the Document in the Document_Preview
Then the user must be navigated to Document_Viewer