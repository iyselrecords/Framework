package com.opus2.magnum.chronology.managechronologies;

import static org.assertj.core.api.Assertions.assertThat;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.opus2.magnum.chronology.ChronologySteps;

public class FindChronologiesList {
    @Steps
    ChronologySteps dip;
    
    @Given("the Find_Input is visible")
    public void givenTheFind_InputIsVisible(){
        assertThat(dip.assertDIP().equals("TDIP")).isTrue();
    }
    @Given("the Chronology_List is listed on the Chronologies_List")
    public void andTheChronology_ListIsListedOnTheChronologies_List(){
        assertThat(dip.assertDIP().equals("TDIP")).isTrue();
    }
    @When("user input a Search_Text")
    public void whenUserInputASearch_Text(){
         dip.search(); 
    }
    @Then("the Search_Text is filtered")
    public void thenTheSearch_TextIsFiltered(){
        assertThat(dip.assertDIP().equals("TDIP")).isTrue();  
    }
}
