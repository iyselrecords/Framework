package com.opus2.magnum.chronology.managechronologies;

import static org.assertj.core.api.Assertions.assertThat;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.opus2.magnum.chronology.ChronologySteps;

public class DeSelectAllChronologiesList {
    @Steps
    ChronologySteps dip;
    
    
    @When("user clicks the None_Link")
    public void whenUserClicksTheNone_Link(){
         dip.selectNone();
    }
    
    @Then("all Chronologies_List is deselected")
    public void thenAllChronologies_ListIsDeselected(){
        assertThat(dip.assertDIP().equals("TDIP")).isTrue(); 
    }
}
