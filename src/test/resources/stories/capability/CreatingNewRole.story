Accessing User Capabilities
Meta:
@regression
@capabilities
@cap_02

Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality.


GivenStories: stories/precondition/LogInToMagnum.story

Scenario: Naviagte To Admin Page
Given user is present on Documents page
When user click the Admin tab
Then user is present on Admin page

Scenario: Verify Creating New Role
Given user is present on Admin page
When user click on link sidemenu
And click on New Role button
And enter Role's RL
And set General capabilities
And set Documents capabilities
And set Transcripts capabilities
And set Chronology capabilities
And set Exporting capabilities
And save changes
Then new Role is created with ability to choose its capabilities