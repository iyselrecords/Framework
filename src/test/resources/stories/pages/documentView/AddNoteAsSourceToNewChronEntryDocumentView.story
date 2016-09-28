Narrative: 
ChronologyEventNewEntry ChronologyEventNewEntry ChronologyEventNewEntry

@Meta: @TestDocView @AddAsSourceToNewChronEntry @Chronology @Auto

Scenario: Enter Correct User Details And Password 
Given that a user is present on the login page
When the user authenticates successfully
And the user fills the memorable word options correctly
Then the user must be navigated to the home page

Scenario: Select Workspace And Navigate To Documents Page
Given the workspace is visible in the cases section
When the user selects workspace title
Then they must be navigated to the documents page

Scenario: Load Document To Preview Documents Page 
Given there is a Document visible in the Document_index
When a user clicks the Document_Title
Then the Document must load to the Document_Preview

Scenario: Navigate To Document Viewer Via Preview Documents Page
Given there is a Document loaded in the Document_Preview
When the user clicks the Document in the Document_Preview
Then the user must be navigated to Document_Viewer

Scenario: Highlight Document Text 
Given user is present on Document_View page
When user highlight Document_Text
Then the Notepad_Annotation_Dialog should be visible

Scenario: Add Note To New Chronology Entry
Given Notepad_Annotation_Dialog is open
When user add newEntryNote
And cancel note
