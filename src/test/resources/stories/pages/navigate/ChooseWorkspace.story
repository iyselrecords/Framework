Narrative:
If the user is logged in, present on the Home page and they are a member of a Workspace
they must be able to navigate to the Documents Page of said workspace by double clicking the Title,
within the index on the Home Page.

Meta: @caselist

Scenario: Enter Correct User Details And Password 
Given that a user is present on the login page
When the user authenticates successfully
And the user fills the memorable word options correctly
Then the user must be navigated to the home page

Scenario: Select Workspace And Navigate To Documents Page
Given the workspace is visible in the cases section
When the user selects workspace title
Then they must be navigated to the documents page