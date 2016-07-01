Meta:
@magnumAdmin
@regression
@admin_054

Narrative:
In order to test Magnum application
As a tester
I want to test features and functionality

GivenStories: stories/Login/UserLogin.story

Scenario: Verify Upload First Document
When user clicks on Upload button
And click the select file button
And choose 'insertDoc' to select
And upload document
Then selected file is uploaded

Scenario: Verify User Login to Magnum
When user rightclick 'insertDoc'
And select 'Insert' option
And click 'Choose file' button
And select 'insertDoc2' file
And select Action 'insert'
And Position 'End'
And Numbering 'Within main flow'
And apply
Then document is inserted