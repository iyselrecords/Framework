Meta:
@regression
@magnumAdmin
@admin_072

Narrative:
In order to test Magnum application
As a tester
I want to test features and functionality

GivenStories: stories/Login/UserLogin.story

Scenario: Verify Organizing Bulk Documents By Adding Tag
When user select Bulk Organize option from Tool dropdown
And find bulk documents '<bulk_doc>', '<bulk_doc2>' and '<bulk_doc3>'
And select '<tag>'
And and apply tag to document
And select '<bulk_fol>' to move document
And move document
Then documents are organise in a selected folder

Examples:
testData.table