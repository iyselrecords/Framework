package com.opus2.magnum.chronology.managechronologies;

import static org.assertj.core.api.Assertions.assertThat;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.opus2.magnum.chronology.Chronology;
import com.opus2.magnum.chronology.ChronologySteps;

public class EditChronologiesList {
    @Steps
    ChronologySteps dip;
    
    
    @Given("the Edit_Button is visible")
    public void givenTheEdit_ButtonIsVisible(){
        assertThat(dip.assertDIP().equals("TDIP")).isTrue();
    }
    
    @When("user select Chronology_List to edit")
    public void whenUserSelectChronology_ListToEdit(){
          dip.selectChronologiesList(Chronology.CHRON_LIST);
    }
    
    @When("clicks on the Edit_Button")
    public void whenClicksOnTheEdit_Button(){
          dip.edit();
    }
    
    @When("update Chronology_List")
    public void whenUpdateChronology_List(){
        dip.update();
    }
    
    @Then("the Chronology_List is updated on the Chronologies_List")
    public void thenTheChronology_ListIsUpdatedOnTheChronologies_List(){
        assertThat(dip.assertDIP().equals("TDIP")).isTrue();  
    }
}
