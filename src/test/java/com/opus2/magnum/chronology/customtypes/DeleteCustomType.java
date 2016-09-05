package com.opus2.magnum.chronology.customtypes;

import static org.assertj.core.api.Assertions.assertThat;

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

	@Then("the Custom_Type is deleted from the list")
	public void thenTheCustom_TypeDeletedFromTheList(){
		assertThat(type.assertDIP().equals("TDIP")).isTrue();  
	}
}
