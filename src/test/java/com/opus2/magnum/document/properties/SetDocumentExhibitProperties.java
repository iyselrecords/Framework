package com.opus2.magnum.document.properties;

import static org.assertj.core.api.Assertions.assertThat;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import net.thucydides.core.annotations.Steps;

public class SetDocumentExhibitProperties {
    @Steps
    DocumentPropertiesSteps doc;
  
    @Given("Properties_Dialog is open")
    public void givenPropertiesDialogIsOpen(){
        assertThat(doc.dialog().equals("block")).isTrue();
    }
    
    @When("user selects $option option from Type_Dropdowm")
    public void whendocClicksPropertiesOption(String option){
        doc.dropdown(option);
    }
    
    @When("enters Exhibit_Value $value")
    public void andEntersExhibitValue(String value){
        doc.exhibit(value);
    }
    
    @When("Deponent_Value $value")
    public void whenDeponentValue(String value){
        doc.deponent(value);
    }
    
    @When("apply")
    public void andApply(){
        doc.apply();
    }
    
    @Then("Properties are applied to Document")
    public void thenPropertiesAreAppliedToDocument(){
        assertThat(doc.assertDIP().equals("TDIP")).isTrue();       
    }
}
