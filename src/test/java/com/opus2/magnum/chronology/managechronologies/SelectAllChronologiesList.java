package com.opus2.magnum.chronology.managechronologies;

import static org.assertj.core.api.Assertions.assertThat;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import net.thucydides.core.annotations.Steps;

import com.opus2.magnum.chronology.ChronologySteps;

public class SelectAllChronologiesList {
    @Steps
    ChronologySteps dip;
    
    
    @Given("the Manage_Chronologies_Dialog is open")
    public void givenTheManage_Chronologies_DialogIsOpen(){
        assertThat(dip.assertDIP().equals("TDIP")).isTrue();
    }
    
    @When("user clicks the All_Link")
    public void whenUserClicksTheAll_Link(){
          dip.selectAll();
    }
    
    @Then("all Chronologies_List is selected")
    public void thenAllChronologies_ListIsSelected(){
        assertThat(dip.assertDIP().equals("TDIP")).isTrue();
    }
}
