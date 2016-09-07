Narrative: 
CustomTypes CustomTypes CustomTypes

@Meta: @CustomTypes @newChron

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

Scenario: Open Custom Types Dialog
Given Custom_Types_Button is visible
When user clicks Custom_Types_Button
Then Custom_Types_Dialog should be visible

Scenario: Select All Custom Types
Given the Custom_Types_Dialog is open
When user clicks the All_Link
Then all Custom_Types is selected

Scenario: DeSelect All Custom Types
Given the Custom_Types_Dialog is open
When user clicks the None_Link
Then all Custom_Types are deselected

Scenario: Add New Custom Type
Given the Add_Button is visible
When user clicks on the Add_Button
And input Custom_Types_Name
And clicks Custom_Types_Save_Button
Then new Custom Types is visible on the Custom_Types_List

Scenario: Rename Custom Type
Given the Rename_Button is visible
When user select Custom_Type to rename
And clicks on the Rename_Button
And update Custom_Type
And clicks Custom_Types_Save_Button
Then the Custom_Type is updated

Scenario: Delete Custom Type
Given the Delete_Button is visible
When user select Custom_Type to delete
And clicks on the Delete_Button
And confirms action
Then the Custom_Type is deleted from the list

Scenario: Find Custom Type
Given the Find_Input is visible
And the Custom_Type is listed on the list
When user input a Search_Term
Then the Search_Text is filtered