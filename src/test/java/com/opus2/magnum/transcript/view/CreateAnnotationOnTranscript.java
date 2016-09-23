package com.opus2.magnum.transcript.view;

import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.opus2.core.Configuration;

import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

public class CreateAnnotationOnTranscript {
    @Steps
    TranscriptViewSteps user;
    
    @Given("the user is on Document_Viewer")
    public void givenTheUserIsOnDocument_Viewer(){
        //assertThat(user.currentUrl().equals(Configuration.documentViewUrl + "page1")).isTrue();
    }
    
    @When("user highlight text")
    public void whenUserHighlightText(){
        user.highlightText();
    }   
    @When("user adds a Note")
    @Alias("add a Note")
    public void whenUserAddsANote(){
         user.addNote();
    }       
    @When("select Tag")
    public void andSelectTag(){
         user.selectTag();
    }
    @Then("the Notepad_Annotation_Dialog should be visible")
    public void thenTheNotepad_Annotation_DialogShouldBeVisible(){
         //assertThat(user.dialog().equals("block")).isTrue();
    }
}
