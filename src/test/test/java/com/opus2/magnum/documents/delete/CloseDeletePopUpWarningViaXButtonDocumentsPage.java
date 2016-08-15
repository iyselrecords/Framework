package com.opus2.magnum.documents.delete;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class CloseDeletePopUpWarningViaXButtonDocumentsPage{
	@Steps
	DeletePopupSteps action;
	
	@Given("the X_Button is visible on the Delete_Popup_Warning")
	public void givenTheX_ButtonIsVisibleOnTheDelete_Popup_Warning(){
		assertThat(action.assertDIP().equals("TDIP")).isTrue();  
	}
	
	@When("the user clicks the X_Button on the Delete_Popup_Warning")
	public void whenTheUserclicksTheX_ButtonOnTheDelete_Popup_Warning() {
	     assertThat(action.assertDIP().equals("TDIP")).isTrue();
	}
	@Then("the Delete_Popup_Warning must close via the X_Button")
	public void thenTheDelete_Popup_WarningMustClose() {
	     assertThat(action.assertDIP().equals("TDIP")).isTrue();
	}
}