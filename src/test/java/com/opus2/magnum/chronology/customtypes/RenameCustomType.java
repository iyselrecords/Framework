package com.opus2.magnum.chronology.customtypes;

import static org.assertj.core.api.Assertions.assertThat;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import net.thucydides.core.annotations.Steps;

public class RenameCustomType {
	@Steps
	CustomTypesSteps type;

	@Given("the Rename_Button is visible")
	public void givenTheRename_ButtonIsVisible(){
		assertThat(type.assertDIP().equals("TDIP")).isTrue();
	}
	
	@When("user select Custom_Type to rename")
	public void whenUserSelectCustom_TypeToRename(){
		type.selectCustomType(CustomTypes.CUSTOM_TYPE); 
	}
	
	@When("clicks on the Rename_Button")
	public void whenClicksOnTheRename_Button(){
		type.rename();
	}
	
	@When("update Custom_Type")
	public void whenUpdateCustom_Type(){
		type.update(); 
	}
	
	@Then("the Custom_Type is updated")
	public void thenTheCustom_TypeIsUpdated(){
		assertThat(type.assertDIP().equals("TDIP")).isTrue();
	}
}
