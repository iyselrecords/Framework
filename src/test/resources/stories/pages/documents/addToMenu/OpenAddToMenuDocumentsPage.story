Narrative: 
If the user is logged in and present on the Documents Page where the Right Click Menu is open at Document level
they must beable to open the Add to Dialog. 

Meta: @OpenAddToDialogDocumentsPage @MagnumUser @USER_GUI08 @User @Admin @PowerUser @User

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

Scenario: Open Add To Dialog Documents Page
Given the Add_To_Option is visible in the Right_Click_Menu
When the user hovers the pointer over the Add_To_Option
Then the Add_To_Menu must open