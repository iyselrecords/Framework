Meta:
@regression
@magnumAdmin
@admin_040

Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality

GivenStories: stories/Login/UserLogin.story

Scenario: Verify Monitoring User Activity
When user clicks on Admin Tab
And clicks the Monitor Activity link
Then the Monitor Activity page is opened
When the user clicks the Show Activity For links
Then the table should change to display that information (edited)

Examples:
testData.table