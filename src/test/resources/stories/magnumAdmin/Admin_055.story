Meta:
@regression
@magnumAdmin
@admin_055

Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality
					 
Scenario: Verify Replacing Document With Another Document
When user select a '<doc>', rightclick
And select Replace option
And choose a '<rep_doc>'
And click Next
And wait for progress bar
And click Replace
And close the Dialog and refresh page
Then '<doc>' should replaced by '<rep_doc>'

Examples:
testData.table