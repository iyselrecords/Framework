package com.opus2.magnum.document.properties;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

public class SelectContextPropertiesOption {
    @Steps
    DocumentPropertiesSteps doc;
    
    @Given("$menuOption option is visible on Context_Menu")
    public void givenOptionIsVisibleOnContextMenu(String menuOption){
        assertThat(doc.option(menuOption).isDisplayed()).isTrue();
    }
    
    @When("user clicks Properties_Option")
    public void whendocClicksPropertiesOption(){
        doc.propertiesOption();
    }
    
    @Then("Properties_Option Dialog is visible")    
    public void thenPropertiesOptionDialogIsVisible(){
        assertThat(doc.dialog().equals("block")).isTrue();
    }
}
