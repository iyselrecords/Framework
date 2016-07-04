Creating New Entry List
Meta:
@regression
@chronology
@ch_002

Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality.

GivenStories: stories/precondition/LogInToMagnum.story

Scenario: Naviagte To Chronology Page
Given user is present on Documents page
When user click the Chronology tab
Then user is present on Chronology page

Scenario: Creating New Entry List
Given user is present on Chronology page
When user click on New Entry button
Then a new chronology entry is created