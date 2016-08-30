Narrative: 
The Folder Colour Dialog is a tool which is used to change the colour of Folders on the Documents and Transcripts Pages 
it is essential that the dialogs layout is both correct and consistent in appearance with the rest of the dialogs across the platform.   

@Meta: @VerifyFolderColourDialogIsAestheticallyCorrectDocumentsPage @MagnumUser @Admin @PowerUser @User @AdminUser

Scenario: Enter Correct User Details And Password 
Given that a user is present on the login page
When the user authenticates successfully
And the user fills the memorable word options correctly
Then the user must be navigated to the home page

Scenario: Navigate To Manage Users and Workspaces
Given that a user is present on the home page
And System_Admin button is visible
When the user clicks System_Admin button
Then the user must be navigated to Admin_User page on a new tab

Scenario: Find User From User List Admin User Page
Given the Find_Input box is visible
And User is listed in User_List
When the user enters User_Email
Then User_Email is visible

Scenario: Select Displayed User Admin User Page
Given Filtered_User is visible
When the user clicks displayed checkbox button
Then User is selected

Scenario: Open Settings Dropdown Admin User Page
Given the Settings_Dropdown_Button is visible
When user clicks the Settings_Dropdown_Button
Then Setting_Dropdown should display Dropdown_Options

Scenario: Select Settings Disable Account Option Admin User Page
Given the Settings_Dropdown is open
When the user select Disable_Account option
Then Confirm_Alert should be visible