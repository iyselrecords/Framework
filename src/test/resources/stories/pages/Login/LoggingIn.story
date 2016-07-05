Narrative: 
If a user is registered and has an active account they must beable to login 
basic login without two factor authentification is a two or three step process
depending on whether the user is logged in on another browser session
Login step one requires the user to input a correct user email or name and password 
Login step two requires the user to input three specific characters of their memorable word
Login must not be successful unless the conditions outlined above have been met 
If at any stage of process the user makes an error they must be informed of this mistake and the process reset

Background: if the user is registered and has an active account they must beable to login
Meta:
@issue #Login
Scenario: Enter Correct User Details And Password 

Given that a user is present on the login page
When the user authenticates successfully
Then the user is navigated to the memorableword page


Scenario: Enter Incorrect User Details And Correct Password

Given that a user is present on the login page
When the user fails to authenticate due to bad email
Then they must be notified for their error
And the process reset 

Scenario: Enter Correct User Details And Incorrect Password

Given that a user is present on the login page
When the user fails to authenticate due to bad password
Then they must be notified for their error
And the process reset 

Scenario: Enter Correct Characters Of Memorable Word

Given that a user is present on the memorableword page
When the user fills the memorable word options correctly
Then they must be navigated to the home page


Scenario: Enter Incorrect Characters Of Memorable Word

Given the user is present on the memorableword page
When the user fills the memorable word options incorrectly
Then they must be notified that the memorableword was incorrect
And the process reset


Scenario: Forced Login 

Given the <User> is present on the <Login_Page>
And the <User> is logged in on another browser session
When the <User> authenticates successfully
And selects the <Forced_Logout_Of_Other_Browser_Session_Checkbox>
Then they must be navigated to the <Memorable_Word_Page>



