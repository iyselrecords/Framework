package com.opus2.magnum.documents.importNotes;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class OpenImportNotesDialogDocumentsPage{
	@Steps
	ImportNotesSteps notes;
	
	@Given("there is a Folder visible on the Select_A_Document_Dialog")
	public void givenThereIsAFolderVisibleOnTheSelect_A_Document_Dialog(){
		 assertThat(notes.folderIsVisible().isDisplayed()).isTrue();
	}
	
	@When("the user clicks the Folder")
	public void whenTheUserClicksTheFolder(){
		 notes.selectFolder();
	}
	
	@When("then clicks the Apply_Button")
	public void whenThenClicksTheApply_Button(){
		 notes.apply();
	}
	
	@Then("the Import_Notes_Dialog must open")
	public void thenTheImport_Notes_DialogMustOpen(){
		assertThat(notes.importNotesDialog().isDisplayed()).isTrue();
	}
}