package com.opus2.magnum.documents.folderColour;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class CloseFolderColourDialogViaXButtonDocumentsPage{
	@Steps
	FolderColourSteps color;
	
	@Given("the X_Button is visible on the Folder_Colour_Dialog")
	public void givenTheX_ButtonIsVisibleOnTheFolder_Colour_Dialog(){
		assertThat(color.xButton().isDisplayed()).isTrue();
	}
	
	@When("the user clicks the X_Button on the Folder_Colour_Dialog")
	public void whenTheUserclicksTheX_ButtonOnTheFolder_Colour_Dialog() {
		color.closeByXButton();
	}
	
	@Then("the Folder_Colour_Dialog must close via the X_Button")
	public void thenTheFolder_Colour_DialogMustCloseViaTheX_Button(){
		assertThat(color.notVisible().equals("none")).isTrue();
	}
}