package com.opus2.magnum.documents.relationships;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class CloseRelationshipsDialogViaCancelButtonDocumentsPage{
	@Steps
	RelationshipsSteps relatedDoc;
	
    @Given("the Cancel_Button is visible on the Relationships_Dialog")	
	public void givenTheCancel_ButtonIsVisibleOnTheRelationships_Dialog(){
    	assertThat(relatedDoc.xButton().isDisplayed()).isTrue();
	}
	
	@When("the user clicks the Cancel_Button on the Relationships_Dialog")	
	public void whenTheUserClicksTheCancel_ButtonOnTheRelationships_Dialog(){  	 
		relatedDoc.closeByXButton();
	}
	@Then("the Relationships_Dialog must close via the Cancel_Button")
	public void thenTheRelationships_DialogMustCloseViaTheCancel_Button() {
		assertThat(relatedDoc.notVisible().equals("none")).isTrue();
    }	
}