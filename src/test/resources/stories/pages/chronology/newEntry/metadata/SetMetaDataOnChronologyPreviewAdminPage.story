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
And enters Exhibit_Value TstExh
And Deponent_Value TstDep
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