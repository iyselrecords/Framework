Narrative: 
If the user is logged in, they are a member of a workspace which has recently uploaded Documents
they must beable to view said Documents on the Recent Documents section of the Home page. 

Meta: @VerifyRecentDocumentsLoadedHomePage @MagnumUser @USER_GUI04 @Admin @PowerUSer @User @Viewer

GivenStories: stories/pages/navigate/ChooseWorkspace.story

Scenario: Verify Recent Documents Section Loaded  Home Page
GivenStories: stories/pages/navigate/NavigateToHomePageViaHomeIcon.story
Given the Recent_Documents section is visible on the Home Page
When the Recent_Documents section has loaded
Then the Target Document must be visible
And the Target Transcript must be visible

Examples:
testData.table