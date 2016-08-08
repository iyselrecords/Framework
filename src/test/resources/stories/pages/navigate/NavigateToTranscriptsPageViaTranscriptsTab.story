Narrative: 
If the user is logged in, they are a member of a workspace and are present on any page 
they must beable to navigate to the Transcripts Page  by clicking the Transcripts Tab on the Navigation Bar.

Meta: @NavigateToTranscripts  @MagnumUser @USER_GUI01 @Admin @PowerUser @User @Viewer

GivenStories: stories/pages/navigate/ChooseWorkspace.story

Scenario: Navigate To Transcripts Via The Transcripts Tab
Given the user is not present on the Transcripts_Page
And the Transcripts_Tab is visible
When the user clicks the Transcripts_Tab
Then they must be navigated to the Transcripts_Page