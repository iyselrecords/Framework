package com.opus2.magnum.chronology;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.opus2.util.Util;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

public class CustomTypesEntries {
	@Steps
	ChronologySteps user;

	@Given("Custom_Types_Button is visible")
	public void givenCustom_Types_ButtonIsVisible(){
		assertThat(Util.getElement(Chronology.CUSTOM_TYPES).isDisplayed()).isTrue();
	}
	@When("user clicks Custom_Types_Button")
	public void whenUserClicksCustom_Types_Button(){
		user.customType();
	}
	@Then("Custom_Types_Dialog should be visible")
	public void thenCustom_Types_DialogShouldBeVisible(){
		assertThat(user.dialog().equals("block")).isTrue();  
	}
}
