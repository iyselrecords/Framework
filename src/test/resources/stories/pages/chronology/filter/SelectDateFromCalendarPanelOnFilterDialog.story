Narrative: 
ChronologyEventNewEntry ChronologyEventNewEntry ChronologyEventNewEntry

@Meta: @CHRON_09 @SelectDateFromCalendarPanel @ChronologyFilter @Chronology @Auto

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

Scenario: Select Date From Calendar Dropdown On Filter Pane
Given the Chronology_Filter_Dialog is open
When user opens Filter_Calendar_Dropdown
And clicks Next_Arrow to view Next_Month_Dates
And clicks Previous_Arrow to view Previous_Month_Dates
And selects Today's_Date
Then Chronology_Entries displays entries within Today's Date