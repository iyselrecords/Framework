package com.opus2.magnum.documents.autolink;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class CloseAutolinkDialogViaXButtonDocumentsPage {
	@Steps
	AutolinkSteps autolink;	

	@Given("the X_Button is visible on the Autolink_Dialog")
	public void givenTheX_ButtonIsVisibleOnTheAutolink_Dialog(){
		assertThat(autolink.xButton().isDisplayed()).isTrue();
	}
	
	@When("the user clicks the X_Button on the Autolink_Dialog")	
	public void whenTheUserclicksTheXButtonOnTheAutoL() {
		autolink.closeByXButton();
	}
	
	@Then("the Autolink_Dialog must close via the X_Button")
	public void thenTheAutolink_DialogMustCloseViaTheX_Button() {
		assertThat(autolink.notVisible().equals("none")).isTrue();
	}
}