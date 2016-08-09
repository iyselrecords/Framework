Narrative: 
If the user is logged in and present on the Documents Page where the Right Click Menu is open at Document level
they must beable to open the Access Dialog by selecting the option from the menu. 

Meta: @OpenAccessDialogDocumentLevelDocumentsPage @MagnumAdmin @USER_GUI08 @Admin 


Scenario: Open Access Dialog Document Level Documents Page
GivenStories: stories/pages/documents/rightClickMenu/OpenRightClickMenuDocumentLevelDocumentsPage.story
Given the Access_Option is visible in the Right_Click_Menu
When the user clicks the Access_Option
Then the Access_Dialog must open