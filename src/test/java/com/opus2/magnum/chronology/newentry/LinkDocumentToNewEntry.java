package com.opus2.magnum.chronology.newentry;

import static org.assertj.core.api.Assertions.assertThat;

import org.jbehave.core.annotations.Given;
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
    
    @When("user selects Existing_Entry $entry")
    public void userSelectsExistingEntry(String entry){
        newEntry.existingEntry(entry);
    }
    
    @Given("the Select_A_Chronology_Entry_Dialog is open")
    public void givenTheChronologyEventDialogIsOpen(){
        assertThat(newEntry.eventDialog(ChronologyNewEntry.SELECT_CHRONOLOGY_ENTRY_DIALOG).equals("block")).isTrue();
    }
    
    @Then("Linked_Document is added As_A_Source to Existing_Entry")
    public void thenLinkedDocumentIsAddedAsASourceToExistingEntry(){
        
    }
}
