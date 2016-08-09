Narrative: 
If the user is logged in and present on the Documents Page where there is at least one Folder in the index
they must beable to open the Right Click Menu by right clicking on said Folder. 

Meta: @OpenRightClickMenuFolderLevelDocumentsPage @MagnumUser @USER_GUI08 @Admin @PowerUser @User

Scenario: Open Right Click Menu Folder Level Documents Page
GivenStories: stories/pages/navigate/ChooseWorkspace.story
Given there is at least one Folder in the Document_Index
When the user right clicks the Folder
Then the Right_Click_Menu must open at folder level