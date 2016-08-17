package com.opus2.magnum.documents.reorder;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class CloseReorderDialogViaXButtonDocumentsPage{
	@Steps 
	ReOrderSteps reorder;
	
	@Given("the X_Button is visible on the Reorder_Dialog")	
	public void givenTheX_ButtonIsVisibleOnTheReorder_Dialog(){
		assertThat(reorder.xButton().isDisplayed()).isTrue();
	}
	
	@When("the user clicks the X_Button on the Reorder_Dialog")	
	public void whenTheUserclicksTheX_ButtonOnTheReorder_Dialog() {
		reorder.closeByXButton();
	}
	
	@Then("the Reorder_Dialog must close via the X_Button")	
	public void thenTheReorder_DialogMustCloseViaTheX_Button(){
		assertThat(reorder.notVisible().equals("none")).isTrue();
	}
}