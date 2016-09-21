Narrative: 
ResetEntryList ResetEntryList ResetEntryList

@Meta: @CHRON_53 @ResetEntryList @ChronologyFilter @Chronology @Auto

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

Scenario: Reset Chronologies List
Given the Reset_Button is visible
When user clicks the Reset_Button
Then Chronology_Entries should set to default