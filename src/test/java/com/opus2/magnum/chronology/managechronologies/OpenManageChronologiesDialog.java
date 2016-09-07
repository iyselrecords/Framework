package com.opus2.magnum.chronology.managechronologies;

import static org.assertj.core.api.Assertions.assertThat;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.opus2.magnum.chronology.ChronologySteps;

public class OpenManageChronologiesDialog {
    @Steps
    ChronologySteps dip;
    
    
    @Given("Manage_Chronologies_Button is visible")
    public void givenManage_Chronologies_ButtonIsVisible(){
        assertThat(dip.assertDIP().equals("TDIP")).isTrue();
    }
    
    @When("user clicks Manage_Chronologies_Button")
    public void whenUserClicksManage_Chronologies_Button(){
          dip.manageChron();
    }
    
    @Then("Manage_Chronologies_Dialog should be visible")
    public void thenManage_Chronologies_DialogShouldBeVisible(){
        assertThat(dip.assertDIP().equals("TDIP")).isTrue();  
    }
}
