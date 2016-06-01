Meta:
@regression
@magnumAdmin
@admin_0281

Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality
					 
Scenario: Verify Moving A Document To Another Location
When user finds a '<doc>' and clicks on it
Then Preview should display first page of the document selected
When user right click on '<Document>'
And select option '<Move>'
And select '<Destination>' folder and click Apply button
Then '<Document>' should be move to '<Destination>' folder

Examples:
testData.table