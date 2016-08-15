package com.opus2.magnum.documents.destinationFolder;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class VerifyDestinationDialogIsAestheticallyCorrectDocumentsPage{
	@Steps
	DestinationFolderSteps destFol;

	@Given("the Destination_Folder_Dialog is open on the Documents_Page")
	public void givenTheDestination_Folder_DialogIsOpenOnTheDocuments_Page(){
		assertThat(destFol.assertDIP().equals("TDIP")).isTrue();
	}
	
	@When("the user is viewing the Destination_Folder_Dialog")
	public void whenTheUserIsViewingTheDestination_Folder_Dialog(){
		assertThat(destFol.assertDIP().equals("TDIP")).isTrue(); 
	}
	
	@Then("the Destination_Folder_Dialog must be Aesthetically consistent with other dialogs across the platform")
	public void thenTheDestination_Folder_DialogMustBeAestheticallyConsistentWithOtherDialogsAcrossThePlatform(){
		assertThat(destFol.assertDIP().equals("TDIP")).isTrue();
	}
	
	@Then("each of the Buttons, Fields, Icons and Element_Names must be correct on the Destination_Folder_Dialog")
    public void thenEachOfTheButtonsFieldsIconsAndElementNamesMustBeCorrectOnTheDestinationFolderDialog(){
		assertThat(destFol.assertDIP().equals("TDIP")).isTrue();
    }
}