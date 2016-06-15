Narrative: 
If the user is logged in, present on the Documents Page and has at least one previously uploaded document
they must beable to filter the Metadata columns to and from the Documents index using the View Options Dropdown Menu. 

GivenStories: RegressionTests/MagnumUser/Login/LoginStepOneEnterUserEmailOrUserNameAndPassword.story
RegressionTests/MagnumUser/Login/LoginStepTwoEnterCharachtersOfMemorableWord.story
RegressionTests/MagnumUser/Magnum-User/NavigateToDocumentsPageViaDocumentsTab.story

Scenario Outline: View Options Dropdown Menu Functionality Documents Page 

Meta: @FilterMetadataColumnsDocumentsPage

Given the <User> is logged in
And present on the <Documents_Page>
And there is at least one <Document> in the index
And the <View_Options_Menu_Button> is visible
Then click the <View_Options_Menu_Button>    
Then verify the <View_Options_Menu> is open
And the <View_Option> is visible 
And the <Metadata_Column> is visible
Then click the <View_Option>
Then verify the <View_Option> is unselected
And verify the <Metadata_Column> is hidden
Then click the <View_Option>   
And verify the <View_Option> is selected 
Then verify the <Metadata_Column> is visible
Then Then click the <View_Options_Menu_Button>
And verify the <View_Options_Menu> is closed

Examples: 
| View_Option | Metadata_Column | 
| Upload_Date | Upload_Date     |
| By          | By              |
| File_Size   | File_Size       |
| Tags        | Tags            |
| Date        | Date            |
| Description | Description     |
| Exhibit     | Exhibit         |
| Deponent    | Deponent        |
| Case        | Case            |
| Custodian   | Custodian       |
| To          | To              |
| From        | From            |
| CC          | CC              |
| BegBates    | BegBates        |
| EndBates    | EndBates        |
| magnumid    | magnumid        |
| BegAttach   | BegAttach       |
| Native      | Native          |
