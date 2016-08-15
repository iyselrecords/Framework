package com.opus2.magnum.documents.replace;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class CloseReplaceDocumentDialogViaXButtonDocumentsPage{
	@Steps
	ReplaceSteps replace;
	
	@Given("the X_Button is visible on the Replace_Document_Dialog")
	public void givenTheX_ButtonIsVisibleOnTheReplace_Document_Dialog(){
		assertThat(replace.xButton().isDisplayed()).isTrue();
	}
	@When("the user clicks the X_Button on the Replace_Document_Dialog")
	public void whenTheUserclicksTheX_ButtonOnTheReplaceDocumentDialog() {
		replace.closeByXButton();
	}
	@Then("the Replace_Document_Dialog must close via the X_Button")
	public void thenTheReplace_Document_DialogMustCloseViaTheX_Button(){
		assertThat(replace.notVisible().equals("none")).isTrue(); 
	}
}