package com.opus2.magnum.documents.enableDisableExport;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class OpenEnableDisableExportDialogDocumentsPage{
	@Steps
	EnableDisableExportSteps eDExp;
	
	
	@Given("the EnableDisable_Export_Option is visible in the Right_Click_Menu")
	public void givenTheEnableDisable_Export_OptionIsVisibleInTheRight_Click_Menu(){
		assertThat(eDExp.option().isDisplayed()).isTrue();
	}
	
	@When("the user clicks the EnableDisable_Export_Option")
	public void whenTheUserClicksTheEnableDisable_Export_Option(){
		eDExp.enbDsbExpOption();
	}
	
	@Then("the EnableDisable_Export_Dialog must open")
	public void thenTheEnableDisable_Export_DialogMustOpen(){
		assertThat(eDExp.dialog().equals("block")).isTrue();
	}
}