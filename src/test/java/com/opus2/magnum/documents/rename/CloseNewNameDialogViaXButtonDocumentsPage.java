package com.opus2.magnum.documents.rename;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class CloseNewNameDialogViaXButtonDocumentsPage{
	@Steps
	RenameSteps rename;
	
	@Given("the X_Button is visible on the New_Name_Dialog")
	public void givenTheX_ButtonIsVisibleOnTheNew_Name_Dialog(){
		assertThat(rename.xButton().isDisplayed()).isTrue();
	}
	
	@When("the user clicks the X_Button on the New_Name_Dialog")
	 public void whenTheUserclicksTheX_ButtonOnTheNew_Name_Dialog() {
		rename.closeByXButton();
	}
	
	@Then("the New_Name_Dialog must close via the X_Button")
	public void thenTheNew_Name_DialogMustCloseViaTheX_Button(){
		assertThat(rename.notVisible().equals("none")).isTrue();
	}
}