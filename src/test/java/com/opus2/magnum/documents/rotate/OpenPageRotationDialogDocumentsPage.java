package com.opus2.magnum.documents.rotate;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;

public class OpenPageRotationDialogDocumentsPage{
	@Steps
	PageRotationSteps page;
	
	@Given("the Rotate_Option is visible in the Right_Click_Menu")	
	public void givenTheRotate_OptionIsVisibleInTheRight_Click_Menu(){
		assertThat(page.option().isDisplayed()).isTrue();
	}
	
	@When("the user clicks the Rotate_Option")	
	public void whenTheUserClicksTheRotate_Option(){
		page.pageRotateOption();
	}
	
	@Then("the Page_Rotation_Dialog must open")	
	public void thenThePage_Rotation_DialogMustOpen(){
		assertThat(page.dialog().equals("block")).isTrue();
	}
}