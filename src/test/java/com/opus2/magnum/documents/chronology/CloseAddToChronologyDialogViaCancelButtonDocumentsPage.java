package com.opus2.magnum.documents.chronology;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class CloseAddToChronologyDialogViaCancelButtonDocumentsPage{
	@Steps
	AddToChronologySteps addToChron;
	
	@Given("the Cancel_Button is visible on the Add_To_Chronology_Dialog")
	public void givenTheCancel_ButtonVisibleIsVisibleOnTheAdd_To_Chronology_Dialog(){
		assertThat(addToChron.cancelButton().isDisplayed()).isTrue();	 
	}
	
	@When("the user clicks the Cancel_Button on the Add_To_Chronology_Dialog")	
	public void whenTheUserClicksTheCancel_Button(){
		addToChron.closeDialog();
	}
	
	@Then("the Add_To_Chronology_Dialog must close via the Cancel_Button")
	public void thenTheAdd_To_Chronology_DialogMustCloseViaTheCancel_Button(){
		assertThat(addToChron.notVisible().equals("none")).isTrue();
	}	
}