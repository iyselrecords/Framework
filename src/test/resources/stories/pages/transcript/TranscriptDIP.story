Narrative:  
If the user is logged in, they are a member of a workspace and are present on any page 
they must beable to navigate to the Chronology Page  by clicking the Chronology Tab on the Navigation Bar.

Meta: @TranscriptDIP

Scenario: Enter Correct User Details And Password 
Given that a user is present on the login page
When the user authenticates successfully
And the user fills the memorable word options correctly
Then the user must be navigated to the home page

Scenario: Select Workspace And Navigate To Documents Page
Given the workspace is visible in the cases section
When the user selects workspace title
Then they must be navigated to the documents page

Scenario: Navigate To Transcripts Via The Transcripts Tab
Given the user is not present on the Transcripts_Page
And the Transcripts_Tab is visible
When the user clicks the Transcripts_Tab
Then they must be navigated to the Transcripts_Page

Scenario: TRANSCRIPT_01
Given user is present on Transcript_Page
When user mapping in progess on TRANSCRIPT_01
Then action should be verify

Scenario: TRANSCRIPT_02
Given user is present on Transcript_Page
When user mapping in progess on TRANSCRIPT_02
Then action should be verify

Scenario: TRANSCRIPT_03
Given user is present on Transcript_Page
When user mapping in progess on TRANSCRIPT_03
Then action should be verify

Scenario: TRANSCRIPT_04
Given user is present on Transcript_Page
When user mapping in progess on TRANSCRIPT_04
Then action should be verify

Scenario: TRANSCRIPT_05
Given user is present on Transcript_Page
When user mapping in progess on TRANSCRIPT_05
Then action should be verify

Scenario: TRANSCRIPT_06
Given user is present on Transcript_Page
When user mapping in progess on TRANSCRIPT_06 Day 2
Then action should be verify

Scenario: TRANSCRIPT_07
Given user is present on Transcript_Page
When user mapping in progess on TRANSCRIPT_07
Then action should be verify