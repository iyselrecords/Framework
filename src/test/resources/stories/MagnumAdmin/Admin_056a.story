Meta:
@regression
@magnumAdmin
@admin_056a

Narrative:
In order to test Magnum application
As a tester
I want to test features and functionality

GivenStories: stories/Login/UserLogin.story

Scenario: Verify Organizing Bulk Documents
When user select Bulk Organize option from Tool dropdown
And find bulk documents '<bulk_doc>', '<bulk_doc2>' and '<bulk_doc3>'
And select '<bulk_fol>' to move document
And move document
Then documents are organise in a selected folder

Examples:
testData.table