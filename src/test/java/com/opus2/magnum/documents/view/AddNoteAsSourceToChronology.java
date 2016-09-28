package com.opus2.magnum.documents.view;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;

import static org.assertj.core.api.Assertions.*;
import net.thucydides.core.annotations.Steps;

public class AddNoteAsSourceToChronology {
    @Steps
    DocumentViewSteps view;
    
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
}
