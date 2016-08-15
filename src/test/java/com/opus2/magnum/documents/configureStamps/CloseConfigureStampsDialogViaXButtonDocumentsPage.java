package com.opus2.magnum.documents.configureStamps;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;
import org.jbehave.core.annotations.*;

public class CloseConfigureStampsDialogViaXButtonDocumentsPage{
	@Steps
	ConfigureStampsSteps configureStamps;
	
	@Given("the X_Button is visible on the Configure_Stamps_Dialog")
	public void givenTheX_ButtonisVisibleVisibleOnTheConfigure_Stamps_Dialog(){
		assertThat(configureStamps.xButton().isDisplayed()).isTrue();
	}
	
	@When("the user clicks the X_Button on the Configure_Stamps_Dialog")
	public void whenTheUserclicksTheX_ButtonOnTheConfigure_Stamps_Dialog() {
		configureStamps.closeByXButton();
	}
	
	@Then("the Configure_Stamps_Dialog must close via the X_Button")
	public void thenTheConfigure_Stamps_DialogMustCloseViaTheX_Button(){
		assertThat(configureStamps.notVisible().equals("none")).isTrue();
	}
}