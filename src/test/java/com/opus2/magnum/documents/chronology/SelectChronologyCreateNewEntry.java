package com.opus2.magnum.documents.chronology;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;

import net.thucydides.core.annotations.Steps;

public class SelectChronologyCreateNewEntry {
    @Steps
    AddToChronologySteps addTo;
    
    
    @Given("Add_To_Chronology_Dialog is open")
    public void givenAddToChronologyDialogIsOpen(){
      assertThat(addTo.dialog().equals("block")).isTrue();
    }
    
    @When("user selects $option Chronology_List_Option")
    public void testUserSelectsTestChronChronologyListOption(String option){
        addTo.selectChronology(option);
    }
    
    @When("clicks Create_A_New_Entry_Button")
    public void andClicksTheCreateANewEntryButton(){
        addTo.createNewEntry();
    }
    
    @When("clicks Select_An_Existing_Entry_Button")
    public void andClicksSelectAnExistingEntryButton(){
        addTo.selectExistingEntry();
    }
}
