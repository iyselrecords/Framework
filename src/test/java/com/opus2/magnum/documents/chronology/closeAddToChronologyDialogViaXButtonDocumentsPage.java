package com.opus2.magnum.documents.chronology;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;

public class CloseAddToChronologyDialogViaXButtonDocumentsPage{
	@Steps
	AddToChronologySteps addToChron;
	
	@Given("the X_Button is visible on the Add_to_Chronology_Dialog")	 
	public void givenTheX_ButtonIsVisibleOnTheAdd_to_Chronology_Dialog(){
		assertThat(addToChron.xButton().isDisplayed()).isTrue(); 
	}
	
	@When("the user clicks the X_Button on the Add_to_Chronology_Dialog")	 
	public void whenTheUserclicksTheX_ButtonOnTheAdd_to_Chronology_Dialog() {
		addToChron.closeByXButton();
	}
	 
	@Then("the Add_To_Chronology_Dialog must close via the X_Button")
	public void thenTheAdd_To_Chronology_DialogMustCloseViaTheX_Button() {
		assertThat(addToChron.notVisible().equals("none")).isTrue();
	}
	 
}