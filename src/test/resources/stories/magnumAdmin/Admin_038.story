Meta:
@regression
@magnumAdmin
@admin_038

Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality.
	
Scenario: Verify Invite User by Email
When user clicks on Admin Tab
And clicks the Users Tab
Then the Users Tab is opened
When the user clicks the Email section.
And they enter an '<email>' into the Email Section.
And they click Invite
Then the user receives an email invitation.

Examples:
testData.table


Scenario: User can accept email invitations and input details
When user clicks on the email invitation
Then they should be on the Registration page
When the user enters a First Name
And enters a Last Name
And selects a Security Question
And enters a Security Answer 
And enters a password
And confirms the password
And enters a memorable word
And confirms the memorable word
And clicks Create Account
Then they should be on the Terms and Conditions Page
When the user clicks Accept
Then they should be on Home page

Examples:
testData.table