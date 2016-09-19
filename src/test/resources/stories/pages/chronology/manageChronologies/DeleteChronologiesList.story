Narrative: 
ManageChronologies ManageChronologies ManageChronologies

@Meta: @CHRON_35 @DeleteChronologyList @Chronology @Done

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

Scenario: Select All Chronologies List
Given the Manage_Chronologies_Dialog is open
When user clicks the All_Link
Then all Chronologies_List is selected

Scenario: DeSelect All Chronologies List
Given the Manage_Chronologies_Dialog is open
When user clicks the None_Link
Then all Chronologies_List is deselected

Scenario: Add New Chronologies List
Given the Add_Button is visible
When user clicks on the Add_Button
And input Chronology_List_Name
And clicks Chronology_List_Save_Button
Then new Chronology_List is visible on the Chronologies_List

Scenario: Edit Chronologies List
Given the Edit_Button is visible
When user select Chronology_List to edit
And clicks on the Edit_Button
And update Chronology_List
And clicks Chronology_List_Save_Button
Then the Chronology_List is updated on the Chronologies_List

Scenario: Delete Chronologies List
Given the Delete_Button is visible
When user select Chronology_List to delete
And clicks on the Delete_Button
And confirms action
Then the Chronology_List deleted from the Chronologies_List

Scenario: Find Chronologies List
Given the Find_Input is visible
And the Chronology_List is listed on the Chronologies_List
When user input a Search_Text
Then the Search_Text is filtered