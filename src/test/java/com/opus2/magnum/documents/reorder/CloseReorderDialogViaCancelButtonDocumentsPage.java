package com.opus2.magnum.documents.reorder;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class CloseReorderDialogViaCancelButtonDocumentsPage{
	@Steps 
	ReOrderSteps reorder;
	
	@Given("the Cancel_Button is visible on the Reorder_Dialog")	
	public void givenTheCancel_ButtonIsVisibleOnTheReorder_Dialog(){
		assertThat(reorder.cancelButton().isDisplayed()).isTrue();
	}
	
	@When("the user clicks the Cancel_Button on the Reorder_Dialog")	
	public void whenTheUserClicksTheCancel_ButtonOnTheReorder_Dialog(){
		reorder.closeDialog();
	}
	
	@Then("the Reorder_Dialog must close via the Cancel_Button")	
	public void thenTheReorder_DialogMustCloseViaTheCancel_Button() {
		assertThat(reorder.notVisible().equals("none")).isTrue();
	}
}