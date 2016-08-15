package com.opus2.magnum.documents.folderColour;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class OpenFolderColourDialogDocumentsPage{
	@Steps
	FolderColourSteps color;
		
	@Given("the Folder_Colour_Option is visible in the Right_Click_Menu")
	public void givenTheFolder_Colour_OptionIsVisibleInTheRight_Click_Menu(){
		assertThat(color.option().isDisplayed()).isTrue(); 
	}
	
	@When("the user clicks the Folder_Colour_Option")
	public void whenTheUserClicksTheFolder_Colour_Option(){
		color.folderColorOption();
	}
	
	@Then("the Folder_Colour_Dialog must open")
	public void thenTheFolder_Colour_DialogMustOpen(){
		assertThat(color.dialog().isDisplayed()).isTrue();
	}
}