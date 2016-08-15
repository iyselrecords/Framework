package com.opus2.magnum.documents.delete;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class OpenDeletePopupWarningDocumentsPage{
	@Steps
	DeletePopupSteps action;

	@Given("the Delete_Option is visible in the Right_Click_Menu")
	public void givenTheDelete_OptionIsVisibleInTheRight_Click_Menu(){
		assertThat(action.assertDIP().equals("TDIP")).isTrue(); 
	}
	
	@When("the user clicks the Delete_Option")
	public void whenTheUserClicksTheDelete_Option(){
		assertThat(action.assertDIP().equals("TDIP")).isTrue(); 
	}
	
	@Then("the Delete_Popup_Warning must open")
	public void thenTheDelete_Popup_WarningMustOpen(){
		assertThat(action.assertDIP().equals("TDIP")).isTrue(); 
	}	
}