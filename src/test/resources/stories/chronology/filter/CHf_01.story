Meta:
@regression
@filter
@CHF_01

Narrative:
In order to test Magnum application
As a tester
I want to use the BDD approach in testing features and functionality.
					 
Scenario: Verify Filter Dialog
When user clicks on Chronology Tab
Then Chronology page opens correctly
When user click on the Filter button
Then the Filter Dialog is visible

Examples:
chronology.table


Scenario: Verify Filtering Entries Without Description
When user clicks 'Item without description' checkbox
Then only entries without description are visible

Examples:
chronology.table


Scenario: Verify Filtering Entries By Date
When user input '<chro_date>'
And select On option
Then entries On, Before, After and Ranges from '<chro_date>' is visible
When user select Before option
Then entries On, Before, After and Ranges from '<chro_date>' is visible
When user select After option
Then entries On, Before, After and Ranges from '<chro_date>' is visible
When user select Range option
Then entries On, Before, After and Ranges from '<chro_date>' is visible

Examples:
chronology.table


Scenario: Verify Filtering Entries By Invalid Date
!--When user input '<chro_date>'
!--And select On option
!--Then entries On, Before, After and Ranges from '<chro_date>' is visible
!--When user select Before option
!--Then entries On, Before, After and Ranges from '<chro_date>' is visible
!--When user select After option
!--Then entries On, Before, After and Ranges from '<chro_date>' is visible
!--When user select Range option
!--Then entries On, Before, After and Ranges from '<chro_date>' is visible

Examples:
chronology.table


Scenario: Verify Filtering Entries By Types
When user select All
Then every type of entries is visible
When user select None
Then no entries is visible
When user select Fact
Then entries type Fact is visible
When user select Meeting
Then entries type Meeting is visible
When user select Event
Then entries type Event is visible
When user select Letter
Then entries type Letter is visible
When user select Email
Then entries type Email is visible
When user select No Type
Then entries type No Type is visible

Examples:
chronology.table


Scenario: Verify Filtering Entries By Status
When user select 'Any' option
Then entries with 'Any' status are visible
When user select 'Undisputed' option
Then entries with 'Undisputed' status are visible
When user select 'Disputed' option
Then entries with 'Disputed' status are visible
When user select 'Not set' option
Then entries that status are 'Not set' are visible

Examples:
chronology.table


Scenario: Verify Filtering Entries By Tags
When user click on the tag button
And select All and Apply
Then entries with any tag are visible
When user click on the tag button
And select any tag and Apply
Then entries with selected tag should be visible

Examples:
chronology.table


Scenario: Verify Creating A Shared Filter
When user select Item Without Description/Date/Type Filters
And select Save as Shared Filter
And enter '<shared_filter>'
And click OK
Then save filter should be visible on Shared Filters options

Examples:
chronology.table

Scenario: Verify Creating A Private Filter
When user select Date/Type Filters
And select Save as Private Filter
And enter '<private_filter>'
And click OK
Then save filter should be visible on Private Filters options

Examples:
chronology.table


Scenario: Verify Selecting Saved Shared/Private Filters Options 
When user click Shared Filters checkbox
And select '<shared_filter>'
Then entries filters saved on '<shared_filter>' are visible
When user click Private Filters checkbox
And select '<private_filter>'
Then entries filters saved on '<private_filter>' are visible

Examples:
chronology.table

Scenario: Verify Deleting Saved Shared/Private Filters Options 
When user click Shared Filters checkbox
And select '<shared_filter>'
And click delete icon
Then saved filtered entries should be deleted from dropdown
When user click Private Filters checkbox
And select '<private_filter>'
And click delete icon (x)
Then saved filtered entries should be deleted from dropdown

Examples:
chronology.table