package com.opus2.magnum.documents.folderColour;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class CloseFolderColourDialogViaCancelButtonDocumentsPage{
	@Steps
	FolderColourSteps color;
	
	@Given("the Cancel_Button is visible on the Folder_Colour_Dialog")
	public void givenTheCancel_ButtonIsVisibleOnTheFolder_Colour_Dialog(){
		assertThat(color.cancelButton().isDisplayed()).isTrue();
	}
	
	@When("the user clicks the Cancel_Button on the Folder_Colour_Dialog")
	public void whenTheUserclicksTheCancel_ButtonOnTheFolder_Colour_Dialog() {
		color.closeDialog();
	}
	
	@Then("the Folder_Colour_Dialog must close via the Cancel_Button")
	public void thenTheFolder_Colour_DialogMustCloseViaTheCancel_Button(){
		assertThat(color.notVisible().equals("none")).isTrue();
	}
}