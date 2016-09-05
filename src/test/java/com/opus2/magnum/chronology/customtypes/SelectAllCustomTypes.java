package com.opus2.magnum.chronology.customtypes;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

public class SelectAllCustomTypes {
	@Steps
	CustomTypesSteps dip;
	
	@Given("the Custom_Types_Dialog is open")
	public void givenTheCustomTypesDialogIsOpen(){
		assertThat(dip.dialog().equals("block")).isTrue(); 
	}
	@Then("all Custom_Types is selected")
	public void thenAllCustomTypesSelected(){
		assertThat(dip.assertDIP().equals("TDIP")).isTrue();
	}

	@Then("all Custom_Types are deselected")
	public void thenAllCustomTypesAreDeselected(){
		assertThat(dip.assertDIP().equals("TDIP")).isTrue(); 
	}
}
