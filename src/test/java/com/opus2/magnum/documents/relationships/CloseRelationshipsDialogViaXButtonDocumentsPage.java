package com.opus2.magnum.documents.relationships;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class CloseRelationshipsDialogViaXButtonDocumentsPage{
	@Steps
	RelationshipsSteps relatedDoc;
	
	@Given("the X_Button is visible on the Relationships_Dialog")
	public void givenTheX_ButtonIsVisibleOnTheRelationships_Dialog(){
		assertThat(relatedDoc.cancelButton().isDisplayed()).isTrue();
	}
	
	@When("the user clicks the X_Button on the Relationships_Dialog")
	public void whenTheUserclicksTheX_ButtonOnTheRelationships_Dialog() {
		relatedDoc.closeDialog();
	}
	
	@Then("the Relationships_Dialog must close via the X_Button")
	public void thenTheRelationships_DialogMustCloseViaTheX_Button(){
		assertThat(relatedDoc.notVisible().equals("none")).isTrue();
	}
}