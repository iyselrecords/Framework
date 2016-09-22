package com.opus2.magnum.transcript;

import static org.assertj.core.api.Assertions.assertThat;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import net.thucydides.core.annotations.Steps;

public class FindTranscript {
    @Steps
    TranscriptSteps user;
    
    private String Transcript;
    
    @When("user input Transcript_Title $transcript on Find_Input")
    public void whenUserInputTranscriptTitlenFindInput(String transcript){
        user.findTranscript(transcript);
        Transcript = transcript;
    }
    
    @Then("Transcript should be visible and highlighted")
    public void thenTranscriptShouldBeVisibleAndHighlighted(){
        assertThat(user.getTranscript().equals(Transcript.toUpperCase())).isTrue();
    }
}
