package com.opus2.magnum.documents.importNotes;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class CloseImportNotesDialogViaXButtonDocumentsPage{
	@Steps
	ImportNotesSteps notes;
	
	@Given("the X_Button is visible on the Import_Notes_Dialog")
	public void givenTheX_ButtonIsVisibleOnTheImport_Notes_Dialog(){
		assertThat(notes.xButton().isDisplayed()).isTrue();
	}
	
	@When("the user clicks the X_Button on the Import_Notes_Dialog")
	public void whenTheUserclicksTheX_ButtonOnTheImport_Notes_Dialog() {
		notes.closeByXButton();
	}
	
	@Then("the Import_Notes_Dialog must close via the X_Button")
	public void thenTheImport_Notes_DialogMustCloseViaTheX_Button(){
		assertThat(notes.notVisible().equals("none")).isTrue();
	}
}