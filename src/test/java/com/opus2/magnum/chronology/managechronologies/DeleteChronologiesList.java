package com.opus2.magnum.chronology.managechronologies;

import static org.assertj.core.api.Assertions.assertThat;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.opus2.magnum.chronology.Chronology;
import com.opus2.magnum.chronology.ChronologySteps;

public class DeleteChronologiesList {
    @Steps
    ChronologySteps dip;
    
    @Given("the Delete_Button is visible")
    public void givenTheDelete_ButtonIsVisible(){
        assertThat(dip.assertDIP().equals("TDIP")).isTrue();
    }
    @When("user select Chronology_List to delete")
    public void whenUserSelectChronology_ListToDelete(){
          dip.selectChronologiesList(Chronology.UPDATE_CHRON_LIST);
    }
    @When("clicks on the Delete_Button")
    public void whenClicksOnTheDelete_Button(){
         dip.delete(); 
    }
    @When("confirms action")
    public void whenConfirmsAction(){
          dip.OK();
    }
    @Then("the Chronology_List deleted from the Chronologies_List")
    public void thenTheChronology_ListDeletedFromTheChronologies_List(){
        assertThat(dip.assertDIP().equals("TDIP")).isTrue();  
    }
}
