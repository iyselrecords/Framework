package com.opus2.magnum.admin;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.opus2.util.Util;

import static org.assertj.core.api.Assertions.*;
import net.thucydides.core.annotations.Steps;

public class AdminPage {
    @Steps
    AdminPageSteps user;
    
    @Given("$option SideMenu_Link is visible")
    public void givenSideMenuLinkIsVisible(String option){
        assertThat(user.sideMenu(option).isDisplayed()).isTrue();
    }
    
    @When("user clicks the SideMenu_Link")
    public void whenUserClicksTheSideMenuLink(){
        user.selectMenu();
    }
    
    @Then("Document_Types and MetaData_Columns should display default values")
    public void thenDocumentTypesAndMetaDataColumnsDisplays(){
        assertThat(user.assertDIP().equals("TDIP")).isTrue();
        Util.pause(5);
    }
}
