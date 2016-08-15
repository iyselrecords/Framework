package com.opus2.magnum.documents.folderColour;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class VerifyFolderColourDialogIsAestheticallyCorrectDocumentsPage{
	@Steps
	FolderColourSteps color;
	
	@Given("the Folder_Colour_Dialog is open on the Documents_Page")
  	public void givenTheFolder_Colour_DialogIsOpenOnTheDocuments_Page(){
  	        assertThat(color.assertDIP().equals("TDIP")).isTrue(); 
  	}
	
	@When("the user is viewing the Folder_Colour_Dialog")
	public void whenTheUserIsViewingTheFolder_Colour_Dialog(){
		assertThat(color.assertDIP().equals("TDIP")).isTrue(); 
	}
	
	@Then("the Folder_Colour_Dialog must be Aesthetically consistent with other dialogs across the platform")
	public void thenTheFolder_Colour_DialogMustBeAestheticallyConsistentWithOtherDialogsAcrossThePlatform(){
		assertThat(color.assertDIP().equals("TDIP")).isTrue(); 
	}
	
	@Then("each of the Buttons, Fields, Icons and Element_Names must be correct on the Folder_Colour_Dialog")
	public void thenEachOfTheButtonsFieldsIconsAndElementNamesMustBeCorrectOnTheFolder_Colour_Dialog(){
		assertThat(color.assertDIP().equals("TDIP")).isTrue(); 
	}
}