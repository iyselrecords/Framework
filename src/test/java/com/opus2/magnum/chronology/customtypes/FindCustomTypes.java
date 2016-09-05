package com.opus2.magnum.chronology.customtypes;

import static org.assertj.core.api.Assertions.assertThat;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;

import net.thucydides.core.annotations.Steps;

public class FindCustomTypes {
	@Steps
	CustomTypesSteps type;


	@Given("the Custom_Type is listed on the list")
	public void andTheCustomTypeIsListedOnTheList(){
		assertThat(type.assertDIP().equals("TDIP")).isTrue();
	}
	@When("user input a Search_Term")
	public void whenUserInputASearch_Term(){
		type.search();
	}
}
