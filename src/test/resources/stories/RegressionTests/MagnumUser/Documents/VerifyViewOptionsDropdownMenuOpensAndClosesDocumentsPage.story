Narrative: 
If the user is logged in, and present on the Documents page 
they must beable to open and close the View Options Dropdown Menu. 

GivenStories: RegressionTests/MagnumUser/Login/LoginStepOneEnterUserEmailOrUserNameAndPassword.story
RegressionTests/MagnumUser/Login/LoginStepTwoEnterCharachtersOfMemorableWord.story
RegressionTests/MagnumUser/Magnum-User/NavigateToDocumentsPageViaDocumentsTab.story

Scenario: Verify View Options Dropdown Menu Opens And Closes Documents Page

Meta: @VerifyViewOptionsDropdownMenuOpensAndClosesDocumentsPage @MagnumUser @USER_GUI03

Given the <User> is logged in 
And present on the <Documents_Page> 
And the <View_Options_Menu_Button> is visible
Then click the <View_Options_Menu_Button>
Then verify the <View_Options_Menu> is open
Then click the <View_Options_Menu_Button>
Then verify the <View_Options_Menu> is closed    
    
    

