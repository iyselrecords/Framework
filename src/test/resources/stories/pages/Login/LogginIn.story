Narrative: 
If a user is registered and has an active account they must beable to login 
basic login without two factor authentification is a two or three step process
depending on whether the user is logged in on another browser session
Login step one requires the user to input a correct user email or name and password 
Login step two requires the user to input three specific characters of their memorable word
Login must not be successful unless the conditions outlined above have been met 
If at any stage of process the user makes an error they must be informed of this mistake and the process reset

Background: if the user is registered and has an active account they must beable to login

Scenario: Enter Correct User Details And Password 

Given the <User> is present on the <Login_Page>
When the <User> authenticates successfully
Then they must be navigated to the <Memorable_Word_Page>


Scenario: Enter Incorrect User Details And Correct Password

Given the <User> is present on the <Login_Page>
When the <User> fails to authenticate due to bad email
Then they must be notified that the <Incorrect_Details> have been entered
And the process reset 

Scenario: Enter Correct User Details And Incorrect Password

Given the <User> is present on the <Login_Page>
When the <User> fails to authenticate due to bad password
Then they must be notified that the <Incorrect_Details> have been entered
And the process reset 

Scenario: Enter Correct Characters Of Memorable Word

Given the <User> is present on the <Memorable_Word_Page>
When the <User> fills the memorable word options correctly
Then they must be navigated to the <Home_Page>


Scenario: Enter Incorrect Characters Of Memorable Word

Given the <User> is present on the <Memorable_Word_Page>
When the <User> fills the memorable word options incorrectly
Then they must be notified that the <Memorable_Word> was incorrect
And the process reset


Scenario: Forced Login 

Given the <User> is present on the <Login_Page>
And the <User> is logged in on another browser session
When the <User> authenticates successfully
And selects the <Forced_Logout_Of_Other_Browser_Session_Checkbox>
Then they must be navigated to the <Memorable_Word_Page>



