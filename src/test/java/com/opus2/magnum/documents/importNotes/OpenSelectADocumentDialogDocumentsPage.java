package com.opus2.magnum.documents.importNotes;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class OpenSelectADocumentDialogDocumentsPage{
	@Steps
	ImportNotesSteps notes;
		
	@Given("the Import_Notes_Option is visible in the Right_Click_Menu")
	public void givenTheImport_Notes_OptionIsVisibleInTheRight_Click_Menu(){
		assertThat(notes.option().isDisplayed()).isTrue();
	}
	
	@When("the user clicks the Import_Notes_Option")
	public void whenTheUserClicksTheImport_Notes_Option(){
		notes.importNotesOption();
	}
	@Then("the Select_A_Document_Dialog must open")
	public void thenTheSelect_A_Document_DialogMustOpen(){
		assertThat(notes.selectADocumentDialog().equals("block")).isTrue();
	}
}