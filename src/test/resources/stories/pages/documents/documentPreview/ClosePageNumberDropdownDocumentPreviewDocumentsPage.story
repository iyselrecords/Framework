Narrative: 
If the user is logged in, present on the Documents Page and the Page Number Selection Dropdown Menu is open on the Preview Window
they must beable to close the menu by clicking on the Dropdown Arrow. 

Meta: @ClosePageNumberSelectionDropdownDocumentPreviewDocumentsPage @MagnumUser @USER_GUI08 @Admin @PowerUser @User

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

Scenario: Close Page Number Selection Dropdown Document Preview Documents Page
Given the Page_Number_Dropdown_Menu is open on the Document_Preview
When the user clicks the Page_Number_Dropdown_Arrow whilst the Page_Number_Dropdown_Menu is open
Then the Page_Number_Dropdown_Menu must close