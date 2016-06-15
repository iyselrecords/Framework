Narrative:
If the user is logged in, present on the Documents Page and they do not have Viewer Capabilities
they must beable to create a New Folder.

GivenStories: RegressionTests/MagnumUser/Login/LoginStepOneEnterUserEmailOrUserNameAndPassword.story
RegressionTests/MagnumUser/Login/LoginStepTwoEnterCharachtersOfMemorableWord.story
RegressionTests/MagnumUser/Magnum-User/NavigateToDocumentsPageViaDocumentsTab.story

Scenario: Create New Folder Documents Page 

Meta: @CreateFolderDocumentsPage

Given <User> is present on the <Documents_Page>
And does not have viewer capabilities
And the <New_Folder_Button> is visible
Then click the <New_Folder_Button> 
Then verify the <NEW_FOLDER__Dialog> is visible
And the <Change_Destintation_Button> is visible
And the <Name_Field> is visible
Then enter the <Folder_Name> into the <Name_Field>
Then verify the <Create_Folder_Button> is visible
Then press the <Create_Folder_Button>
Then verify the new <Folder_Name> is present in the <Documents_Index>

 


 







