Narrative: 
ChronologyEventNewEntry ChronologyEventNewEntry ChronologyEventNewEntry

@Meta: @CHRON_26 @AddEntryFromDocumentPage @Chronology

Scenario: Enter Correct User Details And Password 
Given that a user is present on the login page
When the user authenticates successfully
And the user fills the memorable word options correctly
Then the user must be navigated to the home page

Scenario: Select Workspace And Navigate To Documents Page
Given the workspace is visible in the cases section
When the user selects workspace title
Then they must be navigated to the documents page

Scenario: Open Right Click Menu Document Level Documents Page
Given there is at least one Document in the Document_Index
When the user right clicks the Document
Then the Right_Click_Menu must open at document level

Scenario: Open Add To Dialog Documents Page
Given the Add_To_Option is visible in the Right_Click_Menu
When the user hovers the pointer over the Add_To_Option
Then the Add_To_Menu must open

Scenario: Create New Event Entry
Given the Chronology_Event_Dialog is open
When user inputs Chronology_Event_Details
Then a new Chronology_Event is added to Event_List