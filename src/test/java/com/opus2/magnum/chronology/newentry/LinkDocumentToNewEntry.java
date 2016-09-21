package com.opus2.magnum.chronology.newentry;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import net.thucydides.core.annotations.Steps;

public class LinkDocumentToNewEntry {
    @Steps
    ChronologyNewEntrySteps newEntry;
    
    @When("user inputs New_Event_Details")
    public void userInputsNewEventDetails(){
        newEntry.newEntries();
    }
    
    @Then("Linked_Document is added As_A_Source to New_Entry")
    public void thenLinkedDocumentIsAddedAsASourceToNewEntry(){
        newEntry.entry();
        newEntry.deleteEntry();
    }
}
