package com.opus2.magnum.documents.view;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static org.assertj.core.api.Assertions.*;
import net.thucydides.core.annotations.Steps;

public class CreateAnnotationOnDocument {
    @Steps
    DocumentViewSteps view;
    
    @When("save to Document")
    public void andSaveToDocument(){
        view.save();
    }
    
    @When("cancel note")
    public void andCancelNote(){
        view.cancel();
    }
    
    @Then("Note is created")
    public void thenNoteIsCreated(){
        assertThat(view.noteIsCreated().equals("block")).isTrue();
        view.createdNote();
    }   
    
    @When("user input New_Event_Details")
    public void userInputNewEventDetails(){
        view.newEntries();
    }
    
    @Then("Linked_Note is added As_A_Source to New_Entry")
    public void thenLinkedDocumentIsAddedAsASourceToNewEntry(){
        view.linkedNote();
    }
    
    @When("user selects $option Chronology_Option")
    public void testUserSelectsTestChronChronologyOption(String option){
        view.selectChronology(option);
    }
}
