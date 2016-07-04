Open Filter Dialog
Meta:
@regression
@filter
@CHF_01

Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality.

GivenStories: stories/precondition/LogInToMagnum.story

Scenario: Naviagte To Chronology Page
Given user is present on Documents page
When user click the Chronology tab
Then user is present on Chronology page

Scenario: Open Filter Dialog
Given user is present on Chronology page
When user click the Filter button
Then the Filter Dialog is display