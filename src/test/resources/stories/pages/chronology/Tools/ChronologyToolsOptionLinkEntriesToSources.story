Narrative: 
LinkEntriesToSources LinkEntriesToSources LinkEntriesToSources

@Meta: @CHRON_19 @LinkEntriesToSources @ChronologyTools @Chronology

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

Scenario: Open Import Entries Dialog
Given the Import_Entries_Button is visible
When user clicks the Import_Entries_Button
Then Import_Entries_Dialog should be visible

Scenario: Select Entries To Import
Given the Import_Entries_Dialog is open
And Select_File_Button is visible
When user clicks Select_File_Button
And import file
And confirms action
Then Entries_Event are added to Event_List

Scenario: Open And Select Chronology Tools Option
Given the Tools_Button is visible
When user open and selects Link_Entries_To_Sources option
Then Link_Entries_To_Sources_Dialog should be visible

Scenario: Link Entries To Sources
Given the Link_Entries_To_Sources_Dialog is open
And there Are Possible_Match
When user clicks Create_Links_Button
Then Document_Scource should be Linked to Chronology_Entries