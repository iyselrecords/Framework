package com.opus2.magnum.chronology.customtypes;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import net.thucydides.core.annotations.Steps;

public class DeleteCustomType {
	@Steps
	CustomTypesSteps type;


	@When("user select Custom_Type to delete")
    public void whenUserSelectCustom_TypeToDelete(){
        type.selectCustomType(CustomTypes.UPDATE_CUSTOM_TYPES);
    }

    @When("user select Custom_Type")
    public void whenUserSelectCustomType(){
        type.selectCustomType(CustomTypes.CUSTOM_TYPE);
    }
    
    @Then("the Custom_Type is deleted from the list")
    public void thenTheCustom_TypeDeletedFromTheList(){
        //assertThat(type.isDeleted().equals(null)).isTrue();
    }
    
    @When("user highlight Custom_Type")
    public void whenUserHighlightCustomType(){
        type.selectCustomType(CustomTypes.ADD_TYPE);
    }
}
