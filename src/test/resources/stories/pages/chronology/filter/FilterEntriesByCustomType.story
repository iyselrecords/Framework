Narrative: 
FilterChronologyEntriesByTypes FilterChronologyEntriesByDate FilterChronologyEntriesByDate

@Meta: @CHRON_45 @FilterEntriesByTypes @ChronologyFilter @Chronology @Auto

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

Scenario: Add New Custom Type
Given the Add_Button is visible
When user clicks on the Add_Button
And input Custom_Types Hello_World
And clicks Custom_Types_Save_Button
Then Hello_World is visible on the Custom_Types_List

Scenario: Open New Entry Event Dialog
Given the New_Entry_Button is visible
When user clicks the New_Entry_Button
Then Chronology_Event_Dialog should be visible

Scenario: Assigned Custom Types To New Entry
Given the Chronology_Event_Dialog is open
When user adds CustomType to Chronology_Details
Then Types is assigned to Chronology_Entry

Scenario: Open Chronology Filter Dialog
Given the Filter_Button is visible
When user clicks the Filter_Button
Then Chronology_Filter_Dialog should be visible

Scenario: Filter Chronology Entries By Custom Type
Given the Chronology_Filter_Dialog is open
When user selects Custom_Type_Option
Then Chronology_Entries with Custom_Type_Option should display

Scenario: Open Custom Types Dialog
Given Custom_Types_Button is visible
When user clicks Custom_Types_Button
Then Custom_Types_Dialog should be visible

Scenario: Delete Custom Type
Given the Delete_Button is visible
When user highlight Custom_Type
And clicks on the Delete_Button
And confirms action
Then the Custom_Type is deleted from the list
