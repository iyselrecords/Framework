Meta:
@regression
@magnumAdmin
@admin_056

Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality
					 
Scenario: Verify Organizing Bulk Documents
When user select Bulk Organize option from Tool dropdown
And find bulk documents '<bulk_doc>', '<bulk_doc2>' and '<bulk_doc3>'
And select a '<bulk_fol>'
And select and apply tag
And move document
Then documents are organise in a selected folder

Examples:
testData.table