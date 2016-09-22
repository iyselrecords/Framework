Narrative:  
If the user is logged in, they are a member of a workspace and are present on any page 
they must beable to navigate to the Chronology Page  by clicking the Chronology Tab on the Navigation Bar.

Meta: @Admin @TranscriptViewDIP

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

Scenario: Select And Preview Transcript 
Given user is present on Transcript_Page
When user select and clicks Day 2 Transcript
Then Transcript is loaded on Preview_Pane

Scenario: Navigate To Transcript View Page
Given Transcript is loaded on Preview_Pane
When user clicks on Preview_Pane
Then Transcript opens in a new tab with Detailed_Functionality

Scenario: TRANSCRIPTVIEW_01
Given user is present on TranscriptView_Page
When user mapping in progess on TRANSCRIPTVIEW_01
Then action should be verify

Scenario: TRANSCRIPTVIEW_02
Given user is present on TranscriptView_Page
When user mapping in progess on TRANSCRIPTVIEW_02
Then action should be verify

Scenario: TRANSCRIPTVIEW_03
Given user is present on TranscriptView_Page
When user mapping in progess on TRANSCRIPTVIEW_03
Then action should be verify

Scenario: TRANSCRIPTVIEW_04
Given user is present on TranscriptView_Page
When user mapping in progess on TRANSCRIPTVIEW_04
Then action should be verify

Scenario: TRANSCRIPTVIEW_05
Given user is present on TranscriptView_Page
When user mapping in progess on TRANSCRIPTVIEW_05
Then action should be verify

Scenario: TRANSCRIPTVIEW_06
Given user is present on TranscriptView_Page
When user mapping in progess on TRANSCRIPTVIEW_06
Then action should be verify

Scenario: TRANSCRIPTVIEW_07
Given user is present on TranscriptView_Page
When user mapping in progess on TRANSCRIPTVIEW_07
Then action should be verify

Scenario: TRANSCRIPTVIEW_08
Given user is present on TranscriptView_Page
When user mapping in progess on TRANSCRIPTVIEW_08
Then action should be verify

Scenario: TRANSCRIPTVIEW_09
Given user is present on TranscriptView_Page
When user mapping in progess on TRANSCRIPTVIEW_09
Then action should be verify

Scenario: TRANSCRIPTVIEW_10
Given user is present on TranscriptView_Page
When user mapping in progess on TRANSCRIPTVIEW_10
Then action should be verify

Scenario: TRANSCRIPTVIEW_11
Given user is present on TranscriptView_Page
When user mapping in progess on TRANSCRIPTVIEW_11
Then action should be verify

Scenario: TRANSCRIPTVIEW_12
Given user is present on TranscriptView_Page
When user mapping in progess on TRANSCRIPTVIEW_12
Then action should be verify

Scenario: TRANSCRIPTVIEW_13
Given user is present on TranscriptView_Page
When user mapping in progess on TRANSCRIPTVIEW_13
Then action should be verify

Scenario: TRANSCRIPTVIEW_14
Given user is present on TranscriptView_Page
When user mapping in progess on TRANSCRIPTVIEW_14
Then action should be verify

Scenario: TRANSCRIPTVIEW_15
Given user is present on TranscriptView_Page
When user mapping in progess on TRANSCRIPTVIEW_15
Then action should be verify

Scenario: TRANSCRIPTVIEW_16
Given user is present on TranscriptView_Page
When user mapping in progess on TRANSCRIPTVIEW_16
Then action should be verify

Scenario: TRANSCRIPTVIEW_17
Given user is present on TranscriptView_Page
When user mapping in progess on TRANSCRIPTVIEW_17
Then action should be verify

Scenario: TRANSCRIPTVIEW_18
Given user is present on TranscriptView_Page
When user mapping in progess on TRANSCRIPTVIEW_18
Then action should be verify

Scenario: TRANSCRIPTVIEW_19
Given user is present on TranscriptView_Page
When user mapping in progess on TRANSCRIPTVIEW_19
Then action should be verify

Scenario: TRANSCRIPTVIEW_20
Given user is present on TranscriptView_Page
When user mapping in progess on TRANSCRIPTVIEW_20
Then action should be verify

Scenario: TRANSCRIPTVIEW_21
Given user is present on TranscriptView_Page
When user mapping in progess on TRANSCRIPTVIEW_21
Then action should be verify

Scenario: TRANSCRIPTVIEW_22
Given user is present on TranscriptView_Page
When user mapping in progess on TRANSCRIPTVIEW_22
Then action should be verify

Scenario: TRANSCRIPTVIEW_23
Given user is present on TranscriptView_Page
When user mapping in progess on TRANSCRIPTVIEW_23
Then action should be verify

Scenario: TRANSCRIPTVIEW_24
Given user is present on TranscriptView_Page
When user mapping in progess on TRANSCRIPTVIEW_24
Then action should be verify

Scenario: TRANSCRIPTVIEW_25
Given user is present on TranscriptView_Page
When user mapping in progess on TRANSCRIPTVIEW_25
Then action should be verify

Scenario: TRANSCRIPTVIEW_26
Given user is present on TranscriptView_Page
When user mapping in progess on TRANSCRIPTVIEW_26
Then action should be verify

Scenario: TRANSCRIPTVIEW_27
Given user is present on TranscriptView_Page
When user mapping in progess on TRANSCRIPTVIEW_27
Then action should be verify