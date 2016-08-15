package com.opus2.magnum.documents.enableDisableExport;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;


import org.jbehave.core.annotations.*;
public class CloseEnableDisableExportDialogViaCloseButtonDocumentsPage{
	@Steps
	EnableDisableExportSteps eDExp;
	
	@Given("the Close_Button is visible on the EnableDisable_Export_Dialog")
	public void givenTheClose_ButtonIsVisibleOnTheEnableDisable_Export_Dialog(){
		assertThat(eDExp.closeButton().isDisplayed()).isTrue();
	}
	
	@When("the user clicks the Close_Button on the EnableDisable_Export_Dialog")
	public void whenTheUserclicksTheClose_ButtonOnTheEnableDisable_Export_Dialog() {
		eDExp.closeDialog();
	}
	
	@Then("the EnableDisable_Export_Dialog must close via the Close_Button")
	public void thenTheEnableDisable_Export_DialogMustCloseViaTheClose_Button(){
		assertThat(eDExp.notVisible().equals("none")).isTrue();
	}
}