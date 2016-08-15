package com.opus2.magnum.documents.access;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;

import com.opus2.dialog.access.Access;


public class CloseAccessDialogViaXButtonDocumentsPage {
	@Steps
    DocsAccessSteps menu;
	Access access;
	
 	@Given("the X_Button is visible on the Access_Dialog")
 	public void givenTheX_ButtonIsVisibleOnTheAccess_Dialog() {
 		assertThat(access.hasButton().isDisplayed()).isTrue();
 	}
 	
 	@When("the user clicks the X_Button on the Access_Dialog")
 	public void whenTheUserclicksTheXButtOnTheAccess_Dialog() {
 		menu.closeByXButton();
 	}
 	
 	@Then("the Access_Dialog must close via the X_Button")
 	public void thenTheAccessDialogMustCloseViaTheX_Button() {
 		assertThat(access.dialog().isDisplayed()).isFalse();
 	}
}