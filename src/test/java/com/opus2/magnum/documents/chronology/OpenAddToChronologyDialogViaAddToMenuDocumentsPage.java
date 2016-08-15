package com.opus2.magnum.documents.chronology;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class OpenAddToChronologyDialogViaAddToMenuDocumentsPage{
	@Steps
	AddToChronologySteps addToChron;
	
	@Given("the Chronology_Option is visible in the Right Click Menu")
	public void givenTheChronology_OptionIsVisibleInTheRight_Click_Menu(){
		assertThat(addToChron.option().isDisplayed()).isTrue();
	}
	
	@When("the user clicks the Chronology option")
	public void whenTheUserClicksTheChronology_Option(){
		addToChron.addToChronOption();
	}
	
	@Then("the Add_To Chronology_Dialog must open")
	public void thenTheAdd_To_Chronology_DialogMustOpen(){
		assertThat(addToChron.dialog().isDisplayed()).isTrue();
	}
}