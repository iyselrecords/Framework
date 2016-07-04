Meta:
@regression
@magnumAdmin
@admin_011a

Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality


Scenario: Verify Creating New Folder
GivenStories: stories/precondition/LogInToMagnum.story
When user clicks on New Folder button
And enters <folder_name>
And click Create Folder button
Then created folder should be visible on workspace

Examples:
testData.table