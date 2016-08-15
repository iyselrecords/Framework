Narrative: 
The Add To Chronology Dialog is a tool which is used to add both Documents and Transcripts to both new and existing Chronology Entrants
it is essential that the dialogs layout is both correct and consistent in appearance with the rest of the dialogs across the platform.   

@Meta: @VerifyAddToChronologyDialogIsAestheticallyCorrectDocumentsPage @MagnumUser @Admin @PowerUser @User

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
Then the Add_To Chronology_Dialog must open

Scenario: Verify Add To Chronology Dialog Is Aesthetically Correct Documents Page
Given the Add_To_Chronology_Dialog is open on the Documents_Page
When the user is viewing the Add_To_Chronology_Dialog
Then the Add_To_Chronology_Dialog must be Aesthetically consistent with other dialogs across the platform
And each of the Buttons, Fields, Icons and Element_Names must be correct on the Add_To_Chronology_Dialog