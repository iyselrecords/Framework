Narrative: 
ChronologyEventNewEntry ChronologyEventNewEntry ChronologyEventNewEntry

@Meta: @CHRON_37 @SetMetaDataOnChronologyPreview @Chronology

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

Scenario: Select Context Properties Option
Given Properties option is visible on Context_Menu
When user clicks Properties_Option
Then Properties_Option Dialog is visible

Scenario: Set Document Exhibit Properties 
Given Properties_Dialog is open
When user selects Exhibit option from Type_Dropdowm
And enters Exhibit_Value TestExh
And Deponent_Value TestDep
And apply
Then Properties are applied to Document

Scenario: Navigate To Admin Page Via The Admin Tab
Given the user is not present on the Admin_Page
And the Admin_Tab is visible
When the user clicks the Admin_Tab
Then they must be navgated to the Admin_Page

Scenario: Navigate To MetaData Page
Given user is present on Admin_Page
And Metadata SideMenu_Link is visible
When user clicks the SideMenu_Link
Then Document_Types and MetaData_Columns should display default values

Scenario: Edit Exhibit MetaData To Show In Chronology Preview
Given Exhibit column is visible on MataData_Columns Section
When user clicks Edit to open Custom_Fields_Dialog
And check Show_In_Chronology_Preview checkout
And apply settings
Then Exhibit Metadata is selected

Scenario: Edit Deponent MetaData To Show In Chronology Preview
Given Deponent column is visible on MataData_Columns Section
When user clicks Edit to open Custom_Fields_Dialog
And check Show_In_Chronology_Preview checkout
And apply settings
Then Deponent Metadata is selected

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

Scenario: Create New Event Entry
Given the Chronology_Event_Dialog is open
When user inputs Chronology_Event_Details
Then a new Chronology_Event is added to Event_List