package com.opus2.magnum.documents.relationships;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class OpenRelationshipsDialogDocumentsPage{
	@Steps
	RelationshipsSteps relatedDoc;
		
	@Given("the Related_Documents_Option is visible in the Right_Click_Menu")
	public void givenTheRelated_Documents_OptionIsVisibleInTheRight_Click_Menu(){
		assertThat(relatedDoc.option().isDisplayed()).isTrue();
	}
	
	@When("the user clicks the Related_Documents_Option")
	public void whenTheUserClicksTheRelated_Documents_Option(){
		relatedDoc.relatedDocumentOption();
	}
	
	@Then("the Relationships_Dialog must open")
	public void thenTheRelationships_DialogMustOpen(){
		assertThat(relatedDoc.dialog().isDisplayed()).isTrue();
	}
}