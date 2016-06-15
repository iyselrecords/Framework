Narrative: 
If the user is logged in, and present on the Documents page 
they must beable to open and close the View Options Dropdown Menu.

GivenStories: RegressionTests/MagnumUser/Login/LoginStepOneEnterUserEmailOrUserNameAndPassword.story
RegressionTests/MagnumUser/Login/LoginStepTwoEnterCharachtersOfMemorableWord.story
RegressionTests/MagnumUser/Magnum-User/NavigateToDocumentsPageViaDocumentsTab.story

Scenario: Verify Tools Dropdown Menu Opens And Closes Docuemnts Page

Meta: @VerifyToolsDropdownMenuOpensAndCloses @MagnumUser @USER_GUI03

Given the <User> is logged in 
And present on the <Documents_Page> 
And the <Tools_Button> is visible
Then click the <Tools_Button>
Then verify the <Tools_Menu> is open
Then click the <Tools_Button>
Then verify the <Tools_Menu> is closed  
