Meta:
@regression
@magnumAdmin
@admin_022

Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality
					 
Scenario: Verify Renaming A Document
When user finds a '<doc>' and clicks on it
Then Preview should display first page of the document selected
When user right click on '<Document>'
And select option '<Rename>'
Then New Name For TestDoc Dialog should be visible
When user enters a '<new_name>' and click Ok
Then Document should be rename to '<new_name>'
When user right click on '<new_name>'
And select option '<Rename>'
Then New Name For TestDoc Dialog should be visible
When user enters '<previous_name>' and click Ok
Then Document should be rename to '<previous_name>'

Examples:
testData.table