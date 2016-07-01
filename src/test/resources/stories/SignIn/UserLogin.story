Meta:
@login

Narrative:
In order to test Magnum application
As a tester
I want to test features and functionality

Scenario: User Login Stage One
Given the user is on Magnum homepage
When the user enter username and password
And click the login button
Then user should see the second stage of login

Scenario: Select Workspace
Given the user is on homepage
When user select 'TAF' workspace
Then user should be on the Documents page