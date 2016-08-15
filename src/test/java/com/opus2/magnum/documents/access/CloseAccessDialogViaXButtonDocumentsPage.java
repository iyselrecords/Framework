package com.opus2.magnum.documents.access;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;


public class CloseAccessDialogViaXButtonDocumentsPage {
	@Steps
    AccessSteps access;
	
 	@Given("the X_Button is visible on the Access_Dialog")
 	public void givenTheX_ButtonIsVisibleOnTheAccess_Dialog() {
 		assertThat(access.xButton().isDisplayed()).isTrue();
 	}
 	
 	@When("the user clicks the X_Button on the Access_Dialog")
 	public void whenTheUserclicksTheXButtOnTheAccess_Dialog() {
 		access.closeByXButton();
 	}
 	
 	@Then("the Access_Dialog must close via the X_Button")
 	public void thenTheAccessDialogMustCloseViaTheX_Button() {
 		assertThat(access.notVisible().equals("none")).isTrue();
 	}
}