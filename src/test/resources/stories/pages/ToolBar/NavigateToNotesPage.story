Narrative: 
If the user is logged in, they are a member of a Workspace and are present on the Home Page
they must beable to navigate to the Notes Page by clicking the Notes Shortcut.

GivenStories: stories/pages/Login/LoggingIn.story

Meta: @NavigateToNotesViaShortcut @MagnumUser @USER_GUI02

Scenario: Navigate To Notes Page Via Shortcut On Home Page 

Given the <Notes_Shortcut> is visible  
When the <User> clicks the <Notes_Shortcut>     
Then they must be navigated to the <Notes_Page>