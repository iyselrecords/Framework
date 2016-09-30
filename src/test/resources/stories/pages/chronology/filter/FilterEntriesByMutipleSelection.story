Narrative: 
FilterChronologyEntriesByDate FilterChronologyEntriesByDate FilterChronologyEntriesByDate

@Meta: @CHRON_47 @FilterEntriesByMultipleSelection @ChronologyFilter @Chronology

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

Scenario: Open Chronology Filter Dialog
Given the Filter_Button is visible
When user clicks the Filter_Button
Then Chronology_Filter_Dialog should be visible

Scenario: Filter ItemWithoutDescription And By Status Option Disputed
Given the Chronology_Filter_Dialog is open
And the items without description checkbox is visible
When user clicks Item_Without_Description checkbox and select Type_Option Disputed
Then Chronology_Entries with Disputed Status should display
