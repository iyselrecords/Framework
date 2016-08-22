Narrative:
If the user is logged in and present on the Documents Page where there is a Document loaded to the Document Preview which has more that one page
they must beable to navigate to a specific Page from making a selection from the Page Number Dropdown Menu. 

Meta: @SelectPageViaPageNumberDropdownDocumentPreviewDocumentsPage @MagnumUser @USER_FUNCD14 @Admin @PowerUser @User @Viewer

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

Scenario: Open Page Number Selection Dropdown Document Preview Documents Page
Given the Page_Number_Dropdown_Arrow is visible on the Document_Preview
When the user clicks the Page_Number_Dropdown_Arrow whilst the Page_Number_Dropdown_Menu is closed
Then the Page_Number_Dropdown_Menu must open

Scenario: Select Page Via Page Number Dropdown Document Preview Documents Page
Given the Page_Number_Option is visible on the Page_Number_Dropdown_Menu
When the user clicks the Page_Number_Option on the Page_Number_Dropdown_Menu
Then the Document_Preview must navigate to the selected page