package com.opus2.magnum.documents.importNotes;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class VerifyImportNotesDialogIsAestheticallyCorrectDocumentsPage{
	@Steps
	ImportNotesSteps notes;
	
	@Given("the Import_Notes_Dialog is open on the Documents_Page")
    public void givenTheImport_Notes_DialogIsOpenOnTheDocuments_Page(){
         assertThat(notes.assertDIP().equals("TDIP")).isTrue(); 
    }
	
	@When("the user is viewing the Import_Notes_Dialog")
	public void whenTheUserIsViewingTheImport_Notes_Dialog(){
		 assertThat(notes.assertDIP().equals("TDIP")).isTrue(); 
	}
	
	@Then("the Import_Notes_Dialog must be Aesthetically consistent with other dialogs across the platform")
	public void thenTheImport_Notes_DialogMustBeAestheticallyConsistentWithOtherDialogsAcrossThePlatform(){
		 assertThat(notes.assertDIP().equals("TDIP")).isTrue(); 
	}
	
	@Then("each of the Buttons, Fields, Icons and Element_Names must be correct on the Import_Notes_Dialog")
	public void thenEachOfTheButtonsFieldsIconsAndElementNamesMustBeCorrectOnTheImport_Notes_Dialog(){
		 assertThat(notes.assertDIP().equals("TDIP")).isTrue(); 
	}
}