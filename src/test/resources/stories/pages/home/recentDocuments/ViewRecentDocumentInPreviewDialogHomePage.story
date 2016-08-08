Narrative:
If the user is logged in, present on the Home page, and they are a member of a workspace which has recently uploaded Documents
they must beable to view the Documents individually in the Preview by clicking on the title of a Specific Document.  

Meta: @ViewRecentDocumentInPreviewHomePage  @MagnumUser @USER_GUI04 @Admin @PowerUser @User @Viewer

GivenStories: stories/pages/navigate/ChooseWorkspace.story

Scenario: Verify Recent Documents Section Loaded Home Page
GivenStories: stories/pages/navigate/NavigateToHomePageViaHomeIcon.story
Given the Recent_Documents section is visible on the Home Page
When the Recent_Documents section has loaded
Then the Target Document must be visible
And the Target Transcript must be visible

Scenario: View Recent Document In Preview Home Page
Given there is a <Document> visible in the Recent_Documents section
When the user clicks the Document_Title
Then the <Preview_Dialog> must open via the <Document_Title>
And the correct <Document> must be loaded in the <Preview_Dialog>
And the <Preview_Dialog_Title> must equal the <Document_Title>

Examples:
testData.table