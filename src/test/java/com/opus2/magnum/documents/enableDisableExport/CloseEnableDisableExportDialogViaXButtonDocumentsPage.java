package com.opus2.magnum.documents.enableDisableExport;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class CloseEnableDisableExportDialogViaXButtonDocumentsPage{
	@Steps
	EnableDisableExportSteps eDExp;
	
	@Given("the X_Button is visible on the EnableDisable_Export_Dialog")
	public void givenTheX_ButtonIsVisibleOnTheEnableDisable_Export_Dialog(){
		assertThat(eDExp.xButton().isDisplayed()).isTrue();
	}
	
	@When("the user clicks the X_Button on the EnableDisable_Export_Dialog")
	public void whenTheUserclicksTheX_ButtonOnTheEnableDisable_Export_Dialog() {
		eDExp.closeByXButton();
	}
	
	@Then("the EnableDisable_Export_Dialog must close via the X_Button")
	public void thenTheEnableDisable_Export_DialogMustCloseViaTheX_Button(){
		assertThat(eDExp.notVisible().equals("none")).isTrue();
	}
}