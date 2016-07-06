Narrative: 
If a User is registered and has an active account they must be able to login 
basic login without two factor authentication is a two or three step process
depending on whether the User is logged in on another browser session
Login step one requires the User to input a correct User email or name and password 
Login step two requires the User to input three specific characters of their memorable word
Login must not be successful unless the conditions outlined above have been met 
If at any stage of process the User makes an error they must be informed of this mistake and the process reset

Background: if the User is registered and has an active account they must be able to login
Meta: @Login
@issue #Login
@version:6.11

Scenario: Enter Correct User Details And Password 

Given that a user is present on the login page
When the user authenticates successfully
And the user fills the memorable word options correctly
Then the user must be navigated to the home page


