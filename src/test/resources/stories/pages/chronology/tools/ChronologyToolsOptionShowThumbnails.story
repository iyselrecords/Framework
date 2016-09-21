Narrative: 
DeleteAllEntries DeleteAllEntries DeleteAllEntries

@Meta: @CHRON_20 @ShowThumbnails @ChronologyTools @Chronology @Auto

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

Scenario: Show Entries With Thumbnails
Given the Tools_Button is visible
When user click Tools_Button
And uncheck Show_Thumbnails_Checkbox
Then Thumbnails are not displayed on Entries
When user check Show_Thumbnails_Checkbox
Then Chronology_Entries displays Thumbnails