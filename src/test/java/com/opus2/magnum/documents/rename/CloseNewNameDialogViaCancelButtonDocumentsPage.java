package com.opus2.magnum.documents.rename;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class CloseNewNameDialogViaCancelButtonDocumentsPage{
	@Steps
	RenameSteps rename;
	
	@Given("the Cancel_Button is visible on the New_Name_Dialog")
	public void givenTheCancel_ButtonIsVisibleOnTheNew_Name_Dialog(){
		assertThat(rename.cancelButton().isDisplayed()).isTrue();
	}
	
	@When("the user clicks the Cancel_Button on the New_Name_Dialog")	
	public void whenTheUserClicksTheCancel_ButtonOnTheNew_Name_Dialog(){
		rename.closeDialog();
	}
	
	@Then("the New_Name_Dialog must close via the Cancel_Button")
	public void thenTheNew_Name_DialogMustCloseViaTheCancel_Button() {
		assertThat(rename.notVisible().equals("none")).isTrue();
	}	
}