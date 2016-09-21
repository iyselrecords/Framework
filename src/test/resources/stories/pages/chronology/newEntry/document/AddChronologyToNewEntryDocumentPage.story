Narrative: 
ChronologyEventNewEntry ChronologyEventNewEntry ChronologyEventNewEntry

@Meta: @CHRON_27 @AddChronToNewEntry @Chronology

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

Scenario: Open Add To Chronology Dialog Via Add To Menu Documents Page
Given the Chronology_Option is visible in the Right Click Menu
When the user clicks the Chronology option
Then the Add_To_Chronology_Dialog must open

Scenario: Select Chronologies List And Create New Entry
Given Add_To_Chronology_Dialog is open
When user selects TestChron Chronology_List_Option
Then Chronology_Event_Dialog should be visible

Scenario: Create New Event Entry
Given the Chronology_Event_Dialog is open
When user inputs New_Event_Details
And clicks the Chronology_Tab
And selects Chronologies_List_Option
Then a new Chronology_Event is added to Event_List