package com.opus2.magnum.documents.view;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.opus2.util.Util;

import static org.assertj.core.api.Assertions.*;
import net.thucydides.core.annotations.Steps;

public class CreateAnnotationOnDocument {
    @Steps
    DocumentViewSteps view;
    
    @Given("user is present on Document_View page")
    public void givenTheUserIsOnDocumentViewPage(){
        assertThat(view.viewUrl().equals(Util.getDriver().getCurrentUrl())).isTrue();
    }
    
    @When("user highlight Document_Text")
    public void whenUserHighlightDocumentText(){
        view.highlightText();
    }
    
    @Then("the Notepad_Annotation_Dialog should be visible")
    public void thenTheNotepad_Annotation_DialogShouldBeVisible(){
        assertThat(view.dialog().equals("block")).isTrue();
    }
    
    //add NOte
    @Given("Notepad_Annotation_Dialog is open")
    public void givenNotepadAnnotationaDialogIsOpen(){
        assertThat(view.dialog().equals("block")).isTrue();
    }
    
    @When("user add $note")
    public void whenUserAddsNote(String note){
        view.addNote(note);
    }
    
    @When("Add_As_Source_To_Chronology")
    public void andAddAsSourceToChronology(){
        view.add2Chronolgy();
    }
    
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
 

    
   //create New
    @When("user selects $option Chronology_Option")
    public void testUserSelectsTestChronChronologyOption(String option){
        view.selectChronology(option);
    }
    
    @When("user input New_Event_Details")
    public void userInputNewEventDetails(){
        view.newEntries();
    }
    
    @Then("Linked_Note is added As_A_Source to New_Entry")
    public void thenLinkedDocumentIsAddedAsASourceToNewEntry(){
        view.linkedNote();
    }
}
