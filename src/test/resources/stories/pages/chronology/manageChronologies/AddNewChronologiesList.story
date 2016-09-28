Narrative: 
ManageChronologies ManageChronologies ManageChronologies

@Meta: @CHRON_34 @AddNewChronologyList @Chronology @Auto

Scenario: Enter Correct User Details And Password 
Given that a user is present on the login page
When the user authenticates successfully
And the user fills the memorable word options correctly
Then the user must be navigated to the home page

Scenario: Select Workspace And Navigate To Documents Page
Given the workspace is visible in the cases section
When the user selects workspace title
Then they must be navigated to the documents page

Scenario: Navigate To Chronology Page Via The Chronology Tab
Given the user is not present on the Chronology_Page
And the Chronology_Tab is visible
When the user clicks the Chronology_Tab
Then they must be navigated to the Chronology_Page

Scenario: Select Chronologies List
Given the Chronologies_Dropdown_List is visible
When user selects Chronologies_List_Option
Then Chronologies_List_Option should display Chronology_Entries

Scenario: Open Manage Chronologies Dialog
Given Manage_Chronologies_Button is visible
When user clicks Manage_Chronologies_Button
Then Manage_Chronologies_Dialog should be visible

Scenario: Add New Chronologies List
Given the Add_Button is visible
When user clicks on the Add_Button
And input Chronology_List_Name
And clicks Chronology_List_Save_Button
Then new Chronology_List is visible on the Chronologies_List

Scenario: Delete Chronologies List
Given the Delete_Button is visible
When user select Chronology_List to delete
And clicks on the Delete_Button
And confirms action
Then the Chronology_List deleted from the Chronologies_List