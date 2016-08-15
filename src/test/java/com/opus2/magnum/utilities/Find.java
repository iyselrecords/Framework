package com.opus2.magnum.utilities;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class Find{
	@Steps
	FindSteps user;
	
	@Given("there is a Find_Field visible")
	public void givenThereIsAFind_FieldVisible(){
		 assertThat(user.inputField().isDisplayed()).isTrue();
	}
	
	@Given("the Find_Input is present on the Index")
	public void givenTheFind_InputIsPresentOnTheIndex(){
		 assertThat(user.findInput().isDisplayed()).isTrue();
	}
	
	@When("the user enters Find_Input into the Find_Field")
    public void whenTheUserEntersFind_InputIntoTheFind_Field(){
		user.enterSearch();
    }
	
	@Then("the Find_Input must be visible in the Results_Section")
	public void thenTheFind_InputMustBeVisibleInTheResults_Section(){
		assertThat(user.findStepsDIP().equals("TDIP")).isTrue();
	}
	
	@Then("all other Possible_Results must be filtered out")
	public void thenAllOtherPossible_ResultsMustBeFilteredOut(){
		assertThat(user.findStepsDIP().equals("TDIP")).isTrue();
	}	
}