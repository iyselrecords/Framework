Narrative:
If the user is logged in and present on the Documents Page where there is a Document loaded to the Document Preview which has more that one page
and the user is viewing any page other than the first, they must beable to navigate up the pages by clicking the Page Down Arrow. 

Meta: @NavigatePageDownDocumentPreviewDocumentsPage @MagnumUser @USER_FUNCD14 @Admin @PowerUser @User @Viewer

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

Scenario: Navigate Page Up Document Preview Documents Page
Given the Page_Up_Arrow is visible on the Document_Preview
When the user clicks the Page_Up_Arrow on the Document_Preview
Then the Document_Preview must navigate up one page

Scenario: Navigate Page Down Document Preview Documents Page
Given the Page_Down_Arrow is visible on the Document_Preview
When the user clicks the Page_Down_Arrow on the Document_Preview
Then the Document_Preview must navigate down one page