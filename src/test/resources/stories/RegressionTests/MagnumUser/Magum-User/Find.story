Narrative:  
A find field is used to locate and filter items, If the user is logged in, and there is a find field visible
they must beable to find and filter results, using find. 

Scenario: Find 

Meta: @Find 

Given the <User> is logged in
And there is a <Find_Field> visible 
Then enter <Find_Input> into the <Find_Field>
Then verify the <Find_Input> is visible in the <Results_Section>
And all other <Possible_Results> are filtered out from the <Results_Section>

