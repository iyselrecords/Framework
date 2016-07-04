Narrative: 
If the user is logged in, they are a member of a Workspace and are present on the Any Page
they must beable to navigate to the Chronology Page by clicking the Chronology Shortcut.

GivenStories: stories/Login/LoggingIn.story

Meta: @NavigateToChronologyPage @MagnumUser @USER_GUI02

Scenario: Navigate To Chronology Page Via Shortcut On Home Page 

Given the <Chronology_Shortcut> is visible  
When the <User> clicks the <Chronology_Shortcut>
Then they must be navigated to the <Chronology_Page>