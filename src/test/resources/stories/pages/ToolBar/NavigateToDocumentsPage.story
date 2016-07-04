Narrative: 
If the user is logged in, they are a member of a workspace and are present on the Home Page
they must beable to navigate to the Documents Page by clicking the Documents Shortcut.

GivenStories: stories/Login/LoggingIn.story

Meta: @NavigateToDocuments @MagnumUser @USER_GUI02 

Scenario: Navigate To Documents Page Via Shortcut From Home Page 
 
Given the <Documents_Shortcut> is visible  
When the <User> clicks the <Documents_Shortcut>
Then they must be navigated to the <Documents_Page>


