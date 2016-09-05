package com.opus2.magnum.chronology.customtypes;

import static org.assertj.core.api.Assertions.assertThat;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import net.thucydides.core.annotations.Steps;

public class AddNewCustomType {
	@Steps
	CustomTypesSteps type;

	@When("input Custom_Types_Name")
	public void whenInputCustomTypes_Name(){
		  type.newCustomType();
	}
	
	@When("clicks Custom_Types_Save_Button")
	public void whenClicksCustom_Types_Save_Button(){
		  type.save();
	}
	
	@Then("new Custom Types is visible on the Custom_Types_List")
	public void thenNewCustomTypesIsVisibleOnTheCustom_Types_List(){
		type.addCustomType();
		assertThat(type.assertDIP().equals("TDIP")).isTrue();
		
	}
}
