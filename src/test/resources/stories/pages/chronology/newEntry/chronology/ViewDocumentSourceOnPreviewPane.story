Narrative: 
ChronologyEventNewEntry ChronologyEventNewEntry ChronologyEventNewEntry

@Meta: @CHRON_13 @ViewDocumentSourceOnPreview @Chronology @Done

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

Scenario: Open New Entry Event Dialog
Given the New_Entry_Button is visible
When user clicks the New_Entry_Button
Then Chronology_Event_Dialog should be visible

Scenario: Add Document Source And Preview
Given the Chronology_Event_Dialog is open
When user adds Document_Source RecentTestDoc
And clicks Document to Preview
Then Preview_Dialog should load Document

Scenario: View Document on Document View
Given Preview_Dialog is open
When user clicks on Document
Then Document should open in a new tab