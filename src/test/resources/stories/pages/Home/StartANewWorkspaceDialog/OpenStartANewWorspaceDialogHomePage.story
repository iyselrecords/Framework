Narrative: 
If the user is logged in, they have Administrator Capabilities and are present on the Home Page
they must beable to open the Start A New Workspace Dialog.

GivenStories: stories/pages/Login/LoggingIn.story

Meta: 

Scenario: Create A New Workspace Home Page

Given the <User> is present on the <Home_Page>
And they have <Admin_Capabilities> 
And the <New_Workspace_Button>  is visible
When the <User> clicks the <New_Workspace_Button>  
Then the <Start_A_New_Workspace_Dialog> must open
