package com.opus2.magnum.documents.configureStamps;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;
import org.jbehave.core.annotations.*;
public class CloseConfigureStampsDialogViaCancelButtonDocumentsPage{
	@Steps
	ConfigureStampsSteps configureStamps;
	
	@Given("the Cancel_Button is visible on the Configure_Stamps_Dialog")
	public void givenTheCancel_ButtonIsVisibleOnTheConfigure_Stamps_Dialog(){
		assertThat(configureStamps.cancelButton().isDisplayed()).isTrue();
	}
	
	@When("the user clicks the Cancel_Button on the Configure_Stamps_Dialog")	
	 public void whenTheUserClicksTheCancel_ButtonOnTheConfigure_Stamps_Dialog(){
		configureStamps.closeDialog();
	}
	
	@Then("the Configure_Stamps_Dialog must close via the Cancel_Button")
	 public void thenTheConfigure_Stamps_DialogMustCloseViaTheCancel_Button() {
		assertThat(configureStamps.notVisible().equals("none")).isTrue();
	}
}