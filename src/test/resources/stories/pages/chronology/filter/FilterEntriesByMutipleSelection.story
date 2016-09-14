Narrative: 
FilterChronologyEntriesByDate FilterChronologyEntriesByDate FilterChronologyEntriesByDate

@Meta: @CHRON_46 @FilterEntriesByMultipleSelection @ChronologyFilter @Chronology

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

Scenario: Filter Entries By Status Option Disputed
Given the Chronology_Filter_Dialog is open
When user selects Status_Option Disputed
Then Chronology_Entries with Disputed Status should display

Scenario: Filter Entries By Status Option Undisputed
Given the Chronology_Filter_Dialog is open
When user selects Status_Option Undisputed
Then Chronology_Entries with Undisputed Status should display

Scenario: Filter Entries By Status Option Either
Given the Chronology_Filter_Dialog is open
When user selects Status_Option Either
Then Chronology_Entries with Either Status should display

Scenario: Filter Entries By Status Option Any
Given the Chronology_Filter_Dialog is open
When user selects Status_Option Any
Then Chronology_Entries with Any Status should display

Scenario: Filter Entries By Status Option Not Set
Given the Chronology_Filter_Dialog is open
When user selects Status_Option Not set
Then Chronology_Entries with Not set Status should display
