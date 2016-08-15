package com.opus2.magnum.documents.autolink;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class CloseAutolinkDialogViaCloseButtonDocumentsPage{
	@Steps
	AutolinkSteps autolink;

	@Given("the Close_Button is visible on the Autolink_Dialog")
	public void givenTheClose_ButtonIsVisibleOnTheAutolink_Dialog(){
		assertThat(autolink.hasButton().isDisplayed()).isTrue();
	}
	
	@When("the user clicks the Close_Button on the Autolink_Dialog")	
	public void whenTheUserClicksTheClose_Button(){
		autolink.close();
	}
	
	@Then("the Autolink_Dialog must close via the Close_Button")
	public void thenTheAutolink_DialogMustCloseViaTheCloseButton() {
		//assertThat(autolink.dialog().isDisplayed()).isFalse();
		autolink.isNotVisiable();
	}
}