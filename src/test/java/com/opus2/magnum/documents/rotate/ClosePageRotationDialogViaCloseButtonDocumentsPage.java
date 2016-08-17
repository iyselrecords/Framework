package com.opus2.magnum.documents.rotate;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class ClosePageRotationDialogViaCloseButtonDocumentsPage{
	@Steps
	PageRotationSteps page;
		
	@Given("the Close_Button is visible on the Page_Rotation_Dialog")	
	public void givenTheClose_ButtonIsVisibleOnThePage_Rotation_Dialog() {
		assertThat(page.closeButton().isDisplayed()).isTrue();
	}
	
	@When("the user clicks the Close_Button on the Page_Rotation_Dialog")	
	public void whenTheUserClicksTheClose_ButtonOnThePageRotationDialog(){
		page.closeDialog();
	}
	
	@Then("the Page_Rotation_Dialog must close via the Close_Button")   
	public void thenThePage_Rotation_DialoggMustCloseViaTheClose_Button() {
		assertThat(page.notVisible().equals("none")).isTrue();
	}
}