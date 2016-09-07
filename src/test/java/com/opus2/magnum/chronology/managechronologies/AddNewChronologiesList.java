package com.opus2.magnum.chronology.managechronologies;

import static org.assertj.core.api.Assertions.assertThat;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.opus2.magnum.chronology.ChronologySteps;

public class AddNewChronologiesList {
    @Steps
    ChronologySteps dip;
    
    
    @Given("the Add_Button is visible")
    public void givenTheAdd_ButtonIsVisible(){
        assertThat(dip.assertDIP().equals("TDIP")).isTrue(); 
    }
    
    @When("user clicks on the Add_Button")
    public void whenUserClicksOnTheAdd_Button(){
        dip.add();
    }
    
    @When("input Chronology_List_Name")
    public void whenInputChronology_List_Name(){
        dip.chronListName();
    }
    
    @When("clicks Chronology_List_Save_Button")
    public void whenClicksChronology_List_Save_Button(){
          dip.save();
    }
    
    @Then("new Chronology_List is visible on the Chronologies_List")
    public void thenNewChronology_ListIsVisibleOnTheChronologies_List(){
        dip.addMyList();
        assertThat(dip.assertDIP().equals("TDIP")).isTrue();  
    }
}
