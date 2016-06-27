Meta:
@regression
@magnumAdmin
@documents
@admin_083

Narrative:
In order to test Magnum application
As a tester
I want to test features and functionality

GivenStories: stories/Login/UserLogin.story

Scenario: Verify Creating New Metadata Column
When user navigate to Admin page
And clicks on Metadata SideMenu
And click on 'Add New Column' button
Then the Custom Fields dialog is displayed
When user enters '<label>'
And '<field_name>'
And select Align option
And check 'Show by Default'
And check 'Wrap Text'
And select Column Position option
And check 'Show in Doc Chooser'
And check 'Show in Search Results'
And check 'Show in Chronology Preview'
And check 'Show on Export Coverpage'
And check 'Show on Transcripts Page'
And check 'Custom Page Header'
And check 'Export File Name Convention'
And check 'Show in Magnum Notes'
And click the apply button
Then settings is applied to Document column

Examples:
testData.table