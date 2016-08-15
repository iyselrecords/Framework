package com.opus2.magnum.documents.access;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;

public class OpenAccessDialogDocumentsPage {
	@Steps
	AccessSteps access;
	
	@Given("the Access_Option is visible in the Right_Click_Menu")
	public void givenTheAccess_OptionIsVisibleInTheRight_Click_Menu(){
		assertThat(access.option().isDisplayed()).isTrue();
	}
	
	@When("the user clicks the Access_Option")
	public void whenTheUserClicksTheAccess_Option(){
		access.accessOption();
	}
	
	@Then("the Access_Dialog must open")	
	public void thenTheAccess_DialogMustOpen(){
		assertThat(access.dialog().isDisplayed()).isTrue();
	}
}