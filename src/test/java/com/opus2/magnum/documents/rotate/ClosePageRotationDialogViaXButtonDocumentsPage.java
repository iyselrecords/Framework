package com.opus2.magnum.documents.rotate;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class ClosePageRotationDialogViaXButtonDocumentsPage{
	@Steps
	PageRotationSteps page;
		
	@Given("the X_Button is visible on the Page_Rotation_Dialog")	
	public void givenTheX_ButtonIsVisibleOnThePage_Rotation_Dialog(){
		assertThat(page.xButton().isDisplayed()).isTrue();
	}
	
	@When("the user clicks the X_Button on the Page_Rotation_Dialog")	
	public void whenTheUserclicksTheX_ButtonOnThePage_Rotation_Dialog() {
		page.closeByXButton();
	}
	
	@Then("the Page_Rotation_Dialog must close via the X_Button")	
	public void thenThePage_Rotation_DialogMustCloseViaTheX_Button(){
		assertThat(page.notVisible().equals("none")).isTrue();
	}
}