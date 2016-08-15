Narrative: 
If the user is logged in and present on the Documents Page where the Right Click Menu is open 
they must beable to open the Autolink Dialog by selecting the Autolink option in the menu. 

Meta: @OpenAutolinkDialogDocumentsPage @MagnumAdmin @Admin 

Scenario: Enter Correct User Details And Password 
Given that a user is present on the login page
When the user authenticates successfully
And the user fills the memorable word options correctly
Then the user must be navigated to the home page

Scenario: Select Workspace And Navigate To Documents Page
Given the workspace is visible in the cases section
When the user selects workspace title
Then they must be navigated to the documents page

Scenario: Open Right Click Menu Document Level Documents Page
Given there is at least one Document in the Document_Index
When the user right clicks the Document
Then the Right_Click_Menu must open at document level

Scenario: Open Autolink Dialog Documents Page
Given the Autolink_Option is visible in the Right_Click_Menu
When the user clicks the Autolink_Option
Then the Autolink_Dialog must open