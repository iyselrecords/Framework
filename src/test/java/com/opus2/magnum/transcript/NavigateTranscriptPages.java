package com.opus2.magnum.transcript;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

public class NavigateTranscriptPages {
    @Steps
    TranscriptSteps user;
    

    @When("user clicks Next_Button")
    public void whenUserClicksNextButton(){
        user.next();
    }
    
    @When("clicks Previous_Button")
    public void andClicksPreviousButton(){
        user.previous();
    }
    
    @When("select from page $page Dropdown_Option")
    public void andSelectFromDropdownOption(String pageNum){
        user.dropdownPage(pageNum);
    }
    
    @Then("Transcript should displays relevant pages")
    public void thenTranscriptShouldDisplaysRelevantpPages(){
        assertThat(user.assertDIP().equals("TDIP")).isTrue();
    }
}
