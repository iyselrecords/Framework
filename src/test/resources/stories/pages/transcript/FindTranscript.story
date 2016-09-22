Narrative: 
If the user is logged in, they are a member of a workspace and are present on any page 
they must beable to navigate to the Transcripts Page  by clicking the Transcripts Tab on the Navigation Bar.

Meta: @NavigateToTranscripts  @Transcripts @TRANSCRIPTS_06

Scenario: Enter Correct User Details And Password 
Given that a user is present on the login page
When the user authenticates successfully
And the user fills the memorable word options correctly
Then the user must be navigated to the home page

Scenario: Open Select Workspace Dropdown
Given the user is a member of several Workspaces
And the Workspace_Info_Button is visible
When the user clicks the Workspace_Info_Button
Then the Workspace_Dropdown_Menu must open

Scenario: Select Workspace Workspace Dropdown Menu
Given the Workspace_Title is visible in the Cases section
When the user clicks the Workspace_Title
Then the Page_Title must equal the Workspace_Title

Scenario: Navigate To Transcripts Via The Transcripts Tab
Given the user is not present on the Transcripts_Page
And the Transcripts_Tab is visible
When the user clicks the Transcripts_Tab
Then they must be navigated to the Transcripts_Page

Scenario: Find Transcript
Given user is present on Transcript_Page
When user input Transcript_Title Day 3 on Find_Input
Then Transcript should be visible and highlighted