package com.opus2.magnum.chronology.newentry;

import org.jbehave.core.annotations.When;

import net.thucydides.core.annotations.Steps;

public class LinkDocumentToNewEntry {
    @Steps
    ChronologyNewEntrySteps newEntry;
    
    @When("user inputs New_Event_Details")
    public void userInputsNewEventDetails(){
        newEntry.newEntries();
    }
}
