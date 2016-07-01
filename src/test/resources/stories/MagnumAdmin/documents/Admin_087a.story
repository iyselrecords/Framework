Meta:
@regression
@magnumAdmin
@documents
@admin_087

Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality
					 
Scenario: Verify Creating a Folder And Importing Document
!--When user creates a '<doc_fol>'
!--When upload a '<doc>' into '<doc_fol>'
!--Then '<doc>' should be uploaded to '<doc_fol>'

Examples:
testData.table


Scenario: Verify Inputing Date Properties To Document 
When user select '<doc>'
And rightclick '<doc>' and select Properties
Then Properties Dialog should be visible
When user select Document type
And input date
And apply to '<doc>'
Then date metadata in inputted to '<doc>'

Examples:
testData.table