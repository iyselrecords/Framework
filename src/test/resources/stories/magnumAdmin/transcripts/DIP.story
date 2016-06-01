Meta:
@dip

Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality.


Scenario: Verify Basic Transcript Action
When user navigates to Transcript page
When user clicks on 'Import Transcript' tab
Then the Import Transcript Dialog should be visible
When user input '<testTranscripts>' on Find input box
Then '<testTranscripts>' Transcript is filtered and displayed on preview pane
When user select '<testTranscripts>' Transcript
Then '<testTranscripts>' Transcript is displayed on preview pane
When user clicks on 'Edit Transcript Properties' tab
Then the Edit Transcript Dialog should be visible

Examples:
transcript.table.


Scenario: Verify Transcript Preview Section
When user selects page <pageNum>
Then page <pageNum> should be visible on preview
When user clicks the Next (>) button
Then Next page should be visible
When user clicks the Previous (<) button
Then Previous page should be visible

Examples:
transcript.table.					 

Scenario: Designing Transcript In A New Tab
When user select '<testTranscripts>' Transcript
Then '<testTranscripts>' Transcript is displayed on preview pane
When user clicks on '<testTranscripts>' Transcript
Then '<testTranscripts>' Transcript should open in a new tab

Examples:
transcript.table

Scenario: Toggling Notes, Linked Documents And Designation
When user toggle between buttons to display 'Notes'
Then notes should be visible on Wall
When user toggle between buttons to display 'Linked Documents'
Then linked documents should be visible on Wall
When user toggle between buttons to display 'Designations'
Then designations should be visible on Wall

Examples:
transcript.table

Scenario: Toggling Notes, Linked Documents And Designation From Wall
When user clicks on 'Toggle Notes' button
Then notes should not be visible on Wall
When user clicks on 'Toggle Linked Documents' button
Then linked documents should not be visible on Wall
When user clicks on 'Toggle Designations' button
Then designations should not be visible on Wall

Examples:
transcript.table.
