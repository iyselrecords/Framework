Running User Login
Meta:
@user

Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality
					 

Scenario: User Login Stage Another
Given user is present on Magnum loginpage
When user enter username and password
And click the login button
Then user should see the second stage of login

Scenario: User Login Stage Two
Given user is present on Memorable Word page
When the user enter first memorable character
And second memorable character
And third memorable character
And click login button
Then user should be on the homepage

Scenario: Select Workspace
Given the user is on homepage
When user select 'TAF' workspace
Then user should be on the Documents page