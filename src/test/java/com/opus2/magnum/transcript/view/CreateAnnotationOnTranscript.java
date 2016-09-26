package com.opus2.magnum.transcript.view;

import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.opus2.core.Configuration;
import com.opus2.util.TestData;
import com.opus2.util.Util;

import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

public class CreateAnnotationOnTranscript {
    @Steps
    TranscriptViewSteps user;
    
    @Given("the user is on Transcript_Viewer")
    public void givenTheUserIsOnTranscriptViewer(){
        String url = TestData.TRANSCRIPTSVIEW_.getProperty("tranUrl");
        //assertThat(Util.getDriver().getCurrentUrl().equals(url)).isTrue();
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
    
}
