package com.opus2.magnum.documents.configureStamps;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class OpenConfigureStampsDialogDocumentsPage{
	@Steps
	ConfigureStampsSteps action;
	
	@Given("the Configure_Stamps_Option is visible in the Right_Click_Menu")
	public void givenTheConfigure_Stamps_OptionIsVisibleInTheRight_Click_Menu(){
		 assertThat(action.assertDIP().equals("TDIP")).isTrue();
	}
	
	@When("the user clicks the Configure_Stamps_Option")
	public void whenTheUserClicksTheConfigure_Stamps_Option(){
		 assertThat(action.assertDIP().equals("TDIP")).isTrue();
	}
	
	@Then("the Configure_Stamps_Dialog must open")
	public void thenTheConfigure_Stamps_DialogMustOpen(){
		 assertThat(action.assertDIP().equals("TDIP")).isTrue();
	}
}